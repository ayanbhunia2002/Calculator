package com.example.r1

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import org.mariuszgromada.math.mxparser.Expression
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_1.setOnClickListener{ appendOnExpression("1", true) }
        button_2.setOnClickListener{ appendOnExpression("2", true) }
        button_3.setOnClickListener{ appendOnExpression("3", true) }
        button_4.setOnClickListener{ appendOnExpression("4", true) }
        button_5.setOnClickListener{ appendOnExpression("5", true) }
        button_6.setOnClickListener{ appendOnExpression("6", true) }
        button_7.setOnClickListener{ appendOnExpression("7", true) }
        button_8.setOnClickListener{ appendOnExpression("8", true) }
        button_9.setOnClickListener{ appendOnExpression("9", true) }
        button_0.setOnClickListener{ appendOnExpression("1", true) }

        button_plus.setOnClickListener{ appendOnExpression("+", true) }
        button_minus.setOnClickListener{ appendOnExpression("-", true) }
        button_mul.setOnClickListener{ appendOnExpression("*", true) }
        button_divide.setOnClickListener{ appendOnExpression("/", true) }
        button_power.setOnClickListener{ appendOnExpression("^", true) }
        button_cb.setOnClickListener{ appendOnExpression("(", true) }
        button_ob.setOnClickListener{ appendOnExpression(")", true) }

        button_c.setOnClickListener {
            input.text = ""
            output.text = ""
        }

        button_e.setOnClickListener{
            val string = input.text.toString()
            if (string.isNotEmpty()){
                input.text = string.substring(0, string.length-1)
            }
            output.text = ""
        }

        output.setOnClickListener {
            try {
                val ex = ExpressionBui
            }catch (e: Exception){
                output.text = "Error"
                output.setTextColor(ContextCompat.getColor(this, R.color.teal_200))
            }

        }



    }

    fun appendOnExpression(string: String, canClear : Boolean){
        if(canClear){
            output.text = ""
            input.append((string))
        }
        else{
            input.append(output.text)
            input.append(string)
            output.text = ""
        }
    }

     private fun addInput(buttonValue:  String ): String{
        return "${input.text}$buttonValue"
    }

    private fun getinputex(): String{
        var ex = input.text.replace(Regex("÷"), "/")
        ex =ex.replace(Regex("×"), "*")
        ex =ex.replace(Regex("–"), "-")
        ex =ex.replace(Regex("%"), "%")
        return  ex
    }


    }



}