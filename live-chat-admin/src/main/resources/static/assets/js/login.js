//var server = "http://livechat.rcplatformhk.com:8100";
var server = "http://localhost:8100";
$('body').particleground({
    dotColor: '#5cbdaa',
    lineColor: '#5cbdaa'
});
var app = angular.module('myApp', []);
app.controller('myCtrl', function ($scope, $http) {
    $scope.reset = function () {
        var url = server + "/admin/login.json"
        console.log($scope.user);
        $http.post(url, $scope.user).success(function (response) {
            console.log(response);
            if(response.id!=null){
                $.cookie('adminId', response.id);
                $.cookie("userName", response.userName);
                window.location.href = "index.html";
            }
        });
    };
});