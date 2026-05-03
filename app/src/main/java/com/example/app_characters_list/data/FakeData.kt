package com.example.app_characters_list.data

import androidx.compose.ui.graphics.Color
import com.example.app_characters_list.R

// --- LEAGUE OF LEGENDS ---
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
                ),
                zoomScale = 1.8f, zoomY = 100f, zoomX = 0f
            )
        )
    ),
    Personaje(
        nombre = "SENNA",
        descripcion = "La Redentora. Tras escapar de la linterna de Thresh, utiliza el poder de la luz y la sombra para liberar a las almas perdidas en la Niebla Negra.",
        zoomScale = 1.2f, zoomY = 40f, zoomX = 0f,
        rol = "TIRADOR / SOPORTE", carril = "BOT",
        habilidades = listOf(
            Habilidad("P", "Absorción", R.drawable.senna_1, "Cuando las unidades mueren cerca de Senna, la Niebla Negra atrapa sus almas periódicamente. Senna puede atacar a estas almas para liberarlas, con lo que absorbe la niebla que las mantiene muertas. La niebla alimenta el poder de su cañón reliquia con daño de ataque, alcance de ataque y probabilidad de golpe crítico aumentados."),
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
        zoomScale = 1.4f, zoomY = 50f, zoomX = 0f,
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
                ),
                zoomScale = 1.9f, zoomX = 0f, zoomY = 60f
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
                ),
                zoomScale = 2.2f, zoomX = -90f, zoomY = 90f
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
        descripcion = "Popplio es un Pokémon inicial de tipo Agua introducido en la séptima generación (región de Alola), conocido por ser un león marino azul, regordito y con aspecto de payaso.",
        zoomScale = 0.9f, zoomY = 20f, zoomX = 0f,
        rol = "AGUA", carril = "LEÓN MARINO",
        habilidades = listOf(
            Habilidad("1", "Pistola Agua", R.drawable.water_element, "Pistola agua causa daño y no tiene ningún efecto secundario.."),
            Habilidad("2", "Acua Jet", R.drawable.water_element, "Embestida rápida.")
        ),
        stats = mapOf("Ataque" to 55, "Defensa" to 50, "Magia" to 70, "Dificultad" to 30),
        skins = listOf(Skin("Popplio", R.drawable.popplio), Skin("Brionne", R.drawable.brionne), Skin("Primarina", R.drawable.primarina))
    ),
    Personaje(
        nombre = "FUECOCO",
        descripcion = "Fuecoco es el Pokémon inicial de tipo Fuego de la novena generación (región Paldea) en Pokémon Escarlata y Púrpura. Es el Pokémon Fuegodrilo, caracterizado por su forma de cocodrilo rojo con escamas amarillas, similar a un pimiento o \"churro\", que destaca por ser apacible, lento y con gran apetito.",
        zoomScale = 1f, zoomY = 10f, zoomX = 0f,
        rol = "FUEGO", carril = "FUEGODRILO",
        habilidades = listOf(
            Habilidad("1", "Brasas", R.drawable.fire_element, "Brasas causa daño y tiene una probabilidad del 10% de quemar al objetivo."),
            Habilidad("2", "Incinerar", R.drawable.fire_element, "Incinerar causa daño y además, quema las bayas equipadas en el objetivo, haciéndolas inservibles..")
        ),
        stats = mapOf("Ataque" to 70, "Defensa" to 80, "Magia" to 50, "Dificultad" to 20),
        skins = listOf(Skin("Fuecoco", R.drawable.fuecoco), Skin("Crocalor", R.drawable.crocalor), Skin("Skeledirge", R.drawable.skeledirge))
    ),
    Personaje(
        nombre = "OSHAWOTT",
        descripcion = "Oshawott es un Pokémon inicial de tipo Agua de la quinta generación (Teselia/Unova), con apariencia de nutria marina bípeda. Destaca por su pelaje blanco y azul, pecas en las mejillas y una concha (vieira) en su vientre que usa para combatir y alimentarse.",
        zoomScale = 1f, zoomY = 10f, zoomX = 0f,
        rol = "AGUA", carril = "NUTRIA",
        habilidades = listOf(
            Habilidad("1", "Concha afilada", R.drawable.water_element, "Concha afilada causa daño y tiene una probabilidad del 50% de bajar un nivel la defensa del oponente."),
            Habilidad("1", "Hidrobomba", R.drawable.water_element, "Hidrobomba causa daño y no tiene ningún efecto secundario.")),
        stats = mapOf("Ataque" to 75, "Defensa" to 60, "Magia" to 85, "Dificultad" to 30),
        skins = listOf(Skin("Oshawott", R.drawable.oshawott), Skin("Dewott", R.drawable.dewott), Skin("Samurott", R.drawable.samurott))
    ),
    Personaje(
        nombre = "FENNEKIN",
        descripcion = "Fennekin es un Pokémon inicial de tipo Fuego de la sexta generación (#653), conocido como el Pokémon Zorro. Destaca por su pelaje amarillo/naranja, orejas grandes y la emisión de aire caliente por sus orejas para calmarse.",
        zoomScale = 1.1f, zoomY = -4f, zoomX = 0f,
        rol = "FUEGO", carril = "ZORRO",
        habilidades = listOf(
            Habilidad("1", "Carga de fuego", R.drawable.fire_element, "Carga de fuego causa daño y siempre aumenta un nivel la velocidad del usuario."),
            Habilidad("1", "Lluvia ígnea", R.drawable.fire_element, "Lluvia ígnea causa daño y atrapa al enemigo, evitando que escape o sea cambiado.")),
        stats = mapOf("Ataque" to 50, "Defensa" to 55, "Magia" to 95, "Dificultad" to 40),
        skins = listOf(Skin("Fennekin", R.drawable.fennekin), Skin("Braixen", R.drawable.braixen), Skin("Delphox", R.drawable.delphox))
    ),
    Personaje(
        nombre = "FLABÉBÉ",
        descripcion = "Flabébé es un pequeño Pokémon de tipo Hada introducido en la sexta generación (669 en la Pokédex), caracterizado por aferrarse de por vida a una flor desde su nacimiento.",
        zoomScale = 1f, zoomY = 10f, zoomX = 0f,
        rol = "HADA", carril = "FLOR",
        habilidades = listOf(
            Habilidad("1", "Viento Feérrico", R.drawable.fairy_logo, "Viento feérico causa daño y no tiene ningún efecto secundario."),
            Habilidad("2", "Hoja Mágica", R.drawable.plant_element, "Hoja mágica causa daño y no tiene ningún efecto secundario. Este ataque nunca falla, ignorando cambios en la precisión del usuario y la evasión del objetivo.")
        ),
        stats = mapOf("Ataque" to 40, "Defensa" to 60, "Magia" to 95, "Dificultad" to 50),
        skins = listOf(Skin("Flabébé", R.drawable.flab_b_), Skin("Floette", R.drawable.floette), Skin("Florges", R.drawable.florges))
    ),
    Personaje(
        nombre = "ROWLET",
        descripcion = "Rowlet es un Pokémon inicial de tipo Planta/Volador introducido en la Generación 7 (región Alola), con apariencia de una pequeña lechuza redonda de colores arena y blanco. Destaca por ser sigiloso, volar sin ruido, girar su cuello 180 grados y atacar con patadas potentes o plumas afiladas.",
        zoomScale = 1.1f, zoomY = 10f, zoomX = 0f,
        rol = "PLANTA / VOLADOR", carril = "PLUMA HOJA",
        habilidades = listOf(
            Habilidad("1", "Follaje", R.drawable.plant_element, "Follaje causa daño y no tiene ningún efecto secundario."),
            Habilidad("2", "Pico Taladro", R.drawable.flying_logo, "Pico taladro causa daño y no tiene ningún efecto secundario.")
        ),
        stats = mapOf("Ataque" to 70, "Defensa" to 65, "Magia" to 60, "Dificultad" to 30),
        skins = listOf(Skin("Rowlet", R.drawable.rowlet), Skin("Dartrix", R.drawable.dartrix), Skin("Decidueye", R.drawable.decidueye))
    )
)

val personajesSmash = listOf(
    Personaje(
        nombre = "PIKACHU",
        descripcion = "El ratón eléctrico. Un luchador extremadamente ágil capaz de encadenar ataques eléctricos a gran velocidad.",
        zoomScale = 0.9f, zoomY = 20f, zoomX = 8f,
        rol = "POKÉMON", carril = "LIGERO",
        logo = R.drawable.pika_logo,
        habilidades = listOf(
            Habilidad("B", "Atactrueno", R.drawable.ic_launcher_foreground, "Descarga que recorre el suelo."),
            Habilidad("B↑", "Agilidad", R.drawable.ic_launcher_foreground, "Desplazamiento rápido."),
            Habilidad("B↓", "Trueno", R.drawable.ic_launcher_foreground, "Rayo potente.")
        ),
        stats = mapOf("Ataque" to 70, "Defensa" to 70, "Magia" to 50, "Dificultad" to 30),
        skins = listOf(
            Skin("PIKACHU", R.drawable.pika_1, zoomScale = 0.9f, zoomY = 20f, zoomX = 0f),
            Skin("PIKACHU CON GORRITA", R.drawable.pika_gorrita, zoomScale = 0.92f, zoomY = -10f, zoomX = 20f),
            Skin("PIKACHU GORRO BEANNIE", R.drawable.pika_gorrito, zoomScale = 0.95f, zoomY = 10f, zoomX = -40f)
        )
    ),
    Personaje(
        nombre = "KIRBY",
        descripcion = "El guerrero de Dream Land. Su habilidad característica es tragar enemigos para copiar sus poderes.",
        zoomScale = 0.9f, zoomY = 20f, zoomX = 8f,
        rol = "KIRBY", carril = "LIGERO",
        logo = R.drawable.kirby_logo,
        habilidades = listOf(Habilidad("B", "Tragar", R.drawable.ic_launcher_foreground, "Absorbe al rival.")),
        stats = mapOf("Ataque" to 60, "Defensa" to 60, "Magia" to 70, "Dificultad" to 20),
        skins = listOf(
            Skin("KIRBY", R.drawable.kirby_1, zoomScale = 1f, zoomX = 0f, zoomY = 0f),
            Skin("KIRBY AMARILLO", R.drawable.kirby_2, zoomScale = 1f, zoomX = 0f, zoomY = 0f),
            Skin("KIRBY OSCURO", R.drawable.kirby_3, zoomScale = 1f, zoomX = 0f, zoomY = 0f)
        )
    ),
    Personaje(
        nombre = "BAYONETTA",
        descripcion = "La última Bruja de Umbra. Utiliza sus pistolas y artes mágicas para ralentizar el tiempo con sus pistolas.",
        zoomScale = 2.5f, zoomY = 190f, zoomX = 8f,
        rol = "BAYONETTA", carril = "MEDIO",
        logo = R.drawable.bayo_logo,
        habilidades = listOf(
            Habilidad("B↓", "Tiempo", R.drawable.ic_launcher_foreground, "Ralentiza al enemigo tras contraatacar.")
        ),
        stats = mapOf("Ataque" to 80, "Defensa" to 40, "Magia" to 95, "Dificultad" to 90),
        skins = listOf(
            Skin("BAYONETTA", R.drawable.bayo_1, zoomScale = 1f, zoomX = 0f, zoomY = 0f),
            Skin("BAYONETTA AZUL", R.drawable.bayo_2, zoomScale = 1f, zoomX = 0f, zoomY = 0f),
            Skin("BAYONETTA ROJA", R.drawable.bayo_3, zoomScale = 1f, zoomX = 0f, zoomY = 0f)
        )
    ),
    Personaje(
        nombre = "CLOUD",
        descripcion = "El mercenario ex-SOLDADO. Porta la Espada Mortal y carga su barra de Límite para ataques devastadores.",
        zoomScale = 2f, zoomY = 140f, zoomX = 80f,
        rol = "FINAL FANTASY", carril = "MEDIO",
        logo = R.drawable.ff_logo,
        habilidades = listOf(
            Habilidad("B", "Haz", R.drawable.ic_launcher_foreground, "Onda de choque cortante.")
        ),
        stats = mapOf("Ataque" to 95, "Defensa" to 60, "Magia" to 50, "Dificultad" to 40),
        skins = listOf(
            Skin("CLOUD", R.drawable.cloud_1, zoomScale = 1f, zoomX = 0f, zoomY = 0f),
            Skin("CLOUD MARRÓN", R.drawable.cloud_2, zoomScale = 1f, zoomX = 0f, zoomY = 0f),
            Skin("CLOUD COMBATE", R.drawable.cloud_3, zoomScale = 1f, zoomX = 0f, zoomY = 0f)
        )
    ),
    Personaje(
        nombre = "SEPHIROTH",
        descripcion = "El Ángel de una Sola Ala. Espadachín legendario con un alcance y poder oscuro abrumador.",
        zoomScale = 2.5f, zoomY = 210f, zoomX = -60f,
        rol = "FINAL FANTASY", carril = "MEDIO",
        logo = R.drawable.ff_logo,
        habilidades = listOf(
            Habilidad("B", "Fulgor", R.drawable.ic_launcher_foreground, "Explosión mágica de gran radio.")
        ),
        stats = mapOf("Ataque" to 100, "Defensa" to 35, "Magia" to 90, "Dificultad" to 70),
        skins = listOf(
            Skin("SEPHIROTH", R.drawable.seph_1, zoomScale = 1f, zoomX = 0f, zoomY = 0f),
            Skin("SEPHIROTH GRIS", R.drawable.seph_2, zoomScale = 1f, zoomX = 0f, zoomY = 0f),
            Skin("SEPHIROTH COMBATE", R.drawable.seph_3, zoomScale = 1f, zoomX = 0f, zoomY = 0f)
        )
    ),
    Personaje(
        nombre = "ICE CLIMBERS",
        descripcion = "Popo y Nana. Este dúo inseparable coordina sus martillos para congelar oponentes.",
        zoomScale = 1f, zoomY = -20f, zoomX = 8f,
        rol = "ICE CLIMBER", carril = "MEDIO",
        logo = R.drawable.ice_logo,
        habilidades = listOf(
            Habilidad("B", "Martillo", R.drawable.ic_launcher_foreground, "Deslizan bloques de hielo.")
        ),
        stats = mapOf("Ataque" to 70, "Defensa" to 60, "Magia" to 30, "Dificultad" to 85),
        skins = listOf(
            Skin("ICE CLIMBERS", R.drawable.ice_1, zoomScale = 1f, zoomX = 0f, zoomY = 0f),
            Skin("ICE CLIMBERS AZUL", R.drawable.ice_3, zoomScale = 1f, zoomX = 0f, zoomY = 0f),
            Skin("ICE CLIMBERS ROJO Y GRIS", R.drawable.ice_2, zoomScale = 1f, zoomX = 0f, zoomY = 0f)
        )
    )
)

val personajesMarvel = listOf(
    Personaje(
        nombre = "SCARLET WITCH",
        descripcion = "Wanda Maximoff es experta en aprovechar la formidable magia del caos, lanzando hexágonos con el poder de torcer y remodelar la realidad misma. ¡la energía, el espacio y la materia son meros juguetes en manos de Scarlet Witch!",
        zoomScale = 2.5f, zoomY = 155f, zoomX = 0f,
        rol = "DUELISTA", carril = "AVENGERS",
        logo = R.drawable.scarlet_logo,
        habilidades = listOf(
            Habilidad("Q", "Extinción de la realidad", R.drawable.scarlet_q, "Participa en vuelo libre mientras cargas energía y luego desátala para causar un daño masivo."),
            Habilidad("SHIFT", "Proyección mística", R.drawable.scarlet_shift, "Presiona para poder entrar en modo de vuelo y pulsa de nuevo para salir de este mismo."),
            Habilidad("E", "Sello oscuro", R.drawable.scarlet_e, "Genera un campo de fuerza que aturde a los enemigos dentro de él.")
        ),
        stats = mapOf("Ataque" to 85, "Defensa" to 60, "Magia" to 100, "Dificultad" to 50),
        skins = listOf(
            Skin("SCARLET WITCH", R.drawable.scarletwitch, zoomScale = 1f, zoomX = 0f, zoomY = 0f),
            Skin("SCARLET WITCH ZOMBIE", R.drawable.scarletwitch_zombie, zoomScale = 1f, zoomX = 0f, zoomY = 0f),
            Skin("SCARLET WITCH MULTIVERSE", R.drawable.scarletwitch_multiverse, zoomScale = 1f, zoomX = 0f, zoomY = 0f)
        )
    ),
    Personaje(
        nombre = "DOCTOR STRANGE",
        descripcion = "Como Hechicero Supremo, el Doctor Stephen Strange empuña con gracia hechizos antiguos para cambiar el rumbo incluso de la batalla más imposible. Sin embargo, la magia siempre tiene un costo, y cada uso de sus habilidades arcanas despierta gradualmente la oscuridad dentro de él.",
        zoomScale = 2.3f, zoomY = 170f, zoomX = -20f,
        rol = "VANGUARDIA", carril = "AVENGERS",
        logo = R.drawable.strange_logo,
        habilidades = listOf(
            Habilidad("Q", "Ojo de agamoto", R.drawable.strange_q, "Separa las almas de los enemigos para hacer daño."),
            Habilidad("E", "Maellstrom de la locura", R.drawable.strange_e, "Deshata magia oscura para hacer daño."),
            Habilidad("F", "Pentagrama de Farallah", R.drawable.strange_f, "Crea la entrada y salida de un portal en locaciones que el jugador quiera.")
        ),
        stats = mapOf("Ataque" to 50, "Defensa" to 75, "Magia" to 95, "Dificultad" to 85),
        skins = listOf(
            Skin("DR. STRANGE", R.drawable.strange_1, zoomScale = 1f, zoomX = 0f, zoomY = 0f),
            Skin("DR. STRANGE ZOMBIE", R.drawable.strange_2, zoomScale = 0.9f, zoomX = 0f, zoomY = 0f),
            Skin("DR. STRANGE DIOS DE LA MAGIA", R.drawable.strange_3, zoomScale = 1f, zoomX = 0f, zoomY = 0f))
    ),
    Personaje(
        nombre = "MAGIK",
        descripcion = "Entrenada en las artes oscuras y empuñando su poderosa Soulsword, Magik salta a través de portales para navegar por la arena con facilidad. Una vez que Illyana se transforme en la demoníaca Darkchild, todos los que se atrevan a enfrentarse a ella caerán ante su despiadada espada.",
        zoomScale = 2.5f, zoomY = 168f, zoomX = 170f,
        rol = "DUELISTA", carril = "X-MEN",
        logo = R.drawable.magik_logo,
        habilidades = listOf(
            Habilidad("Q", "Niña de la oscuridad", R.drawable.magik_q, "Transfórmate en la hija de la oscuridad y gana una mejora en todas tus habilidades básicas."),
            Habilidad("SHIFT", "Discos de impulso", R.drawable.magik_shift, "Vuélvete invisible mientras te teletransportas una corta distancia a la dirección que estés corriendo."),
            Habilidad("E", "Incursión de umbral", R.drawable.magik_e, "Da un desplazamiento corto y levanta por los aires a los enemigos en el camino.")
        ),
        stats = mapOf("Ataque" to 90, "Defensa" to 40, "Magia" to 75, "Dificultad" to 70),
        skins = listOf(
            Skin("MAGIK", R.drawable.magik_1, zoomScale = 1f, zoomX = 0f, zoomY = 0f),
            Skin("MAGIK DEMONIO FÉNIX", R.drawable.magik_2, zoomScale = 1f, zoomX = 0f, zoomY = 0f),
            Skin("MAGIK CHICA PUNK", R.drawable.magic_3, zoomScale = 1f, zoomX = 0f, zoomY = 0f))
    ),
    Personaje(
        nombre = "JEFF",
        descripcion = "La mayoría de los tiburones terrestres son criaturas feroces de las profundidades... ¡pero Jeff no! Este pequeño y adorable tiburón terrestre aporta un toque de alegría y curación a cada batalla. Pero si la marea cambia, Jeff puede transformarse en una bestia voraz, tragándose un ejército de enemigos en un trago gigante!",
        zoomScale = 1.5f, zoomY = 20f, zoomX = -20f,
        rol = "ESTRATEGA", carril = "INDEPENDIENTE",
        logo = R.drawable.jeff_logo,
        habilidades = listOf(
            Habilidad("Q", "¡Es Jeff!", R.drawable.jeff_q, "Sumérgete profundamente en la escena y resurge para tragar tanto enemigos como aliados dentro del alcance."),
            Habilidad("E", "Burbuja curativa", R.drawable.jeff_e, "Escupe una burbuja que cura al aliado que la recolecta, otorgándoles impulso de curación y impulso de movimiento."),
            Habilidad("SHIFT", "A escondidas", R.drawable.jeff_shift, "Sumérgete en la escena con solo su aleta expuesta, otorgándose un velocidad de movimiento. Jeff puede curarse mientras está sumergido y adquiere la capacidad de arrastrarse por los suelos.")
        ),
        stats = mapOf("Ataque" to 40, "Defensa" to 50, "Magia" to 30, "Dificultad" to 20),
        skins = listOf(
            Skin("JEFF", R.drawable.jeff_1, zoomScale = 1f, zoomX = 0f, zoomY = 0f),
            Skin("JEFF DÚO DEVORADOR", R.drawable.jeff_2, zoomScale = 1f, zoomX = 0f, zoomY = 0f),
            Skin("JEFF DELFÍN INCÓGNITO", R.drawable.jeff_3, zoomScale = 1f, zoomX = 0f, zoomY = 0f))
    ),
    Personaje(
        nombre = "STORM",
        descripcion = "Una capacidad mutante de nivel Omega para manipular patrones climáticos convierte a Ororo Munroe en una fuerza a tener en cuenta. Lluvia o brillo, truenos o relámpagos, ¡la naturaleza misma se inclina al mando de la Diosa de la Tormenta!",
        zoomScale = 2.5f, zoomY = 180f, zoomX = -180f,
        rol = "DUELISTA", carril = "X-MEN",
        logo = R.drawable.storm_logo,
        habilidades = listOf(
            Habilidad("Q", "Huracán omega", R.drawable.storm_q, "Se transforma en un huracán para atraer enemigos cercanos y causar daño."),
            Habilidad("SHIFT", "Control meteorológico", R.drawable.storm_shift, "Cambia el clima para invocar tornados y rayos, los cuales otorgan velocidad de movimiento y aumento de daño de ataque."),
            Habilidad("E", "Impulso divino", R.drawable.storm_e, "Deshata un rayo y un tornado que dan velocidad de ataque y aumento de daño a la par de hacer daño prolongado a los enemigos y ralentización.")
        ),
        stats = mapOf("Ataque" to 65, "Defensa" to 45, "Magia" to 95, "Dificultad" to 50),
        skins = listOf(
            Skin("STORM", R.drawable.storm_1, zoomScale = 1f, zoomX = 0f, zoomY = 0f),
            Skin("STORM SIMBIONTE", R.drawable.storm_2, zoomScale = 1f, zoomX = 0f, zoomY = 0f),
            Skin("STORM DIOSA DEL TRUENO", R.drawable.storm_3, zoomScale = 1f, zoomX = 0f, zoomY = 0f))
    ),
    Personaje(
        nombre = "LOKI",
        descripcion = "¿Qué mayor emoción hay para un Dios de la Travesura que burlar a sus enemigos? El astuto embaucador Loki usa sus ilusiones y habilidades para cambiar de forma para entrar y salir del combate, jugando con los enemigos en todo momento.",
        zoomScale = 2.5f, zoomY = 180f, zoomX = 0f,
        rol = "ESTRATEGA", carril = "PRÍNCIPE DE ASGARD",
        logo = R.drawable.loki_logo,
        habilidades = listOf(
            Habilidad("Q", "Dios de las travesuras", R.drawable.loki_q, "Cambia de forma a un aliado o héroe enemigo objetivo y usa todas sus habilidades excepto cualquiera de sus habilidades de equipo."),
            Habilidad("E", "Doppelganger", R.drawable.loki_e, "Proyecta una ilusión que puede desarrollar algunas de las habilidades de Loki."),
            Habilidad("F", "Intercambio tortuoso", R.drawable.loki_f, "Intercambia con la Ilusión seleccionada.")
        ),
        stats = mapOf("Ataque" to 80, "Defensa" to 85, "Magia" to 50, "Dificultad" to 60),
        skins = listOf(
            Skin("LOKI", R.drawable.loki_1, zoomScale = 1f, zoomX = 0f, zoomY = 0f),
            Skin("LOKI CARNICERO", R.drawable.loki_2, zoomScale = 1f, zoomX = 0f, zoomY = 0f),
            Skin("LOKI SHIN SAGI-SHI", R.drawable.loki_3, zoomScale = 1f, zoomX = 0f, zoomY = 0f))
    )
)

val categorias = listOf(
    Categoria("LoL", R.drawable.fondo_lol, personajesLol, Color(0xFFC89B3C), Color(0xFF010A13)),
    Categoria("Pokemon", R.drawable.arceus, personajesPokemon, Color(0xFFFFCC00), Color(0xFF757575)),
    Categoria("Smash", R.drawable.smash_backg, personajesSmash, Color(0xFFED1D24), Color(0xFF424242)),
    Categoria("Marvel", R.drawable.shield, personajesMarvel, Color(0xFFE30613), Color(0xFF000000))
)