package arb.test.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_main_go.setOnClickListener {

            val intent = Intent(this,Activity2::class.java)
            intent.putExtra("data",edt_main_data.text.toString())
            startActivity(intent)

        }

    }
}
