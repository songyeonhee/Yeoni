$(function () {
  let bxslider1 = $(".bxslider1").bxSlider({
    auto: true,
    pager: false,
    controls: false,
    // onSliderLoad: function (currentIndex) {
    //   $("current-slide-number").text(currentIndex + 1);
    // },

    onSlideBefore: function ($slideElement, prevIdex, nextIndex) {
      // $slideElement 이동할 슬라이드 객체
      // prevIndex 이전 슬라이드 번호
      // nextIndex 이동할 인덱스 번호

      $("#current-slide-number").text(nextIndex + 1);
    },
  });

  $(".pause").on("click", function (e) {
    if ($(this).hasClass("on") == "true") {
      $(this).removeClass("on");
      bxslider1.startAuto();
    } else {
      $(this).addClass("on");
      bxslider1.stopAuto();
    }

    return false;
  });

  $(".prev-btn").on("click", function () {
    bxslider1.goToPrevSlide();
    return false;
  });
  $(".next-btn").on("click", function () {
    bxslider1.goToNextSlide();
    return false;
  });
});

$(function () {
  let bxslider2 = $(".bxslider2").bxSlider({
    auto: true,
    pager: false,
  });
});
