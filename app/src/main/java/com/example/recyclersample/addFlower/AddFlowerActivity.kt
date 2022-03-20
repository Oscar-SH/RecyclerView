package com.example.recyclersample.addFlower

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.recyclersample.R
import com.google.android.material.textfield.TextInputEditText

const val FLOWER_NAME = "name"
const val FLOWER_DESCRIPTION = "description"
const val FLOWER_TAMANIO = "tamanio"
const val FLOWER_TIPO = "tipo"
const val FLOWER_NOMBRECIENTIFICO= "nombreCientifico"
const val FLOWER_COLOR = "color"

class AddFlowerActivity : AppCompatActivity() {
    private lateinit var addFlowerName: TextInputEditText
    private lateinit var addFlowerDescription: TextInputEditText
    private lateinit var addFlowerTamanio: TextInputEditText
    private lateinit var addFlowerTipo: TextInputEditText
    private lateinit var addFlowernombreCientifico: TextInputEditText
    private lateinit var addFlowerColor: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_flower_layout)

        findViewById<Button>(R.id.done_button).setOnClickListener {
            addFlower()
        }
        addFlowerName = findViewById(R.id.add_flower_name)
        addFlowerDescription = findViewById(R.id.add_flower_description)
        addFlowerTamanio = findViewById(R.id.add_flower_tamanio)
        addFlowerTipo = findViewById(R.id.add_flower_tipo)
        addFlowernombreCientifico = findViewById(R.id.add_flower_nombreCientifico)
        addFlowerColor = findViewById(R.id.add_flower_color)
    }

    /* The onClick action for the done button. Closes the activity and returns the new flower name
    and description as part of the intent. If the name or description are missing, the result is set
    to cancelled. */

    private fun addFlower() {
        val resultIntent = Intent()

        if (addFlowerName.text.isNullOrEmpty() || addFlowerDescription.text.isNullOrEmpty()) {
            setResult(Activity.RESULT_CANCELED, resultIntent)
        } else {
            val name = addFlowerName.text.toString()
            val description = addFlowerDescription.text.toString()
            val tamanio = addFlowerTamanio.text.toString()
            val tipo = addFlowerTipo.text.toString()
            val nombreCientifico= addFlowernombreCientifico.text.toString()
            val color = addFlowerColor.text.toString()
            resultIntent.putExtra(FLOWER_NAME, name)
            resultIntent.putExtra(FLOWER_DESCRIPTION, description)
            resultIntent.putExtra(FLOWER_TAMANIO, tamanio)
            resultIntent.putExtra(FLOWER_TIPO, tipo)
            resultIntent.putExtra(FLOWER_NOMBRECIENTIFICO, nombreCientifico)
            resultIntent.putExtra(FLOWER_COLOR, color)
            setResult(Activity.RESULT_OK, resultIntent)
        }
        finish()
    }
}