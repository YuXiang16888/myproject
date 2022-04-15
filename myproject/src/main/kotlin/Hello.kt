fun main(args: Array<String>) {
//    println("Hello Kotlin")
    var human = Human()
    human.hello()
    val age:Int = 19;//value 不可變
    var age2:Int = 19;//variable 變數 可變的
    age2 = 20;
    val name:String;
    name = "Xiang";
}

class Human{
    fun hello(){
        println("Hello Kotlin")
    }
}