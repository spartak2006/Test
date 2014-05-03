package com.pizzaapp.pizzaapp_v_2.app.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pizzaapp.pizzaapp_v_2.app.R;

/**
 * Created by neso on 12.04.14..
 */
public class LoginFragment extends BaseFragment
{

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState)
    {
        View parent = inflater.inflate(R.layout.login, container, false);

        initUi(parent);

        return parent;
    }

    @Override
    protected void initUi(View parent)
    {



    }

    @Override
    protected void initListeners()
    {

    }
}
