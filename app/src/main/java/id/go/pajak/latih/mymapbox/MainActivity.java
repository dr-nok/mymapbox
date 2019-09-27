package id.go.pajak.latih.mymapbox;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.mapbox.mapboxsdk.Mapbox;
import com.mapbox.mapboxsdk.constants.Style;
import com.mapbox.mapboxsdk.maps.MapView;

public class MainActivity extends AppCompatActivity {

    private MapView mapView;

    @Override
    protected void onStart() {
        super.onStart();
        mapView.onStop();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mapView.onStop();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        mapView.onLowMemory();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        mapView.onSaveInstanceState(outState);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Mapbox.getInstance(this, "pk.eyJ1IjoicmlnYSIsImEiOiJjaWVtcGw1a2owMWhwczJtMm16a3l6YjhlIn0.S5r9DF4P7TEVxG0aTsFU5A");
        setContentView(R.layout.activity_main);
        mapView = (MapView)findViewById(R.id.mapView);
        mapView.onCreate(savedInstanceState);
        mapView.setStyleUrl(Style.MAPBOX_STREETS);



    }
}
