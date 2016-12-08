

var format = function (date) {
    var fmt = "yyyy-MM-dd";
    var o = {
        "M+": date.getMonth() + 1,                 //月份
        "d+": date.getDate(),                    //日
        "h+": date.getHours(),                   //小时
        "m+": date.getMinutes(),                 //分
        "s+": date.getSeconds(),                 //秒
        "q+": Math.floor((date.getMonth() + 3) / 3), //季度
        "S": date.getMilliseconds()             //毫秒
    };
    if (/(y+)/.test(fmt))
        fmt = fmt.replace(RegExp.$1, (date.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt))
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
};
var addDay = function (days) {
    var d = new Date();
    d.setDate(d.getDate() + days);
    return d;
};

var getNumData = function (response) {
    var userTotalNumArray = new Array();
    var facebookNumArray = new Array();
    var newUserNumArray = new Array();
    var newFacebookNumArray = new Array();
    var numData = new Array();
    $.each(response.body, function (name, value) {
        userTotalNumArray.push(value.userTotalNum);
        newUserNumArray.push(value.newUserNum);
        newFacebookNumArray.push(value.newFacebookNum);
        facebookNumArray.push(value.facebookNum);
    });
    numData.push(userTotalNumArray);
    numData.push(facebookNumArray);
    numData.push(newUserNumArray);
    numData.push(newFacebookNumArray);
    return numData;
};

var getNumDataVideo = function (response) {
    var videoTimeArray = new Array();
    var videoPeopleArray = new Array();
    var matchVideoPeopleArray = new Array();
    var matchVideoTimeArray = new Array();
    var numData = new Array();
    $.each(response.body, function (name, value) {
        videoTimeArray.push(value.videoTime);
        videoPeopleArray.push(value.videoPeople);
        matchVideoPeopleArray.push(value.matchVideoPeople);
        matchVideoTimeArray.push(value.matchVideoTime);
    });
    numData.push(videoTimeArray);
    numData.push(videoPeopleArray);
    numData.push(matchVideoPeopleArray);
    numData.push(matchVideoTimeArray);
    return numData;
};


var getNumDataFriend = function (response) {
    var videoBefriendCountArray = new Array();
    var videoBefriendNumArray = new Array();
    var numData = new Array();
    $.each(response.body, function (name, value) {
        videoBefriendCountArray.push(value.videoBefriendCount);
        videoBefriendNumArray.push(value.videoBefriendCount*2);
    });
    numData.push(videoBefriendCountArray);
    numData.push(videoBefriendNumArray);
    return numData;
};

var getNumDataConsume = function (response) {
    var matchPagePayCountArray = new Array();
    var matchPagePayPeopleArray = new Array();
    var numData = new Array();
    $.each(response.body, function (name, value) {
        matchPagePayCountArray.push(value.matchPagePayCount);
        matchPagePayPeopleArray.push(value.matchPagePayPeople);
    });
    numData.push(matchPagePayCountArray);
    numData.push(matchPagePayPeopleArray);
    return numData;
};

var getItem = function (response) {
    var xaxisArray = new Array();
    $.each(response.body, function (name, value) {
        xaxisArray.push(value.createTime);
    });
    return xaxisArray;
};

var angularShow=function(url,legend,type){
    var app = angular.module('myApp', []);
    var adminId = $.cookie("adminId");
    var beginDate = format(addDay(-30));
    var endDate = format(addDay(1));
    app.controller('myCtrl', function ($scope, $http) {
        $http.get(url + "adminId=" + adminId + "&beginDate=" + beginDate + "&endDate=" + endDate)
            .success(function (response) {
                console.log(response);
                $scope.data = response.body;
                if(type==1){
                    $scope.newUserNum = response.body[0].newUserNum;
                    $scope.userTotalNum = response.body[0].userTotalNum;
                    $scope.userBoyNum = response.body[0].userBoyNum;
                    $scope.userGirlNum = response.body[0].userGirlNum;
                    $scope.numData = getNumData(response);
                }else if(type==2){
                    $scope.videoTime = response.body[0].videoTime;
                    $scope.videoPeople = response.body[0].videoPeople;
                    $scope.matchVideoPeople = response.body[0].matchVideoPeople;
                    $scope.matchVideoTime = response.body[0].matchVideoTime;
                    $scope.numData = getNumDataVideo(response);
                }else if(type==3){
                    $scope.videoBefriendCount = response.body[0].videoBefriendCount;
                    $scope.videoBefriendNum = response.body[0].videoBefriendCount*2;
                    $scope.numData = getNumDataFriend(response);
                }else if(type==4){
                    $scope.matchPagePayCount = response.body[0].matchPagePayCount;
                    $scope.matchPagePayPeople = response.body[0].matchPagePayPeople;
                    $scope.numData = getNumDataConsume(response);
                }
                $scope.item = getItem(response);
                $scope.legend = legend;
                chartShow($scope);
                // 日历插件
                var dateRange = new pickerDateRange('date_show', {
                    isTodayValid: false,
                    startDate: format(addDay(-30)),
                    endDate: format(new Date()),
                    //needCompare : true,
                    //isSingleDay : true,
                    //shortOpr : true,
                    dayRangeMax: '30', // 日期最大范围(以天计算)
                    startDateId: 'startDate',
                    endDateId: 'endDate',
                    defaultText: ' 至 ',
                    inputTrigger: 'input_trigge',
                    theme: 'ta',
                    success: function (obj) {
                        $("#dCon").html('开始时间 : ' + obj.startDate + '<br/>结束时间 : ' + obj.endDate);
                        console.log(obj.startDate)
                        $http.get(url + "adminId=" + adminId + "&beginDate=" + obj.startDate + "&endDate=" + obj.endDate).success(function (resp) {
                            $scope.data = resp.body;
                            $scope.numData = getNumData(resp);
                            $scope.item = getItem(resp);
                            chartShow($scope);
                        })
                    }
                });

            });
    }).run(['$rootScope',function($rootScope){
        $rootScope.nativeId=getCurrentNativeId();
        function getCurrentNativeId(){
            var href=window.location.href;
            var str = href.substring(href.lastIndexOf("/")+1,href.lastIndexOf(".html"));
            console.log(str);
            return str;
        }
    }]).directive('native',['$rootScope',function($rootScope,$cookies){
            return{
                restrict:'A',
                link:function(scope,element,attrs){
                    $(element).click(function(){
                        scope.$apply(function(){
                            $rootScope.nativeId = attrs.href;
                        });
                    });
                }
            }
        }]);
}
var chartShow = function ($scope) {
    // 基于准备好的dom，初始化echarts实例
    var myChart = echarts.init(document.getElementById('main'));
    // 指定图表的配置项和数据
    var option = {
        title: {
            text: '折线图堆叠'
        },
        tooltip: {
            trigger: 'axis'
        },
        legend: {
            data: $scope.legend
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '3%',
            containLabel: true
        },
        toolbox: {
            feature: {
                saveAsImage: {}
            }
        },
        xAxis: {
            type: 'category',
            boundaryGap: false,
            data: $scope.item,
            axisLabel: {
                //X轴刻度配置
                //interval: //0：表示全部显示不间隔；auto:表示自动根据刻度个数和宽度自动设置间隔个数
            }
        },
        yAxis: {
            type: 'value'
        },
        series: function () {
            var serie = [];
            for (var i = 0; i < $scope.legend.length; i++) {
                var item = {
                    name: $scope.legend[i],
                    type: 'line',
                    data: $scope.numData[i]
                };
                serie.push(item);
            }
            return serie;
        }()
    };
    // 使用刚指定的配置项和数据显示图表。
    myChart.setOption(option);
    window.onresize = myChart.resize;
}