package com.chisw.lab12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.min

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("GG", task1("2"))
        Log.d("GG", task2(Weekday.MONDAY))
        Log.d("GG", task3(Weekday.MONDAY).toString())
        Log.d("GG", task4(2, 7, Operation.PLUS).toString())
        Log.d("GG", task5(2, 7).toString())
    }

    private fun task1(string: String) = when {
        Regex("[0-9]").matches(string) -> "Number"
        Regex("[a-z]+").matches(string) -> "Only small letters"
        Regex("[a-zA-Z]+").matches(string) -> "Letters"
        else -> "No pattern"
    }

    private fun task2(day: Weekday) = when(day.num) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "No day"
    }

    private fun task3(day: Weekday) = day.nextDay()

    private fun task4(num1: Int, num2: Int, operation: Operation) = when(operation) {
        Operation.PLUS -> num1 + num2
        Operation.MINUS -> num1 - num2
        Operation.MULTIPLICATION -> num1 * num2
        Operation.DIVISION -> num1 / num2
    }

    private fun task5(a: Int, b: Int): Int {
        val n = 5 * a - 2 * b
        return min(n, a + b)
    }
}