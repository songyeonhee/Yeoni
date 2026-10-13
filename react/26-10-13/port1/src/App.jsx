import { useEffect, useState } from "react";
import About from "./components/About";
import Contact from "./components/Contact";
import Header from "./components/Header";
import Hero from "./components/Hero";
import Projects from "./components/Projects";
import Skills from "./components/Skills";

function App() {
  const [isScrolled, setIsScrolled] = useState(false);
  useEffect(() => {
    // 스크롤이 일어날 때마다 실행할 함수를 정의
    const handleScroll = () => {
      setIsScrolled(window.scrollY > 50);
      // $(window).scrollTop(); 와 같음
      // 세로 스크롤 위치가 50px 이상이면 true, 그렇지 않으면 false
    };
    window.addEventListener("scroll", handleScroll);

    // 컴포넌트가 사라질 때 실행될 클린 업 함수 (정리 함수) - 메모리 누수 방지
    return () => window.removeEventListener("scroll", handleScroll);
  }, []);
  // [] : 빈 의존성 배열 - 딱 한 번만 이벤트 리스너를 등록

  return (
    <div className="App">
      <Hero />
      <About />
      <Skills />
      <Projects />
      <Contact />
      <Header isScrolled={isScrolled} />
    </div>
  );
}

export default App;
