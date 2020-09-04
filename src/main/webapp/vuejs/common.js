var baseUrl = "http://localhost:8090/"

//定义ajax响应成功失败变量
var ajaxSuccess = 1
var ajaxFail = 0

//获取当前日期，格式YYYY-MM-DD
var getCurrentDate = function() {
    var date = new Date();
    var seperator = "-";
    var year = date.getFullYear();
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if(month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if(strDate >= 1 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = year + seperator + month + seperator + strDate;
    return currentdate;
}

