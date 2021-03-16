package com.examples.barvolume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var edWidth : EditText
    private lateinit var edHeigth : EditText
    private lateinit var edLength : EditText
    private lateinit var btnCalculate : Button
    private lateinit var tvResult : TextView

    //menambahkan method onSaveInstanceState
    companion object {
        private const val STATE_RESULT = "state_result"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edWidth = findViewById(R.id.edt_width)
        edHeigth = findViewById(R.id.edt_heigth)
        edLength = findViewById(R.id.edt_length)
        btnCalculate = findViewById(R.id.btn_calculate)
        tvResult = findViewById(R.id.tv_Result)

        btnCalculate.setOnClickListener(this)

        //menangkap hasil dari bundle ke result jika tidak null dan menyimpan kembali ke tvResult
        if (savedInstanceState != null) {
            val result = savedInstanceState.getString(STATE_RESULT)
            tvResult.text = result //menyimpan ke tvResult
        }

    }

    //menyimpan isi tvResult ke bundle
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT, tvResult.text.toString())
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_calculate) {
            val inputWidth = edWidth.text.toString().trim()
            val inputHeigth = edHeigth.text.toString().trim()
            val inputLength = edLength.text.toString().trim()

            var isEmptyFields = false

            when {
                inputWidth.isEmpty() -> {
                    isEmptyFields = true
                    edWidth.error = "Field tidak boleh kosong"
                }

                inputHeigth.isEmpty() -> {
                    isEmptyFields = true
                    edHeigth.error = "Field tidak boleh kosong"
                }

                inputLength.isEmpty() -> {
                    isEmptyFields = true
                    edLength.error = "Field tidak boleh kosong"
                }

            }

            if (!isEmptyFields) {
                val volume = inputLength.toDouble() * inputWidth.toDouble() * inputHeigth.toDouble()
                tvResult.text = volume.toString()
            }
        }
    }
}