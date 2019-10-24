package bonch.dev.school.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import bonch.dev.school.MainAppActivity
import bonch.dev.school.R
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    private lateinit var buttonCompleteSignUp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        buttonCompleteSignUp = complete_sign_up_button

        buttonCompleteSignUp.setOnClickListener {
            val intent = Intent(SignUpActivity@this, MainAppActivity::class.java)
            startActivity(intent)
        }
    }
}