package com.ifa.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.ifa.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //Setup View Model
        MainViewModel viewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        viewModel.setUser();
        viewModel.getUser().observe(this, user -> {
            binding.setViewModel(viewModel);
            binding.setUser(user);
        });

    }
}
