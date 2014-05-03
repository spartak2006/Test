package com.pizzaapp.pizzaapp_v_2.app.fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.pizzaapp.pizzaapp_v_2.app.R;

/**
 * Created by neso on 13.04.14..
 */
public class HomeScreen extends BaseFragment
{
    private Button mSearch;
    private Button mLogin;
    private Button mRandomize;
    private Button mFeatured;
    private Button mAbout;
    private Button mContactUs;

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState)
    {
        View parent = inflater.inflate(R.layout.home_screen, container, false);

        initUi(parent);
        initListeners();
        return parent;
    }

    @Override
    protected void initUi(View parent)
    {
        mSearch = (Button) parent.findViewById(R.id.home_screen_search_button);
        mLogin = (Button) parent.findViewById(R.id.home_screen_login_button);
        mRandomize = (Button) parent.findViewById(R.id.home_sreen_randomize_button);
        mFeatured = (Button) parent.findViewById(R.id.home_screen_featured_button);
        mAbout = (Button) parent.findViewById(R.id.home_screen_about_button);
        mContactUs = (Button) parent.findViewById(R.id.home_screen_contact_us_button);

    }

    @Override
    protected void initListeners()
    {

        mSearch.setOnClickListener(mOnClickListener);
        mLogin.setOnClickListener(mOnClickListener);
        mRandomize.setOnClickListener(mOnClickListener);
        mFeatured.setOnClickListener(mOnClickListener);
        mAbout.setOnClickListener(mOnClickListener);
        mContactUs.setOnClickListener(mOnClickListener);

    }

    private View.OnClickListener mOnClickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            switch (v.getId())
            {
                case R.id.home_screen_search_button:
                    SearchFragment searchFragment = new SearchFragment();
                    FragmentManager searchManager = getFragmentManager();
                    FragmentTransaction searchTransaction = searchManager.beginTransaction();
                    searchTransaction.replace(R.id.activity_main_holder, searchFragment);
                    searchTransaction.addToBackStack(null);
                    searchTransaction.commit();
                    break;

                case R.id.home_screen_login_button:
                    LoginFragment loginFragment = new LoginFragment();
                    FragmentManager loginManager = getFragmentManager();
                    FragmentTransaction loginTransaction = loginManager.beginTransaction();
                    loginTransaction.replace(R.id.activity_main_holder, loginFragment);
                    loginTransaction.addToBackStack(null);
                    loginTransaction.commit();
                    break;

                case R.id.home_sreen_randomize_button:
                    RandomizeFragment randomizeFragment = new RandomizeFragment();
                    FragmentManager randomizeManager = getFragmentManager();
                    FragmentTransaction randomizeTransaction = randomizeManager.beginTransaction();
                    randomizeTransaction.replace(R.id.activity_main_holder, randomizeFragment);
                    randomizeTransaction.addToBackStack(null);
                    randomizeTransaction.commit();
                    break;
                case R.id.home_screen_featured_button:
                    FeaturedFragment featuredFragment = new FeaturedFragment();
                    FragmentManager featuredManager = getFragmentManager();
                    FragmentTransaction featuredTransaction = featuredManager.beginTransaction();
                    featuredTransaction.replace(R.id.activity_main_holder, featuredFragment);
                    featuredTransaction.addToBackStack(null);
                    featuredTransaction.commit();
                    break;
                case R.id.home_screen_about_button:
                    AboutFragment aboutFragment = new AboutFragment();
                    FragmentManager aboutManager = getFragmentManager();
                    FragmentTransaction aboutTransaction = aboutManager.beginTransaction();
                    aboutTransaction.replace(R.id.activity_main_holder, aboutFragment);
                    aboutTransaction.addToBackStack(null);
                    aboutTransaction.commit();
                    break;
                case R.id.home_screen_contact_us_button:
                    ContactUsFragment contactUsFragment = new ContactUsFragment();
                    FragmentManager contactUsManager = getFragmentManager();
                    FragmentTransaction contactUsTransaction = contactUsManager.beginTransaction();
                    contactUsTransaction.replace(R.id.activity_main_holder, contactUsFragment);
                    contactUsTransaction.addToBackStack(null);
                    contactUsTransaction.commit();
                    break;
            }
        }
    };
}
