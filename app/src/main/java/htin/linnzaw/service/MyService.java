package htin.linnzaw.service;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service
{
    private MediaPlayer mediaplayer;
    public MyService()
    {

    }

    @Override
    public IBinder onBind(Intent intent)
    {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate()
    {
        Toast.makeText(this, "Service created", Toast.LENGTH_SHORT).show();
        mediaplayer = MediaPlayer.create(this, R.raw.eventually);
        mediaplayer.setLooping(false);
    }

    @Override
    public void onStart(Intent intent, int startid)
    {
        Toast.makeText(this, "Service  Started", Toast.LENGTH_SHORT).show();
        mediaplayer.start();
    }

    @Override
    public void onDestroy()
    {
        Toast.makeText(this, "Service stopped", Toast.LENGTH_SHORT).show();
        mediaplayer.stop();
    }
}
