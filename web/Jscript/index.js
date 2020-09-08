$(function () {

    $("#form2").hide()



    $("#inp1").click(function () {
        //验证用户名
        var usernametext = $("#nametext").val();
        var usernamepass =/^\w{5,12}$/;
        // if(!usernamepass.test(usernametext)) {
        //     $("span.err").text("用户名错误！");
        //     $("#nametext").val('');
        //     return false;

        var userpwtext = $("#pwtext").val();
        var userpwpass =/^\w{5,12}$/;
        if(!userpwpass.test(userpwtext)||!usernamepass.test(usernametext)) {
            $("span.err").text("用户名或密码错误！");
            $("#pwtext").val('');
            $("#nametext").val('');
            return false;
        }
        $("span.err").text();

        $(location).attr("href","login");
    });

    $("#inp2").click(function () {
        $("#form2").show();
        $("#form1").hide();
        return false;
    });

    $("#inp3").click(function () {

        var usernametext1 = $("#nametext1").val();
        var usernamepass1 =/^\w{5,12}$/;

        if(!usernamepass1.test(usernametext1)) {
            $("span.err").text("用户名格式错误！");
            $("#nametext").val('');
            return false;
        }
        var userpwtext1 = $("#pwtext1").val();
        var userpwpass1 =/^\w{5,12}$/;

        if(!userpwpass1.test(userpwtext1)) {
            $("span.err").text("密码格式错误！");
            $("#pwtext1").val('');
            return false;

        }
        var userpw1text =$("#pw1text").val();

        if(userpw1text != userpwtext1){
            $("span.err").text("密码和上次不同!");
            $("#pw1text").val('');
            return false;
        }

        var useremailtext = $("#emtext").val();
        var useremailpass = /^\w{5,12}$/;
        if(!useremailpass.test(useremailtext)){
            $("span.err").text("邮箱格式不正确");
            $("#emtext").val('');
            return false;
        }
        $("span.err").text();
        $(location).attr("href","login");

    });
    $("#inp4").click(function () {
        $("#form1").show();
        $("#form2").hide();
        return false;
    });



});

