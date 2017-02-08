$(function () {
   $("#divController").on("click","#memberManage",function (event) {

       var target = event.currentTarget;
       $(target).children("ul").toggleClass("collapse");
       $(target).siblings("li").children("a").removeClass("active");
       $(target).children("a").addClass("active");

   })
});