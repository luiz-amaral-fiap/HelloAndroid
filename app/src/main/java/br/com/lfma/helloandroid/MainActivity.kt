package br.com.lfma.helloandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

//  : -> extends
//  , -> implements (interface)
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
