package com.hilsriusnahak.uicomponent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgBtnAdd: ImageButton = findViewById(R.id.imgButtonAdd)
        val imgBtnDelete: ImageButton = findViewById(R.id.imgButtonCancel)
        val edtNama: EditText = findViewById(R.id.editNama)
        val rgGender: RadioGroup = findViewById(R.id.radioGroup)
        val cbC: CheckBox = findViewById(R.id.cbCoding)
        val cbR: CheckBox = findViewById(R.id.cbReading)
        val cbT: CheckBox = findViewById(R.id.cbTraveling)

        imgBtnAdd.setOnClickListener {
            Toast.makeText(this@MainActivity, "Berhasil", Toast.LENGTH_LONG).show()
        }

        imgBtnDelete.setOnClickListener {
            edtNama.setText("")
            rgGender.clearCheck()
            cbC.setChecked(false);
            cbR.setChecked(false);
            cbT.setChecked(false);

            Toast.makeText(this@MainActivity, "Berhasil Di Batalkan", Toast.LENGTH_LONG).show()
        }
    }
}