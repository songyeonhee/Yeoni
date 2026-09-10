$(function () {
  var top1 = $("#item1").offset().top;
  var left1 = $("#item1").offset().left;
  var left2 = $("#item2").offset().left;
  var left3 = $("#item3").offset().left;
  var lef4 = $("#item4").offset().left;
  var left5 = $("#item5").offset().left;

  $(window).scroll(function () {
    var sct = $(this).scrollTop();
    $("#value").text(sct);
    $("#item1").css({ top: top1 + sct / 4 });
    $("#item2").css({ top: top1 + sct / 5, left: left2 + sct / 8 });
    $("#item3").css({ top: top1 + sct / 6, left: left3 + sct / 6 });
    $("#item4").css({ top: top1 + sct / 8, left: left4 + sct / 5 });
    $("#item3").css({ left: left5 + sct / 4 });
  });
});
