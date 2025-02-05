package com.br.zulamy25;

import android.app.Application;
import android.content.Intent;

import com.br.zulamy25.MusicService;

public class Contador extends Application {
    private static int activityCount = 0;
    private static Contador instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

    public static Contador getInstance() {
        return instance;
    }

    public static void incrementActivityCount() {
        activityCount++;
    }

    public static void decrementActivityCount() {
        activityCount--;
        if (activityCount == 0) {
            stopMusicService();
        }
    }

    private static void stopMusicService() {
        Intent intent = new Intent(instance, MusicService.class);
        instance.stopService(intent);
    }
}
