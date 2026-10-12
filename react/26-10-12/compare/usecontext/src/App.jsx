
import Header from "./components/Header";
import MainContent from "./components/MainContent";
import AppProvider from "./context/AppContext";
import "./App.css";

function App() {
  return (
    <AppProvider>
      <div className="app">
        <Header />
        <MainContent />
      </div>
    </AppProvider>
  );
}

export default App;
