public class Main {
    /*Ej1: Definir y mostrar variables.
    Crea un programa que defina tres variables: nombre, edad y ciudad.
    Asigna valores a cada una y muestra se contenido en la consola.
    */
    public static void main(String[] args){
        String nombre= "Ana";
        System.out.print("Mi nombres es: " + nombre);
        int edad= 25;
        System.out.print("La edad es: " + edad);
        String ciudad= "Madrid";
        System.out.print("La ciudad es: " + ciudad);

        /*Ej2: Modifica variables,
        Crea un programa que defina una varibale llamda publicación con
        valor inicla 0. Luego, modifica su valor 3 veces y muestra el
        resultado final.
        */
        int puntuacion= 0;
        System.out.print("La puntuación es: "+ puntuacion);
        puntuacion= 5;//primera modificación
        System.out.print("La puntuación después de la primera modificación:"+puntuacion);
        puntuacion= 10; //segunda modificación
        System.out.print("La puntuación después de la segunda modificación:"+puntuacion);
        puntuacion= 15; // Puntuación final
        System.out.print("La puntuación fianl:"+puntuacion);

        /*Tipos de varible.
        Define cinco varibale con diferente tipos de datos(String, int,
        boolean, double, char) y muestra tanto su valor como su tipo.
        */
        String nombre1="Carlos";// Tipo: String
        System.out.print("El nombre es: "+nombre1);
        int edad2=30; // Tipo:int.
        System.out.print("La edad es: "+edad2);
        boolean esEstudiante = true; // Tipo boolean.
        System.out.print("¿Es estudiante: "+esEstudiante);
        double altura= 1.75; // Tipo: double.
        System.out.print("La alura: "+altura);
        char inicial='C';
        System.out.print("La inicial es: "+inicial);

        /*El4: Variables con nombre descriptivos.
        Crea un progtama que simule la información de un libro usando
        variables con nombres descriptivos.Muestra toda la información
        del libro en la consola.
        */

        String titulo= "Don Quijote de la Mancha";
        System.out.print("El título del libro es: "+titulo);
        String autor="Miguel de Cervantes";
        System.out.print("El autor es: " +autor);
        int publicacion= 1605;
        System.out.print("El año de publicación es: "+publicacion);
        int paginas= 863;
        System.out.print("Número de páginas: "+paginas);
        boolean disponibleEnBiblioteca = true;
        System.out.print("¿Disponible en la biblioteca: "+disponibleEnBiblioteca);

        /* Ej5: Declaración y uso de constantes.
        Crea un programa que use constantes para lamcenar información que no
        debe cambiar(como el valor de PI o el nombre de una aplicación) y
        varibales para información que puede cambiar. Muestra todos los valores.
        */
         final String aplicacion= "MiApp";
         System.out.print("Aplicación:"+aplicacion);
         String version= "1.0.0";
         System.out.print("Versión:"+version);
         final float PI= 3.14159f;
         System.out.print("El valor de PI:"+PI);
         String usuario="Laura";
         System.out.print("Usuario actual:"+usuario);
         int nivel= 1;
         System.out.print("Nivel:"+nivel);
         int puntuacion2= 0;
         System.out.print("Puntuación:"+puntuacion2);
         usuario="Miguel";
         System.out.print("Usuario actualizado:"+usuario);
         nivel= 2;
         System.out.print("Nivel actualizado:"+nivel);
         puntuacion2= 150;
         System.out.print("Puntuación actualizada:"+puntuacion2);

         /*Ej 6: Operaciones aritméticas simples.
         Escrible un programa que declare dos variables numéricas, realice
         las operaciones básicas(+,-,*,/) y muestre los resultaso por consola
          */
         int numero1=10;
         System.out.print("Número 1:" +numero1);
         int numero2= 5;
         System.out.print("Número 2: "+numero2);
         int suma= numero1 + numero2;
         System.out.println("La suma es: "+suma);
         int resta= numero1 - numero2;
         System.out.println("La resta es: "+resta);
         int multiplicacion= numero1*numero2;
         System.out.println("La multiplicación es: "+multiplicacion);
         int division= numero1/numero2;
         System.out.println("La división es:"+division);

         /* Ej 7: Presentación personal.
         Crea un programa que almacene tu información personal(nombre,
         apellido, edad y ciudad) en varibale y muestre un mensaje de prestación
         por consola.
          */

        final String inicio1="Hola";
        System.out.print("¡"+inicio1+"!");
        final String nombre2= "Elena García";
        System.out.print("Me llamo "+nombre2);
        final int edad5= 24 ;
        System.out.print("Tengo " +edad5+ " años");
        final String ciudad2= "Barcelona";
        System.out.print("Vivo en "+ciudad2);

        /*Ej 8:Calculador de área de un rectángulo.Desarrolla un programa
        que calcule el área de un rectángulo. Declara varibales para la base
        y la altura, y muestra el resultado del cálculo.
         */

        int base= 5;
        System.out.print("Base del rectángulo:" +base);
        int altura2= 3;
        System.out.print("Altura del restángulo:" +altura2);
        int area = base*altura2;
        System.out.println("El área del restángulo es: "+area);

        /* Ej9: Información de un producto.
        Escribe un programa que almacene la información de un producto
        (nombre, precio, código y disponibilidad) y muestre estos datos
        formateados por consola.
         */

        String info="INFORMACIÓN DEL PRODUCTO";
        System.out.print("Título"+info);
        String nombre3="Auriculares Bluetooth";
        System.out.print("Nombre:"+nombre3);
        float precio2= 29.99f;
        System.out.print("Preecio:"+precio2);
        String codigo="AUR-2023";
        System.out.print("Código:"+codigo);
        boolean disponible= true;
        System.out.print("Disponible:"+disponible);


        /* Ej10: Conversión de temperaturas.
        Crea un programa que convierta una temperatura de grados Celsius
        a Fahrenheit.Usa una variable par la temperatura en Celsisu y
        muestra el resultado de la conversión.
        La fórmula para convertir de Celsius a Fahrenheit es:
        F=C*9/5+32.
         */

        int temperatura= 25;
        System.out.print("Temperatura en Celsius:"+temperatura);
        int fahrenheit= temperatura*9/5+32;
        System.out.println("Temperatura en Fahrenheit:"+fahrenheit);





















    }
}
