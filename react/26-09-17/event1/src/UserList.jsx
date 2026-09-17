import User from "./User";

function UserList({ users, onRemove, onToggle }) {
  return (
    <div>
      {" "}
      {/* <div>
        <b>{users[0].username}</b>
        <span>({users[0].email})</span>
      </div>

      <div>
        <b>{users[1].username}</b>
        <span>({users[1].email})</span>
      </div>

      <div>
        <b>{users[2].username}</b>
        <span>({users[2].email})</span>
      </div> */}
      {/* <User user={users[0]} />
      <User user={users[1]} />
      <User user={users[2]} /> */}
      {users.map((user) => (
        <User
          user={user}
          key={user.id}
          onRemove={onRemove}
          // onRemove 함수는 UserList에서도 전달을 받으며, User 컴포넌트에게 전달
          onToggle={onToggle}
        />
      ))}
    </div>
  );
}

export default UserList;
