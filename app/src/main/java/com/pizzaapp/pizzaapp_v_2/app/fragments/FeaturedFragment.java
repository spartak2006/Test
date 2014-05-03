package com.pizzaapp.pizzaapp_v_2.app.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pizzaapp.pizzaapp_v_2.app.R;

/**
 * Created by neso on 12.04.14..
 */
public class FeaturedFragment extends BaseFragment
{


    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState)
    {

        View parent = inflater.inflate(R.layout.featured, container, false);
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
