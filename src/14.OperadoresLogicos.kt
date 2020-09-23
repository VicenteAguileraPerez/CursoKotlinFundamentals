
fun main()
{
    var bool1:Boolean=true //1
    var bool2:Boolean=false//0

    println(bool1.and(bool2))//1 && 0 = 0 false
    println(bool1 && bool2.not()) //1 && 1=1 true
    println(!bool1 and bool2 )//0 && 0 =0 false

    println(bool1.not())//0 false
    println(!bool2)//1 true

    println(bool1.or(bool2))//1 || 0 = 1 true
    println(bool1.not() || bool2)//0  || 0 = 0 false
    println( (bool1 or bool2).not() ) //!(1 || 0) = !1=0 false  nor

    println(bool1.xor(bool2))//1 xor 0 = 1 true
    println(  (bool1 xor  bool2).not() )// !(1 xor 0)=!(true)=false xnor
}