<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-23
  Time: 오후 1:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div class="container">
        글번호 : ${board.id}<br>
        작성자 : ${borad.boradWriter}<br>
        제목 : ${borad.boradTitle}<br>
        비밇번호 : ${borad.boradPassword}<br>
        내용 : ${borad.boradContents}<br>
        조회수 : ${borad.boradHits}<br>
        작성일자 : ${borad.boradCreatedDate}<br>
        <button class="btn btn-outline-primary"
                onclick="location.href='/borad/passwordCheck?id=${borad.id}'">수정</button>
        <button class="btn btn-outline-primary"
                onclick="location.href='/borad/passwordCheck?id=${borad.id}'">삭제</button>
        <button class="btn btn-outline-primary"
                onclick="findAll()">목록</button>

    </div>
</body>
<script>
    const boardUpdate = () => {
        // 수정을 위한 화면(update.jsp)를 출력하고, 비밀번호를 입력받아서
        // 비밀번호 일치하면 수정처리, 일치하지 않으면 alert(회원 수정이랑 프로세스 같음
    }
    const boardDelete = () => {
        // 비밀번호 체크를 위한 화면(passwordCheck.jsp)을 출력하고, 비밀번호 입력받아
        // 비밀번호 일치하면 삭제처리 후 목록 출력, 일치하지 않으면 alert 띄우고 상세화면으로
        location.href = "/board/passwordCheck?id=${board.id}";
    }
    const findAll = () => {
        location.href = "/board/findAll";
    }
</script>
</html>
