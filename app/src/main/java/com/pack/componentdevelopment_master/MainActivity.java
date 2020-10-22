package com.pack.componentdevelopment_master;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.pack.componentdevelopment_master.databinding.ActivityMainBinding;
import com.pack.componentdevelopment_master.databinding.ActivityMainBindingImpl;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        initNavButtom();
    }
    private void initNavButtom(){
//        创建一个容器
        NavController controller= Navigation.findNavController(this,R.id.nvaFragment);
//        创建底部导航
        AppBarConfiguration configuration= new AppBarConfiguration.Builder(binding.navBottom.getMenu()).build();

        NavigationUI.setupActionBarWithNavController(this,controller,configuration);
        NavigationUI.setupWithNavController(binding.navBottom,controller);

    }
}