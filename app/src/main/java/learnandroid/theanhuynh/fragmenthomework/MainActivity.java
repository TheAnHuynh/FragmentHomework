package learnandroid.theanhuynh.fragmenthomework;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTabHost;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    FragmentTabHost tabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addControls() {
        tabHost = findViewById(R.id.tabHost);
        tabHost.setup(this,getSupportFragmentManager(),R.id.tabContent);

        TabHost.TabSpec tab1 = tabHost.newTabSpec("tabMonHoc");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("tabGiangVien");
        TabHost.TabSpec tab3 = tabHost.newTabSpec("tabThongTin");

        tab1.setIndicator("Môn Học");
        tab2.setIndicator("Giảng Viên");
        tab3.setIndicator("Thông tin");

        tabHost.addTab(tab1,FragmentTab1.class,null);
        tabHost.addTab(tab2,FragmentTab2.class,null);
        tabHost.addTab(tab3,FragmentTab3.class,null);

    }

    private void addEvents() {
//        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
//            @Override
//            public void onTabChanged(String s) {
//                FragmentManager fragmentManager = getSupportFragmentManager();
//                FragmentTransaction transaction = fragmentManager.beginTransaction();
//                android.support.v4.app.Fragment fragment = null;
//                switch (s){
//                    case "tabMonHoc":{
//                        fragment = new FragmentTab1();
//                        break;
//                    }
//                    case "tabGiangVien":{
//                        fragment = new FragmentTab2();
//                        break;
//                    }
//                    case "tabThongTin": {
//                        fragment = new FragmentTab3();
//                        break;
//                    }
//                }
//                transaction.replace(R.id.tabContent,fragment);
//                transaction.commit();
//            }
//        });
    }
}
