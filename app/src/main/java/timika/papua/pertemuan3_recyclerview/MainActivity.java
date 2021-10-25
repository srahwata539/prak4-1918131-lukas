package timika.papua.pertemuan3_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private mahasiswaadapter adapter;
    private ArrayList<mahasiswa> mahasiswaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView)findViewById(R.id.recycleview);
        adapter = new mahasiswaadapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

    }
    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new mahasiswa("Agung", "1218019",
                "2012"));
        mahasiswaArrayList.add(new mahasiswa("Abi", "1118002",
                "2011"));
        mahasiswaArrayList.add(new mahasiswa("Yudis", "1118031",
                "2011"));
    }
}