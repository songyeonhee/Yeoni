$(function () {
  var a2 = $("#area2").offset().top;
  var a3 = $("#area3").offset().top;
  var ash = $("#ashColorArea").offset().top;

  $(window).scroll(function () {
    var sct = $(this).scrollTop();
    $("sValue").text(sct);
    $("#area1").css("background-position-y", sct);
  });
});
