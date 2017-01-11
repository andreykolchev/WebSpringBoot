$(document).ready(function () {
    $.ajax({
        url: "http://localhost:8080/greeting"
    }).then(function (data) {
        $('#my-template').tmpl(data).appendTo('#greeting');
    });
});
