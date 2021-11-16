package net.huray.solfit.bluetooth

import androidx.appcompat.app.AppCompatActivity
import ai
import android.os.Bundle

class MainActivity : BleProfileServiceReadyActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}