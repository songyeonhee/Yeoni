import UserList from "./UserList";
import CreateUser from "./CreateUser";
import { useRef } from "react";
import { useState } from "react";
function App() {
  const [inputs, setInputs] = useState({
    username: "",
    email: "",
  });
  const { username, email } = inputs; //구조분해할당
  // const username = inputs.username;
  // const email = inputs.email;

  const onChange = (e) => {
    const { name, value } = e.target;
    setInputs({
      ...inputs, // 기존 값을 기억
      [name]: value,
    });
  };

  const [users, setUsers] = useState([
    {
      id: 1,
      username: "velopert",
      email: "public.velopert@gmail.com",
      active: true,
    },
    {
      id: 2,
      username: "tester",
      email: "tester@example.com",
      active: true,
    },
    {
      id: 3,
      username: "liz",
      email: "liz@example.com",
      active: false,
    },
  ]);
  const nextId = useRef(4); // 초기값 지정
  const onCreate = () => {
    const user = {
      // 하나의 데이터 생성
      id: nextId.current,
      username,
      email,

      // const user = {
      // id: 4,
      // username: '홍길동',
      // email: 'hong@test.com'
      // };
    };
    setUsers([...users, user]);

    setInputs({
      username: "",
      email: "",
    });

    nextId.current += 1;
  };

  const onRemove = (id) => {
    // 리액트는 삭제의 개념이 존재하지 않음
    // user.id가 파라미터로 일치하지 않는 요소만 추출하여 새로운 배열을 만듦
    // user.id가 삭제되는 효과와 동일
    setUsers(users.filter((user) => user.id !== id));
  };

  const onToggle = (id) => {
    setUsers(
      users.map((user) =>
        user.id === id ? { ...user, active: !user.active } : user,
      ),
    );
  };
  return (
    <div>
      <CreateUser
        username={username}
        email={email}
        onChange={onChange}
        onCreate={onCreate}
      />
      <UserList users={users} onRemove={onRemove} onToggle={onToggle} />
    </div>
  );
}

export default App;
