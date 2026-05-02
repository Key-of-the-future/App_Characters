package com.example.app_characters_list.ui

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.app_characters_list.data.selectedCategoria
import com.example.app_characters_list.data.selectedPersonaje
import com.example.app_characters_list.data.Habilidad
import com.example.app_characters_list.data.Forma

@Composable
fun DetailScreen(navController: NavController) {
    val personaje = selectedPersonaje ?: return
    val categoria = selectedCategoria
    val scrollState = rememberScrollState()

    var skinIndex by remember { mutableStateOf(0) }
    var formaActual by remember { mutableStateOf<Forma?>(null) }
    
    val skin = personaje.skins[skinIndex]
    val primaryColor = categoria?.colorPrincipal ?: Color.Cyan
    val secondaryColor = categoria?.colorSecundario ?: Color.Black

    //código para las distintas especificaciones jeje
    val (labelRol, labelCarril, labelSkins) = when (categoria?.nombre) {
        "LoL" -> Triple("ROL", "CARRIL", "SKINS")
        "Pokemon" -> Triple("TIPO", "ESPECIE", "EVOLUCIONES")
        "Smash" -> Triple("SERIE", "PESO", "TRAJES")
        "Marvel" -> Triple("CLASE", "AFILIACIÓN", "SKINS")
        else -> Triple("ROL", "CARRIL", "SKINS")
    }

    //datos para lolcito y sus formas
    val imagenAMostrar = formaActual?.imagen ?: skin.imagen
    val descripcionAMostrar = formaActual?.descripcion ?: personaje.descripcion
    val habilidadesAMostrar = formaActual?.habilidades ?: personaje.habilidades
    
    //código para poder escalar las imágenes y splash jsjs
    val zoomScaleAMostrar = formaActual?.zoomScale ?: skin.zoomScale
    val zoomXAMostrar = formaActual?.zoomX ?: skin.zoomX
    val zoomYAMostrar = formaActual?.zoomY ?: skin.zoomY

    Box(modifier = Modifier.fillMaxSize()) {
        //cambio de fondo
        Image(
            painter = painterResource(id = categoria?.fondo ?: personaje.skins[0].imagen),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Box(modifier = Modifier.fillMaxSize().background(secondaryColor.copy(alpha = 0.75f)))

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(60.dp))

            // card principal
            Card(
                colors = CardDefaults.cardColors(containerColor = Color.White.copy(alpha = 0.1f)),
                shape = RoundedCornerShape(28.dp),
                modifier = Modifier.fillMaxWidth(),
                border = BorderStroke(1.dp, primaryColor.copy(alpha = 0.5f))
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        IconButton(
                            onClick = { 
                                formaActual = null 
                                skinIndex = (skinIndex - 1 + personaje.skins.size) % personaje.skins.size 
                            }
                        ) {
                            Icon(Icons.AutoMirrored.Filled.KeyboardArrowLeft, null, tint = primaryColor, modifier = Modifier.size(45.dp))
                        }

                        // box para el zoom
                        Box(
                            modifier = Modifier
                                .size(260.dp)
                                .clip(RoundedCornerShape(20.dp))
                        ) {
                            Image(
                                painter = painterResource(id = imagenAMostrar),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                                    .graphicsLayer(
                                        scaleX = zoomScaleAMostrar,
                                        scaleY = zoomScaleAMostrar,
                                        translationX = zoomXAMostrar,
                                        translationY = zoomYAMostrar
                                    ),
                                contentScale = ContentScale.Fit
                            )
                        }

                        IconButton(
                            onClick = { 
                                formaActual = null
                                skinIndex = (skinIndex + 1) % personaje.skins.size 
                            }
                        ) {
                            Icon(Icons.AutoMirrored.Filled.KeyboardArrowRight, null, tint = primaryColor, modifier = Modifier.size(45.dp))
                        }
                    }
                    
                    Text(
                        text = formaActual?.nombre ?: skin.nombre,
                        style = MaterialTheme.typography.headlineMedium,
                        color = Color.White,
                        fontWeight = FontWeight.ExtraBold,
                        modifier = Modifier.padding(top = 12.dp)
                    )

                    if (personaje.formas.isNotEmpty()) {
                        Row(
                            modifier = Modifier.padding(top = 16.dp),
                            horizontalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            FormButton("Base", formaActual == null, primaryColor) { formaActual = null }
                            personaje.formas.forEach { forma ->
                                FormButton(forma.nombre, formaActual == forma, primaryColor) {
                                    formaActual = forma
                                }
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            //card de la info
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Black.copy(alpha = 0.4f)),
                border = BorderStroke(1.dp, primaryColor.copy(alpha = 0.3f))
            ) {
                Column(modifier = Modifier.padding(20.dp)) {
                    Text("INFORMACIÓN", color = primaryColor, fontWeight = FontWeight.Bold, style = MaterialTheme.typography.labelLarge)
                    Text(descripcionAMostrar, color = Color.White, fontSize = 16.sp, modifier = Modifier.padding(top = 8.dp))
                    HorizontalDivider(modifier = Modifier.padding(vertical = 16.dp), color = primaryColor.copy(alpha = 0.2f))
                    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                        InfoItem(labelRol, personaje.rol, primaryColor)
                        InfoItem(labelCarril, personaje.carril, primaryColor)
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            //card para las estadísticas de los perso
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Black.copy(alpha = 0.4f)),
                border = BorderStroke(1.dp, primaryColor.copy(alpha = 0.3f))
            ) {
                Column(modifier = Modifier.padding(20.dp)) {
                    val labelStats = if (categoria?.nombre == "Pokemon") "BASE STATS" else "ESTADÍSTICAS"
                    Text(labelStats, color = primaryColor, fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
                    personaje.stats.forEach { (stat, valor) ->
                        StatBar(stat, valor, primaryColor)
                    }
                }
            }

            Spacer(modifier = Modifier.height(20.dp))

            //card para las habilidades
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(24.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Black.copy(alpha = 0.4f)),
                border = BorderStroke(1.dp, primaryColor.copy(alpha = 0.3f))
            ) {
                Column(modifier = Modifier.padding(20.dp)) {
                    Text("HABILIDADES", color = primaryColor, fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 20.dp))
                    habilidadesAMostrar.forEach { habilidad ->
                        HabilidadItem(habilidad, primaryColor)
                        if (habilidad != habilidadesAMostrar.last()) {
                            HorizontalDivider(modifier = Modifier.padding(vertical = 16.dp), color = Color.White.copy(alpha = 0.1f))
                        }
                    }
                }
            }
            
            Spacer(modifier = Modifier.height(100.dp))
        }

        FilledIconButton(
            onClick = { navController.popBackStack() },
            modifier = Modifier.padding(20.dp).align(Alignment.TopStart),
            colors = IconButtonDefaults.filledIconButtonColors(containerColor = primaryColor)
        ) {
            Icon(Icons.AutoMirrored.Filled.ArrowBack, "Atrás", tint = secondaryColor)
        }
    }
}

@Composable
fun FormButton(nombre: String, isSelected: Boolean, color: Color, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isSelected) color else Color.White.copy(alpha = 0.1f),
            contentColor = if (isSelected) Color.Black else Color.White
        ),
        shape = RoundedCornerShape(12.dp),
        contentPadding = PaddingValues(horizontal = 12.dp, vertical = 4.dp),
        modifier = Modifier.height(32.dp)
    ) {
        Text(nombre, fontSize = 11.sp, fontWeight = FontWeight.Bold)
    }
}

@Composable
fun HabilidadItem(habilidad: Habilidad, primaryColor: Color) {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.Top) {
        Box(modifier = Modifier.size(64.dp).border(2.dp, primaryColor, RoundedCornerShape(8.dp)).padding(2.dp)) {
            Image(painter = painterResource(id = habilidad.imagen), null, modifier = Modifier.fillMaxSize().clip(RoundedCornerShape(6.dp)), contentScale = ContentScale.Crop)
            if (habilidad.tecla.isNotEmpty()) {
                Surface(color = primaryColor, modifier = Modifier.align(Alignment.BottomEnd).size(20.dp), shape = RoundedCornerShape(topStart = 4.dp)) {
                    Text(text = habilidad.tecla, color = Color.Black, fontSize = 12.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
                }
            }
        }
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(text = habilidad.nombre.uppercase(), color = Color.White, fontWeight = FontWeight.ExtraBold, fontSize = 15.sp)
            Text(text = habilidad.descripcion, color = Color.LightGray, fontSize = 14.sp, lineHeight = 18.sp)
        }
    }
}

@Composable
fun InfoItem(label: String, value: String, primaryColor: Color) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text(label, color = Color.Gray, fontSize = 11.sp, fontWeight = FontWeight.Bold)
        Text(value, color = Color.White, fontWeight = FontWeight.Bold, fontSize = 18.sp)
    }
}

@Composable
fun StatBar(nombre: String, valor: Int, primaryColor: Color) {
    Column(modifier = Modifier.padding(bottom = 12.dp)) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(nombre, color = Color.White, fontSize = 14.sp)
            Text("$valor%", color = primaryColor, fontSize = 14.sp, fontWeight = FontWeight.Bold)
        }
        Box(modifier = Modifier.fillMaxWidth().height(8.dp).background(Color.White.copy(alpha = 0.1f), RoundedCornerShape(4.dp))) {
            Box(modifier = Modifier.fillMaxWidth(valor / 100f).height(8.dp).background(Brush.horizontalGradient(listOf(primaryColor, primaryColor.copy(alpha = 0.6f))), RoundedCornerShape(4.dp)))
        }
    }
}