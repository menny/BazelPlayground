package net.evendanan.bazelplayground;

import android.content.pm.ApplicationInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import net.evendanan.rewrite_lib.MyContentProvider;

import java.util.List;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Name of java lib is " + net.evendanan.bazelplayground.javalib.Util.getLibName(), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        ApplicationInfo appInfo = null;
        try {
            appInfo = getPackageManager().getApplicationInfo("net.evendanan.bazelplayground", PackageManager.GET_META_DATA);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        List<ProviderInfo> providers = getPackageManager().queryContentProviders(appInfo.processName, appInfo.uid, 0);
        StringBuilder providersText = new StringBuilder("There are ");
        providersText.append(providers.size()).append(" providers.");
        for(ProviderInfo aProvider : providers) {
            providersText.append("\nname:").append(aProvider.name);
            providersText.append("\nauthority:").append(aProvider.authority);
        }
        TextView contentProviderText = (TextView) findViewById(R.id.context_provider_lib);
        contentProviderText.setText(providersText.toString());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
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
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
