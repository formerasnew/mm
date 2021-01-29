package com.chz.myjetpack;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;

import com.chz.myjetpack.utils.NavGraphBuilder;
import com.chz.myjetpack.view.AppBottomBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;



public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    private NavController navController;
    private AppBottomBar navView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navView = findViewById(R.id.nav_view);
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        navController = NavHostFragment.findNavController(fragment);


        NavGraphBuilder.build(this, fragment.getChildFragmentManager(), navController, fragment.getId());

        navView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        //页面跳转
        navController.navigate(item.getItemId());
        //false 代表按钮没有被选中 true 选中
        //如果MenuItem为空就不选中 不为空就选中
        return !TextUtils.isEmpty(item.getTitle());
    }
}