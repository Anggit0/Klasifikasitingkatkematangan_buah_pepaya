package org.tensorflow.lite.examples.classification;


        import android.content.Intent;
        import android.os.Build;
        import android.os.Bundle;
        import android.os.Handler;
        import android.view.Window;
        import android.view.WindowManager;
        import android.widget.TextView;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.core.content.ContextCompat;

        import org.tensorflow.lite.examples.classification.tflite.Classifier;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //menghilangkan ActionBar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);


        // final Handler handler = new Handler();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // startActivity(new Intent(getApplicationContext(), ClassifierActivity.class));
                Intent panggil = new Intent(SplashScreen.this, ClassifierActivity.class);
                startActivity(panggil);
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }
}