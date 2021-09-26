# Bienvenidos a mi Reto Sofka 😎
- El reto consiste en realizar un programa de un **Concurso de Preguntas y Respuestas**, teniendo 5 rondas y por cada una se debe elegir una pregunta de una categoria (**Hay 5 preguntas por categoria**).

- El reto cuenta con un método de creación de las 25 preguntas y un método para la creación de los 5 premios que necesita usar el juego.
- [Diagrama UML del reto](https://ibb.co/RbksQ22)
- Para iniciar El programa se debe dar click en Run As -> Java Application (En Eclipse Neon3) la clase AdminJuego.

	![iniciar programa](https://i.ibb.co/ZVLnTQG/15.png)



# Tecnologías usadas ⚙


- Lenguaje: Java 1.8
- IDE: Eclipse Neon 3

# Capturas de pantalla de algunas salidas 👀

## Menú 

Todos tienen las mismas validaciones de evitar el ingreso de datos erróneos.

![ingresar datos correctos](https://i.ibb.co/xgXRTFb/3.png)

Se debe ingresar algunas de las opciones disponibles

![ingresar opcion valida](https://i.ibb.co/q7G97FL/4.png)
- Menu Principal
	
	![Vista del menu principal](https://i.ibb.co/B3hYpgX/menuprincipal.png)
	
	No permite iniciar el juego sino se configura primero.
	
	![enter image description here](https://i.ibb.co/b5qSx9R/5.png)

	Al configurar ya se podrá iniciar el  juego
	
	![enter image description here](https://i.ibb.co/851dbtV/6.png)

## Dentro del juego 🙌

Al iniciar el juego elegirá una pregunta aleatoriamente de la primera categoría.

![iniciando juego](https://i.ibb.co/Wn555cn/7.png)

Si se elige la respuesta **correcta**  (En este caso las que dicen **True**, **para pruebas todas serán la opción 2**) se le va sumando el premio de cada ronda.

![respuesta correcta avanza](https://i.ibb.co/q1kq2Fk/8.png)

En caso de elegir una respuesta **incorrecta** terminará el juego y si tiene algo acumulado lo perderá y el juego guardará los resultado en un **archivo.Txt**.

![respuesta incorrecta pierde todo](https://i.ibb.co/V3CQdrZ/9.png)

El juegador puede retirarse en cualquier ronda y llevarse lo acumulado. Si decide hacerlo se guardará el resultado de la partida.

![si se retira se lleva acumulado](https://i.ibb.co/qR7yPs7/10.png)

El jugador gana al contestar correctamente la pregunta de la ronda 5 y luego se guarda los resultados. 

![si gana se lleva todo](https://i.ibb.co/vZMFHMP/11.png)

# Persistencia de datos 📘
- Al ganar, perder o retirarse se guardan los datos de los resultados en un archivo.txt llamado datosHistoricos en una carpeta con nombre PersistenciaDeDatos.
- El archivo esta seteado con una ruta relativa asi que no hay que modificar alguna clase del proyecto.

	![persistencia de datos](https://i.ibb.co/X4F4ZNW/12.png)


## Paquete Test 🛠
Se creo un paquete de test unitarios y de integración para ir probando la lógica de cada clase, al ir desarrollando el proyecto.

![pruebas de cada clase](https://i.ibb.co/YptXVpK/14.png)
