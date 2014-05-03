package com.pizzaapp.pizzaapp_v_2.app.activities;

import android.app.Activity;

/**
 * Created by neso on 13.04.14..
 */
public abstract class BaseActivity extends Activity
{
    protected abstract void initUi();

    protected abstract void initListeners();

}
