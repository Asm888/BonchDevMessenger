package bonch.dev.school.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import bonch.dev.school.MainAppActivity
import bonch.dev.school.R
import kotlinx.android.synthetic.main.fragment_chat.*

class ChatFragment : Fragment() {

    private lateinit var button : Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_chat,container,false)
        button = view.findViewById(R.id.send_message_button)
        setListeners()
        return view
    }

    fun setListeners()
    {
        button.setOnClickListener (View.OnClickListener{
            (context as MainAppActivity).replaceFragments()
        })
    }
}