$(function () {
    
    /*
    var infowindow = new google.maps.InfoWindow();
    

    function bindInfoWindow(marker, map, infowindow, strDescription) {
        google.maps.event.addListener(marker, 'click', function () {
            infowindow.setContent(strDescription);
            infowindow.open(map, marker);
        });
    }

    function initMap() {
        
        var contentString = '<div class="info-window">' +
                '<h3>Flight Status</h3>' +
                '<div class="info-content">' +
                '<p>Flight Status</p>' +
                '</div>' +
                '</div>';

        var infowindow = new google.maps.InfoWindow({
            content: contentString,
            maxWidth: 400
        });
        var styles = [{"featureType": "landscape", "stylers": [{"saturation": -100}, {"lightness": 65}, {"visibility": "on"}]}, {"featureType": "poi", "stylers": [{"saturation": -100}, {"lightness": 51}, {"visibility": "simplified"}]}, {"featureType": "road.highway", "stylers": [{"saturation": -100}, {"visibility": "simplified"}]}, {"featureType": "road.arterial", "stylers": [{"saturation": -100}, {"lightness": 30}, {"visibility": "on"}]}, {"featureType": "road.local", "stylers": [{"saturation": -100}, {"lightness": 40}, {"visibility": "on"}]}, {"featureType": "transit", "stylers": [{"saturation": -100}, {"visibility": "simplified"}]}, {"featureType": "administrative.province", "stylers": [{"visibility": "off"}]}, {"featureType": "water", "elementType": "labels", "stylers": [{"visibility": "on"}, {"lightness": -25}, {"saturation": -100}]}, {"featureType": "water", "elementType": "geometry", "stylers": [{"hue": "#ffff00"}, {"lightness": -25}, {"saturation": -97}]}];

        map.set('styles', styles);
        
        var mapProp = {
            center: new google.maps.LatLng(0,0), //LLANDRINDOD WELLS
            zoom: 2,
            mapTypeId: google.maps.MapTypeId.ROADMAP
        };

        map = new google.maps.Map(document.getElementById("map"), mapProp);
        
        
       

        var json1 = {
            "planes": [
                {
                    "title": "Hungary",  
                    "alt" : 10660.38,
                    "lat": 7.0204,
                    "lng": 51.7109},
                {
                    "title": "Hungary",
                    "alt" : 10652.76,
                    "lat": 16.3425,
                    "lng": 45.861},
                {
                    "title": "Spain",
                    "alt" : 8633.46,
                    "lat": -3.9125,
                    "lng": 41.5421}
            ]
        };
        

        $.each(json1.planes, function (key, data) {

            var latLng = new google.maps.LatLng(data.lat, data.lng);
            var markerImage = 'marker.png';
            var marker = new google.maps.Marker({
                position: latLng,
                map: map,
                icon: markerImage,
                title: data.title
            });

            var details = data.title + ", " + data.alt + ".";
            bindInfoWindow(marker, map, infowindow, details);

        });
         */

  

});