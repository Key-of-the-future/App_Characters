package com.example.app_characters_list.data

import androidx.compose.ui.graphics.Color
import com.example.app_characters_list.R

val personajesLol = listOf(
    Personaje(
        nombre = "AHRI",
        descripcion = "La vastaya de nueve colas. Ahri manipula la magia del reino espiritual para confundir a sus enemigos y devorar su esencia vital, buscando siempre redención y su lugar en el mundo.",
        zoomScale = 1.8f, zoomY = 80f, zoomX = 0f,
        rol = "MAGO", carril = "MID",
        habilidades = listOf(
            Habilidad("P", "Ladrona de esencias", R.drawable.ahri_1, "Se cura al golpear enemigos con habilidades."),
            Habilidad("Q", "Orbe del engaño", R.drawable.ahri_2, "Lanza un orbe que daña al ir y volver."),
            Habilidad("W", "Fuego zorruno", R.drawable.ahri_3, "Invoca tres llamas que buscan objetivos."),
            Habilidad("E", "Hechizo", R.drawable.ahri_4, "Lanza un beso que atrae al enemigo hacia ella."),
            Habilidad("R", "Impulso espiritual", R.drawable.ahri_5, "Tres desplazamientos rápidos que lanzan rayos.")
        ),
        stats = mapOf("Ataque" to 30, "Defensa" to 40, "Magia" to 90, "Dificultad" to 80),
        skins = listOf(
            Skin("Ahri", R.drawable.ahri_classic, zoomScale = 1.3f, zoomX = 0f, zoomY = 0f),
            Skin("Ahri Guardiana Estelar", R.drawable.ahri_sg, zoomScale = 1.8f, zoomX = -190f, zoomY = 80f),
            Skin("Ahri Challenger", R.drawable.ahri_challenger, zoomScale = 1.5f, zoomX = -90f, zoomY = 40f)
        )
    ),
    Personaje(
        nombre = "AKALI",
        descripcion = "La Asesina Furtiva. Abandonó la Orden Kinkou para proteger Jonia a su manera, utilizando su arsenal de armas ninja y su agilidad letal.",
        zoomScale = 1.8f, zoomY = 110f, zoomX = 0f,
        rol = "ASESINO", carril = "TOP / MID",
        habilidades = listOf(
            Habilidad("P", "Marca de la asesina", R.drawable.akali_1, "Inflige daño adicional tras golpear con habilidades."),
            Habilidad("Q", "Ráfaga de cinco filos", R.drawable.akali_2, "Lanza kunáis en abanico."),
            Habilidad("W", "Manto crepuscular", R.drawable.akali_3, "Crea una cortina de humo que la oculta."),
            Habilidad("E", "Voltereta shuriken", R.drawable.akali_4, "Lanza un shuriken y se marca al objetivo."),
            Habilidad("R", "Ejecución perfecta", R.drawable.akali_5, "Se desliza infligiendo daño masivo.")
        ),
        stats = mapOf("Ataque" to 85, "Defensa" to 30, "Magia" to 60, "Dificultad" to 90),
        skins = listOf(
            Skin("Akali", R.drawable.akali_classic, zoomScale = 1.8f, zoomX = 0f, zoomY = 0f),
            Skin("Akali K/DA", R.drawable.akali_kda, zoomScale = 1.8f, zoomX = 0f, zoomY = 0f),
            Skin("Akali Star Guardian", R.drawable.akali_sg, zoomScale = 1.8f, zoomX = -90f, zoomY = 0f)
        )
    ),
    Personaje(
        nombre = "SYNDRA",
        descripcion = "La Soberana Oscura. Una maga de Jonia con un poder inmenso que manipula esferas de energía pura para someter a quienes intentaron limitar su potencial.",
        zoomScale = 1.8f, zoomY = 100f, zoomX = 0f,
        rol = "MAGO", carril = "MID",
        habilidades = listOf(
            Habilidad("P", "Trascendencia", R.drawable.syndra_1_1, "Syndra reúne Fragmentos de Ira al subir de nivel e infligir daño a enemigos, lo que mejora sus habilidades."),
            Habilidad("Q", "Esfera oscura", R.drawable.syndra_2_1, "Syndra conjura una esfera oscura e inflige daño mágico."),
            Habilidad("W", "Fuerza de voluntad", R.drawable.syndra_3_1, "Syndra recoge y lanza una Esfera Oscura o un súbdito enemigo, infligiendo daño mágico y reduciendo la Velocidad de Movimiento de sus enemigos."),
            Habilidad("E", "Dispersar a los débiles", R.drawable.syndra_4_1, "Syndra empuja a los enemigos y a las Esferas Oscuras e inflige daño mágico. Los enemigos impactados por las Esferas Oscuras son aturdidos."),
            Habilidad("R", "Poder desatado", R.drawable.syndra_5_1, "Syndra bombardea a un campeón enemigo con todas sus Esferas Oscuras.")
        ),
        stats = mapOf("Ataque" to 20, "Defensa" to 30, "Magia" to 100, "Dificultad" to 80),
        skins = listOf(
            Skin("Syndra", R.drawable.syndra_classic, zoomScale = 1.8f, zoomX = 0f, zoomY = 0f),
            Skin("Syndra coven", R.drawable.syndra_coven, zoomScale = 1.8f, zoomX = 0f, zoomY = 0f),
            Skin("Syndra deleite lunar", R.drawable.syndra_lunar_empress, zoomScale = 1.8f, zoomX = 0f, zoomY = 0f)
        ),
        formas = listOf(
            Forma(
                "Trascendida",
                R.drawable.syndra_classic,
                "Syndra ha logrado obtener todas las cargas necesarias para mejorar cada habilidad y ahora puede desatar por completo su poder.",
                listOf(
                    Habilidad("P", "Trascendencia (Activada)", R.drawable.syndra_1_2, "Ha podido desatar su máximo potencial."),
                    Habilidad("Q", "Esfera oscura (Mejorada)", R.drawable.syndra2_2, "Syndra puede conservar una carga adicional de esfera oscura."),
                    Habilidad("W", "Fuerza de voluntad (Mejorada)", R.drawable.syndra_3_2, "Daño verdadero adicional al lanzar fuerza de voluntad."),
                    Habilidad("E", "Dispersar a los débiles (Mejorada)", R.drawable.syndra_4_2, "Aumenta la amplitud del cono y ralentiza a todos los objetivos."),
                    Habilidad("R", "Poder desatado (Mejorada)", R.drawable.syndra_5_2, "Ejecuta a los objetivos con poca vida.")
                )
            )
        )
    ),
    Personaje(
        nombre = "SENNA",
        descripcion = "La Redentora. Tras escapar de la linterna de Thresh, utiliza el poder de la luz y la sombra para liberar a las almas perdidas en la Niebla Negra.",
        zoomScale = 1.2f, zoomY = 40f, zoomX = 0f,
        rol = "TIRADOR / SOPORTE", carril = "BOT",
        habilidades = listOf(
            Habilidad("P", "Absolución", R.drawable.senna_1, "Cuando las unidades mueren cerca de Senna, la Niebla Negra atrapa sus almas periódicamente. Senna puede atacar a estas almas para liberarlas, con lo que absorbe la niebla que las mantiene muertas. La niebla alimenta el poder de su cañón reliquia con daño de ataque, alcance de ataque y probabilidad de golpe crítico aumentados."),
            Habilidad("Q", "Oscuridad lacerante", R.drawable.senna_2, "Senna dispara un rayo combinado de luz y sombra contra un objetivo, lo que cura a aliados y daña a enemigos."),
            Habilidad("W", "Abrazo final", R.drawable.senna_3, "Senna lanza una ola de Niebla Negra. Si impacta a un enemigo, la oleada hambrienta se abalanza sobre él para inmovilizarlo, junto con todas las unidades cercanas después de un momento."),
            Habilidad("E", "Maldición de la niebla negra", R.drawable.senna_4, "Senna canaliza la niebla que almacena en su arma, genera una tormenta a su alrededor y abraza la oscuridad para convertirse en un espectro. Los aliados que entren en la zona se camuflan y también aparecen como espectros mientras la niebla los cubre."),
            Habilidad("R", "Cañón de sombras", R.drawable.senna_5, "Dispara un rayo global que escuda a los aliados contra el daño, mientras los enemigos en el centro reciben daño.")
        ),
        stats = mapOf("Ataque" to 75, "Defensa" to 40, "Magia" to 40, "Dificultad" to 70),
        skins = listOf(
            Skin("Senna", R.drawable.senna_classic, zoomScale = 1.4f, zoomX = 0f, zoomY = 0f),
            Skin("Senna True Damage", R.drawable.senna_true_damage, zoomScale = 1.4f, zoomX = 0f, zoomY = 0f),
            Skin("Senna detective psíquica", R.drawable.senna_psychicdetective, zoomScale = 1.4f, zoomX = 0f, zoomY = 0f))
    ),
    Personaje(
        nombre = "KAYN",
        descripcion = "El Segador Sombrío. Shieda Kayn, esgrime la oscura arma viviente Rhaast, inmutable ante la progresiva corrupción de su cuerpo y mente. Solo hay dos resultados posibles: o Kayn somete el arma a su voluntad... o la cuchilla malévola lo consume por completo.",
        zoomScale = 1.4f,
        zoomY = 50f,
        rol = "ASESINO / LUCHADOR", carril = "JUNGLA",
        habilidades = listOf(
            Habilidad("P", "La guadaña darkin", R.drawable.kayn_base, "Elige entre transformarse en Asesino o Rhaast."),
            Habilidad("Q", "Corte segador", R.drawable.kayn_1_1, "Deslizamiento y ataque circular."),
            Habilidad("W", "Alcance de cuchilla", R.drawable.kayn_1_2, "Daña y ralentiza en línea."),
            Habilidad("E", "Paso sombrío", R.drawable.kayn_1_3, "Permite caminar a través de muros."),
            Habilidad("R", "Transgresión de umbral", R.drawable.kayn_1_4, "Se oculta dentro de un enemigo marcado.")
        ),
        stats = mapOf("Ataque" to 90, "Defensa" to 55, "Magia" to 20, "Dificultad" to 80),
        skins = listOf(
            Skin("Kayn", R.drawable.kayn_classic, zoomScale = 1.5f, zoomX = 0f, zoomY = 0f),
            Skin("Kayn portador del amanecer", R.drawable.kayn_dawnbringer, zoomScale = 1.5f, zoomX = 0f, zoomY = 0f),
            Skin("Kayn Odisea", R.drawable.kayn_odyssey, zoomScale = 1.5f, zoomX = 0f, zoomY = 0f)),
        formas = listOf(
            Forma(
                "Asesino Sombrío",
                R.drawable.kayn_shadowassasin,
                "Kayn ha dominado a Rhaast. Se especializa en eliminar objetivos frágiles con gran movilidad.",
                listOf(
                    Habilidad("P", "La guadaña darkin (Asesino)", R.drawable.kayn_base_1, "Cuando Kayn no ha recibido daño sus ataques y habilidades se potencian con daño mágico contra campeones."),
                    Habilidad("Q", "Corte segador (Asesino)", R.drawable.kayn_2_1, "Deslizamiento y ataque circular con un aumento de rango de desplazamiento."),
                    Habilidad("W", "Alcance de cuchilla (Asesino)", R.drawable.kayn_2_2, "Kayn ahora puede moverse mientras usa esta habilidad y aumenta el alcance de esta misma."),
                    Habilidad("E", "Paso sombrío (Asesino)", R.drawable.kayn_2_3, "Obtiene un aumento de velocidad de movimiento al usarla y se vuelve inmune a ralentizaciones."),
                    Habilidad("R", "Transgresión de umbral (Asesino)", R.drawable.kayn_2_4, "Aumenta el alcance de la habilidad antes y después de salir de la posesión al enemigo.")
                )
            ),
            Forma(
                "Rhaast",
                R.drawable.rhaast_splash,
                "El Oscuro ha tomado el control. Se especializa en el aguante y control de masas contra tanques.",
                listOf(
                    Habilidad("P", "La guadaña darkin (Rhaast)", R.drawable.kayn_base_2, "Cuando inflige daño a campeones enemigos se cura por el daño infligido."),
                    Habilidad("Q", "Corte segador (Rhaast)", R.drawable.kayn_3_1, "Inflige más daño en base a la vida máxima de los enemigos."),
                    Habilidad("W", "Alcance de cuchilla (Rhaast)", R.drawable.kayn_3_2, "Ahora al usarla, levanta a los enemigos por los aires."),
                    Habilidad("E", "Paso sombrío (Rhaast)", R.drawable.kayn_3_3, "Puede caminar sobre muros."),
                    Habilidad("R", "Transgresión de umbral (Rhaast)", R.drawable.kayn_3_4, "Al usarla hace daño en base a la vida del enemigo y se cura en base a esta misma.")
                )
            )
        )
    ),
    Personaje(
        nombre = "MISS FORTUNE",
        descripcion = "La Cazarrecompensas. Sarah Fortune, capitana de Aguasturbias famosa por su apariencia, pero temida por su brutalidad, es una figura severa entre los criminales más duros de la ciudad portuaria.",
        zoomScale = 1.7f,
        zoomY = 90f,
        zoomX = -190f,
        rol = "TIRADOR", carril = "BOT",
        habilidades = listOf(
            Habilidad("P", "Toque de amor", R.drawable.miss_1, "Inflige daño físico adicional cuando usa un ataque básico contra un objetivo nuevo."),
            Habilidad("Q", "Doble bala", R.drawable.miss_2, "Dispara una bala que inflige daño a un objetivo y a la unidad detrás de él."),
            Habilidad("W", "Alarde", R.drawable.miss_3, "De forma pasiva, Miss Fortune obtiene velocidad de movimiento cuando no es atacada. Activar esta habilidad otorga velocidad de ataque adicional por unos segundos."),
            Habilidad("E", "Lluvia de plomo", R.drawable.miss_4, "Revela un área con una lluvia de balas que inflige oleadas de daño y ralentiza a los enemigos."),
            Habilidad("R", "Balacera", R.drawable.miss_5, "Canaliza una ráfaga de balas en forma de cono frente a ella que inflige una enorme cantidad de daño a los enemigos.")
        ),
        stats = mapOf("Ataque" to 100, "Defensa" to 25, "Magia" to 10, "Dificultad" to 60),
        skins = listOf(
            Skin("Miss Fortune", R.drawable.miss_classic, zoomScale = 1.9f, zoomX = -280f, zoomY = 0f),
            Skin("Miss Fortune diosa de las armas", R.drawable.miss_gun_goddess, zoomScale = 1.4f, zoomX = 0f, zoomY = 0f),
            Skin("Miss Fortune año nuevo lunar", R.drawable.miss_ano_lunar, zoomScale = 1.8f, zoomX = -100f, zoomY = 0f))
    )
)

val personajesPokemon = listOf(
    Personaje(
        nombre = "POPPLIO",
        descripcion = "Pokémon León Marino. Crea globos de agua por la nariz para jugar y atacar con gran alegría.",
        zoomScale = 0.9f, zoomY = 20f, zoomX = 0f,
        rol = "AGUA", carril = "LEÓN MARINO",
        habilidades = listOf(
            Habilidad("1", "Pistola Agua", R.drawable.ic_launcher_foreground, "Lanza un chorro de agua."),
            Habilidad("2", "Acua Jet", R.drawable.ic_launcher_foreground, "Embestida rápida.")
        ),
        stats = mapOf("Ataque" to 55, "Defensa" to 50, "Magia" to 70, "Dificultad" to 30),
        skins = listOf(Skin("Popplio", R.drawable.popplio), Skin("Brionne", R.drawable.brionne), Skin("Primarina", R.drawable.primarina))
    ),
    Personaje(
        nombre = "FUECOCO",
        descripcion = "Pokémon Fuegodrilo. Es de carácter apacible y absorbe el calor por sus escamas cuadradas.",
        zoomScale = 1f, zoomY = 10f, zoomX = 0f,
        rol = "FUEGO", carril = "FUEGODRILO",
        habilidades = listOf(
            Habilidad("1", "Ascuas", R.drawable.ic_launcher_foreground, "Pequeñas llamas."),
            Habilidad("2", "Calcinación", R.drawable.ic_launcher_foreground, "Llamarada intensa.")
        ),
        stats = mapOf("Ataque" to 70, "Defensa" to 80, "Magia" to 50, "Dificultad" to 20),
        skins = listOf(Skin("Fuecoco", R.drawable.fuecoco), Skin("Crocalor", R.drawable.crocalor), Skin("Skeledirge", R.drawable.skeledirge))
    ),
    Personaje(
        nombre = "OSHAWOTT",
        descripcion = "Pokémon Nutria. Lucha usando el escalopeto de su vientre, el cual cuida con mucho esmero.",
        zoomScale = 1f, zoomY = 10f, zoomX = 0f,
        rol = "AGUA", carril = "NUTRIA",
        habilidades = listOf(
            Habilidad("1", "Concha Filo", R.drawable.ic_launcher_foreground, "Ataque cortante."),
            Habilidad("2", "Hidropulso", R.drawable.ic_launcher_foreground, "Onda de agua.")
        ),
        stats = mapOf("Ataque" to 75, "Defensa" to 60, "Magia" to 85, "Dificultad" to 30),
        skins = listOf(Skin("Oshawott", R.drawable.oshawott), Skin("Dewott", R.drawable.dewott), Skin("Samurott", R.drawable.samurott))
    ),
    Personaje(
        nombre = "FENNEKIN",
        descripcion = "Pokémon Zorro. Expulsa aire muy caliente por sus grandes orejas para intimidar a rivales.",
        zoomScale = 1.1f, zoomY = -4f, zoomX = 0f,
        rol = "FUEGO", carril = "ZORRO",
        habilidades = listOf(Habilidad("1", "Nitrocarga", R.drawable.ic_launcher_foreground, "Ataque ígneo veloz.")),
        stats = mapOf("Ataque" to 50, "Defensa" to 55, "Magia" to 95, "Dificultad" to 40),
        skins = listOf(Skin("Fennekin", R.drawable.fennekin), Skin("Braixen", R.drawable.braixen), Skin("Delphox", R.drawable.delphox))
    ),
    Personaje(
        nombre = "Flabebe",
        descripcion = "Pokémon Flor.",
        zoomScale = 1f, zoomY = 10f, zoomX = 0f,
        rol = "HADA", carril = "FLOR",
        habilidades = listOf(
            Habilidad("1", "Viento Hada", R.drawable.ic_launcher_foreground, "Polen místico."),
            Habilidad("2", "Hoja Mágica", R.drawable.ic_launcher_foreground, "Hojas mágicas.")
        ),
        stats = mapOf("Ataque" to 40, "Defensa" to 60, "Magia" to 95, "Dificultad" to 50),
        skins = listOf(Skin("Flabébé", R.drawable.flab_b_), Skin("Floette", R.drawable.floette), Skin("Florges", R.drawable.florges))
    ),
    Personaje(
        nombre = "ROWLET",
        descripcion = "Pokémon Pluma Hoja. Ataca planeando en silencio y es capaz de girar el cuello 180°.",
        zoomScale = 1.1f, zoomY = 10f, zoomX = 0f,
        rol = "PLANTA / VOLADOR", carril = "PLUMA HOJA",
        habilidades = listOf(
            Habilidad("1", "Follaje", R.drawable.ic_launcher_foreground, "Hojas afiladas."),
            Habilidad("2", "Pico Taladro", R.drawable.ic_launcher_foreground, "Gira su pico.")
        ),
        stats = mapOf("Ataque" to 70, "Defensa" to 65, "Magia" to 60, "Dificultad" to 30),
        skins = listOf(Skin("Rowlet", R.drawable.rowlet), Skin("Dartrix", R.drawable.dartrix), Skin("Decidueye", R.drawable.decidueye))
    )
)

val personajesSmash = listOf(
    Personaje(
        nombre = "PIKACHU",
        descripcion = "El ratón eléctrico. Un luchador extremadamente ágil capaz de encadenar ataques eléctricos.",
        zoomScale = 0.9f, zoomY = 20f, zoomX = 8f,
        rol = "POKÉMON", carril = "LIGERO",
        habilidades = listOf(
            Habilidad("B", "Atactrueno", R.drawable.ic_launcher_foreground, "Descarga al suelo."),
            Habilidad("B↑", "Agilidad", R.drawable.ic_launcher_foreground, "Desplazamiento rápido."),
            Habilidad("B↓", "Trueno", R.drawable.ic_launcher_foreground, "Rayo vertical potente.")
        ),
        stats = mapOf("Ataque" to 70, "Defensa" to 70, "Magia" to 50, "Dificultad" to 30),
        skins = listOf(Skin("Clásico", R.drawable.pika_1, zoomScale = 0.9f, zoomY = 20f, zoomX = 0f,), Skin("Ash", R.drawable.pika_gorrita, zoomScale = 0.92f, zoomY = -10f, zoomX = 20f,), Skin("Libre", R.drawable.pika_gorrito, zoomScale = 0.95f, zoomY = 10f, zoomX = -40f,))
    ),
    Personaje(
        nombre = "KIRBY",
        descripcion = "El guerrero de Dream Land. Su habilidad característica es tragar enemigos para copiar sus poderes.",
        zoomScale = 0.9f, zoomY = 20f, zoomX = 8f,
        rol = "KIRBY", carril = "LIGERO",
        habilidades = listOf(
            Habilidad("B", "Tragar", R.drawable.ic_launcher_foreground, "Copia el poder del rival."),
            Habilidad("B↑", "Cuchillo", R.drawable.ic_launcher_foreground, "Ataque ascendente."),
            Habilidad("B↓", "Piedra", R.drawable.ic_launcher_foreground, "Bloque pesado.")
        ),
        stats = mapOf("Ataque" to 60, "Defensa" to 60, "Magia" to 70, "Dificultad" to 20),
        skins = listOf(Skin("Kirby", R.drawable.kirby_1), Skin("Kirby (Amarillo)", R.drawable.kirby_2), Skin("Kirby (Oscuro)", R.drawable.kirby_3))
    ),
    Personaje(
        nombre = "BAYONETTA",
        descripcion = "La última Bruja de Umbra. Domina el aire y ralentiza el tiempo con sus pistolas.",
        zoomScale = 2.5f, zoomY = 190f, zoomX = 8f,
        rol = "BAYONETTA", carril = "MEDIO",
        habilidades = listOf(
            Habilidad("B", "Balas", R.drawable.ic_launcher_foreground, "Disparo constante."),
            Habilidad("B↑", "Giro", R.drawable.ic_launcher_foreground, "Ataque circular."),
            Habilidad("B↓", "Tiempo", R.drawable.ic_launcher_foreground, "Ralentiza al enemigo.")
        ),
        stats = mapOf("Ataque" to 80, "Defensa" to 40, "Magia" to 95, "Dificultad" to 90),
        skins = listOf(Skin("Bayonetta", R.drawable.bayo_1), Skin("Bayonetta azul", R.drawable.bayo_2), Skin("Bayonetta rojo", R.drawable.bayo_3))
    ),
    Personaje(
        nombre = "CLOUD",
        descripcion = "El mercenario ex-SOLDADO. Porta la Espada Mortal y carga su barra de Límite para ataques devastadores.",
        zoomScale = 2f, zoomY = 140f, zoomX = 80f,
        rol = "FINAL FANTASY", carril = "MEDIO",
        habilidades = listOf(
            Habilidad("B", "Haz", R.drawable.ic_launcher_foreground, "Onda de choque."),
            Habilidad("B↑", "Corte", R.drawable.ic_launcher_foreground, "Tajo triple rápido."),
            Habilidad("B↓", "Límite", R.drawable.ic_launcher_foreground, "Potencia ataques.")
        ),
        stats = mapOf("Ataque" to 95, "Defensa" to 60, "Magia" to 50, "Dificultad" to 40),
        skins = listOf(Skin("Cloud", R.drawable.cloud_1), Skin("Cloud marrón", R.drawable.cloud_2), Skin("Cloud armadura", R.drawable.cloud_3))
    ),
    Personaje(
        nombre = "SEPHIROTH",
        descripcion = "El Ángel de una Sola Ala. Espadachín legendario con un alcance y poder oscuro abrumador.",
        zoomScale = 2.5f, zoomY = 210f, zoomX = -60f,
        rol = "FINAL FANTASY", carril = "MEDIO",
        habilidades = listOf(
            Habilidad("B", "Fulgor", R.drawable.ic_launcher_foreground, "Explosión mágica."),
            Habilidad("B↑", "Corte", R.drawable.ic_launcher_foreground, "Múltiples tajos rápidos."),
            Habilidad("B↓", "Destello", R.drawable.ic_launcher_foreground, "Barrera mágica.")
        ),
        stats = mapOf("Ataque" to 100, "Defensa" to 35, "Magia" to 90, "Dificultad" to 70),
        skins = listOf(Skin("Sephiroth", R.drawable.seph_1), Skin("Sephiroth gris", R.drawable.seph_2), Skin("Sephiroth combate", R.drawable.seph_3))
    ),
    Personaje(
        nombre = "ICE CLIMBERS",
        descripcion = "Popo y Nana. Este dúo inseparable coordina sus martillos para congelar oponentes.",
        zoomScale = 1f, zoomY = -20f, zoomX = 8f,
        rol = "ICE CLIMBER", carril = "MEDIO",
        habilidades = listOf(
            Habilidad("B", "Martillo", R.drawable.ic_launcher_foreground, "Desliza bloques de hielo."),
            Habilidad("B↑", "Salto", R.drawable.ic_launcher_foreground, "Nana impulsa a Popo."),
            Habilidad("B↓", "Ventisca", R.drawable.ic_launcher_foreground, "Giro helado.")
        ),
        stats = mapOf("Ataque" to 70, "Defensa" to 60, "Magia" to 30, "Dificultad" to 85),
        skins = listOf(Skin("Ice climbers", R.drawable.ice_1), Skin("Ice climbers (Azul)", R.drawable.ice_3), Skin("Ice climbers (Rojo y gris)", R.drawable.ice_2))
    )
)

val personajesMarvel = listOf(
    Personaje(
        nombre = "SCARLET WITCH",
        descripcion = "Wanda Maximoff utiliza su Magia del Caos para distorsionar la realidad y desintegrar enemigos.",
        zoomScale = 2.5f, zoomY = 155f, zoomX = 0f,
        rol = "ESTRATEGA", carril = "AVENGERS",
        habilidades = listOf(
            Habilidad("1", "Rayo", R.drawable.ic_launcher_foreground, "Energía mística."),
            Habilidad("2", "Esfera", R.drawable.ic_launcher_foreground, "Zona de distorsión."),
            Habilidad("3", "Vuelo", R.drawable.ic_launcher_foreground, "Levitación libre.")
        ),
        stats = mapOf("Ataque" to 85, "Defensa" to 60, "Magia" to 100, "Dificultad" to 50),
        skins = listOf(
            Skin("Scarlet witch", R.drawable.scarletwitch),
            Skin("Scarlet witch (Zombie)", R.drawable.scarletwitch_zombie),
            Skin("Scarlet witch (Multiverse)", R.drawable.scarletwitch_multiverse)
        )
    ),
    Personaje(
        nombre = "DOCTOR STRANGE",
        descripcion = "El Hechicero Supremo. Utiliza artes místicas y reliquias para proteger la realidad.",
        zoomScale = 2.3f, zoomY = 170f, zoomX = -20f,
        rol = "ESTRATEGA", carril = "AVENGERS",
        habilidades = listOf(
            Habilidad("1", "Ojos", R.drawable.ic_launcher_foreground, "Aturde con reliquias."),
            Habilidad("2", "Portal", R.drawable.ic_launcher_foreground, "Transporte de equipo."),
            Habilidad("3", "Escudo", R.drawable.ic_launcher_foreground, "Barrera mística.")
        ),
        stats = mapOf("Ataque" to 50, "Defensa" to 75, "Magia" to 95, "Dificultad" to 85),
        skins = listOf(
            Skin("Strange", R.drawable.strange_1),
            Skin("Strange", R.drawable.strange_2),
            Skin("Defensor", R.drawable.strange_3))
    ),
    Personaje(
        nombre = "MAGIK",
        descripcion = "Illyana Rasputina. Guerrera del Limbo experta en teletransporte y el uso de su Espada del Alma.",
        zoomScale = 2.5f, zoomY = 168f, zoomX = 170f,
        rol = "DUELISTA", carril = "X-MEN",
        habilidades = listOf(
            Habilidad("1", "Espada", R.drawable.ic_launcher_foreground, "Ataques mágicos cuerpo a cuerpo."),
            Habilidad("2", "Discos", R.drawable.ic_launcher_foreground, "Teletransporte táctico."),
            Habilidad("3", "Forma Oscura", R.drawable.ic_launcher_foreground, "Potencia temporal.")
        ),
        stats = mapOf("Ataque" to 90, "Defensa" to 40, "Magia" to 75, "Dificultad" to 70),
        skins = listOf(
            Skin("Strange", R.drawable.magik_1),
            Skin("Magik", R.drawable.magik_2),
            Skin("Limbo", R.drawable.magic_3))
    ),
    Personaje(
        nombre = "JEFF",
        descripcion = "El adorable tiburón terrestre. Devora obstáculos con ternura y un carisma sorprendente.",
        zoomScale = 1.5f, zoomY = 20f, zoomX = -20f,
        rol = "ESTRATEGA", carril = "INDEPENDIENTE",
        habilidades = listOf(
            Habilidad("1", "Mordida", R.drawable.ic_launcher_foreground, "Ataque rápido."),
            Habilidad("2", "Buceo", R.drawable.ic_launcher_foreground, "Se oculta bajo el suelo."),
            Habilidad("3", "Sanación", R.drawable.ic_launcher_foreground, "Cura aliados.")
        ),
        stats = mapOf("Ataque" to 40, "Defensa" to 50, "Magia" to 30, "Dificultad" to 20),
        skins = listOf(
            Skin("Strange", R.drawable.jeff_1),
            Skin("Jeff", R.drawable.jeff_2),
            Skin("Disfraz", R.drawable.jeff_3))
    ),
    Personaje(
        nombre = "STORM",
        descripcion = "Diosa del Clima. Capaz de invocar relámpagos, tornados y tormentas sobre sus enemigos.",
        zoomScale = 2.5f, zoomY = 180f, zoomX = -180f,
        rol = "DUELISTA", carril = "X-MEN",
        habilidades = listOf(
            Habilidad("1", "Rayo", R.drawable.ic_launcher_foreground, "Descarga eléctrica directa."),
            Habilidad("2", "Tornado", R.drawable.ic_launcher_foreground, "Vuela y empuja."),
            Habilidad("3", "Vendaval", R.drawable.ic_launcher_foreground, "Ralentiza en área.")
        ),
        stats = mapOf("Ataque" to 65, "Defensa" to 45, "Magia" to 95, "Dificultad" to 50),
        skins = listOf(
            Skin("Strange", R.drawable.storm_1),
            Skin("Storm", R.drawable.storm_2),
            Skin("Punk Storm", R.drawable.storm_3))
    ),
    Personaje(
        nombre = "LOKI",
        descripcion = "Anna Marie. Capaz de absorber poderes y vitalidad de cualquier héroe mediante contacto físico.",
        zoomScale = 2.5f, zoomY = 180f, zoomX = 0f,
        rol = "VANGUARDIA", carril = "X-MEN",
        habilidades = listOf(
            Habilidad("1", "Absorción", R.drawable.ic_launcher_foreground, "Copia una habilidad enemiga."),
            Habilidad("2", "Golpe", R.drawable.ic_launcher_foreground, "Impacto físico potente."),
            Habilidad("3", "Robo Vital", R.drawable.ic_launcher_foreground, "Sana al golpear.")
        ),
        stats = mapOf("Ataque" to 80, "Defensa" to 85, "Magia" to 50, "Dificultad" to 60),
        skins = listOf(
            Skin("Strange", R.drawable.loki_1),
            Skin("Rogue", R.drawable.loki_2),
            Skin("Savage Land", R.drawable.loki_3))
    )
)

val categorias = listOf(
    Categoria("LoL", R.drawable.fondo_lol, personajesLol, Color(0xFFC89B3C), Color(0xFF010A13)),
    Categoria("Pokemon", R.drawable.pokedex, personajesPokemon, Color(0xFFFFCC00), Color(0xFF3B4CCA)),
    Categoria("Smash", R.drawable.smash_bg, personajesSmash, Color(0xFFE30613), Color(0xFF000000)),
    Categoria("Marvel", R.drawable.shield, personajesMarvel, Color(0xFFED1D24), Color(0xFFFFFFFF))
)

