package com.example.myapplication

import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener

class SensorListener : SensorEventListener {
    var temperature :Float = 1f
    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {
        System.out.println("asdsd")
            }

    override fun onSensorChanged(p0: SensorEvent?) {
        if(p0 != null)
        temperature = p0.values[0]
    }
}