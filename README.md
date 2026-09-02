# Acepta el Reto — Java Solutions

Colección de soluciones en **Java** para problemas del juez online [Acepta el Reto](https://www.aceptaelreto.com/).

Este repositorio recoge ejercicios resueltos para practicar y profundizar en:

- Algoritmos
- Estructuras de datos
- Matemáticas y teoría de números
- Strings
- Arrays y matrices
- Simulación
- Optimización temporal y espacial
- Resolución de problemas
- Programación competitiva con Java

Además de las soluciones aceptadas, se conservan algunos intentos anteriores con estados como `TLE`, `MLE` o `CE`, ya que forman parte del proceso de análisis, depuración y optimización.

---

## Organización del repositorio

Las implementaciones están separadas según el resultado obtenido en el juez:

```text
Acepta-el-reto/
│
├── soluciones/
│   │
│   ├── aceptados/
│   │   ├── ConstanteDeKaprekar_100.java
│   │   ├── AproximacionDeGauss_107.java
│   │   ├── ...
│   │   ├── LlenandoPiscinas_131.java
│   │   ├── LlenandoPiscinas2_131.java
│   │   └── ...
│   │
│   └── intentos/
│       ├── AvituallamientoEnLasEtapasCiclistasMLE_122.java
│       ├── SanFerminesMLE_149.java
│       ├── HamburguesquinCE_421.java
│       ├── HamburguesquinTLE_421.java
│       └── ...
│
└── README.md
```

### `soluciones/aceptados`

Contiene las implementaciones que fueron **aceptadas por el juez**.

En algunos problemas se mantienen varias soluciones aceptadas para conservar diferentes enfoques válidos.

Por ejemplo:

```text
LlenandoPiscinas_131.java
LlenandoPiscinas2_131.java
```

Las variantes numeradas como `2`, `3`, etc. representan implementaciones alternativas que también fueron aceptadas.

### `soluciones/intentos`

Contiene implementaciones que no llegaron a ser aceptadas y que se conservan para documentar parte del proceso de resolución y optimización.

Los principales estados utilizados son:

| Estado | Significado |
|:---:|---|
| `TLE` | Time Limit Exceeded |
| `MLE` | Memory Limit Exceeded |
| `CE` | Compilation Error |

---

## Enfoque

El objetivo del repositorio no es únicamente almacenar soluciones, sino mantener un registro de la práctica y evolución en:

```text
Java
  │
  ├── Algorithms
  ├── Data Structures
  ├── Problem Solving
  ├── Competitive Programming
  └── Optimization
```

---

## Soluciones destacadas

Estas soluciones representan distintos tipos de problemas y técnicas presentes en el repositorio.

| ID | Problema | Área | Código |
|---:|---|---|---|
| 100 | [Constante de Kaprekar](https://www.aceptaelreto.com/problem/statement.php?id=100) | Simulación y manipulación numérica | [`Java`](soluciones/aceptados/ConstanteDeKaprekar_100.java) |
| 107 | [Aproximación de Gauss](https://www.aceptaelreto.com/problem/statement.php?id=107) | Teoría de números y precálculo | [`Java`](soluciones/aceptados/AproximacionDeGauss_107.java) |
| 141 | [Paréntesis balanceados](https://www.aceptaelreto.com/problem/statement.php?id=141) | Validación de secuencias | [`Java`](soluciones/aceptados/ParéntesisBalenceados_141.java) |
| 176 | [Campo de Minas](https://www.aceptaelreto.com/problem/statement.php?id=176) | Matrices y recorrido de vecinos | [`Java`](soluciones/aceptados/CampoDeMinas_176.java) |
| 300 | [Palabras Pentavocálicas](https://www.aceptaelreto.com/problem/statement.php?id=300) | Procesamiento de cadenas | [`Java`](soluciones/aceptados/PalabrasPentavocalicas_300.java) |
| 600 | [Puntos de Silla](https://www.aceptaelreto.com/problem/statement.php?id=600) | Arrays y matrices | [`Java`](soluciones/aceptados/PuntosDeSilla_600.java) |
| 754 | [Palíndromos ocultos](https://www.aceptaelreto.com/problem/statement.php?id=754) | Strings | [`Java`](soluciones/aceptados/PalindromosOcultos_754.java) |

---

## Variantes aceptadas

Algunos problemas incluyen varias implementaciones aceptadas.

Se conservan porque permiten comparar distintas formas de llegar a una solución válida.

| ID | Problema | Implementaciones |
|---:|---|---|
| 131 | Llenando piscinas | [`Solución 1`](soluciones/aceptados/LlenandoPiscinas_131.java) · [`Solución 2`](soluciones/aceptados/LlenandoPiscinas2_131.java) |
| 144 | Teclado Estropeado | [`Solución 1`](soluciones/aceptados/TecladoEstropeado_144.java) · [`Solución 2`](soluciones/aceptados/TecladoEstropeado2_144.java) |
| 156 | Ascensor | [`Solución 1`](soluciones/aceptados/Ascensor_156.java) · [`Solución 2`](soluciones/aceptados/Ascensor2_156.java) |
| 300 | Palabras Pentavocálicas | [`Solución 1`](soluciones/aceptados/PalabrasPentavocalicas_300.java) · [`Solución 2`](soluciones/aceptados/PalabrasPentavocalicas2_300.java) |
| 523 | Aburrimiento Autopista | [`Solución 1`](soluciones/aceptados/AburrimientoAutopista_523.java) · [`Solución 2`](soluciones/aceptados/AburrimientoAutopista2_523.java) · [`Solución 3`](soluciones/aceptados/AburrimientoAutopista3_523.java) |
| 600 | Puntos de Silla | [`Solución 1`](soluciones/aceptados/PuntosDeSilla_600.java) · [`Solución 2`](soluciones/aceptados/PuntosDeSilla2_600.java) |
| 611 | Conan Doyle y Sean Connery | [`Solución 1`](soluciones/aceptados/ConanDoyleyySeanConnery_611.java) · [`Solución 2`](soluciones/aceptados/ConanDoyleySeanConneryVectores_611.java) |

---

# Soluciones aceptadas

| ID | Problema | Solución |
|---:|---|---|
| 100 | [Constante de Kaprekar](https://www.aceptaelreto.com/problem/statement.php?id=100) | [`ConstanteDeKaprekar_100.java`](soluciones/aceptados/ConstanteDeKaprekar_100.java) |
| 101 | [Cuadrados Diabólicos Y Esotéricos](https://www.aceptaelreto.com/problem/statement.php?id=101) | [`CuadradosDiabolicosYEsotericos_101.java`](soluciones/aceptados/CuadradosDiabolicosYEsotericos_101.java) |
| 102 | [Encriptación De Mensajes](https://www.aceptaelreto.com/problem/statement.php?id=102) | [`EncriptacionDeMensajes_102.java`](soluciones/aceptados/EncriptacionDeMensajes_102.java) |
| 103 | [Problemas De Herencia](https://www.aceptaelreto.com/problem/statement.php?id=103) | [`ProblemasDeHerencia_103.java`](soluciones/aceptados/ProblemasDeHerencia_103.java) |
| 104 | [Móviles](https://www.aceptaelreto.com/problem/statement.php?id=104) | [`Moviles_104.java`](soluciones/aceptados/Moviles_104.java) |
| 105 | [Ventas](https://www.aceptaelreto.com/problem/statement.php?id=105) | [`Ventas_105.java`](soluciones/aceptados/Ventas_105.java) |
| 106 | [Códigos De Barras](https://www.aceptaelreto.com/problem/statement.php?id=106) | [`CodigosDeBarras_106.java`](soluciones/aceptados/CodigosDeBarras_106.java) |
| 107 | [Aproximación de Gauss](https://www.aceptaelreto.com/problem/statement.php?id=107) | [`AproximacionDeGauss_107.java`](soluciones/aceptados/AproximacionDeGauss_107.java) |
| 108 | [De nuevo en el bar de Javier](https://www.aceptaelreto.com/problem/statement.php?id=108) | [`DeNuevoEnElBarDeJavier_108.java`](soluciones/aceptados/DeNuevoEnElBarDeJavier_108.java) |
| 109 | [Liga de pádel](https://www.aceptaelreto.com/problem/statement.php?id=109) | [`LigaDePadel_109.java`](soluciones/aceptados/LigaDePadel_109.java) |
| 110 | [Estrofas](https://www.aceptaelreto.com/problem/statement.php?id=110) | [`Estrofas_110.java`](soluciones/aceptados/Estrofas_110.java) |
| 111 | [Aprobar química](https://www.aceptaelreto.com/problem/statement.php?id=111) | [`AprobarQuimica_111.java`](soluciones/aceptados/AprobarQuimica_111.java) |
| 112 | [Radares de Tramo](https://www.aceptaelreto.com/problem/statement.php?id=112) | [`RadaresDeTramo_112.java`](soluciones/aceptados/RadaresDeTramo_112.java) |
| 113 | [Semáforos sin parar](https://www.aceptaelreto.com/problem/statement.php?id=113) | [`SemaforosSinParar_113.java`](soluciones/aceptados/SemaforosSinParar_113.java) |
| 114 | [Último dígito del factorial](https://www.aceptaelreto.com/problem/statement.php?id=114) | [`UltimoDigitoDelFactorial_114.java`](soluciones/aceptados/UltimoDigitoDelFactorial_114.java) |
| 115 | [Número de Kaprekar](https://www.aceptaelreto.com/problem/statement.php?id=115) | [`NumeroDeKaprekar_115.java`](soluciones/aceptados/NumeroDeKaprekar_115.java) |
| 116 | [¡Hola Mundo!](https://www.aceptaelreto.com/problem/statement.php?id=116) | [`HolaMundo_116.java`](soluciones/aceptados/HolaMundo_116.java) |
| 117 | [La fiesta aburrida](https://www.aceptaelreto.com/problem/statement.php?id=117) | [`LaFiestaAburrida_117.java`](soluciones/aceptados/LaFiestaAburrida_117.java) |
| 119 | [Escudos del ejército romano](https://www.aceptaelreto.com/problem/statement.php?id=119) | [`EscudosDelEjercitoRomano_119.java`](soluciones/aceptados/EscudosDelEjercitoRomano_119.java) |
| 120 | [Constante mágica](https://www.aceptaelreto.com/problem/statement.php?id=120) | [`ConstanteMagica_120.java`](soluciones/aceptados/ConstanteMagica_120.java) |
| 121 | [Chicles de Regalo](https://www.aceptaelreto.com/problem/statement.php?id=121) | [`ChiclesDeRegalo_121.java`](soluciones/aceptados/ChiclesDeRegalo_121.java) |
| 122 | [Avituallamiento en las etapas ciclistas](https://www.aceptaelreto.com/problem/statement.php?id=122) | [`AvituallamientoEnLasEtapasCiclistas_122.java`](soluciones/aceptados/AvituallamientoEnLasEtapasCiclistas_122.java) |
| 123 | [Conjugar verbos](https://www.aceptaelreto.com/problem/statement.php?id=123) | [`ConjugarVerbos_123.java`](soluciones/aceptados/ConjugarVerbos_123.java) |
| 125 | [Números vampiro](https://www.aceptaelreto.com/problem/statement.php?id=125) | [`NumerosVampiro_125.java`](soluciones/aceptados/NumerosVampiro_125.java) |
| 126 | [Divisores del Factorial](https://www.aceptaelreto.com/problem/statement.php?id=126) | [`DivisoresDelFactorial_126.java`](soluciones/aceptados/DivisoresDelFactorial_126.java) |
| 128 | [Florencia](https://www.aceptaelreto.com/problem/statement.php?id=128) | [`Florencia_128 .java`](soluciones/aceptados/Florencia_128.java) |
| 130 | [Mejor...Imposible](https://www.aceptaelreto.com/problem/statement.php?id=130) | [`MejorImposible_130.java`](soluciones/aceptados/MejorImposible_130.java) |
| 131 | [Llenando piscinas](https://www.aceptaelreto.com/problem/statement.php?id=131) | [`LlenandoPiscinas_131.java`](soluciones/aceptados/LlenandoPiscinas_131.java) |
| 131 | [Llenando piscinas](https://www.aceptaelreto.com/problem/statement.php?id=131) | [`LlenandoPiscinas2_131.java`](soluciones/aceptados/LlenandoPiscinas2_131.java) |
| 132 | [Las cartas del abuelo](https://www.aceptaelreto.com/problem/statement.php?id=132) | [`LasCartasDelAbuelo_132.java`](soluciones/aceptados/LasCartasDelAbuelo_132.java) |
| 134 | [Escalera de color](https://www.aceptaelreto.com/problem/statement.php?id=134) | [`EscaleraDeColor_134.java`](soluciones/aceptados/EscaleraDeColor_134.java) |
| 137 | [Hundir la flota](https://www.aceptaelreto.com/problem/statement.php?id=137) | [`HundirLaFlota_137.java`](soluciones/aceptados/HundirLaFlota_137.java) |
| 139 | [Números Cubifinitos](https://www.aceptaelreto.com/problem/statement.php?id=139) | [`NumerosCubifinitos_139.java`](soluciones/aceptados/NumerosCubifinitos_139.java) |
| 140 | [Suma de dígitos](https://www.aceptaelreto.com/problem/statement.php?id=140) | [`SumaDeDigitos_140.java`](soluciones/aceptados/SumaDeDigitos_140.java) |
| 141 | [Paréntesis balanceados](https://www.aceptaelreto.com/problem/statement.php?id=141) | [`ParéntesisBalenceados_141.java`](soluciones/aceptados/ParéntesisBalenceados_141.java) |
| 144 | [Teclado Estropeado](https://www.aceptaelreto.com/problem/statement.php?id=144) | [`TecladoEstropeado_144.java`](soluciones/aceptados/TecladoEstropeado_144.java) |
| 144 | [Teclado Estropeado](https://www.aceptaelreto.com/problem/statement.php?id=144) | [`TecladoEstropeado2_144.java`](soluciones/aceptados/TecladoEstropeado2_144.java) |
| 149 | [San Fermines](https://www.aceptaelreto.com/problem/statement.php?id=149) | [`SanFermines_149.java`](soluciones/aceptados/SanFermines_149.java) |
| 151 | [¿Es matriz identidad?](https://www.aceptaelreto.com/problem/statement.php?id=151) | [`EsMatrizIdentidad_151.java`](soluciones/aceptados/EsMatrizIdentidad_151.java) |
| 156 | [Ascensor](https://www.aceptaelreto.com/problem/statement.php?id=156) | [`Ascensor_156.java`](soluciones/aceptados/Ascensor_156.java) |
| 156 | [Ascensor](https://www.aceptaelreto.com/problem/statement.php?id=156) | [`Ascensor2_156.java`](soluciones/aceptados/Ascensor2_156.java) |
| 160 | [Matrices Triangulares](https://www.aceptaelreto.com/problem/statement.php?id=160) | [`MatricesTriangulares_160.java`](soluciones/aceptados/MatricesTriangulares_160.java) |
| 163 | [Súmale uno](https://www.aceptaelreto.com/problem/statement.php?id=163) | [`SumaleUno_163.java`](soluciones/aceptados/SumaleUno_163.java) |
| 165 | [Número hyperpar](https://www.aceptaelreto.com/problem/statement.php?id=165) | [`NumeroHyperpar_165.java`](soluciones/aceptados/NumeroHyperpar_165.java) |
| 169 | [Carrera Popular](https://www.aceptaelreto.com/problem/statement.php?id=169) | [`CarreraPopular_169.java`](soluciones/aceptados/CarreraPopular_169.java) |
| 171 | [Abadías Pirenaicas](https://www.aceptaelreto.com/problem/statement.php?id=171) | [`AbadiasPirenaicas_171.java`](soluciones/aceptados/AbadiasPirenaicas_171.java) |
| 176 | [Campo de Minas](https://www.aceptaelreto.com/problem/statement.php?id=176) | [`CampoDeMinas_176.java`](soluciones/aceptados/CampoDeMinas_176.java) |
| 182 | [Persistencia multiplicativa de los números](https://www.aceptaelreto.com/problem/statement.php?id=182) | [`PersistenciaMultiplicativaNumeros_182.java`](soluciones/aceptados/PersistenciaMultiplicativaNumeros_182.java) |
| 183 | [Anélidos](https://www.aceptaelreto.com/problem/statement.php?id=183) | [`Anelidos_183.java`](soluciones/aceptados/Anelidos_183.java) |
| 185 | [Potitos](https://www.aceptaelreto.com/problem/statement.php?id=185) | [`Potitos_185.java`](soluciones/aceptados/Potitos_185.java) |
| 186 | [Y el ganador es...](https://www.aceptaelreto.com/problem/statement.php?id=186) | [`YElGanadorEs_186.java`](soluciones/aceptados/YElGanadorEs_186.java) |
| 191 | [Los problemas de ser rico](https://www.aceptaelreto.com/problem/statement.php?id=191) | [`LosProblemasDeSerRico_191.java`](soluciones/aceptados/LosProblemasDeSerRico_191.java) |
| 192 | [Por 3 o más 5](https://www.aceptaelreto.com/problem/statement.php?id=192) | [`Por3OMas5_192.java`](soluciones/aceptados/Por3OMas5_192.java) |
| 200 | [Colores](https://www.aceptaelreto.com/problem/statement.php?id=200) | [`Colores_200.java`](soluciones/aceptados/Colores_200.java) |
| 201 | [Natalidad](https://www.aceptaelreto.com/problem/statement.php?id=201) | [`Natalidad_201.java`](soluciones/aceptados/Natalidad_201.java) |
| 222 | [Serie de potencias](https://www.aceptaelreto.com/problem/statement.php?id=222) | [`SerieDePotencias_222.java`](soluciones/aceptados/SerieDePotencias_222.java) |
| 225 | [El Otro Hijo de Bonacci](https://www.aceptaelreto.com/problem/statement.php?id=225) | [`ElOtroHijoDeBonacci_225.java`](soluciones/aceptados/ElOtroHijoDeBonacci_225.java) |
| 238 | [Repartiendo el botín](https://www.aceptaelreto.com/problem/statement.php?id=238) | [`RepartiendoElBotin_238.java`](soluciones/aceptados/RepartiendoElBotin_238.java) |
| 248 | [Los premios de las tragaperras](https://www.aceptaelreto.com/problem/statement.php?id=248) | [`LosPremiosDeLasTragaperras_248.java`](soluciones/aceptados/LosPremiosDeLasTragaperras_248.java) |
| 270 | [Me Pillo El Toro](https://www.aceptaelreto.com/problem/statement.php?id=270) | [`MePilloElToro_270.java`](soluciones/aceptados/MePilloElToro_270.java) |
| 300 | [Palabras Pentavocálicas](https://www.aceptaelreto.com/problem/statement.php?id=300) | [`PalabrasPentavocalicas_300.java`](soluciones/aceptados/PalabrasPentavocalicas_300.java) |
| 300 | [Palabras Pentavocálicas](https://www.aceptaelreto.com/problem/statement.php?id=300) | [`PalabrasPentavocalicas2_300.java`](soluciones/aceptados/PalabrasPentavocalicas2_300.java) |
| 337 | [La Abuela María](https://www.aceptaelreto.com/problem/statement.php?id=337) | [`LaAbuelaMaria_337.java`](soluciones/aceptados/LaAbuelaMaria_337.java) |
| 344 | [Conectando cables](https://www.aceptaelreto.com/problem/statement.php?id=344) | [`ConectandoCables_344.java`](soluciones/aceptados/ConectandoCables_344.java) |
| 362 | [El día de Navidad](https://www.aceptaelreto.com/problem/statement.php?id=362) | [`ElDiaDeNavidad_362.java`](soluciones/aceptados/ElDiaDeNavidad_362.java) |
| 368 | [Cociendo Huevos](https://www.aceptaelreto.com/problem/statement.php?id=368) | [`CociendoHuevos_368.java`](soluciones/aceptados/CociendoHuevos_368.java) |
| 370 | [Estación de tren](https://www.aceptaelreto.com/problem/statement.php?id=370) | [`EstacionDeTren_370.java`](soluciones/aceptados/EstacionDeTren_370.java) |
| 402 | [Las Dimensiones Del Puzzle](https://www.aceptaelreto.com/problem/statement.php?id=402) | [`LasDimensionesDelPuzzle_402.java`](soluciones/aceptados/LasDimensionesDelPuzzle_402.java) |
| 403 | [En campos de fútbol](https://www.aceptaelreto.com/problem/statement.php?id=403) | [`EnCamposDeFutbol_403.java`](soluciones/aceptados/EnCamposDeFutbol_403.java) |
| 416 | [Michael J. Fox y el Pato Donald](https://www.aceptaelreto.com/problem/statement.php?id=416) | [`MichaelJFoxyelPatoDonald_416.java`](soluciones/aceptados/MichaelJFoxyelPatoDonald_416.java) |
| 429 | [Organizando Hangares](https://www.aceptaelreto.com/problem/statement.php?id=429) | [`OrganizandoHangares_429.java`](soluciones/aceptados/OrganizandoHangares_429.java) |
| 438 | [Esgritura](https://www.aceptaelreto.com/problem/statement.php?id=438) | [`Esgritura_438.java`](soluciones/aceptados/Esgritura_438.java) |
| 446 | [Abuelas Falsas](https://www.aceptaelreto.com/problem/statement.php?id=446) | [`AbuelasFalsas_446.java`](soluciones/aceptados/AbuelasFalsas_446.java) |
| 464 | [Entrando en Pelotón](https://www.aceptaelreto.com/problem/statement.php?id=464) | [`EntrandoEnPeloton_464.java`](soluciones/aceptados/EntrandoEnPeloton_464.java) |
| 479 | [El Hombre sin Miedo y Sin Radar](https://www.aceptaelreto.com/problem/statement.php?id=479) | [`ElHombreSinMiedoYSinRadar_479.java`](soluciones/aceptados/ElHombreSinMiedoYSinRadar_479.java) |
| 484 | [El incidente de Dhahran](https://www.aceptaelreto.com/problem/statement.php?id=484) | [`ElIncidenteDeDhahran_484.java`](soluciones/aceptados/ElIncidenteDeDhahran_484.java) |
| 485 | [Senda Pirenaica](https://www.aceptaelreto.com/problem/statement.php?id=485) | [`SendaPirenaica_485.java`](soluciones/aceptados/SendaPirenaica_485.java) |
| 514 | [El mejor dato del paro](https://www.aceptaelreto.com/problem/statement.php?id=514) | [`ElMejorDatoDelParo_514.java`](soluciones/aceptados/ElMejorDatoDelParo_514.java) |
| 519 | [Desbloqueo Retro](https://www.aceptaelreto.com/problem/statement.php?id=519) | [`DesbloqueoRetro_519.java`](soluciones/aceptados/DesbloqueoRetro_519.java) |
| 522 | [La desconfianza de la ASALE](https://www.aceptaelreto.com/problem/statement.php?id=522) | [`DesconfianzaASALE_522.java`](soluciones/aceptados/DesconfianzaASALE_522.java) |
| 523 | [Aburrimiento Autopista](https://www.aceptaelreto.com/problem/statement.php?id=523) | [`AburrimientoAutopista_523.java`](soluciones/aceptados/AburrimientoAutopista_523.java) |
| 523 | [Aburrimiento Autopista](https://www.aceptaelreto.com/problem/statement.php?id=523) | [`AburrimientoAutopista2_523.java`](soluciones/aceptados/AburrimientoAutopista2_523.java) |
| 523 | [Aburrimiento Autopista](https://www.aceptaelreto.com/problem/statement.php?id=523) | [`AburrimientoAutopista3_523.java`](soluciones/aceptados/AburrimientoAutopista3_523.java) |
| 529 | [Login, logout](https://www.aceptaelreto.com/problem/statement.php?id=529) | [`Loginlogout_529.java`](soluciones/aceptados/Loginlogout_529.java) |
| 540 | [Por el hueco de la escalera](https://www.aceptaelreto.com/problem/statement.php?id=540) | [`PorElHuecoDeLaEscalera_540.java`](soluciones/aceptados/PorElHuecoDeLaEscalera_540.java) |
| 558 | [Camel Casi](https://www.aceptaelreto.com/problem/statement.php?id=558) | [`CamelCasi_558.java`](soluciones/aceptados/CamelCasi_558.java) |
| 582 | [¡Son los cuartos!](https://www.aceptaelreto.com/problem/statement.php?id=582) | [`SonLosCuartos_582.java`](soluciones/aceptados/SonLosCuartos_582.java) |
| 593 | [Pruebas en lotes](https://www.aceptaelreto.com/problem/statement.php?id=593) | [`PruebasPorLotes_593.java`](soluciones/aceptados/PruebasPorLotes_593.java) |
| 599 | [Pepe Casanova](https://www.aceptaelreto.com/problem/statement.php?id=599) | [`PepeCasanova_599.java`](soluciones/aceptados/PepeCasanova_599.java) |
| 600 | [Puntos De Silla](https://www.aceptaelreto.com/problem/statement.php?id=600) | [`PuntosDeSilla_600.java`](soluciones/aceptados/PuntosDeSilla_600.java) |
| 600 | [Puntos De Silla](https://www.aceptaelreto.com/problem/statement.php?id=600) | [`PuntosDeSilla2_600.java`](soluciones/aceptados/PuntosDeSilla2_600.java) |
| 611 | [Conan Doyle y Sean Connery](https://www.aceptaelreto.com/problem/statement.php?id=611) | [`ConanDoyleyySeanConnery_611.java`](soluciones/aceptados/ConanDoyleyySeanConnery_611.java) |
| 611 | [Conan Doyle y Sean Connery](https://www.aceptaelreto.com/problem/statement.php?id=611) | [`ConanDoyleySeanConneryVectores_611.java`](soluciones/aceptados/ConanDoyleySeanConneryVectores_611.java) |
| 641 | [Incidencia Acumulada](https://www.aceptaelreto.com/problem/statement.php?id=641) | [`IncidenciaAcumulada_641.java`](soluciones/aceptados/IncidenciaAcumulada_641.java) |
| 653 | [RunnersApp](https://www.aceptaelreto.com/problem/statement.php?id=653) | [`RunnersApp_653.java`](soluciones/aceptados/RunnersApp_653.java) |
| 663 | [Contando desde el cero](https://www.aceptaelreto.com/problem/statement.php?id=663) | [`ContandoDesdeElCero_663.java`](soluciones/aceptados/ContandoDesdeElCero_663.java) |
| 667 | [Pipos](https://www.aceptaelreto.com/problem/statement.php?id=667) | [`Pipos_667.java`](soluciones/aceptados/Pipos_667.java) |
| 688 | [Evitando tropiezos](https://www.aceptaelreto.com/problem/statement.php?id=688) | [`EvitandoTropiezos_688.java`](soluciones/aceptados/EvitandoTropiezos_688.java) |
| 725 | [Las luces en el río](https://www.aceptaelreto.com/problem/statement.php?id=725) | [`LasLucesEnElRio_725.java`](soluciones/aceptados/LasLucesEnElRio_725.java) |
| 738 | [Torfiles](https://www.aceptaelreto.com/problem/statement.php?id=738) | [`Torfiles_738.java`](soluciones/aceptados/Torfiles_738.java) |
| 751 | [Coetáneos](https://www.aceptaelreto.com/problem/statement.php?id=751) | [`Coetanos_751.java`](soluciones/aceptados/Coetanos_751.java) |
| 754 | [Palíndromos ocultos](https://www.aceptaelreto.com/problem/statement.php?id=754) | [`PalindromosOcultos_754.java`](soluciones/aceptados/PalindromosOcultos_754.java) |
| 760 | [Bloque Seguro](https://www.aceptaelreto.com/problem/statement.php?id=760) | [`BloqueSeguro_760.java`](soluciones/aceptados/BloqueSeguro_760.java) |
| 782 | [El abuelo centenario](https://www.aceptaelreto.com/problem/statement.php?id=782) | [`ElAbueloCentenario_782.java`](soluciones/aceptados/ElAbueloCentenario_782.java) |
| 800 | [Travesuras en el hotel de Hilbert](https://www.aceptaelreto.com/problem/statement.php?id=800) | [`TravesurasEnElHotelDeHilbert_800.java`](soluciones/aceptados/TravesurasEnElHotelDeHilbert_800.java) |

---

# Intentos conservados

Estos archivos representan implementaciones anteriores que no fueron aceptadas por el juez.

Se conservan para mostrar parte del proceso de resolución, depuración y optimización.

| ID | Problema | Estado | Implementación |
|---:|---|:---:|---|
| 122 | [Avituallamiento en las etapas ciclistas](https://www.aceptaelreto.com/problem/statement.php?id=122) | `MLE` | [`AvituallamientoEnLasEtapasCiclistasMLE_122.java`](soluciones/intentos/AvituallamientoEnLasEtapasCiclistasMLE_122.java) |
| 149 | [San Fermines](https://www.aceptaelreto.com/problem/statement.php?id=149) | `MLE` | [`SanFerminesMLE_149.java`](soluciones/intentos/SanFerminesMLE_149.java) |
| 183 | [Anélidos](https://www.aceptaelreto.com/problem/statement.php?id=183) | `MLE` | [`Anelidos2_MLE_183.java`](soluciones/intentos/Anelidos2_MLE_183.java) |
| 192 | [Por 3 O Mas 5](https://www.aceptaelreto.com/problem/statement.php?id=192) | `TLE` | [`Por3OMas5TLE_192.java`](soluciones/intentos/Por3OMas5TLE_192.java) |
| 421 | [Hamburguesquin](https://www.aceptaelreto.com/problem/statement.php?id=421) | `CE` | [`HamburguesquinCE_421.java`](soluciones/intentos/HamburguesquinCE_421.java) |
| 421 | [Hamburguesquin](https://www.aceptaelreto.com/problem/statement.php?id=421) | `TLE` | [`HamburguesquinTLE_421.java`](soluciones/intentos/HamburguesquinTLE_421.java) |
| 421 | [Hamburguesquin](https://www.aceptaelreto.com/problem/statement.php?id=421) | `TLE` | [`HamburguesquinTLE2_421.java`](soluciones/intentos/HamburguesquinTLE2_421.java) |
| 514 | [El mejor dato del paro](https://www.aceptaelreto.com/problem/statement.php?id=514) | `TLE` | [`ElMejorDatoDelParoTLE_514.java`](soluciones/intentos/ElMejorDatoDelParoTLE_514.java) |
| 688 | [Evitando tropiezos](https://www.aceptaelreto.com/problem/statement.php?id=688) | `MLE` | [`EvitandoTropiezosMLE_688.java`](soluciones/intentos/EvitandoTropiezosMLE_688.java) |
| 782 | [El abuelo centenario](https://www.aceptaelreto.com/problem/statement.php?id=782) | `TLE` | [`ElAbueloCentenarioTLE_782.java`](soluciones/intentos/ElAbueloCentenarioTLE_782.java) |

### Significado de los estados

| Estado | Significado |
|:---:|---|
| `AC` | Accepted |
| `TLE` | Time Limit Exceeded |
| `MLE` | Memory Limit Exceeded |
| `CE` | Compilation Error |

Una implementación puede ser conceptualmente válida y, aun así, superar los límites de tiempo o memoria establecidos por el juez.

Conservar algunos de estos intentos permite comparar enfoques y analizar el proceso seguido hasta alcanzar una solución aceptada.

---

## Ejecución

Cada solución puede compilarse y ejecutarse de forma independiente utilizando el JDK.

Por ejemplo:

```bash
javac soluciones/aceptados/ConstanteDeKaprekar_100.java
java -cp soluciones/aceptados ConstanteDeKaprekar_100
```

La entrada debe proporcionarse siguiendo exactamente el formato especificado en el enunciado original de cada problema.

---

## Convención de nombres

Las soluciones utilizan principalmente el siguiente formato:

```text
NombreDelProblema_ID.java
```

Cuando existen varias implementaciones aceptadas:

```text
NombreDelProblema_ID.java
NombreDelProblema2_ID.java
NombreDelProblema3_ID.java
```

Los intentos no aceptados indican normalmente el resultado obtenido:

```text
NombreDelProblemaTLE_ID.java
NombreDelProblemaMLE_ID.java
NombreDelProblemaCE_ID.java
```

---

## Sobre Acepta el Reto

[Acepta el Reto](https://www.aceptaelreto.com/) es un juez online de programación que permite practicar resolución de problemas mediante diferentes lenguajes.

Los **enunciados, nombres de los problemas y contenido de la plataforma pertenecen a Acepta el Reto y a sus respectivos autores**.

Este repositorio contiene mis propias implementaciones y enlaza a los problemas originales para proporcionar contexto.

---

## Autor

**Rubén Teijeiro**

- GitHub: [@lubineitor](https://github.com/lubineitor)
- LinkedIn: [Rubén Teijeiro](https://www.linkedin.com/in/rubenteijeiro/)

---

<div align="center">

### `JAVA · ALGORITHMS · DATA STRUCTURES · PROBLEM SOLVING`

</div>
