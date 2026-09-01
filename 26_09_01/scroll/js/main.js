$(function () {
  var off1 = $("#section1").offset().top;
  var off2 = $("#section2").offset().top;
  var off3 = $("#section3").offset().top;
  var off4 = $("#section4").offset().top;
  var off5 = $("#section5").offset().top;

  var of_1 = $("#wrap > section").eq(0).offset().top;
  var of_2 = $("#wrap > section").eq(1).offset().top;
  var of_3 = $("#wrap > section").eq(2).offset().top;

  var f_top = $("#float-div").offset().top;
  $(window).scroll(function () {
    var sct = $(window).scrollTop();

    $(".s-top").text(sct);

    if (sct > 50) {
      $("nav").addClass("fixed");
    } else {
      $("nav").removeClass("fixed");
    }

    if (sct >= $("#wrap > section").eq(0).offset().top) {
      $("nav ul li").removeClass("on");
      $("nav ul li").eq(0).addClass("on");
    }

    if (sct >= $("#wrap > section").eq(1).offset().top) {
      $("nav ul li").removeClass("on");
      $("nav ul li").eq(1).addClass("on");
    }

    if (sct >= $("#wrap > section").eq(2).offset().top) {
      $("nav ul li").removeClass("on");
      $("nav ul li").eq(2).addClass("on");
    }

    if (sct >= $("#wrap > section").eq(3).offset().top) {
      $("nav ul li").removeClass("on");
      $("nav ul li").eq(3).addClass("on");
    }

    if (sct >= $("#wrap > section").eq(4).offset().top) {
      $("nav ul li").removeClass("on");
      $("nav ul li").eq(4).addClass("on");
    }

    $("#float-div")
      .stop()
      .animate({ top: f_top + sct }, 300);
  });

  // alert(f_top);

  $("#nav ul li").click(function () {
    var i = $(this).index();
    var offTop = $("#wrap > section").eq(i).offset().top;

    $("html, body")
      .stop()
      .animate({ scrollTop: offTop + "px" }, 800);

    $("nav ul li").removeClass("on");
    $("nav ul li").eq(i).addClass("on");
    return false;
  });

  $("#pop-up").draggable();

  // pop이라는 이름의 쿠기 값을 가져옴
  // 처음 방문한 사람은 팝업이 보임
  if ($.cookie("pop") != "no") {
    $("#pop-up").show();
  }

  $("#pop-up area")
    .eq(1)
    .click(function (e) {
      e.preventDefault();
      $("#pop-up").fadeOut("fast");
    });

  $("#pop-up area:eq(0)").click(function (e) {
    e.preventDefault();
    $.cookie("pop", "no", { expires: 1 });
    // expires에 저장된 기간동안 pop에 no를 저장
    $("#pop-up").fadeOut("fast");
  });

  $("#notice-wrap").draggable();
  if ($.cookie("popup") == "none") {
    $("#notice-wrap").hide();
  }

  var chk = $("#expireChk");
  $(".closeBtn").on("click", closePop);

  function closePop() {
    if (chk.is(":checked")) {
      $.cookie("popup", "none", { expire: 3 });
    }
    $("#notice-wrap").fadeOut();
  }
});
