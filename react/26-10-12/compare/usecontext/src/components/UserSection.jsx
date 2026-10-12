import React from "react";
import { useAppContext } from "../context/AppContext";
import UserInfo from "./UserInfo";

function UserSection() {
  const { user, updateUserName, updateUserAge } = useAppContext();
  return (
    <section className="section">
      <h2>사용자 정보</h2>
      <UserInfo
        user={user}
        updateUserName={updateUserName}
        updateUserAge={updateUserAge}
      />
    </section>
  );
}

export default UserSection;
