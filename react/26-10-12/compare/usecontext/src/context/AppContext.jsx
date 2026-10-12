import { createContext, useState, useContext } from "react";

// Context 생성 (전역 데이터의 통로)
const AppContext = createContext();

// Provider : 데이터 공급자
// children : 감싸진 컴포넌트
export default function AppProvider({ children }) {
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

  const value = {
    count,
    user,
    updateUserName,
    updateUserAge,
    incrementCount,
    decrementCount,
    resetCount,
  };
  return <AppContext.Provider value={value}>{children}</AppContext.Provider>;
  // Provider로 감싸진 모든 컴포넌트 내에서 value에 접근 가능
}

export function useAppContext() {
  const context = useContext(AppContext); // 쉽게 꺼내서 사용하기 좋게
  if (!context) {
    throw new Error("useAppContext must be used within AppProvider");
  }
  return context;
}
