package com.zpf.test5;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by ChenzJ on 2018/5/27.
 */

public class PrefFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }

}
