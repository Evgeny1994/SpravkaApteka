package instagram.downloader.com.spravkaapteka;


import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

public class Seek extends AppCompatActivity {
    final float start_value = 0.7f;
    final float step = 0.15f;
    int size_coef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seek);
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        if (seekBar!= null)
        {
            //seekBar.setProgress(select_coef);
            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                    size_coef = progress;




                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                    SharedPreferences settings = getSharedPreferences("MyAppSett", MODE_PRIVATE);
                    SharedPreferences.Editor value_add = settings.edit();
                    value_add.putInt("size_coef", size_coef);
                    value_add.commit();
                   // int su = value_add;
                    Log.i("Размер шріфта", value_add.toString());

                }
            });
        }
    }
}
