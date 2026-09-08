$(function () {
  // <div class="main">
  //     <section class="section1">
  //       <ul class="bxslider"></ul>
  $(".bxslider").bxSlider({
    auto: true,
  });
});

$(function () {
  $(".slider-basic").slick({
    autoplay: true,
    dots: true,
    arrows: false,
    infinite: true,
    speed: 500,
    slidesToShow: 1,
    slidesToScroll: 1,
  });
});

$(function () {
  $(".pop_up")
    .find("img")
    .eq(1)
    .on("click", function (e) {
      e.preventDefault();
      $(".pop_up").fadeOut("fast");
    });
});
