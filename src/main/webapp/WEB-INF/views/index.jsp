<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>

    <meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
    <meta name="viewport" content="width=device-width" , initial-scale="1"> <!--뷰포트 설정(브라우저 자동크기조절 중단)-->
    <title>Exercising ajax in spring MVC - clone coding -</title>
    <!--<script type="text/javascript" src="https://code.jquery.com/jquery-3.4.1.min.js"></script>-->
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            $('#buttonDemo1').click(function(){
                alert('Demo 1 practice')

                $.ajax({
                    type: 'GET',
                    url: '${pageContext.request.contextPath}/',
                    success: function(result) {
                        $('#result1').html(result);
                    }
                })
            })

            $('#buttonDemo2').click(function(){
                alert('Demo 2 practice')

                var fullName = $('#fullName').val();

                $.ajax({
                    type: 'GET',
                    url: '${pageContext.request.contextPath}/' + fullName,
                    success: function(result) {
                        $('#result2').html(result);
                    }
                })
            })
        })
    </script>

</head>

<body>
    what's u'r name : ${name}

    <br>
    <fieldset>
        <legend>Demo 1</legend>
        <input type="button" value="Demo 1" id="buttonDemo1">
        <br>
        <span id="result1"></span>
    </fieldset>

    <fieldset>
        <legend>Demo 2</legend>
        Full name <input type = "text" id = "fullName">
        <input type="button" value="Demo 2" id="buttonDemo2">
        <br>
        <span id="result2"></span>
    </fieldset>

</body>

</html>