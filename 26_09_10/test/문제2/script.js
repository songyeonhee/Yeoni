$(function () {
  $(".tab-menu li").on("click", function () {
    const index = $(this).index();

    $(".tab-menu li").removeClass("active");
    $(".tab-menu li").eq(index).addClass("active");

    $(".tab-content div").removeClass("active");
    $(".tab-content div").eq(index).addClass("active");
  });
});
