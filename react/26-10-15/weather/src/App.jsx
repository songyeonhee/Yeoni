// import axios from "axios";
import { useEffect, useState } from "react";
import "./App.css";

const API_KEY = "cd6d9f9ee83133e9cf8155cac01fb3e3";

function App() {
  const [city, setCity] = useState("");
  const [loading, setLoading] = useState(false);
  const [weather, setWeather] = useState(null);
  const [error, setError] = useState("");

  const fetchWeather = async (cityName) => {
    if (!cityName.trim()) {
      setError("도시 이름을 입력해 주세요.");
      return;
    }

    setLoading(true);
    setError("");
    setWeather(null);

    try {
      const response = await fetch(
        `https://api.openweathermap.org/data/2.5/weather?q=${encodeURIComponent(cityName.trim())}&appid=${API_KEY}&units=metric&lang=kr`,
      );

      // HTTP 응답 오류 검사
      if (!response.ok) {
        if (response.status === 404) {
          throw new Error("존재하지 않는 도시입니다.");
        }

        if (response.status === 401) {
          throw new Error("API KEY를 확인해 주세요.");
        }

        throw new Error("날씨 정보를 가져오지 못했습니다.");
      }

      // JSON 데이터 변환
      const data = await response.json();

      // 날씨 데이터 저장
      setWeather(data);
    } catch (err) {
      console.error("날씨 API 오류:", err);
      setError(err.message);
      setWeather(null);
    } finally {
      setLoading(false);
    }
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    fetchWeather(city);
  };

  // 초기 로드 시 서울 날씨 가져오기
  useEffect(() => {
    // 처음에 한 번만 실행
    fetchWeather("Seoul");
  }, []);

  return (
    <div className="app">
      <div className="container">
        <h1 className="title">🌤️ 날씨앱</h1>
        <form className="search-form" onSubmit={handleSubmit}>
          <input
            type="text"
            className="search-input"
            placeholder="도시 이름을 입력하세요(예:Seoul , Tokyo)"
            value={city}
            onChange={(e) => setCity(e.target.value)}
          />
          <button type="submit" className="search-button" disabled={loading}>
            {loading ? "검색중..." : "검색"}
          </button>
        </form>
        {error && <div className="error">{error} </div>}
        {weather && !loading && (
          <div className="weather-card">
            <div className="weather-header">
              <h2 className="city-name">
                {weather.name}, {weather.sys.country}
              </h2>
              <div className="weather-icon">
                <img
                  src={`https://openweathermap.org/img/wn/${weather.weather[0].icon}@4x.png`}
                  alt={weather.weather[0].description}
                />
              </div>
            </div>
            <div className="temperature">{Math.round(weather.main.temp)}°C</div>
            <div className="weather-description">
              {weather.weather[0].description}
            </div>
            <div className="weather-details">
              <div className="detail-item">
                <span className="detail-label">체감 온도</span>
                <span className="detail-value">
                  {Math.round(weather.main.feels_like)}°C
                </span>
              </div>
              <div className="detail-item">
                <span className="detail-label">습도</span>
                <span className="detail-value">{weather.main.humidity}%</span>
              </div>
              <div className="detail-item">
                <span className="detail-label">풍속</span>
                <span className="detail-value">{weather.wind.speed} m/s</span>
              </div>
              <div className="detail-item">
                <span className="detail-label">기압</span>
                <span className="detail-value">
                  {weather.main.pressure} hPa
                </span>
              </div>
            </div>
          </div>
        )}
        {loading && (
          <div className="loading">
            <div className="spinner"></div>
            <p>날씨정보 불러오는중 .....</p>
          </div>
        )}
      </div>
    </div>
  );
}

export default App;
