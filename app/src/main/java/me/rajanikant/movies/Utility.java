package me.rajanikant.movies;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Project : Popular Movies
 * Author : Rajanikant
 * Date : 19 Apr 2016
 * Time : 11:10
 */
public class Utility {

    private static boolean mTwoPaneLayout = false;

    public static boolean isNetworkAvailable(Context context) {
        ConnectivityManager connectivityManager
                = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean isTwoPaned(){
        return mTwoPaneLayout;
    }

    public static void setTwoPaneLayout(boolean twoPaneLayout){
        mTwoPaneLayout = twoPaneLayout;
    }

}
