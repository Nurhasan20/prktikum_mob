package com.example.project_enam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testdata = createphonedata()
        rvpart.layoutManager = LinearLayoutManager(this)
        rvpart.setHasFixedSize(true)
        rvpart.adapter = adapter(testdata,{phoneitem : phonedata -> phoneitemClicked(phoneitem)})
    }

    private fun phoneitemClicked(phoneItem : phonedata){
        val showDetailActivityIntent = Intent(this, PhoneDetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, phoneItem.phone.toString())
        startActivity(showDetailActivityIntent)
    }
    private fun createphonedata() : List<phonedata>{
        val partlist = ArrayList<phonedata>()
        partlist.add(phonedata(123456,"ROTUN"))
        partlist.add(phonedata(654321,"ADE"))
        partlist.add(phonedata(635412,"LATEP"))
        partlist.add(phonedata(162534,"LILI"))
        partlist.add(phonedata(435261,"MEHOK"))
        return partlist
    }

}
