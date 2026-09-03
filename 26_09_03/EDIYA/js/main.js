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
