package instagram.downloader.com.spravkaapteka;


import android.os.Bundle;
import android.text.Html;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Main18Activity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);
        editText = findViewById(R.id.editText);
        editText.setText(Html.fromHtml(getResources().getString(R.string.aviamore)));
    }
}
