package br.com.lfma.helloandroid.ui.main

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.lfma.helloandroid.R
import kotlinx.android.synthetic.main.activity_main.*

//  : -> extends
//  , -> implements (interface)
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nome = intent.getStringExtra("nome")
        val telefone = intent.getStringExtra("telefone")

        tvNome.text = getString(R.string.saudacao,nome,telefone)
    }
}
