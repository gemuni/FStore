<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link href="styles/SignIn.css" rel="stylesheet" />
<script src="js/users/SignIn.js"></script>
<div id="appsignin" class="modal">
  <form:form id="appsigincontent">
  <form class="modal-content animate" action="/action_page.php">
    <div class="imgcontainer">
      <span onclick="document.getElementById('appsignin').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="${pageContext.request.contextPath}/img/logo.png" alt="Avatar" class="avatar">
    </div>

    <div class="container">
      <label for="uname"><b>Tài Khoản</b></label>
      <input type="text" placeholder="Tài khoản/Email" name="username" required>

      <label for="psw"><b>Mật Khẩu</b></label>
      <input type="password" placeholder="Nhập mật khẩu" name="password" required>
        
      <button type="submit">Đăng Nhập</button>
      <label>
        <input type="checkbox" checked="checked" name="remember"> Ghi nhớ tài khoản
      </label>
    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('appsignin').style.display='none'" class="cancelbtn">Cancel</button>
      <span class="psw">Quên <a href="#">mật khẩu?</a></span>
    </div>
  </form>
  </form:form>
</div>