package com.example.datecalculator

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var currentDay: Int = 0
    var currentMonth: Int = 0
    var currentYear: Int = 0
    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var calendarView = findViewById<CalendarView>(R.id.calendarView)
        var tvStartDate = findViewById<TextView>(R.id.tvStartDate)
        var tvEndDate = findViewById<TextView>(R.id.tvEndDate)

        var btnStartDate = findViewById<Button>(R.id.btnStartDate)
        var btnEndDate =  findViewById<Button>(R.id.btnEndDate)

        calendarView.setOnDateChangeListener { calendarView, year, month, day ->
            currentDay = day
            currentMonth = month + 1
            currentYear = year
        }
        btnStartDate.setOnClickListener{
            tvStartDate.text =  "$currentDay/$currentMonth/$currentYear"
        }
        btnEndDate.setOnClickListener{
            tvEndDate.text =  "$currentDay/$currentMonth/$currentYear"
        }
}
}