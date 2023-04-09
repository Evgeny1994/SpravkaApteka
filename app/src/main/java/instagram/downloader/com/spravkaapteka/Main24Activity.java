package instagram.downloader.com.spravkaapteka;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;

public class Main24Activity extends AppCompatActivity {
    ListView lvMain;
    AutoCompleteTextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main24);
        text = findViewById(R.id.autoCompleteTextView);
        lvMain = findViewById(R.id.lvMain);
        final ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.n6, android.R.layout.simple_list_item_1);
        lvMain.setAdapter(adapter);

        text.setAdapter(adapter);
        text.setThreshold(1);

        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position) {
                    case 0:
                        Intent intent = new Intent(Main24Activity.this, Main5Activity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(Main24Activity.this, Main6Activity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(Main24Activity.this, Main7Activity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(Main24Activity.this, Main8Activity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(Main24Activity.this, Main9Activity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(Main24Activity.this, Main16Activity.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(Main24Activity.this, Main10Activity.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(Main24Activity.this, Main11Activity.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(Main24Activity.this, Main12Activity.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(Main24Activity.this, Main13Activity.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(Main24Activity.this, Main14Activity.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(Main24Activity.this, Main15Activity.class);
                        startActivity(intent11);
                        break;

                    case 12:
                        Intent intent12 = new Intent(Main24Activity.this, Main18Activity.class);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(Main24Activity.this, Main19Activity.class);
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(Main24Activity.this, Main20Activity.class);
                        startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15 = new Intent(Main24Activity.this, Main21Activity.class);
                        startActivity(intent15);
                        break;

                    case 16:
                        Intent intent16 = new Intent(Main24Activity.this, Main22Activity.class);
                        startActivity(intent16);
                        break;
                    case 17:
                        Intent intent17 = new Intent(Main24Activity.this, Main24Activity.class);
                        startActivity(intent17);
                        break;
                }
            }
        });
    }
}
