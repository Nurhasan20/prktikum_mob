package com.example.project_enam

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.list_item.*
import kotlinx.android.synthetic.main.phonedetail.*
import java.time.Instant

class PhoneDetail : AppCompatActivity (){
    override fun onCreate (savedInstantState: Bundle?) {
        super.onCreate(savedInstantState)
        setContentView(R.layout.phonedetail)

        var intentThatStartedThisActivity = getIntent()

        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)){
            var partId = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            textView.text = partId
        }

    }
}