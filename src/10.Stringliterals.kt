fun main() {


    //Escaped Strings
    /**
        \t - Inserta tabulación
        \b - Inserta backspace
        \n - Inserta salto de linea
        \r - Inserta retorno de carro
        \' - Inserta comilla simple
        \" - Inserta comilla doble
        \\ - Inserta diagonal invertida
        \$ - Inserta símbolo dólar
     */
    var string="hola mundo\n\'minombre\'\t\"apellido\""
    print(string+"\n");
    var texto="mi\b texto \\ "
    print(texto)



    //String raws (cadenas puras)
     var pura ="""
         #%hola
         #%como
         #%estas
         \n
         \b
     """.trimIndent()
    print("\n"+pura.trimMargin("#%"))
}