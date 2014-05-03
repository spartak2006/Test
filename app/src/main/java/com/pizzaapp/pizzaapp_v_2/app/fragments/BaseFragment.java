package com.pizzaapp.pizzaapp_v_2.app.fragments;

import android.app.Fragment;
import android.view.View;

/**
 * Created by neso on 12.04.14..
 */
public abstract class BaseFragment extends Fragment
{
    protected abstract void initUi(View parent);

    protected abstract void initListeners();
}
