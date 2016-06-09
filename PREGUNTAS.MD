### 1)
#### a) 
> También hay que poder conocer qué tan contenta está la mascota, que es un número entero mayor o igual que 0, donde a mayor nivel, más contenta está la mascota.

Este numero entero para conocer cuanto esta contenta.. ¿Es el nivel?

#### b)
> Cuando una mascota juega, pasa lo siguiente:
> Se pone de mal humor si esta hambrienta.
> Una mascota puede jugar si está contenta o aburrida, si está hambrienta no. 

¿Se contradice? Dice que una mascota cuando juega estando hambrienta se pone de mal humor, pero después dice que no puede jugar estando hambrienta

#### c) 
> Una mascota puede jugar si está contenta o aburrida, si está hambrienta no.

¿Qué es el es estado `aburrida` que acaba de aparecer? Se necesita más información para su modelado.

---

### 2)
#### a) 
> Indique en palabras los pasos necesarios para incorporar un nuevo estado “Triste” en la mascota, de manera que quede listo para funcionar. 

- Cree una clase con el nombre `Triste` que implemente la interfaz `Estado`
- Implemente los métodos de la interfaz `Estado` (`comer()` y `jugar()`)
- El constructor de `Triste` se requiere que solicite la instancia de `Tamagotchi` para que se puedan enviar los mensajes a dicha instancia.
- Para que la mascota cambie su estado, existe el método `cambiarEstado(Estado)`

#### b)
> Indique cómo resolvería para darles de comer a todas las mascotas que están dentro de una colección “mascotas”.

```Java
public class ColeccionDeMascotas() {
  private List<Tamagotchi> mascotas = new ArrayList<Tamagotchi>();
  
  // Métodos para agregar/sacar/modificar mascotas dentro de la lista
  
  public darleDeComerATodasLasMascotas() {
    mascotas.forEach(unaMascota -> unaMascota.comer());
  }
}
```

