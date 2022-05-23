<html>
    <title>Title</title>
    <Link rel="stylesheet" href="/reources/css/bootstrap.min.css">
    <script>
        const saveForm = () => {
            location.href = "/board/save";
        }
        const findAll = () => {
            location.href = "/board/findAll";
        }
        // 회원가입 글쓰기
        // 회원가입 글목록
    </script>
<body>
    <h2>index.jsp</h2>
    <button class="btn btn-outline-succes" onclick="saveForm()">글작성</button>
    <button class="btn btn-outline-succes" onclick="findAll()">글목록</button>
</body>
</html>
