package michaeljuarez.com.broadcastreceiverproject

import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {


    var airPlaneReceiver : AirPlaneReceiver = AirPlaneReceiver();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onResume() {
        super.onResume()

        val intentFilter = IntentFilter();
        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED);

        registerReceiver(airPlaneReceiver, intentFilter);
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(airPlaneReceiver);
    }
}
