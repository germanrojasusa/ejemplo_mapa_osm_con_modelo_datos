package com.example.openstreemapexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

import org.osmdroid.config.Configuration;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.CustomZoomButtonsController;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private MapView myOpenMapView;
    private MapController myMapController;
    private Lugares lugares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Configuration.getInstance().setUserAgentValue(this.getPackageName());
        setContentView(R.layout.activity_main);



        myOpenMapView = (MapView) findViewById(R.id.openmapview);

        myOpenMapView.getZoomController().setVisibility(CustomZoomButtonsController.Visibility.ALWAYS);
        myMapController = (MapController) myOpenMapView.getController();
        myMapController.setZoom(16);
        myOpenMapView.setMultiTouchControls(true);

        //Traer la informción de lugares
        lugares = new Lugares();
        ArrayList<Lugar> lugares_datos = lugares.traerLugares();

        //Pinta los puntos de los lugares que estén en el modelo
        for (Lugar lugar: lugares_datos){
            addMarker(lugar.getPunto(), lugar.getNombre(), lugar.getDescripcion());
        }

        //Validamos que haya al menos un sitio para centrar el mapa en el primer lugar del listado
        if (lugares_datos.size()>0){
            myMapController.setCenter(lugares_datos.get(0).getPunto());
        }
    }
    public void addMarker(GeoPoint geoPoint, String name, String description){
        Marker marker = new Marker(myOpenMapView);
        marker.setPosition(geoPoint);
        marker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_CENTER);
        marker.setIcon(getResources().getDrawable(android.R.drawable.star_on, null));
        marker.setTitle(name);
        marker.setSubDescription(description);
        myOpenMapView.getOverlays().add(marker);
    }

}