package com.pizzaapp.pizzaapp_v_2.app.activities;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import com.pizzaapp.pizzaapp_v_2.app.R;
import com.pizzaapp.pizzaapp_v_2.app.fragments.HomeScreen;

public class MainActivity extends BaseActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUi();
    }

    @Override
    protected void initUi()
    {

        HomeScreen homeScreen = new HomeScreen();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.activity_main_holder, homeScreen);
        transaction.commit();

    }

    @Override
    protected void initListeners()
    {

    }
}
