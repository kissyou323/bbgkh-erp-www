/**
 * Created by lixiang on 2016/7/17.
 */
var webroot =window.location.pathname;
console.log(webroot);
var webprotocol = window.location.protocol;
var webroot1 = webroot.substring(1)
var webroot2 = webroot.substring(0,webroot1.indexOf('/')+1);
var webHost = window.location.host;
console.log(webprotocol+"//"+webHost+webroot);
var rootpath =webprotocol+"//"+webHost+webroot


function getroot(){
    return webroot;
}