package instagram.downloader.com.spravkaapteka;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.Locale;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

public class Main2Activity extends AppCompatActivity {
    ListView lvMain;
    SharedPreferences sPref;
    final String SAVED_TEXT = "saved_text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
        lvMain = (ListView) findViewById(R.id.lvMain);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.n1, android.R.layout.simple_list_item_1);
        lvMain.setAdapter(adapter);
        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position) {
                    case 0:
                        //Тема приложения: Светлая Тёмная
                        AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);
                        builder.setTitle(R.string.exit)
                                .setMessage("Выберите тему приложения")
                                .setPositiveButton(R.string.dark, new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {
                                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                                        recreate();


                                    }
                                }).setNegativeButton(R.string.white, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                                recreate();
                            }
                        });
                        builder.create();
                        builder.show();

                        break;
                    case 1:
                        Intent intent = new Intent(Main2Activity.this, Seek.class);
                        startActivity(intent);


                        break;

                    case 2:
                        //Язык приложения: английский, русский, Белорусский
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(Main2Activity.this);
                        builder1.setTitle(R.string.exit)
                                .setMessage(getString(R.string.s2))
                                .setPositiveButton(R.string.russian, new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int i) {


                                    }
                                }).setNegativeButton(R.string.english, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                //LocaleHelper.setLocale(Main2Activity.this, getBaseContex);

                            }
                        }).setNeutralButton("Белорусский", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                               Locale locale = new Locale("en");
                               Locale.setDefault(locale);
                               Configuration configuration = new Configuration();
                              configuration.locale = locale;
                              getBaseContext().getResources().updateConfiguration(configuration, getBaseContext().getResources().getDisplayMetrics());
                              Main2Activity.this.setContentView(R.layout.activity_main2);
                                Main2Activity.this.setContentView(R.layout.activity_main);
                              recreate();
                              //Сохраненіе переменненой
                                sPref = getPreferences(MODE_PRIVATE);
                                SharedPreferences.Editor ed = sPref.edit();
                                ed.putString(SAVED_TEXT, "en");
                                ed.commit();
                                Log.i("переменная сохранена","переменная сохраненна");



                            }
                        });
                        builder1.create();
                        builder1.show();
                        break;
                }
            }
        });
    }

    //инициализация увеличения размера шрифта
    private void init() {
        int size_coef;
        final float start_value = 0.7f;
        final float step = 0.15f;
        Resources res = getResources();
        SharedPreferences settings = getSharedPreferences("MyAppSett", MODE_PRIVATE);
        try {
            size_coef = settings.getInt("size_coef", 2);
            } catch (Exception e)
        {
            size_coef =2;
        }
        float new_value = start_value + size_coef * step;
        Configuration configuration = new Configuration(res.getConfiguration());
        configuration.fontScale = new_value;
        res.updateConfiguration(configuration, res.getDisplayMetrics());
    }
}