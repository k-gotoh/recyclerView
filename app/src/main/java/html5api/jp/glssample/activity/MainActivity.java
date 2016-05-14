package html5api.jp.glssample.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import html5api.jp.glssample.Items;
import html5api.jp.glssample.R;
import html5api.jp.glssample.recycler.adapter.RecyclerViewAdapter;


public class MainActivity extends AppCompatActivity {

    private StaggeredGridLayoutManager gaggeredGridLayoutManager;
    private List<Items> gaggeredList;
    private RecyclerViewAdapter rcAdapter;

    private int cnt = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gaggeredList.add(1, new Items("#" + getNumber() + " beans", R.drawable.ptn1));
                rcAdapter.notifyItemInserted(1);
            }
        });

        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gaggeredList.add(2, new Items("#" + getNumber() + " sweets", R.drawable.ptn2));
                rcAdapter.notifyItemInserted(2);
            }
        });

        Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gaggeredList.add(3, new Items("#" + getNumber() + " textile", R.drawable.ptn3));
                rcAdapter.notifyItemInserted(3);
            }
        });

        Button btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gaggeredList.add(4, new Items("#" + getNumber() + " alcohole", R.drawable.ptn4));
                rcAdapter.notifyItemInserted(4);
            }
        });

        Button btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gaggeredList.add(0, new Items("#" + getNumber() + " feather", R.drawable.ptn5));
                rcAdapter.notifyItemInserted(0);
            }
        });
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        gaggeredGridLayoutManager = new StaggeredGridLayoutManager(3, 1);
        recyclerView.setLayoutManager(gaggeredGridLayoutManager);

        gaggeredList = getListItemData();

        rcAdapter = new RecyclerViewAdapter(MainActivity.this, gaggeredList);
        recyclerView.setAdapter(rcAdapter);
    }

    private String getNumber() {
        return String.valueOf(cnt++);
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        //getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//        return super.onOptionsItemSelected(item);
//    }

    private List<Items> getListItemData(){
        List<Items> listViewItems = new ArrayList<Items>();
        listViewItems.add(new Items("coffee cup", R.drawable.ptn1));
        listViewItems.add(new Items("chocolate", R.drawable.ptn2));
        listViewItems.add(new Items("check", R.drawable.ptn3));
        listViewItems.add(new Items("wine", R.drawable.ptn4));
        // listViewItems.add(new Items("feather", R.drawable.ptn5));
        listViewItems.add(new Items("saucer", R.drawable.ptn1));
        listViewItems.add(new Items("chocolat", R.drawable.ptn2));
        listViewItems.add(new Items("clothes", R.drawable.ptn3));
        listViewItems.add(new Items("vin", R.drawable.ptn4));
        // listViewItems.add(new Items("bird", R.drawable.ptn5));
        listViewItems.add(new Items("pot", R.drawable.ptn1));
        listViewItems.add(new Items("cioccolato", R.drawable.ptn2));
        listViewItems.add(new Items("hanger", R.drawable.ptn3));
        listViewItems.add(new Items("vino ", R.drawable.ptn4));
        listViewItems.add(new Items("colorful", R.drawable.ptn5));

        return listViewItems;
    }
}
