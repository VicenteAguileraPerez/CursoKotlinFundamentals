fun main()
{
    var int:Int
    var string:String
    val iva=0.16f

    int=500
    string="Pantalón"

    var string2="El $string cuesta \$$int pesos"
    var string3="El iva del $string es: \$${int*iva}"
    println(string2)
    println(string3)
    print("El precio final del $string es de \$${int+(int*iva)}")

    var pura ="""
         #%hola
         #%como
         #%estas
         #%$string
         $int
         $iva
         \n
         \b
     """.trimIndent()
    print("\n"+pura.trimMargin("#%"))

}














/*
*
*
*
* */