import CounterSection from "./CounterSection";
import UserSection from "./UserSection";

function MainContent({
  user,
  updateUserName,
  updateUserAge,
  count,
  incrementCount,
  decrementCount,
  resetCount,
}) {
  return (
    <main className="main-content">
      <CounterSection
        count={count}
        incrementCount={incrementCount}
        decrementCount={decrementCount}
        resetCount={resetCount}
      />
      <UserSection
        user={user}
        updateUserName={updateUserName}
        updateUserAge={updateUserAge}
      />
    </main>
  );
}

export default MainContent;
