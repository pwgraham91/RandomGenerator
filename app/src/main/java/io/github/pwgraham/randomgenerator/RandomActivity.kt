package io.github.pwgraham.randomgenerator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_random.*
import java.util.*

class RandomActivity : AppCompatActivity() {
    companion object {
        const val TOTAL_COUNT = "total_count"
        const val DEFAULT_UPPER_BOUND = 0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random)
        showRandomNumber()
    }

    fun showRandomNumber() {
        val count = intent.getIntExtra(TOTAL_COUNT, DEFAULT_UPPER_BOUND)

        val randomInstance = Random()
        var randomInt = 0
        if (count > randomInt) {
            randomInt = randomInstance.nextInt(count + 1)
        }

        textview_random.text = "$randomInt"
    }
}
