/**
 * Created by admin on 2016/9/18.
 */
//var server = "http://livechat.rcplatformhk.com:8100";
var server = "http://localhost:8100";
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
    $.each(response, function (name, value) {
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


function formatSeconds(value) {
    var theTime = parseInt(value);// 秒
    var theTime1 = 0;// 分
    var theTime2 = 0;// 小时
    if (theTime > 60) {
        theTime1 = parseInt(theTime / 60);
        theTime = parseInt(theTime % 60);
        if (theTime1 > 60) {
            theTime2 = parseInt(theTime1 / 60);
            theTime1 = parseInt(theTime1 % 60);
        }
    }
    var result = "" + parseInt(theTime) + "秒";
    if (theTime1 > 0) {
        result = "" + parseInt(theTime1) + "分" + result;
    }
    if (theTime2 > 0) {
        result = "" + parseInt(theTime2) + "小时" + result;
    }
    return result;
}


function parseVideoTime(list) {
    $.each(list, function (name, value) {
        value.videoTime = formatSeconds(value.videoTime / 1000);
        value.matchVideoTime = formatSeconds(value.matchVideoTime / 1000);
        value.friendVideoTime = formatSeconds(value.friendVideoTime / 1000);
        value.threeChatAvgTime = formatSeconds(value.threeChatAvgTime / 1000);
    });
    return list;
}

var getNumDataVideo = function (response) {
    var videoTimeArray = new Array();
    var videoPeopleArray = new Array();
    var matchVideoPeopleArray = new Array();
    var matchVideoTimeArray = new Array();
    var numData = new Array();
    $.each(response, function (name, value) {
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

var getPayStat = function (response) {
    var goldNumArray = new Array();
    var moneyArray = new Array();
    var countArray = new Array();
    var numData = new Array();
    $.each(response.list, function (name, value) {
        goldNumArray.push(value.goldNum);
        moneyArray.push(value.money);
        countArray.push(value.count);
    })
    numData.push(goldNumArray);
    numData.push(moneyArray);
    numData.push(countArray);
    return numData;
}


var getNumDataFriend = function (response) {
    var videoBefriendCountArray = new Array();
    var videoBefriendNumArray = new Array();
    var numData = new Array();
    $.each(response, function (name, value) {
        videoBefriendCountArray.push(value.videoBefriendCount);
        videoBefriendNumArray.push(value.videoBefriendCount * 2);
    });
    numData.push(videoBefriendCountArray);
    numData.push(videoBefriendNumArray);
    return numData;
};

var getNumDataConsume = function (response) {
    var matchPagePayCountArray = new Array();
    var matchPagePayPeopleArray = new Array();
    var numData = new Array();
    $.each(response, function (name, value) {
        matchPagePayCountArray.push(value.matchPagePayCount);
        matchPagePayPeopleArray.push(value.matchPagePayPeople);
    });
    numData.push(matchPagePayCountArray);
    numData.push(matchPagePayPeopleArray);
    return numData;
};

var getNumDataMatchNum = function (response) {
    var matchTotal = new Array();
    var matchSuccess = new Array();
    var matchFail = new Array();
    var numData = new Array();
    $.each(response, function (name, value) {
        matchTotal.push(value.matchTotal);
        matchSuccess.push(value.matchSuccess);
        matchFail.push(value.matchFail);
    });
    numData.push(matchTotal);
    numData.push(matchSuccess);
    numData.push(matchFail);
    return numData;
};


var getItem = function (response) {
    var xaxisArray = new Array();
    $.each(response, function (name, value) {
        xaxisArray.push(value.createTime);
    });
    return xaxisArray;
};

var getItemList = function (response) {
    var xaxisArray = new Array();
    $.each(response.list, function (name, value) {
        var date = new Date();
        date.setTime(value.createTime);
        xaxisArray.push(date.toLocaleDateString());
    });
    return xaxisArray;
};

Array.prototype.indexOf = function (val) {
    for (var i = 0; i < this.length; i++) {
        if (this[i] == val) return i;
    }
    return -1;
};
Array.prototype.remove = function (val) {
    var index = this.indexOf(val);
    if (index > -1) {
        this.splice(index, 1);
    }
};

var animateApp = angular.module('animateApp', ['ngRoute', 'ngAnimate', 'angularPagination', 'ngTip','ui.bootstrap.datetimepicker']);
var adminId = $.cookie("adminId");


animateApp.config(function ($routeProvider) {
    $routeProvider
    // home page
        .when('/', {
            templateUrl: 'tpl/userStats.html',
            reloadOnSearch: true,
            controller: 'userController'
        })
        // about page
        .when('/videoStats', {
            templateUrl: 'tpl/videoStats.html',
            controller: 'videoController'
        })
        // contact page
        .when('/friStats', {
            templateUrl: 'tpl/friStats.html',
            controller: 'friController'
        })
        .when('/consStats', {
            templateUrl: 'tpl/consStats.html',
            controller: 'consController'
        })
        .when('/matchNum', {
            templateUrl: 'tpl/matchNum.html',
            controller: 'matchNumController'
        })
        .when('/push', {
            templateUrl: 'tpl/push.html',
            controller: 'pushController'
        })
        // about page
        .when('/report', {
            templateUrl: 'tpl/report.html',
            controller: 'reportController'
        })
        // contact page
        .when('/image', {
            templateUrl: 'tpl/image.html',
            controller: 'imageController'
        })
        .when('/setting', {
            templateUrl: 'tpl/setting.html',
            controller: 'settingController'
        })
        .when('/payStat', {
            templateUrl: 'tpl/payStat.html',
            controller: 'payStatController'
        })
        .when('/appVersion', {
            templateUrl: 'tpl/appVersion.html',
            controller: 'appVersionController'
        })
        .when('/dau', {
            templateUrl: 'tpl/dau.html',
            controller: 'dauController'
        })
        .when('/freeCommodity', {
            templateUrl: 'tpl/freeCommodity.html',
            controller: 'freeCommodityController'
        })
        .when('/reportSetting', {
            templateUrl: 'tpl/reportSetting.html',
            controller: 'reportSettingController'
        })
        .when('/offUserTotal', {
            templateUrl: 'tpl/offUserTotal.html',
            controller: 'offUserTotalController'
        })
        .when('/offUser', {
            templateUrl: 'tpl/offUser.html',
            controller: 'offUserController'
        })
        // about page
        .when('/userInfo', {
            templateUrl: 'tpl/userInfo.html',
            controller: 'userInfoController'
        });

});

// user controller
animateApp.controller('userController', function ($scope, $http) {
    if (adminId == null && adminId == undefined) {
        window.location.href = "login.html";
    }
    $scope.pageClass = 'page-1';
    var url = server + "/statistics/getUserStatistics.json?";
    var legend = ['总用户数量', 'facebook用户数量', '新增用户数量', '新增facebook用户数量'];
    stats($scope, $http, url, legend, 1, "userChar", "userDateRange");
    var getNowData = function () {
        $http.get(server + "/statistics/findUserNow.json?adminId=" + adminId).success(function (response) {
            $scope.nowData = response;
            console.log(response);
        });
    }
    getNowData();
    $scope.flush = function () {
        getNowData();
    }
});

/**
 * dauController
 */
animateApp.controller('dauController', function ($scope, $http) {
    //var beginDate = format(addDay(-30));
    var date = format(new Date());
    if (adminId == null && adminId == undefined) {
        window.location.href = "login.html";
    }
    $scope.pageClass = 'page-1';
    var url = server + "/statistics/getUserKeepDay.json?";
    var getNowData = function () {
        $http.get(server + "/statistics/getUserKeepNow.json?adminId=" + adminId).success(function (response) {
            $scope.nowData = response;
            console.log(response);
        });
    }
    getNowData();
    $scope.flush = function () {
        getNowData();
    }
    $http.get(url + "adminId=" + adminId).success(function (response) {
        console.log(response);
        $scope.data = response;
    });
    $scope.param = {adminId: adminId,date: date};
    $http.get(server+"/statistics/getActiveUserHour.json",{params: $scope.param}).success(function (response) {
        var xArray = new Array();
        var boyArray = new Array();
        var girlArray = new Array();
        var yArray = new Array();
        var x = function(type,data,name){
            this.type = type;
            this.data = data;
            this.name = name;
        }
        var xData = new Array();
        $.each(response, function (name, value) {
            var date = new Date(value.createTime);
            xData.push(date.getHours());
            boyArray.push(value.boyActiveCount);
            girlArray.push(value.girlActiveCount);
        });
        xArray.push(new x('category',xData));
        yArray.push(new x("bar",boyArray,"男性"));
        yArray.push(new x("bar",girlArray,"女性"));
        console.log(xArray);
        console.log(response);
        char(xArray,yArray);
    });
    var char = function(xArray,yArray){
        var myChart = echarts.init(document.getElementById("dauChar"));
        var option = {
            title : {
                text: '用户当天活跃数据'
            },
            tooltip : {
                trigger: 'axis'
            },
            legend: {
                data:['男性','女性']
            },
            toolbox: {
                show : true,
                feature : {
                    dataView : {show: true, readOnly: false},
                    magicType : {show: true, type: ['line', 'bar']},
                    restore : {show: true},
                    saveAsImage : {show: true}
                }
            },
            calculable : true,
            xAxis : xArray,
            yAxis : [
                {
                    type : 'value'
                }
            ],
            series : yArray
        };
        myChart.setOption(option);
        window.onresize = myChart.resize;
    }
});


// video controller
animateApp.controller('videoController', function ($scope, $http) {
    $scope.pageClass = 'page-2';
    var legend = ['视频通话总时间', '视频通话总人数', '匹配视频通话总时间', '匹配视频通话总人数'];
    var url = server + "/statistics/getVideoStatistics.json?";
    stats($scope, $http, url, legend, 2, "videoChar", "videoDateRange");
    var getNowData = function () {
        $http.get(server + "/statistics/getVideoNow.json?adminId=" + adminId).success(function (response) {
            $scope.nowData = response;
            $scope.nowData.videoTime = formatSeconds(response.videoTime / 1000);
            $scope.nowData.matchVideoTime = formatSeconds(response.matchVideoTime / 1000);
            $scope.nowData.friendVideoTime = formatSeconds(response.friendVideoTime / 1000);
            $scope.nowData.threeChatAvgTime = formatSeconds(response.threeChatAvgTime / 1000);
            console.log(response);
        });
    }
    getNowData();
    $scope.flush = function () {
        getNowData();
    }
});

// friend controller
animateApp.controller('friController', function ($scope, $http) {
    $scope.pageClass = 'page-3';
    var url = server + "/statistics/getFriendStatistics.json?";
    var legend = ['匹配环节成为好友总人数', '匹配环节成为好友总次数'];
    stats($scope, $http, url, legend, 3, "friChar", "friDateRange");
    var getNowData = function () {
        $http.get(server + "/statistics/getFriendNow.json?adminId=" + adminId).success(function (response) {
            $scope.nowData = response;
            console.log(response);
        });
    }
    getNowData();
    $scope.flush = function () {
        getNowData();
    }
});

// 消费 controller
animateApp.controller('consController', function ($scope, $http) {
    $scope.pageClass = 'page-1';
    var url = server + "/statistics/getConsumeStatistics.json?";
    var legend = ['聊天付费人数', '聊天付费次数'];
    stats($scope, $http, url, legend, 4, "consChar", "consDateRange");
    var getNowData = function () {
        $http.get(server + "/statistics/getConsumeNow.json?adminId=" + adminId).success(function (response) {
            $scope.nowData = response;
            console.log(response);
        });
    }
    getNowData();
    $scope.flush = function () {
        getNowData();
    }
});

//匹配次数
animateApp.controller('matchNumController', function ($scope, $http) {
    $scope.pageClass = 'page-1';
    var url = server + "/statistics/getMatchNum.json?";
    var getNowData = function () {
        $http.get(server + "/statistics/getMatchDayNow.json?adminId=" + adminId).success(function (response) {
            $scope.nowData = response;
            console.log(response);
        });
    }
    getNowData();
    $scope.flush = function () {
        getNowData();
    }
    $http.get(url + "adminId=" + adminId).success(function (response) {
        console.log(response);
        $scope.data = response;
    });
});

// 推送 controller
animateApp.controller('pushController', function ($scope, $http, ngTip) {
    $scope.table = false;
    $scope.pageClass = 'page-2';
    var url = server + "/push/addPush.json?";
    $('.form_datetime').datetimepicker({
        language: 'zh-CN',
        weekStart: 1,
        todayBtn: 1,
        autoclose: 1,
        todayHighlight: 1,
        startView: 2,
        forceParse: 0,
        showMeridian: 1
    });
    var PushLanguage = function (languageId,context) {
        this.languageId = languageId;
        this.context = context;
    }
    $scope.reset = function () {
        var pushLanguages = new Array();
        pushLanguages.push(new PushLanguage(1,$scope.english));
        pushLanguages.push(new PushLanguage(2,$scope.chinese));
        pushLanguages.push(new PushLanguage(12,$scope.portugal));
        $scope.push = {adminId: adminId,pushLanguages:pushLanguages};
        console.log($scope.push);
        $http.post(url, $scope.push).success(function (response) {
            console.log(response);
            if (response.status == 10000) {
                ngTip.tip('添加成功', 'success');
            } else {
                ngTip.tip("操作失败", "danger");
            }
        });
    };
    $scope.show = function () {
        $scope.param = {adminId: adminId}
        $http.get(server + "/push/getPushHistory.json", {params: $scope.param}).success(function (response) {
            $scope.table = true;
            console.log(response);
            $scope.list = response.list;
        })
    }
});

// 举报 controller
animateApp.controller('reportController', function ($scope, $http, Pagination, $location) {
    $scope.pageClass = 'page-3';
    report($scope, $http, Pagination, $location);
});


// 图片审核 page controller

animateApp.controller('imageController', function ($scope, $http, Pagination, $location, $log) {
    $scope.pageClass = 'page-1';
    image($scope, $http, Pagination, $location, $log);
});

//设置
animateApp.controller('settingController', function ($scope, $http) {
    var url = server + "/admin/modifyPassord.json?";
    $scope.pageClass = 'page-2';
    $scope.user = {adminId: adminId, password: password};
    $scope.reset = function () {
        console.log($scope.user);
        $http.get(url, {params: $scope.user}).success(function (response) {
            console.log(response);
            $scope.numData = getNumDataConsume(response);
        });
    };
});

//用户信息
animateApp.controller('userInfoController', function ($scope, $http) {
    $scope.pageClass = 'page-3';
    var url = server + "/admin/getAdmin.json?";
    $http.get(url + "adminId=" + adminId)
        .success(function (response) {
            $scope.userName = response.userName;
            $scope.email = response.email;
            console.log(response);
        });
});

// 购买统计
animateApp.controller("payStatController", function ($scope, $http, Pagination) {
    var getNowData = function () {
        $http.get(server + "/statistics/getPayStatDayNow.json?adminId=" + adminId).success(function (response) {
            $scope.nowData = response;
            console.log(response);
        });
    }
    getNowData();
    $scope.flush = function () {
        getNowData();
    }
    var url = server + "/statistics/getPayStat.json";
    $scope.param = {
        adminId: adminId,
        beginDate: format(addDay(-30)),
        endDate: format(addDay(1)),
        pageNo: 1,
        pageSize: 10
    }
    var legend = ['购买金币数', '购买金额', '购买次数'];
    $http.get(url, {params: $scope.param}).success(function (response) {
        console.log(response);
        $scope.data = response.list;
        $scope.goldNum = response.list[0].goldNum;
        $scope.money = response.list[0].money;
        $scope.count = response.list[0].count;
        $scope.page = response.page.list;
        $scope.item = getItemList(response);
        $scope.legend = legend;
        $scope.numData = getPayStat(response);
        chartShow($scope, "payChar");
        // 日历插件
        $('#payDateRange').val(format(addDay(-30)) + ' - ' + format(new Date()));
        $('#payDateRange').daterangepicker({
            locale: {
                format: 'YYYY-MM-DD'
            },
            startDate: format(addDay(-30)),
            endDate: format(new Date())
        }, function (start, end, label) {
            $scope.param.beginDate = start.format('YYYY-MM-DD');
            $scope.param.endDate = end.format('YYYY-MM-DD');
            console.log($scope.param);
            $http.get(url, {params: $scope.param}).success(function (resp) {
                console.log(resp);
                $scope.data = resp.list;
                $scope.page = resp.page.list;
                $scope.item = getItemList(resp);
                $scope.legend = legend;
                $scope.numData = getPayStat(resp);
                chartShow($scope, "payChar");
                reloadPage(resp);
            });
        });
        var reloadPage = function (resp) {
            var pagination = $scope.pagination = Pagination.create({
                itemsPerPage: 10,
                itemsCount: resp.page.count,
                maxNumbers: resp.page.pages
            });
            pagination.onChange = function (page) {
                $scope.param.pageNo = page;
                $http.get(server + "/statistics/getUserPayRecord.json", {params: $scope.param}).success(function (data) {
                    console.log(data);
                    $scope.page = data.list;
                });
                console.info('page=', page);
            }
        };
        reloadPage(response);
    })
});

// app版本管理
animateApp.controller("appVersionController", function ($scope, $http, ngTip) {
    $scope.isShow = false;
    var url = server + "/appVersion/getAppVersion.json?";
    $http.get(url + "adminId=" + adminId).success(function (response) {
        console.log(response);
        $scope.list = response;
        $scope.modify = function (x) {
            $scope.isShow = true;
            console.log(x);
            $scope.version = x;
        }
        $scope.reset = function () {
            $http.post(server + "/appVersion/updateAppVersion.json", $scope.version).success(function (data) {
                console.log(data);
                if (data.id != null) {
                    $scope.list = data;
                    $scope.isShow = false;
                    ngTip.tip('修改成功', 'success');
                } else {
                    ngTip.tip(data.msg, 'danger');
                    $scope.list = response;
                }
            })
        }
    });
});

// 免费商品
animateApp.controller("freeCommodityController", function ($scope, $http, ngTip) {
    $scope.isShow = false;
    var url = server + "/freeCommodity.json?";
    $http.get(url + "adminId=" + adminId).success(function (response) {
        console.log(response);
        $scope.list = response;
        $scope.modify = function (x) {
            $scope.isShow = true;
            console.log(x);
            $scope.freeCommodity = x;
        }
        $scope.reset = function () {
            $http.post(server + "/freeCommodity.json", $scope.freeCommodity).success(function (data) {
                console.log(data);
                if (data[0]!= null) {
                    $scope.list = data;
                    $scope.isShow = false;
                    ngTip.tip('修改成功', 'success');
                } else {
                    ngTip.tip(data.msg, 'danger');
                }
            })
        }
    });
});


// 用户封号设置
animateApp.controller("reportSettingController", function ($scope, $http, ngTip) {
    $scope.isShow = false;
    var url = server + "/reportSetting.json?";
    $http.get(url + "adminId=" + adminId).success(function (response) {
        console.log(response);
        $scope.list = response;
        $scope.modify = function (x) {
            $scope.isShow = true;
            console.log(x);
            $scope.reportSetting = x;
        }
        $scope.reset = function () {
            $http.put(server + "/reportSetting.json", $scope.reportSetting).success(function (data) {
                console.log(data);
                if (data[0]!= null) {
                    $scope.list = data;
                    $scope.isShow = false;
                    ngTip.tip('修改成功', 'success');
                } else {
                    ngTip.tip(data.msg, 'danger');
                }
            })
        }
    });
});


// 当前被封号用户
animateApp.controller('offUserController', function ($scope, $http, Pagination, $location, $log) {
    $scope.pageClass = 'page-1';
    var url = server + "/report/reportRecord.json?";
    $http.get(url + "adminId=" + adminId).success(function (response) {
        $scope.list = response;
        console.log(response);
    });
    $scope.deleteImage = function (userId,type) {
        $scope.param = {userId:userId,type:type}
        $http.post(server+"/report/image.json",$scope.param).success(function (response) {
            $scope.list = response;
            console.log(response);
        })
    }
});


// 累计封号用户
animateApp.controller('offUserTotalController', function ($scope, $http, Pagination, $location, $log) {
    $scope.pageClass = 'page-1';
    image($scope, $http, Pagination, $location, $log);
});




var image = function ($scope, $http, Pagination, $location, $log) {
    moment.locale('zh-cn');
    Array.prototype.indexOf = function (val) {
        for (var i = 0; i < this.length; i++) {
            if (this[i] == val) return i;
        }
        return -1;
    };

    Array.prototype.remove = function (val) {
        var index = this.indexOf(val);
        if (index > -1) {
            this.splice(index, 1);
        }
    };
    var url = server + "/img/getImg.json?";
    var getArray = function (data) {
        var array = [];
        $.each(data.list, function (name, value) {
            array.push(value.id);
        });
        return array;
    }
    var ImgChecked = function (imgId, checked) {
        this.imgId = imgId;
        this.checked = checked;
    }
    var ImgDto = function (adminId, imgChecked, gender, type, pageNo, pageSize) {
        this.adminId = adminId;
        this.list = imgChecked;
        this.gender = gender;
        this.type = type;
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
    var pageSize = 24;
    var beginDate = addDay(-1);
    var endDate = new Date();
    $scope.param = {adminId: adminId, pageNo: 1, pageSize: pageSize,beginDate:beginDate,endDate:endDate};
    //时间插件
    $scope.dateRangeStart = beginDate;
    $scope.dateRangeEnd = endDate;
    $scope.startDateOnSetTime = function (newDate, oldDate) {
        console.log(newDate);
        console.log($scope.dateRangeEnd);
        flushData(newDate,$scope.dateRangeEnd);
    }

    $scope.endDateOnSetTime = function (newDate, oldDate) {
        console.log($scope.dateRangeStart);
        console.log(newDate);
        flushData($scope.dateRangeStart,newDate);
    }
    var flushData = function (beginDate,endDate) {
        $scope.param = {adminId: adminId, pageNo: 1, pageSize: pageSize,beginDate:beginDate,endDate:endDate};
        $http.post(url, $scope.param).success(function (data) {
            console.log(data);
            $scope.imgList = data.list;
            $scope.allArray = getArray(data);
            $scope.choseArr = [];
            $scope.x = false;
            $scope.master = false;
            $scope.pages = data.pages;
        });
    }

    $http.post(url, $scope.param).success(function (response) {
        $scope.imgList = response.list;
        console.log(response.list);
        $scope.pages = response.pages;
        $scope.allArray = getArray(response);//初始化数据
        $scope.choseArr = [];//定义数组用于存放前端显示
        $scope.x = false;//默认未选中
        $scope.master = false;
        $scope.all = function (c, v) {//全选
            if (c == true) {
                $scope.x = true;
                $scope.choseArr = v;
            } else {
                $scope.x = false;

                $scope.choseArr = [];
            }
        };
        $scope.chk = function (z, x) {//单选或者多选
            console.log(x);
            if (x == true) {//选中
                $("#"+z +"image").css("filter","grayscale(100%)");
                $scope.choseArr.push(z);
                console.log($scope.choseArr);
            } else {
                $("#"+z +"image").removeAttr("style");
                $scope.choseArr.remove(z);
                console.log($scope.choseArr);
            }
        };
        $scope.offUserAndDelete = function (userId,imageId) {
            console.log(userId + "," + imageId);
            $scope.deleteParam = {adminId: adminId, pageNo: 1, pageSize: pageSize,beginDate:beginDate,endDate:endDate,userId:userId,imageId:imageId};
            $http.post(server+ "/img/forbid.json", $scope.deleteParam).success(function (data) {
                console.log(data);
                $scope.imgList = data.list;
                $scope.allArray = getArray(data);
                $scope.choseArr = [];
                $scope.x = false;
                $scope.master = false;
                $scope.pages = data.pages;
                $location.path('/image');
            });
        }

        $scope.handle = function (result, id, how) {// 操作CURD
            var array = [];
            if (id != undefined && id.length != 0) {
                var imgChecked = new ImgChecked(id, how);
                array.push(imgChecked);
            } else {
                if ($scope.choseArr[0] == "" || $scope.choseArr.length == 0) {//没有选择一个的时候提示
                    alert("请至少选中一条数据进行操作！")
                    return;
                };
                for (var i = 0; i < $scope.choseArr.length; i++) {
                    var imgChecked = new ImgChecked($scope.choseArr[i], result);
                    array.push(imgChecked);
                }
            }
            var imgDto = new ImgDto(adminId, array);
            console.log(imgDto);
            checkImg(imgDto);
        };

        $('#gender-select').change(function () {
            selectUpdate();
        });

        $("#type-select").change(function () {
            selectUpdate();
        })
        var selectUpdate = function () {
            $http.post(url, $scope.param).success(function (data) {
                console.log(data);
                $scope.imgList = data.list;
                $scope.allArray = getArray(data);
                $scope.choseArr = [];
                $scope.x = false;
                $scope.master = false;
                $scope.pages = data.pages;
                $location.path('/image');
            });
        }

        $scope.next = function () {
            var array = [];
            if ($scope.choseArr[0] != "" || $scope.choseArr.length != 0) {
                for (var i = 0; i < $scope.choseArr.length; i++) {
                    var imgChecked = new ImgChecked($scope.choseArr[i], 2);
                    array.push(imgChecked);
                    $scope.allArray.remove($scope.choseArr[i]);
                }
            }
            for (var i = 0; i < $scope.allArray.length; i++) {
                var imgChecked = new ImgChecked($scope.allArray[i], 1);
                array.push(imgChecked);
            }

            var imgDto = new ImgDto(adminId, array, $scope.param.gender, $scope.param.type, 1, pageSize);
            console.log(imgDto);
            checkImg(imgDto);
        }

        var checkImg = function (imgDto) {
            $http.post(server + "/img/checkImg.json", imgDto).success(function (data) {
                console.log(data);
                $scope.imgList = data.list;
                $scope.allArray = getArray(data);
                $scope.choseArr = [];
                $scope.x = false;
                $scope.master = false;
                $scope.pages = data.pages;
                $location.path('/image');
            });
        };

    });
}

var report = function ($scope, $http, Pagination, $location) {
    Array.prototype.indexOf = function (val) {
        for (var i = 0; i < this.length; i++) {
            if (this[i] == val) return i;
        }
        return -1;
    };


    Array.prototype.remove = function (val) {
        var index = this.indexOf(val);
        if (index > -1) {
            this.splice(index, 1);
        }
    };
    var url = server + "/report/getReport.json?";
    var getArray = function (data) {
        var array = [];
        $.each(data.list, function (name, value) {
            array.push(value.id);
        });
        return array;
    }
    var ReportHandle = function (reportId, result, description, handleWay) {
        this.reportId = reportId;
        this.result = result;
        this.description = description;
        this.handleWay = handleWay;
    }
    var Dto = function (adminId, imgChecked) {
        this.adminId = adminId;
        this.list = imgChecked;
    }

    $scope.param = {adminId: adminId, pageNo: 1, pageSize: 8};
    $http.get(url, {params: $scope.param}).success(function (response) {
        $scope.list = response.list;
        $scope.allArray = getArray(response);//初始化数据
        $scope.choseArr = [];//定义数组用于存放前端显示
        $scope.x = false;//默认未选中
        $scope.master = false;
        $scope.all = function (c, v) {//全选
            if (c == true) {
                $scope.x = true;
                $scope.choseArr = v;
            } else {
                $scope.x = false;
                $scope.choseArr = [];
            }
        };
        $scope.chk = function (z, x) {//单选或者多选
            if (x == true) {//选中
                $scope.choseArr.push(z);
                console.log($scope.choseArr);
            } else {
                $scope.choseArr.remove(z);
                console.log($scope.choseArr);
            }
        };
        $scope.deleteAll = function (id) {// 操作CURD
            if (id != undefined && id.length != 0) {
                handle(1, 3, id);
            } else {
                handle(1, 3);
            }
        };
        $scope.deleteHeadImg = function (id) {// 操作CURD
            if (id != undefined && id.length != 0) {
                handle(1, 1, id);
            } else {
                handle(1, 1);
            }
        };
        $scope.deleteBackground = function (id) {
            if (id != undefined && id.length != 0) {
                handle(1, 2, id);
            } else {
                handle(1, 2);
            }
        }
        $scope.pass = function (id) {
            if (id != undefined && id.length != 0) {
                console.log(id);
                handle(2, 4, id);
            } else {
                handle(2, 4);
            }
        }
        $scope.offUserAndDelete = function(id){
            if (id != undefined && id.length != 0) {
                console.log(id);
                handle(1, 5, id);
            } else {
                handle(1, 5);
            }
        }
        var handle = function (result, handleWay, id) {
            var array = [];
            if (id != undefined && id.length != 0) {
                var reportHandle = new ReportHandle(id, result, "", handleWay);
                array.push(reportHandle);
            } else {
                if ($scope.choseArr[0] == "" || $scope.choseArr.length == 0) {//没有选择一个的时候提示
                    alert("请至少选中一条数据进行操作！")
                    return;
                }
                ;
                for (var i = 0; i < $scope.choseArr.length; i++) {
                    var reportHandle = new ReportHandle($scope.choseArr[i], result, "", handleWay);
                    array.push(reportHandle);
                }
            }
            console.log(array);
            var dto = new Dto(adminId, array);
            console.log(dto);
            $http.post(server + "/report/handleReport.json", dto).success(function (data) {
                console.log(data);
                $scope.list = data.list;
                $scope.allArray = getArray(data);
                $scope.choseArr = [];
                $scope.x = false;
                $scope.master = false;
                $scope.pagination = Pagination.create({
                    itemsPerPage: 10,
                    itemsCount: data.count,
                    maxNumbers: data.pages
                });
                $location.path('/report');
            });
        }

        console.log(response);
        var pagination = $scope.pagination = Pagination.create({
            itemsPerPage: 10,
            itemsCount: response.count,
            maxNumbers: response.pages
        });
        pagination.onChange = function (page) {
            $scope.param = {adminId: adminId, pageNo: page, pageSize: 8};
            $http.get(url, {params: $scope.param}).success(function (data) {
                console.log(data);
                $scope.list = data.list;
                $scope.allArray = getArray(data);
                $scope.choseArr = [];
                $scope.x = false;
                $scope.master = false;
            });
            console.info('page=', page);
        };
    });
}


var stats = function ($scope, $http, url, legend, type, id, dateId) {
    var beginDate = format(addDay(-30));
    var endDate = format(addDay(1));
    $http.get(url + "adminId=" + adminId + "&beginDate=" + beginDate + "&endDate=" + endDate)
        .success(function (response) {
            console.log(response);
            $scope.data = response;
            if (type == 1) {
                $scope.newUserNum = response[0].newUserNum;
                $scope.userTotalNum = response[0].userTotalNum;
                $scope.userBoyNum = response[0].userBoyNum;
                $scope.userGirlNum = response[0].userGirlNum;
                $scope.numData = getNumData(response);
            } else if (type == 2) {
                $scope.data = parseVideoTime(response);
                $scope.videoTime = response[0].videoTime;
                $scope.videoPeople = response[0].videoPeople;
                $scope.matchVideoPeople = response[0].matchVideoPeople;
                $scope.matchVideoTime = response[0].matchVideoTime;
                $scope.numData = getNumDataVideo(response);
            } else if (type == 3) {
                $scope.videoBefriendCount = response[0].videoBefriendCount;
                $scope.videoBefriendNum = response[0].videoBefriendCount / 2;
                $scope.numData = getNumDataFriend(response);
            } else if (type == 4) {
                $scope.matchPagePayCount = response[0].matchPagePayCount;
                $scope.matchPagePayPeople = response[0].matchPagePayPeople;
                $scope.bodyPayCount = response[0].bodyPayCount;
                $scope.girlPayCount = response[0].girlPayCount;
                $scope.numData = getNumDataConsume(response);
            } else if (type == 5) {
                $scope.matchTotal = response[0].matchTotal;
                $scope.matchSuccess = response[0].matchSuccess;
                $scope.matchFail = response[0].matchFail;
                $scope.numData = getNumDataMatchNum(response);
                console.log($scope.numData);
            }
            $scope.item = getItem(response);
            $scope.legend = legend;
            chartShow($scope, id);
            // 日历插件
            $('#' + dateId).val(format(addDay(-30)) + ' - ' + format(new Date()));
            $('#' + dateId).daterangepicker({
                locale: {
                    format: 'YYYY-MM-DD'
                },
                startDate: format(addDay(-30)),
                endDate: format(new Date())
            }, function (start, end, label) {
                console.log(start.format('YYYY-MM-DD'));
                console.log(end.format('YYYY-MM-DD'));
                $http.get(url + "adminId=" + adminId + "&beginDate=" + start.format('YYYY-MM-DD') + "&endDate=" + end.format('YYYY-MM-DD')).success(function (resp) {
                    console.log(resp);
                    $scope.data = resp;
                    if (type == 1) {
                        $scope.numData = getNumData(response);
                    } else if (type == 2) {
                        $scope.data = parseVideoTime(response);
                        $scope.numData = getNumDataVideo(response);
                    } else if (type == 3) {
                        $scope.numData = getNumDataFriend(response);
                    } else if (type == 4) {
                        $scope.numData = getNumDataConsume(response);
                    } else if (type == 5) {
                        $scope.numData = getNumDataMatchNum(response);
                    }
                    $scope.item = getItem(resp);
                    chartShow($scope, id);
                });
            });
        });
}





