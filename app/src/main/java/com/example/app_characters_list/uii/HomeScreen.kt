package com.example.app_characters_list.uii

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.app_characters_list.data.categorias
import com.example.app_characters_list.data.selectedPersonaje
import com.example.app_characters_list.data.selectedCategoria

@Composable
fun HomeScreen(navController: NavController) {

    var categoriaActual by remember { mutableStateOf(selectedCategoria ?: categorias[0]) }

    Box(modifier = Modifier.fillMaxSize()) {

        Image(
            painter = painterResource(id = categoriaActual.fondo),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(categoriaActual.colorSecundario.copy(alpha = 0.7f))
        )

        Column(modifier = Modifier.fillMaxSize()) {

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 12.dp, horizontal = 8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(categorias) { categoria ->
                    val esSeleccionada = categoriaActual == categoria
                    Button(
                        onClick = { 
                            categoriaActual = categoria
                            selectedCategoria = categoria 
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = if (esSeleccionada) categoria.colorPrincipal else Color.White.copy(alpha = 0.1f),
                            contentColor = if (esSeleccionada) categoria.colorSecundario else Color.White
                        ),
                        border = if (esSeleccionada) null else BorderStroke(1.dp, Color.White.copy(alpha = 0.3f))
                    ) {
                        Text(categoria.nombre, fontWeight = if (esSeleccionada) FontWeight.Bold else FontWeight.Normal)
                    }
                }
            }

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.weight(1f)
            ){
                items(categoriaActual.personajes) { personaje ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(230.dp)
                            .clickable {
                                selectedPersonaje = personaje
                                selectedCategoria = categoriaActual
                                navController.navigate("detalle")
                            },
                        colors = CardDefaults.cardColors(containerColor = Color.White.copy(alpha = 0.05f)),
                        border = BorderStroke(1.dp, categoriaActual.colorPrincipal.copy(alpha = 0.4f))
                    ) {
                        Box(modifier = Modifier.fillMaxSize()) {
                            
                            //logo de fondo
                            personaje.logo?.let { logoRes ->
                                Image(
                                    painter = painterResource(id = logoRes),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .align(Alignment.Center)
                                        .size(170.dp)
                                        .offset(y = (-20).dp),
                                    alpha = 0.3f, 
                                    contentScale = ContentScale.Fit
                                )
                            }

                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier.fillMaxSize().padding(12.dp)
                            ) {
                                Box(
                                    modifier = Modifier
                                        .size(140.dp)
                                        .padding(bottom = 8.dp)
                                        .clip(RoundedCornerShape(12.dp)),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Image(
                                        painter = painterResource(id = personaje.skins[0].imagen),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .graphicsLayer(
                                                scaleX = personaje.zoomScale,
                                                scaleY = personaje.zoomScale,
                                                translationY = personaje.zoomY,
                                                translationX = personaje.zoomX
                                            ),
                                        contentScale = ContentScale.Crop,
                                        alignment = Alignment.TopCenter
                                    )
                                }

                                Text(
                                    text = personaje.nombre,
                                    style = MaterialTheme.typography.titleLarge,
                                    color = Color.White,
                                    fontWeight = FontWeight.ExtraBold,
                                    textAlign = TextAlign.Center
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
