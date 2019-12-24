<#import "parts/common.ftl" as c>

<@c.page>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
          <a class="nav-link" href="#">Home</a>
      </li>
      <li class="nav-item active">
          <a class="nav-link" href="#">Hello</a>
      </li>
      <li class="nav-item active">
          <a class="nav-link" href="#">Ex1</a>
      </li>
    </ul>
  </div>
</nav>
<div class="container mt-5">
    <h1>Welcome!</h1>
    <form action="/upload">
        <input type="file" name = "file">
        <button type="submit">Загрузить файл</button>
    </form>
    <p>Click <a href="/hello">here</a> to see a greeting.</p>
</div>
</@c.page>

