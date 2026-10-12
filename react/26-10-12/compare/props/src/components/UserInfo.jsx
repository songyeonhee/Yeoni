import { useState } from "react";

function UserInfo({ user, updateUserName, updateUserAge }) {
  const [nameInput, setNameInput] = useState("");
  const [ageInput, setAgeInput] = useState("");

  const handleNameSubmit = (e) => {
    e.preventDefault();
    if (nameInput.trim()) {
      updateUserName(nameInput); // 키보드로 입력한 내용으로 useNmae을 변경
      setNameInput("");
    }
  };

  const handleAgeSubmit = (e) => {
    e.preventDefault();
    if (ageInput && !isNaN(ageInput)) {
      // not a number
      updateUserAge(parseInt(ageInput));
      // parseInt(10.5px) -> 10
      setAgeInput("");
    }
  };

  return (
    <div className="user-info">
      <div className="user-display">
        <p>
          <strong>이름 : {user.name}</strong>
        </p>
        <p>
          <strong>나이 : {user.age}세</strong>
        </p>
      </div>
      <form onSubmit={handleNameSubmit} className="form">
        <input
          type="text"
          value={nameInput}
          onChange={(e) => setNameInput(e.target.value)} // 키보드로 입력하는 내용
          placeholder="새 이름 입력"
        />
        <button type="submit">이름 변경하기</button>
      </form>
      <form onSubmit={handleAgeSubmit} className="form">
        <input
          type="number"
          value={ageInput}
          onChange={(e) => setAgeInput(e.target.value)}
          placeholder="새 나이 입력"
        />
        <button type="submit">나이 변경</button>
      </form>
    </div>
  );
}

export default UserInfo;
