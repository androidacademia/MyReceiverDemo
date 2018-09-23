package login.com.girish.myreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String action=intent.getAction();
        Log.i("MYRECEIVER","SCREEN ON");
        switch (action){
            case Intent.ACTION_POWER_CONNECTED:
                Log.i("MYRECEIVER","POWER Connected");
                Toast.makeText(context, "POWER Connected", Toast.LENGTH_SHORT).show();
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                Log.i("MYRECEIVER","POWER DISCONNECTED");
                Toast.makeText(context, "POWER Disconnected", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
