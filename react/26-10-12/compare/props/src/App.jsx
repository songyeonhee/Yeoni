import { useState } from "react";
import Header from "./components/Header";
import MainContent from "./components/MainContent";
import "./App.css";

function App() {
  const [count, setCount] = useState(0);
  const [user, setUser] = useState({
    name: "홍길동",
    age: 25,
  });

  const updateUserName = (name) => setUser({ ...user, name });
  const updateUserAge = (age) => setUser({ ...user, age });

  const incrementCount = () => setCount(count + 1);
  const decrementCount = () => setCount(count - 1);
  const resetCount = () => setCount(0);

  return (
    <div className="app">
      <Header user={user} />
      <MainContent
        // Props 이름 = {실제 전달할 값 (홍길동, 30)}
        user={user}
        updateUserName={updateUserName}
        updateUserAge={updateUserAge}
        count={count}
        incrementCount={incrementCount}
        decrementCount={decrementCount}
        resetCount={resetCount}
      />
    </div>
  );
  // count: 현재 숫자 상태
  // setCount: 숫자 상태를 변경하는 함수
  // user: 사용자 정보 객체
  // setUser: 사용자 정보 객체를 변경하는 함수
}

export default App;
