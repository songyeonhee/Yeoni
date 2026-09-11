$(function () {
  $(".menu").on("click", function () {
    const clickMenu = $(this);
    const nextSubMenu = clickMenu.next(".submenu");

    $(".menu").removeClass("active");
    $(".submenu").slideUp(300);

    clickMenu.toggleClass("active");
    nextSubMenu.stop().slideToggle(300);
  });
});
