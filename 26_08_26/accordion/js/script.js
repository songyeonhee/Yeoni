// 1. dd 숨기기
// 2. dd 중 첫 번째만 보여주기
// 3. 첫 번째 dt에 addClass("selected")
// 4. dt 클릭 시 아코디언이 되도록
// 5. dt 마우스 오버 시 this.addClass("over");
// 5. dt 마우스 아웃 시 this.removeClass("over");

$(function () {
  // dd 숨기기
  $("dd").hide();

  // dd 중 첫 번째만 보여주기
  $("dd").eq(0).show();

  // 첫 번째 dt에 addClass("selected")
  $("dt").eq(0).addClass("selected");

  // dl dt 클릭 시 아코디언이 되도록
  $("dl dt").click(function () {
    var status = $(this).next("dd").css("display");
    if (status == "none") {
      $("dd").slideUp("slow");
      $(this).next().slideDown("slow");
      $("dl dt").removeClass("selected");
      $(this).addClass("selected");
    }
  });

  // dl dt 마우스 오버 시 this.addClass("over");
  $("dl dt").mouseover(function () {
    $(this).addClass("over");
  });

  // dl dt 마우스 아웃 시 this.removeClass("over");
  $("dl dt").mouseout(function () {
    $(this).removeClass("over");
  });
});
//   $("dt").click(function () {
//     let ddStatus = $(this).next("dd").css("display");
//     // console.log(ddStatus);
//     if (ddStatus == "none") {
//       $("dt").removeClass("selected");
//       $("dd").slideUp();
//       $(this).addClass("selected");
//       $(this).next("dd").slideDown();
//     } else {
//       $("dd").slideUp();
//     }
//   });

//   $("dt").mouseover(function () {
//     $("dt").removeClass("selected");
//     $(this).addClass("selected");
//     $(this).next("dd").slideDown();
//   });

//   $("dt").mouseleave(function () {
//     $("dt").removeClass("selected");
//     $(this).next("dd").slideUp();
//   });
// });
