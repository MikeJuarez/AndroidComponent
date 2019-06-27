package michaeljuarez.com.broadcastreceiverproject;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.Toast;

public class AirPlaneReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String action = intent.getAction();

        if (action != null && action.equals(Intent.ACTION_AIRPLANE_MODE_CHANGED)) {
                Toast.makeText(context, "Airplane mode has changed", Toast.LENGTH_LONG).show();
                Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
                vibrator.vibrate(2000);

        }
    }
}
