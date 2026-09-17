import { useState } from "react";

function InputSample() {
  const [text, setText] = useState("");

  const onChange = (e) => {
    setText(e.target.value); // 키보드로 입력한 input 값을 가지고와 text 변경
    // console.log(e.target.value);
    // 이벤트가 발생한 input 값을 가져와 text라는 state 변수에 저장
  };

  const onReset = () => {
    setText("");
  };
  return (
    <div>
      <input onChange={onChange} value={text} />
      <button onClick={onReset}>초기화</button>
      <div>
        <b>값 : {text}</b>
      </div>
    </div>
  );
}

export default InputSample;