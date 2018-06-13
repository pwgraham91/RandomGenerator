package io.github.pwgraham.randomgenerator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View) {
        val countString = text_view.text.toString()
        var count: Int = Integer.parseInt(countString)

        count++

        text_view.text = count.toString()
    }

    fun randomMe(view: View) {
        val randomIntent = Intent(this, RandomActivity::class.java)

        val countString = text_view.text.toString()
        val count = Integer.parseInt(countString)

        randomIntent.putExtra(RandomActivity.TOTAL_COUNT, count)

        startActivity(randomIntent)
    }
}