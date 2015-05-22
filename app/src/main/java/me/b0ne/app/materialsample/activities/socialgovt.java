package helpline.application.smile.com.helpline;

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

import me.b0ne.app.materialsample.R;
import me.b0ne.app.materialsample.adapters.MainListAdapter;


public class socialgovt extends ActionBarActivity {

    private ListView mListView;
    private FloatingActionButton mFab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sociogovt);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);
        actionBar.setTitle("Social-Govt");
//        ActionBar actionBar = getSupportActionBar();

        mListView = (ListView)findViewById(R.id.list_view);
        mFab = (FloatingActionButton)findViewById(R.id.fab);
        String[] items = getResources().getStringArray(R.array.socio_item_list);
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

                    Uri telephoneUri = Uri.parse("tel:108 ");
                    Intent my_intent = new Intent(Intent.ACTION_DIAL, telephoneUri);
                    startActivity(my_intent);
                    break;
                case 1:
                    Uri telephoneUri1 = Uri.parse("tel: 1097");
                    Intent my_intent1 = new Intent(Intent.ACTION_DIAL, telephoneUri1);
                    startActivity(my_intent1);
                    break;
                case 2:
                    Uri telephoneUri2 = Uri.parse("tel:102 ");
                    Intent my_intent2 = new Intent(Intent.ACTION_DIAL, telephoneUri2);
                    startActivity(my_intent2);
                    break;
                case 3:
                    Uri telephoneUri3 = Uri.parse("tel: 1910");
                    Intent my_intent3 = new Intent(Intent.ACTION_DIAL, telephoneUri3);
                    startActivity(my_intent3);
                    break;
                case 4:
                    Uri telephoneUri4 = Uri.parse("tel:1911");
                    Intent my_intent4 = new Intent(Intent.ACTION_DIAL, telephoneUri4);
                    startActivity(my_intent4);
                    break;
                case 5:
                    Uri telephoneUri5 = Uri.parse("tel:1092");
                    Intent my_intent5 = new Intent(Intent.ACTION_DIAL, telephoneUri5);
                    startActivity(my_intent5);
                    break;
                case 6:
                    Uri telephoneUri6 = Uri.parse("tel: 1919");
                    Intent my_intent6 = new Intent(Intent.ACTION_DIAL, telephoneUri6);
                    startActivity(my_intent6);
                    break;
                case 7:
                    Uri telephoneUri7 = Uri.parse("tel:101");
                    Intent my_intent7 = new Intent(Intent.ACTION_DIAL, telephoneUri7);
                    startActivity(my_intent7);
                    break;
                case 8:
                    Uri telephoneUri8 = Uri.parse("tel:100");
                    Intent my_intent8 = new Intent(Intent.ACTION_DIAL, telephoneUri8);
                    startActivity(my_intent8);
                    break;
                case 9:
                    Uri telephoneUri9 = Uri.parse("tel:1073");
                    Intent my_intent9 = new Intent(Intent.ACTION_DIAL, telephoneUri9);
                    startActivity(my_intent9);
                    break;
                case 10:
                    Uri telephoneUri10 = Uri.parse("tel:155313");
                    Intent my_intent10= new Intent(Intent.ACTION_DIAL, telephoneUri10);
                    startActivity(my_intent10);
                    break;
                case 11:
                    Uri telephoneUri11 = Uri.parse("tel: 1091");
                    Intent my_intent11 = new Intent(Intent.ACTION_DIAL, telephoneUri11);
                    startActivity(my_intent11);
                    break;
                case 12:
                    Uri telephoneUri12 = Uri.parse("tel: 131");
                    Intent my_intent12 = new Intent(Intent.ACTION_DIAL, telephoneUri12);
                    startActivity(my_intent12);
                    break;
                case 13:
                    Uri telephoneUri13 = Uri.parse("tel:1345");
                    Intent my_intent13 = new Intent(Intent.ACTION_DIAL, telephoneUri13);
                    startActivity(my_intent13);
                    break;
                case 14:
                    Uri telephoneUri14 = Uri.parse("tel:1582");
                    Intent my_intent14= new Intent(Intent.ACTION_DIAL, telephoneUri14);
                    startActivity(my_intent14);
                    break;
                case 15:
                    Uri telephoneUri15 = Uri.parse("tel:1800 3000 0093");
                    Intent my_intent15= new Intent(Intent.ACTION_DIAL, telephoneUri15);
                    startActivity(my_intent15);
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
