package id.web.owlstudio.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    //TODO 1 deklarasi variable global

    private BottomNavigationView.OnNavigationItemSelectedListener
        onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()){
                case R.id.dashboard:
                    FragmentManager manager1 = getSupportFragmentManager();
                    FragmentTransaction transaction1 = manager1.beginTransaction();

                    // panggil fragment tujuan
                    BlankFragment blankFragment = new BlankFragment();
                    transaction1.replace(R.id.container2, blankFragment).commit();

                    return true;

                case R.id.money:
                    FragmentManager manager2 = getSupportFragmentManager();
                    FragmentTransaction transaction2 = manager2.beginTransaction();

                    // panggil fragment tujuan
                    BlankFragment2 blankFragment2 = new BlankFragment2();
                    transaction2.replace(R.id.container2, blankFragment2).commit();

                    return true;

                case R.id.android:
                    FragmentManager manager3 = getSupportFragmentManager();
                    FragmentTransaction transaction3 = manager3.beginTransaction();

                    //panggil fragment tujuan
                    BlankFragment3 blankFragment3 = new BlankFragment3();
                    transaction3.replace(R.id.container2, blankFragment3).commit();

                    return true;

                case R.id.test4:
                    FragmentManager manager4 = getSupportFragmentManager();
                    FragmentTransaction transaction4 = manager4.beginTransaction();

                    //panggil fragment tujuan
                    BlankFragment4 blankFragment4 = new BlankFragment4();
                    transaction4.replace(R.id.container2, blankFragment4).commit();

                    return true;
            }

            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO 2 kenalin dan hubungin

        // panggil method FragmentManager dan supaya support ke device versi lebih rendah
        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = manager.beginTransaction();

        // Menambahkan fragment mana yang duluan tampil dan ditambahkan
        BlankFragment blankFragment = new BlankFragment();

        // commit adalah method untuk menampilkan secara async atau proses belakang layar
        transaction.replace(R.id.container2, blankFragment).commit();

        // hubungkan dengan ID yang ada di activity_main.xml pada ID Bottom Navigation
        BottomNavigationView navigationView = findViewById(R.id.navigation);
        navigationView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);
    }
}
