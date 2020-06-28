fun main()
{
    //Las cadenas están representadas por el tipo String
    // Los elementos de un String son caracteres y puede acceder a ellos por el operador de indexación s[i].

    var nombre:String = "Vicente Aguilera"
    println(nombre)
    println("Caracter en la pos 10 ="+nombre[1]) //i=length-1 como max y como minimo 0

     //propiedades de los Strings
     //.length permite conocer cuántos caracteres hay en la cadena
     //+ permite concatenar o unir 2 cadenas o más
     // operador de indexación s[i].
     println("hola".length)
     var cantLetras:Int = nombre.length
     println("La cantidad de letras de "+nombre+" es: "+cantLetras)

    //metodos principales de la clase String
    //Cadena1.plus(Cadena1) tiene la misma funcionalidad que el signo +, esto es concatenar
     var saludo:String="Hola "
     var concatenarConFuncion:String= saludo.plus(nombre).plus("!!!!")
     println(concatenarConFuncion)
    //cadena.get(pos)-> permite conocer el Char de la posicion especificada de la cadena
     println("La letra en la pos 2 de la cadena ".plus(saludo)+"es :"+saludo.get(2))
    //cadena.subString(posInicio)-> permite crear una subcadena de la cadena desde la
    // posición especificada hasta el final de la cadena
    var cadena:String = "La letra en la pos 2 de la cadena "
    println(cadena.substring(9))
    //cadena.subString(posInicio, posFinal)-> permite crear una subcadena de la cadena desde la posInicio especificada hasta PosFinal-1
     println(cadena.substring(0,10)) //[a,b)
    //cadena.capitalize() cambia la primera letra del texto a mayúscyla
    var nombrePropio:String="paulina"
    println(nombrePropio.capitalize())
    //cadena.decapitalize() cambia la primera letra del texto a minúscula
     var nombrePropio2:String="Vicente"
    println(nombrePropio2.decapitalize())
    //cadena.toUpperCase() cambia todas las letras del texto a mayúsculas
    println(nombrePropio.toUpperCase())
    //cadena.toLowerCase() cambia todas las letras del texto a minúsculas
    nombrePropio2="VICENTE"
    println(nombrePropio2.toLowerCase())
}
