package com.ifpb.newsnetwork.rss;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class RssService extends Service {

    public RssService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate(){
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        return (super.onStartCommand(intent, flags, startId));
    }

}
