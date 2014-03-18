<!DOCTYPE html>
<html class="uk-notouch" dir="ltr" lang="en-gb"><head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Quizcomm</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/uikit/uikit.css">
        <script src="${pageContext.request.contextPath}/resources/jquery/jquery.js"></script>
        <script src="${pageContext.request.contextPath}/resources/uikit/uikit.js"></script>
        <script src="${pageContext.request.contextPath}/resources/uikit/sticky.js"></script>
        <script src="${pageContext.request.contextPath}/resources/js/quiz.js"></script>
    </head>

    <body>

        <div class="uk-container uk-container-center uk-margin-top uk-margin-large-bottom">

            <nav class="uk-navbar uk-margin-large-bottom">
                <a class="uk-navbar-brand uk-hidden-small" href="http://getuikit.com/docs/layouts_frontpage.html">Brand</a>
                <ul class="uk-navbar-nav uk-hidden-small">
                    <li>
                        <a href="http://getuikit.com/docs/layouts_frontpage.html">Home</a>
                    </li>
                    <li>
                        <a href="http://getuikit.com/docs/layouts_portfolio.html">Profile</a>
                    </li>
                    <li>
                        <a href="http://getuikit.com/docs/layouts_blog.html">My Quiz</a>
                    </li>
                    <li class="uk-active">
                        <a href="http://getuikit.com/docs/layouts_documentation.html">Create Quiz</a>
                    </li>
                    <li>
                        <a href="http://getuikit.com/docs/layouts_login.html">Logout</a>
                    </li>
                </ul>
                <a href="#offcanvas" class="uk-navbar-toggle uk-visible-small" data-uk-offcanvas=""></a>
                <div class="uk-navbar-brand uk-navbar-center uk-visible-small">Brand</div>
            </nav>

            

            <div class="uk-grid" data-uk-grid-margin="">
                <div class="uk-width-medium-3-4"> 
                    <h3>Create Quiz</h3>
                    <table class="uk-table">
                        <thead>
                            <tr>
                                <th></th>
                                <th></th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><code>Title</code></td>
                                <td><input type="text" name="title" id="create_quiz_title"></td>
                            </tr>
                            <tr>
                                 <td><code>Type</code></td>
                                <td><input type="text" name="type" id="create_quiz_type"></td>
                            </tr>
                            <tr>
                                <td><code><button id="create_quiz_submit">Create</button></code></td>
                                
                            </tr>
                        </tbody>
                    </table>

                   


                   
                
                <div class="uk-width-medium-1-4">

                    <div style="height: 270px;" class="uk-sticky" id="sticky-s7261"><div style="" class="uk-panel uk-panel-box" data-uk-sticky="{top:35}">
                        <ul class="uk-nav uk-nav-side" data-uk-scrollspy-nav="{closest:'li', smoothscroll:true}">
                            <li class="uk-nav-header">Quiz Details</li>      
                        </ul>
                    </div>
                  </div>

                </div>
            </div>
        </div>

        <div id="offcanvas" class="uk-offcanvas">
            <div class="uk-offcanvas-bar">
                <ul class="uk-nav uk-nav-offcanvas">
                    <li>
                        <a href="http://getuikit.com/docs/layouts_frontpage.html">Frontpage</a>
                    </li>
                    <li>
                        <a href="http://getuikit.com/docs/layouts_portfolio.html">Portfolio</a>
                    </li>
                    <li>
                        <a href="http://getuikit.com/docs/layouts_blog.html">Blog</a>
                    </li>
                    <li class="uk-active">
                        <a href="http://getuikit.com/docs/layouts_documentation.html">Documentation</a>
                    </li>
                    <li>
                        <a href="http://getuikit.com/docs/layouts_contact.html">Contact</a>
                    </li>
                    <li>
                        <a href="http://getuikit.com/docs/layouts_login.html">Login</a>
                    </li>
                </ul>
            </div>
        </div>
</div>

</body></html>