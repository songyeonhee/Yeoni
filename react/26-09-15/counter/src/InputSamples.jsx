import { useState } from "react";

function InputSamples() {
  const [inputs, setInputs] = useState({
    name: "",
    nickname: "",
  });

  const { name, nickname } = inputs; // 구조 분해 할당 (비구조화 할당) 통해 추출
  // inputs 객체에서 값을 꺼내는 과정
  // const name = inputs.name;
  // const nickname = inputs.nickname;

  const onChange = (e) => {
    const { value, name } = e.target; // e.target에서 name과 value 추출
    setInputs({
      ...inputs, // 전개 연산자, 기존의 input 객체 복사
      [name]: value, // name키를 가진 값을 value로 설정
    });
  };

  const onReset = () => {
    setInputs({
      name: "",
      nickname: "",
    });
  };

  return (
    <div>
      <input placeholder="이름" name="name" onChange={onChange} value={name} />
      <input
        placeholder="닉네임"
        name="nickname"
        onChange={onChange}
        value={nickname}
      />
      <button onClick={onReset}>초기화</button>
      <div>
        <b>값: </b>
        이름 (닉네임)
      </div>
    </div>
  );
}

export default InputSamples;
