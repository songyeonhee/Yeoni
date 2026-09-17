import ProfileCard from "./components/ProfileCard";

function App() {
  return (
    <div
      style={{
        display: "flex",
        flexWrap: "wrap",
        gap: "1.25rem",
      }}
    >
      <ProfileCard
        name="홍길동"
        age={25}
        job="프론트엔드 개발자"
        image="src/assets/1.jpg"
      />

      <ProfileCard
        name="김영희"
        age={28}
        job="백엔드 개발자"
        image="src/assets/2.jpg"
      />

      <ProfileCard
        name="이철수"
        age={31}
        job="UI/UX 디자이너"
        image="src/assets/3.jpg"
      />
    </div>
  );
}

export default App;
