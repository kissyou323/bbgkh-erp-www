/**
 * Created by lixiang on 2016/7/17.
 */
console.log("aaa");



function keyup(){
    console.log($("#name").val());
    var name =$("#name").val();
    window.location.href="switch/home/"+name;

}


