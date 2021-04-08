var app = (function () {
    var buscaCity = function () {
        var city = document.getElementById("city").value;
        fetch('http://localhost:8080/weather/city/'+city)
            .then(response => response.json())
            .then(json => mostrar(json))
            .catch(err => {
                console.log(err);

            });
    };
    var mostrar = function(json){

        var name = json.name;
        var country = json.sys.country;

        $("#ciudad").text(name+", "+country);

        var main = json.weather[0].main;
        var description = json.weather[0].description;

        $("#descrip").text(main+", "+description);

        var temp = json.main.temp;

        $("#temperatura").text("Temperature "+temp+"°C");

        var feels_like = json.main.feels_like;
        var temp_min = json.main.temp_min;

        var temp_max = json.main.temp_max;

        $("#temperatura2").text("Feels like: "+feels_like+"°C, Min: "+temp_min+"°C, Max: "+temp_max+"°C");

        var pressure = json.main.pressure;
        var humidity = json.main.humidity;

        $("#time").text("Pressure: "+pressure+", Humidity: "+humidity+"%");
    };
    return{
        buscaCity: buscaCity
    };
})();
