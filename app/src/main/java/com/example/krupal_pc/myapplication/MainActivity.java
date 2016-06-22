package com.example.krupal_pc.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import Beans.Person;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person p = new Person();
        p.setId("1");
        p.setName("krupal");
        p.setMobile("9662143557");
       /* RealmConfiguration.Builder mBuilder = new RealmConfiguration.Builder(this);
        Realm.setDefaultConfiguration(mBuilder.build());

        Realm realm = Realm.getDefaultInstance();


        realm.beginTransaction();
        realm.copyToRealm(p);
        realm.commitTransaction();*/

    }
}
