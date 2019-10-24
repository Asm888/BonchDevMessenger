package bonch.dev.school.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import bonch.dev.school.MainAppActivity
import bonch.dev.school.R
import kotlinx.android.synthetic.main.activity_sign_in.*


class SignInActivity : AppCompatActivity(){

    private lateinit var buttonSignIn : Button
    private lateinit var buttonSignUp : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        buttonSignIn = sign_in_button
        buttonSignUp = sign_up_button

        buttonSignIn.setOnClickListener{
            val intent = Intent(SignInActivity@this, MainAppActivity::class.java)
            startActivity(intent)
        }

        buttonSignUp.setOnClickListener {
            val intent = Intent(SignInActivity@this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}