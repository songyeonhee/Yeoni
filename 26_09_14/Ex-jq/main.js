// #31
$(function () {
  $("#btn").on("click", function () {
    $("#title").text("안녕 jQuery");
  });
});

// #32
$(function () {
  $("#box").mouseenter(function () {
    $(this).css("color", "red");
  });

  $("#box").mouseleave(function () {
    $(this).css("color", "black");
  });
});

// #33
$(function () {
  $("#toggleBtn").on("click", function () {
    $("#panel").slideToggle(300);
  });
});

// #34
$(function () {
  $("ul > li").on("click", function () {
    alert($(this).text());
  });
});

// #35
$(function () {
  $("#loginForm").on("submit", function (e) {
    e.preventDefault();
    console.log($("#userid").val());
  });
});
