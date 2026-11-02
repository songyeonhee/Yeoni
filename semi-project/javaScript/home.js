$(document).ready(function () {
  $(".sidebar-s1, .sidebar-s2").each(function () {
    const $targetTab = $(this);

    $targetTab.on("click", ".tab-btn", function () {
      const targetId = $(this).data("tab");
      $targetTab.find(".tab-btn").removeClass("active-tab-btn");
      $(this).addClass("active-tab-btn");

      $targetTab.find(".tab-contents").removeClass("active-tab-contents");
      $targetTab
        .find(".tab-contents")
        .filter(function () {
          return this.id === targetId;
        })
        .addClass("active-tab-contents");
    });
  });
});
