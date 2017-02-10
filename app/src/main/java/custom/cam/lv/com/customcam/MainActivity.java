package custom.cam.lv.com.customcam;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import custom.cam.lv.com.customcam.view.ui.fragment.Camera2BasicFragment;

public class MainActivity extends AppCompatActivity {
    private Camera2BasicFragment camera2BasicFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupCameraFragment();
    }

    private void setupCameraFragment() {
        if (camera2BasicFragment == null) {
            camera2BasicFragment = new Camera2BasicFragment();
        }
        getSupportFragmentManager().beginTransaction().replace(R.id.container, camera2BasicFragment).commit();
    }
}
