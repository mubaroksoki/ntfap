package com.example.notifapk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var notificationManager: NotificationManagerCompat


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notificationManager = NotificationManagerCompat.from(this)

        btnSend1.setOnClickListener{
            val title = eTitle.text.toString()
            val absena = absen.text.toString()
            val builder = NotificationCompat.Builder(this, bbapk.CHANNEL_1_ID)
                .setSmallIcon(R.drawable.ngopi_bang)
                .setContentTitle(title)
                .setContentText(absena)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setSubText("Ini sub text")
                .setCategory(NotificationCompat.CATEGORY_MESSAGE)

            val notification = builder.build()
            notificationManager.notify(1, notification)
        }

    }
}
