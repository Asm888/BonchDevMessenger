package bonch.dev.school.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import bonch.dev.school.MainAppActivity
import bonch.dev.school.R

class ProfileFragment : Fragment() {

    private lateinit var button : Button
    lateinit var passwordFr : PasswordFragment

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_profile,container,false)
        button = view.findViewById(R.id.change_password_button)
        passwordFr = PasswordFragment()
        button.setOnClickListener {
            fragmentManager?.let { it1 -> passwordFr.show(it1,"passwordFragment") }
        }
        return view
    }


}