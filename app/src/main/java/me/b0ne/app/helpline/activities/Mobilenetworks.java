package me.b0ne.app.helpline.activities;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.melnykov.fab.FloatingActionButton;

import me.b0ne.app.helpline.R;
import me.b0ne.app.helpline.adapters.MainListAdapter;


public class Mobilenetworks extends ActionBarActivity {

    private ListView mListView;
    private FloatingActionButton mFab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mobnet);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setTitle("MobileNetworks");
//        ActionBar actionBar = getSupportActionBar();

        mListView = (ListView) findViewById(R.id.list_view);
        mFab = (FloatingActionButton) findViewById(R.id.fab);
        String[] items = getResources().getStringArray(R.array.mobile_item_list);
        MainListAdapter adapter = new MainListAdapter(this, items);
        mListView.setAdapter(adapter);
        mFab.attachToListView(mListView);

        mListView.setOnItemClickListener(onListClick);
    }

    private AdapterView.OnItemClickListener onListClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent();



            switch (position) {
                case 0:

                    Uri telephoneUri = Uri.parse("tel:18001234567");
                    Intent my_intent = new Intent(Intent.ACTION_DIAL, telephoneUri);
                    startActivity(my_intent);
                    Mobilenetworks.this.finish();
                case 1:
                    Intent intent1 = new Intent(Intent.ACTION_DIAL);
                    intent1.setData(Uri.parse("tel:0123456789"));
                    startActivity(intent1);
                    break;
                case 2:
                    Uri telephoneUri2 = Uri.parse("tel:57777");
                    Intent my_intent2 = new Intent(Intent.ACTION_DIAL, telephoneUri2);
                    startActivity(my_intent2);
                    break;
                case 3:
                    Uri telephoneUri3 = Uri.parse("tel:1800-345-1500");
                    Intent my_intent3 = new Intent(Intent.ACTION_DIAL, telephoneUri3);
                    startActivity(my_intent3);
                    break;
                case 4:
                    Uri telephoneUri4 = Uri.parse("tel:180042012777");
                    Intent my_intent4 = new Intent(Intent.ACTION_DIAL, telephoneUri4);
                    startActivity(my_intent4);
                    break;
                case 5:
                    Uri telephoneUri5 = Uri.parse("tel:18002700001");
                    Intent my_intent5 = new Intent(Intent.ACTION_DIAL, telephoneUri5);
                    startActivity(my_intent5);
                    break;
                case 6:
                    Uri telephoneUri6 = Uri.parse("tel:18002663366");
                    Intent my_intent6 = new Intent(Intent.ACTION_DIAL, telephoneUri6);
                    startActivity(my_intent6);
                    break;
            }
            startActivity(intent);


        }
    };









    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivityForResult(new Intent(android.provider.Settings.ACTION_SETTINGS), 0);
            return true;

        }
        else if(id==R.id.action_about){
            final Context context = this;
            Intent intent = new Intent(context,about.class);
            startActivity(intent);
        }
        if(id==android.R.id.home){
            NavUtils.navigateUpFromSameTask(this);
        }
        return super.onOptionsItemSelected(item);
    }


}
