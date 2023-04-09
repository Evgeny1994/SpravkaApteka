package instagram.downloader.com.spravkaapteka;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
public class Main4Activity extends AppCompatActivity {
    ListView lvMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        lvMain=  findViewById(R.id.lvMain);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.n3, android.R.layout.simple_list_item_1);
        lvMain.setAdapter(adapter);
        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                switch (position)
                {
                    case 0:
                        Intent intent = new Intent(Main4Activity.this, Main5Activity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(Main4Activity.this, Main6Activity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(Main4Activity.this, Main7Activity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(Main4Activity.this, Main8Activity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(Main4Activity.this, Main9Activity.class);
                        startActivity(intent4);
                    case 5:
                        Intent intent5 = new Intent(Main4Activity.this, Main16Activity.class);
                }
            }
        });
    }
    }
