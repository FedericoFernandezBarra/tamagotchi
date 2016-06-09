# tamagotchi

1) Modelar una mascota virtual, del estilo Tamagotchi, de manera que yo pueda usarla para: 

- Pedirle que coma
- Pedirle que juegue
- Preguntarle si puede jugar
- También hay que poder conocer qué tan contenta está la mascota, que es un número entero mayor o igual que 0, donde a mayor nivel, más contenta está la mascota. 
- Una mascota puede estar mal humor, hambrienta o contenta; y su comportamiento depende de en qué estado esté. 

Cuando una mascota come, pasa lo siguiente 

- Si está hambrienta, se pone contenta. 
- Si está contenta, su nivel se incrementa en una unidad.
- Si está de mal humor, y hace más de 80 minutos que está de mal humor, entonces se pone contenta.
- Si está de mal humor desde hace 80 minutos o menos, entonces no le pasa nada, no cambia nada.

Cuando una mascota juega, pasa lo siguiente:

- Si está contenta, su nivel se incrementa en dos unidades. Si llegará a jugar mas de 5 veces se pone hambrienta (jugar da hambre).
- Si está de mal humor, se pone contenta.
- Se pone de mal humor si esta hambrienta.

Una mascota puede jugar si está contenta o aburrida, si está hambrienta no. 

NO SE PUEDE CONSULTAR DE NINGUNA MANERA EL ESTADO ACTUAL DE LA MASCOTA. 

Esto quiere decir que está prohibido hacer comparaciones del tipo estado.equals("contento") o cualquiera similar utilizando mensajes especiales. 

---

2) Responder las siguientes preguntas:

a) Indique en palabras los pasos necesarios para incorporar un nuevo estado “Triste” en la mascota, de manera que quede listo para funcionar. 
b) Indique cómo resolvería para darles de comer a todas las mascotas que están dentro de una colección “mascotas”.
