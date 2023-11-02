package com.example.charmelocal.initial

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.charmelocal.LoginActivity
import com.example.charmelocal.R

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //infla o layout para possibilitar o findViewById
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        //Pega a Tag do Botão
        val btn = view.findViewById<Button>(R.id.teste)

        btn.setOnClickListener {
            val intent = Intent (activity, LoginActivity::class.java)
            activity?.startActivity(intent)
        }

        return view
    }
}