$(function () {
  $(".hamburger").on("click", function () {
    $(this).toggleClass("active");
    $(".mobile-nav").toggleClass("active");
    $("body").toggleClass("no-scroll");
  });

  $(".mobile-gnb > li > a").on("click", function () {
    const subMenu = $(this).siblings(".sub-menu");
    const hasActive = subMenu.hasClass("active");
    $(".mobile-gnb .sub-menu").removeClass("active");
    if (!hasActive) {
      subMenu.addClass("active");
    }
  });

  $(".mob-menu-toggle").on("click", function () {
    const subMenu = $(this).siblings(".sub-menu");
    const hasActive = subMenu.hasClass("active");
    $(".mobile-gnb .sub-menu").removeClass("active");
    if (!hasActive) {
      subMenu.addClass("active");
    }
  });

  $(document).on("keydown", function (e) {
    if (e.key === "Escape") {
      $(".hamburger").removeClass("active");
      $(".mobile-nav").removeClass("active");
      $("body").removeClass("no-scroll");
    }
  });
});
