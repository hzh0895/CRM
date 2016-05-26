package com.example.showjoy.crm.util;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ShowJoy on 2016/5/26.
 */
public class ActivityCollector {
    private static List<Activity> activities = new ArrayList<>();

    public static void addActivity(Activity activity) {
        activities.add(activity);
    }

    public static void removeActivity(Activity activity) {
        activities.remove(activity);
    }

    public static void finishAll() {
        for(Activity activity: activities) {
            if(! activity.isFinishing())
                activity.finish();
        }
    }
}
