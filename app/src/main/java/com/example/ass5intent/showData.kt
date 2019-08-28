package com.example.ass5intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_show_data.*

class showData : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_data)

        var data = intent.extras
        var newEmployee = data?.getParcelable<Employee>("empData")
        nameText.text = "Empolyee Name: ${newEmployee?.name}"
        genderText.text = "Gender: ${newEmployee?.gender}"
        emailText.text = "E-mail: ${newEmployee?.email}"
        salaryText.text = "Salary: ${newEmployee?.salary}"




    }

    fun close(view: View){
        finish()
    }
}
