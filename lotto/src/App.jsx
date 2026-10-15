import { useState } from "react";

function App() {
  const [number, setNumber] = useState([]);
  const handleDraw = () => {
    const drawNumber = [];
    // for (let i = 0; i < 6; i++) {
    //   const randomNumber = Math.floor(Math.random() * 45 + 1);
    //   drawNumber.push(randomNumber);
    // }

    while (drawNumber.length < 7) {
      const randomNumber = Math.floor(Math.random() * 45 + 1);
      if (drawNumber.includes(randomNumber)) {
        return;
      } else {
        drawNumber.push(randomNumber);
      }
      setNumber(drawNumber);
    }
  };
  return (
    <div>
      <p>🔴🟢🟡</p>
      <h1>로또 번호 추첨기</h1>
      <button onClick={handleDraw}>추첨 시작하기</button>
      <p>{number.length === 0 ? "추첨을 시작해보세요!" : number}</p>
    </div>
  );
}

export default App;
