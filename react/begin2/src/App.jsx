import Hello from "./Hello";
import "./App.css";

function App() {
  const name = "react";
  const style = {
    backgroundColor: "black",
    color: "aqua",
    fontSize: "24",
    padding: "1rem",
  };
  return (
    // <>
    //   {/* 주석은 화면에는 보이지 않습니다 중괄호 필수 */}
    //   <Hello />
    //   <div style={style}>{name}</div>
    //   <div className="gray-box"></div>
    // </>

    <div>
      <Hello name="react" color="red" />
    </div>
  );
}

export default App;
