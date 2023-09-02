package com.karan.location;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    LocationManager lm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        //Run time permission
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)!= PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this,Manifest.permission.ACCESS_COARSE_LOCATION)!=PackageManager.PERMISSION_GRANTED)
        {
          ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.ACCESS_COARSE_LOCATION},0);
          return;
        }
        lm= (LocationManager) getSystemService(LOCATION_SERVICE);
        lm.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, new LocationListener() {
            @Override
            public void onLocationChanged(@NonNull Location location)
            {
              double lat=location.getLatitude();
              double lon=location.getLongitude();
              textView.setText("Latitude"+lat+"\n"+"Longitude"+lon);
                Geocoder geocoder=new Geocoder(MainActivity.this);
                try
                {
                  List<Address>list= geocoder.getFromLocation(lat,lon,1);
                  String country=list.get(0).getCountryName();
                  String locality=list.get(0).getLocality();
                  String postalCode=list.get(0).getPostalCode();
                  String address=list.get(0).getAddressLine(0);
                  textView.append("\n \n"+country+","+locality+","+postalCode+","+address);
                }
                catch (Exception e)
                {

                }
            }
        });
    }
}