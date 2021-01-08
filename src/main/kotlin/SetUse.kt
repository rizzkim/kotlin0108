fun main(){
    val touches = setOf<String>(
        "Java Basic", "Database", "Web Front End",
        "Java Web Programming", "Java Framework",
        "Kotlin", "Android", "Swift", "iOS"
    )

    for(study in touches){
        print("${study}\t")
    }
    println()

    //하나 꺼내서 출력하기
    println("${touches.first()}")
}