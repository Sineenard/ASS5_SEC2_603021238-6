package com.example.ass5intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_show_data.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //addListenerOnButton()

    }



    /*fun sendData(view: View){
        val intent = Intent(this,showData::class.java)
        intent.putExtra("empData",Employee())

    }*/


    fun sendData(view: View){
        //----------------------------------------------------------
        val btn_click: Button = findViewById(R.id.send) as Button
        btn_click.setOnClickListener{
            var radioGroup: RadioGroup = findViewById(R.id.radiogroup)
            var selectedId : Int = radioGroup.checkedRadioButtonId;
            var radioButton : RadioButton = findViewById(selectedId);
        //--------------------------------------------------------------
            val intent = Intent(this,showData::class.java)
            intent.putExtra("empData",Employee(empName.text.toString(), radioButton.text.toString()
            , empMail.text.toString(), empSal.text.toString().toInt()))
            startActivity(intent)



        }
    }

    fun reset(view: View){
        empName.text.clear()
        empSal.text.clear()
        empMail.text.clear()
        radiogroup.clearCheck()

    }
}
