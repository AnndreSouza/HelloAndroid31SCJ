package br.com.andre.helloandroid.extensions

import android.widget.EditText

fun EditText.value() = this.text.toString()