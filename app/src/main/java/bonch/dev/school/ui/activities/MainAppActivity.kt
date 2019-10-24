package bonch.dev.school

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bonch.dev.school.ui.fragments.ChatFragment
import bonch.dev.school.ui.fragments.PasswordFragment
import bonch.dev.school.ui.fragments.ProfileFragment
import kotlinx.android.synthetic.main.activity_main_app.*

class MainAppActivity : AppCompatActivity() {

    val fm = supportFragmentManager
    private lateinit var passwordFragment : PasswordFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_app)

        attachFragment()
    }

    fun attachFragment(){
        fm.beginTransaction().add(R.id.fragment_main_activity_container,ChatFragment()).commit()
    }

    fun replaceFragments()
    {
        fm.beginTransaction().replace(R.id.fragment_main_activity_container,ProfileFragment()).addToBackStack("fragment_profile").commit()
    }


    fun changePasswordFragment()
    {
        passwordFragment = PasswordFragment()
        fm.beginTransaction().add(R.id.change_password_fragment_container,passwordFragment).commit()
    }
}
