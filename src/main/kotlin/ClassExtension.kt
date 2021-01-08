class Super{
    open fun method(){
        println("상위 클래스의 메소드")
    }
}

//상속을 통해서 기능을 확장
/*
class Sub:Super(){
    fun disp(){
        println("클래스 기능 확장")
    }
}
 */

//클래스의 기능 확장
fun Super.disp(){
    println("클래스 기능 확장")
}
fun main(){
    //val sub : Sub = Sub()
    //sub.disp()

    val superExt = Super()
    superExt.disp()
}