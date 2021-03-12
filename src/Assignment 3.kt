fun main(){
text()

println(join("sharon",22))
    println(strings("Sharon"))
    println(act("Sharon","That's me!"))
}
fun text(){
    val text="akiraChix"
    var first=text[0]
    var third=text[2]
    var fourth=text[3]

    println("$first$third$fourth")

}
fun join(name:String,age:Int):String{
    return "Hi my name is " + name + " and i am " + age + " years old"
}
fun strings(name:String):Int{
    var lengthOfString= name.length
    return lengthOfString


}
fun act(name:String,answer:String) {
    if (name=="Sharon") {
        println(answer)
    }
    else{
        println("I don't know who that is")
    }
}