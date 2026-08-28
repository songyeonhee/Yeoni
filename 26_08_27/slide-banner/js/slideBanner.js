$(function () {
  let brandVisual = $("#brand-visual > ul > li"); // 배너 사진
  let button = $("#button-list > li"); // pager 버튼
  let currentIndex = 0; // 현재 사진 또는 pager를 나타냄
  let id;

  button.click(function () {
    // 클릭 시 버튼의 색 변경
    // 슬라이드를 움직이는 함수 호출
    let buttonIndex = $(this).index();
    //alert(buttonIndex);

    button.removeClass("on"); // 모든 버튼의 on 클래스 제거
    button.eq(buttonIndex).addClass("on");
    move(buttonIndex);

    return false;
  });

  function move(buttonIndex) {
    // 현재 활성화된 버튼과 클릭한 버튼이 동일하면 빠져나감
    if (currentIndex == buttonIndex) return;
    // buttonIndex는 button.click 내에서 선언했기 때문에 사용 불가
    // 매개변수로 넣어줌

    let currentSlide = brandVisual.eq(currentIndex); // 현재 사진, 시작 시 0
    let nextSlide = brandVisual.eq(buttonIndex); // 클릭한 인덱스의 사진

    currentSlide.css("left", "0").stop().animate({ left: "-100%" }, 500);
    nextSlide.css("left", "100%").stop().animate({ left: "0" }, 500);
    currentIndex = buttonIndex;
  }

  function timer() {
    setInterval(() => {
      let n = currentIndex + 1;
      if (n === 3) n = 0;

      button.eq(n).trigger("click");
      // 1씩 증가하며 버튼을 강제로 클릭
    }, 3000);
  }

  timer();
});
