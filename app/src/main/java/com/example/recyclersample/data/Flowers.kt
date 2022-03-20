package com.example.recyclersample.data

import android.content.res.Resources
import com.example.recyclersample.R

/* Returns initial list of flowers. */
fun flowerList(resources: Resources): List<Flower> {
    return listOf(
        Flower(
            id = 1,
            name = resources.getString(R.string.flower1_name),
            image = R.drawable.rose,
            description = resources.getString(R.string.flower1_description),
            tamanio = resources.getString(R.string.tamanio),
            tipo = resources.getString(R.string.tipo),
            nombreCientifico = resources.getString(R.string.nombreCientifico),
            color = resources.getString(R.string.color)
        ),
        Flower(
            id = 2,
            name = resources.getString(R.string.flower2_name),
            image = R.drawable.freesia,
            description = resources.getString(R.string.flower2_description),
            tamanio = resources.getString(R.string.tamanio),
            tipo = resources.getString(R.string.tipo),
            nombreCientifico = resources.getString(R.string.nombreCientifico),
            color = resources.getString(R.string.color)
        ),
    )
}