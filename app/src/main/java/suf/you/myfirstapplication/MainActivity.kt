package suf.you.myfirstapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun buFindAgeEvent(view:View){
        val birthYear = txtYear.text.toString().toInt()
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        if(birthYear>currentYear || birthYear<=0){
            tvAge.text = "invalid input"
            return
        }
        val myAge = currentYear - birthYear
        tvAge.text = myAge.toString()
    }
}
