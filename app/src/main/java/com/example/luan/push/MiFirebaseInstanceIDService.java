package com.example.luan.push;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Luan on 1/03/2017.
 */
public class MiFirebaseInstanceIDService extends FirebaseInstanceIdService {


    public static String TAG = "Push";

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String TOKEN = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Token: " + TOKEN);
    }
}
