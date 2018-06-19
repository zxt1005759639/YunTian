
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>Ext JS 3 Desktop + Ext JS 4 Charts</title>

    <link rel="stylesheet" type="text/css" href="http://dev.sencha.com/deploy/dev/resources/css/ext-all.css">
    <link rel="stylesheet" type="text/css" href="css/desktop.css">
    <link rel="stylesheet" type="text/css" href="css/ext-sandbox.css">

    <!-- GC -->


    <style>
        #chart-win-shortcut img {
            width:48px;
            height:48px;
            background-image: url(images/chart48x48.png);
            filter:progid:DXImageTransform.Microsoft.AlphaImageLoader(src='images/chart48x48.png', sizingMethod='scale');
        }
    </style>
    <script type="text/javascript" src="ext/js/ext-base.js"></script><!-- ENDLIBS -->

    <script type="text/javascript" src="js/ext/ext-all.js"></script><!-- DESKTOP -->

    <script type="text/javascript" src="js/StartMenu.js"></script>
    <script type="text/javascript" src="js/TaskBar.js"></script>
    <script type="text/javascript" src="js/Desktop.js"></script>
    <script type="text/javascript" src="js/App.js"></script>
    <script type="text/javascript" src="js/Module.js"></script>
    <script type="text/javascript" src="js/sample.js"></script>

    <script type="text/javascript" src="../../builds/ext-all-sandbox.js"></script>
    <script type="text/javascript" src="js/sandbox.js"></script>
</head>

<body scroll="no">

    <div id="x-desktop">
        <a href="http://sencha.com" target="_blank" style="margin:5px; float:right;"><img src="images/powered.gif" /></a>

        <dl id="x-shortcuts">
            <dt id="grid-win-shortcut">
                <a href="https://www.baidu.com/"><img src="images/b1.ico" />
                <div>Grid Window</div></a>
            </dt>
            <dt id="acc-win-shortcut">
                <a href="https://www.w3cschool.cn/extjs/extjs_first_program.html"><img src="images/b2.ico" />
                <div>Accordion Window</div></a>
            </dt>
            <dt id="chart-win-shortcut">
                <a href="#"><img src="images/b3.ico" />
                <div>Charts</div></a>
            </dt>
        </dl>
    </div>

    <div id="ux-taskbar">
        <div id="ux-taskbar-start"></div>
        <div id="ux-taskbuttons-panel"></div>
        <div class="x-clear"></div>
    </div>

</body>
</html>