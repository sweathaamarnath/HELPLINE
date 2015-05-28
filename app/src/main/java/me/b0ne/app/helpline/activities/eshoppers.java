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


public class eshoppers extends ActionBarActivity {

    private ListView mListView;
    private FloatingActionButton mFab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.eshoppers);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setTitle("E-Shoppers");
//        ActionBar actionBar = getSupportActionBar();

        mListView = (ListView)findViewById(R.id.list_view);
        mFab = (FloatingActionButton)findViewById(R.id.fab);
        String[] items = getResources().getStringArray(R.array.shop_item_list);
        MainListAdapter adapter = new MainListAdapter(this, items);
        mListView.setAdapter(adapter);
        mFab.attachToListView(mListView);

        mListView.setOnItemClickListener(onListClick);
    }

    private AdapterView.OnItemClickListener onListClick = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Intent intent = new Intent(Intent.ACTION_CALL);
            switch (position) {
                case 0:

                    intent.setData(Uri.parse("tel:1800 102 3547"));
                    startActivity(intent);
                    break;
                case 1:
                    intent.setData(Uri.parse("tel:1800 3000 9009"));
                    startActivity(intent);
                    break;
                case 2:
                    intent.setData(Uri.parse("tel:1 800 258 5555 "));
                    startActivity(intent);
                    break;
                case 3:
                    intent.setData(Uri.parse("tel:08043541999"));
                    startActivity(intent);
                    break;
                case 4:
                    intent.setData(Uri.parse("tel:092126 92126"));
                    startActivity(intent);
                    break;
                case 5:
                    intent.setData(Uri.parse("tel:1800- 209- 3229"));
                    startActivity(intent);
                    break;
                case 6:
                    intent.setData(Uri.parse("tel:1-800-209-6648"));
                    startActivity(intent);
                    break;
                case 7:
                    intent.setData(Uri.parse("tel:18002662333"));
                    startActivity(intent);
                    break;
                case 8:
                    intent.setData(Uri.parse("tel:1800 3000 1212"));
                    startActivity(intent);
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
