package com.example.app_characters_list.data

import androidx.compose.ui.graphics.Color

data class Skin(
    val nombre: String,
    val imagen: Int,
    //zoom de las skins
    val zoomScale: Float = 1f,
    val zoomX: Float = 0f,
    val zoomY: Float = 0f
)

data class Habilidad(
    val tecla: String,
    val nombre: String,
    val imagen: Int,
    val descripcion: String
)

data class Forma(
    val nombre: String,
    val imagen: Int,
    val descripcion: String,
    val habilidades: List<Habilidad>,
    //zoom de los splash
    val zoomScale: Float = 1f,
    val zoomX: Float = 0f,
    val zoomY: Float = 0f
)

data class Personaje(
    val nombre: String,
    val descripcion: String,
    val rol: String,
    val carril: String,
    val habilidades: List<Habilidad>,
    val stats: Map<String, Int>,
    val skins: List<Skin>,
    val formas: List<Forma> = emptyList(),
    //zoom de skins
    val zoomScale: Float = 1.8f,
    val zoomY: Float = 30f,
    val zoomX: Float = 0f
)

data class Categoria(
    val nombre: String,
    val fondo: Int,
    val personajes: List<Personaje>,
    val colorPrincipal: Color,
    val colorSecundario: Color
)