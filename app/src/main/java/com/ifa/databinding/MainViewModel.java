package com.ifa.databinding;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainViewModel extends ViewModel {

    private MutableLiveData<List<User>> user = new MutableLiveData<>();

    public MutableLiveData<List<User>> getUser(){
        return user;
    }

    public void setUser(){
        List<User> users = new ArrayList<>();
        users.add(new User("Phoenix 1","phoenix1@gmail.com"));
        users.add(new User("Phoenix 2","phoenix2@gmail.com"));
        users.add(new User("Phoenix 3","phoenix3@gmail.com"));
        users.add(new User("Phoenix 4","phoenix4@gmail.com"));

        this.user.setValue(users);
    }

}
