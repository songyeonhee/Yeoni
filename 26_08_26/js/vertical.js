$(function () {
  // .sub 안보이게하기
  // $(".m_menu li ul").css("display", none);
  $(".sub").hide();
  // $(".sub").css("display", none);

  // .sub 중 인덱스 번호 0번 (첫 번째 것만 보이도록)
  $(".sub").eq(0).show();
  //$('.m_menu li:nth-child(1) ul').css('display','block');
  //$('.m_menu li:nth-child(1) ul').show();
  //$('.m_menu li:eq(0) ul').show();
  //$('.m_menu li:first ul').show();

  $(".m_menu > li > a").click(function (e) {
    // return false;
    e.preventDefault();

    var status = $(this).next(".sub").css("display");
    // alert(status);
    // 클릭한 a태그의 다음에 있는 요소 중 class가 sub인 요소의 display 속성 값
    // 가져온 block/none 상태를 status에 저장

    if (status == "none") {
      $(".sub").slideUp();
      $(this).next(".sub").slideDown();
    } else {
      $(".sub").slideUp();
    }
  });
});
