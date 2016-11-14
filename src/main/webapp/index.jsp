<%--
  Created by IntelliJ IDEA.
  User: lixiang
  Date: 11/11/2016
  Time: 12:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="base.jsp"%>
<html xml:lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>狗粮到货</title>
    <link type="text/css" rel="stylesheet" href="${rootpath}/resource/renxi/default.css">
    <script type="text/javascript" src="${rootpath}/resource/renxi/jquery.min.js"></script>
    <script type="text/javascript" src="${rootpath}/resource/renxi/jscex.min.js"></script>
    <script type="text/javascript" src="${rootpath}/resource/renxi/jscex-parser.js"></script>
    <script type="text/javascript" src="${rootpath}/resource/renxi/jscex-jit.js"></script>
    <script type="text/javascript" src="${rootpath}/resource/renxi/jscex-builderbase.min.js"></script>
    <script type="text/javascript" src="${rootpath}/resource/renxi/jscex-async.min.js"></script>
    <script type="text/javascript" src="${rootpath}/resource/renxi/jscex-async-powerpack.min.js"></script>
    <script type="text/javascript" src="${rootpath}/resource/renxi/functions.js" charset="utf-8"></script>
    <script type="text/javascript" src="${rootpath}/resource/renxi/love.js" charset="utf-8"></script>
    <style type="text/css">
        <!--
        .STYLE1 {color: #666666}
        -->
    </style>
</head>
<body>
<audio autoplay="autopaly">
    <source src="${rootpath}/resource/luck.mp3" type="audio/mp3" />
</audio>

<div id="main">
    <div id="wrap">
        <div id="text">
            <div id="code">
                <font color="#FF0000">
                    <span class="say">远方的小妹，Hello，想不到狗粮长这个样子吧</span><br>
                    <span class="say"> </span><br>
                    <span class="say"> 首先介绍下这款狗粮：</span><br>
                    <span class="say"> </span><br>
                    <span class="say">专业，定制版，只有VVVVVVIP才可享受 (☆_☆)(☆_☆)</span><br>
                    <span class="say">借这款狗粮向远在异地的单身汪表达诚挚的问候，多买些狗粮，把自己照顾好 \(^o^)/</span><br>
                    <span class="say">学业为重！前路漫漫，选择了道路便只顾风雨兼程,Fighting!^_^o~ 努力！</span><br>
                    <span class="say">下面是重点！！！！！------></span><br>
                    <span class="say"> </span><br>
                    <a href="${rootpath}/resource/真正的狗粮.docx">
                    <span class="say"><span class="space"></span> <h3>-- 在上海的某人--</h3></span>
                    </a>
                </font></p>
            </div>
        </div>

        <div id="clock-box">
            <span class="STYLE1"></span><font color="#33CC00">狗粮保质期</font>
            <span class="STYLE1">还剩余：</span>
            <div id="clock"></div>
        </div>

        <canvas id="canvas" width="1100" height="680"></canvas>

    </div>

</div>

</body>

<script>
    (function(){

        var canvas = $('#canvas');

        if (!canvas[0].getContext) {
            $("#error").show();
            return false;        }

        var width = canvas.width();
        var height = canvas.height();
        canvas.attr("width", width);
        canvas.attr("height", height);
        var opts = {
            seed: {
                x: width / 2 - 20,
                color: "rgb(190, 26, 37)",
                scale: 2
            },
            branch: [
                [535, 680, 570, 250, 500, 200, 30, 100, [
                    [540, 500, 455, 417, 340, 400, 13, 100, [
                        [450, 435, 434, 430, 394, 395, 2, 40]
                    ]],
                    [550, 445, 600, 356, 680, 345, 12, 100, [
                        [578, 400, 648, 409, 661, 426, 3, 80]
                    ]],
                    [539, 281, 537, 248, 534, 217, 3, 40],
                    [546, 397, 413, 247, 328, 244, 9, 80, [
                        [427, 286, 383, 253, 371, 205, 2, 40],
                        [498, 345, 435, 315, 395, 330, 4, 60]
                    ]],
                    [546, 357, 608, 252, 678, 221, 6, 100, [
                        [590, 293, 646, 277, 648, 271, 2, 80]
                    ]]
                ]]
            ],
            bloom: {
                num: 700,
                width: 1080,
                height: 650,
            },
            footer: {
                width: 1200,
                height: 5,
                speed: 10,
            }
        }

        var tree = new Tree(canvas[0], width, height, opts);
        var seed = tree.seed;
        var foot = tree.footer;
        var hold = 1;

        canvas.click(function(e) {
            var offset = canvas.offset(), x, y;
            x = e.pageX - offset.left;
            y = e.pageY - offset.top;
            if (seed.hover(x, y)) {
                hold = 0;
                canvas.unbind("click");
                canvas.unbind("mousemove");
                canvas.removeClass('hand');
            }
        }).mousemove(function(e){
            var offset = canvas.offset(), x, y;
            x = e.pageX - offset.left;
            y = e.pageY - offset.top;
            canvas.toggleClass('hand', seed.hover(x, y));
        });

        var seedAnimate = eval(Jscex.compile("async", function () {
            seed.draw();
            while (hold) {
                $await(Jscex.Async.sleep(10));
            }
            while (seed.canScale()) {
                seed.scale(0.95);
                $await(Jscex.Async.sleep(10));
            }
            while (seed.canMove()) {
                seed.move(0, 2);
                foot.draw();
                $await(Jscex.Async.sleep(10));
            }
        }));

        var growAnimate = eval(Jscex.compile("async", function () {
            do {
                tree.grow();
                $await(Jscex.Async.sleep(10));
            } while (tree.canGrow());
        }));

        var flowAnimate = eval(Jscex.compile("async", function () {
            do {
                tree.flower(2);
                $await(Jscex.Async.sleep(10));
            } while (tree.canFlower());
        }));

        var moveAnimate = eval(Jscex.compile("async", function () {
            tree.snapshot("p1", 240, 0, 610, 680);
            while (tree.move("p1", 500, 0)) {
                foot.draw();
                $await(Jscex.Async.sleep(10));
            }
            foot.draw();
            tree.snapshot("p2", 500, 0, 610, 680);

            // 会有闪烁不得意这样做, (＞﹏＜)
            canvas.parent().css("background", "url(" + tree.toDataURL('image/png') + ")");
            canvas.css("background", "#ffe");
            $await(Jscex.Async.sleep(300));
            canvas.css("background", "none");
        }));

        var jumpAnimate = eval(Jscex.compile("async", function () {
            var ctx = tree.ctx;
            while (true) {
                tree.ctx.clearRect(0, 0, width, height);
                tree.jump();
                foot.draw();
                $await(Jscex.Async.sleep(25));
            }
        }));

        var textAnimate = eval(Jscex.compile("async", function () {
            var together = new Date();
            together.setFullYear(2016,2 , 1); 			//时间年月日
            together.setHours(19);						//小时
            together.setMinutes(0);					//分钟
            together.setSeconds(0);					//秒前一位
            together.setMilliseconds(0);				//秒第二位

            $("#code").show().typewriter();
            $("#clock-box").fadeIn(500);
            while (true) {
                timeElapse(together);
                $await(Jscex.Async.sleep(1000));
            }
        }));

        var runAsync = eval(Jscex.compile("async", function () {
            $await(seedAnimate());
            $await(growAnimate());
            $await(flowAnimate());
            $await(moveAnimate());

            textAnimate().start();

            $await(jumpAnimate());
        }));

        runAsync().start();
    })();
</script>

</html>
