package br.com.lfma.helloandroid.extensions

import android.widget.EditText

fun EditText.value() = this.text.toString()