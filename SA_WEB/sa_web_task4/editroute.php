<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <link rel="stylesheet" href="routenator.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <title>Routenator - Edit Route</title>
    </head>
    <body class="edit">
        <div class="top_bar">
            <h1>Edit an Existing Route</h1>
            
            <a id="home" href="index.php">home</a>
        </div>
            <form method="get">
                <div class="search_bar">
                <div>
                <a>Routename:</a><br/>
                <input type="text" id="routename">
                </div>
                <div>
                <a>Start:</a><br/>
                <input type="text" id="start">
                </div>
                <div>
                <a>Destination:</a><br/>
                <input type="text" id="dest">
                </div>
                </div>
            </form>
            
        <div id="updateStops"></div>
        <div id="edit"></div>
        <div id="route"></div>
    </body>
</html>

<script type="text/javascript">
   $(document).ready(function()
    {
        setInterval(function()
        {
            var name = document.getElementById('routename').value;
            var start = document.getElementById('start').value;
            var dest = document.getElementById('dest').value;
            name = name.split(" ").join("+");
            start = start.split(" ").join("+");
            dest = dest.split(" ").join("+");
            if(name != "" || start != "" || dest != "") {
                $('#route').load('controller.php?f=6&name=' + name + '&start=' + start + '&dest=' + dest);
            }
        }, 1000);
             
    });
    
    function editroutename(id, name) {
        var route = name.split(": ");
        var tmp = prompt("Routename:", route[0]);
        tmp += ": ";
        for(var i = 1; route[i]; i++) { tmp += route[i]; }
        name = tmp.split(" ").join("+");
        $('#edit').load('controller.php?f=7&id=' + id + '&type=0' + '&name=' + name);
    };
    
    function editroutestart(id, name) {
        var route = name.split(": ");
        var stop = route[1];
        var stop = stop.split(" => ");
                
        var start = prompt("Start:", stop[0]);
        stopsready = stop[0].split(" ").join("+");
        start = start.split(" ").join("+");
        name = name.split(" ").join("+");
        $('#edit').load('controller.php?f=7&id=' + id + '&type=1' + '&old=' + stopsready + '&new=' + start + '&name=' + name);
    }
    
    function editroutedest(id, name) {
        var route = name.split("=> ");
        
        var dest = prompt("Destination:", route[1]);
        stopsready = route[1].split(" ").join("+");
        dest = dest.split(" ").join("+");
        name = name.split(" ").join("+");
        $('#edit').load('controller.php?f=7&id=' + id + '&type=2' + '&old=' + stopsready + '&new=' + dest + '&name=' + name);
    }
    
    function editroutestops(id, name) {
        name = name.split(" ").join("+");
        $('#updateStops').load('controller.php?f=8&id=' + id + '&name=' + name);
    }
    
    function addStop(route_id){
        var name = prompt("Stopname:");
        name = name.split(" ").join("+");
        $('#updateStops').load('controller.php?f=9&name=' + name+ '&route_id=' + route_id);
    }
    function deleteStop(route_id, stop_id){
       $('#updateStops').load('controller.php?f=10&route_id=' + route_id + '&stop_id=' + stop_id);
    }
    
</script>

