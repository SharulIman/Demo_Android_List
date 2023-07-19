package sg.edu.rp.c346.id22018526.demoandroidlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    ListView lv;

    ArrayList<AndroidVersion> list;

    ArrayAdapter<AndroidVersion> lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listview1);
        list = new ArrayList<AndroidVersion>();
        lista = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
        lv.setAdapter(lista);

        //Examples
        list.add(new AndroidVersion("Cupcake",1.5));
        list.add(new AndroidVersion("Donut",1.6));
        list.add(new AndroidVersion("Eclair",2.0));
        list.add(new AndroidVersion("Froyo",2.2));

    }
}