data class Item(
    val num:Int, val name:String, val price:Int){}

fun main(){
    val list = listOf<Item>(
        Item(1,"와이셔츠",30000),
        Item(2, "티셔츠", 15000),
        Item(3, "자켓", 100000),
        Item(4, "롱패딩", 250000),
        Item(5, "숏패딩", 150000)
    )

    //30000이 넘는 데이터만 추출
    println("30000 초과 : ${list.filter({it.price > 30000})}")
    //100000 ~ 150000 사이인 데이터 추출
    println("100000~150000 : ${list.filter({it.price >= 100000 && it.price <= 150000})}")
    //롱패딩과 숏패딩에 해당하는 데이터만 조회
    val keywords = mutableListOf<String>()
    keywords.add("롱패딩")
    keywords.add("숏패딩")
    println("롱패딩 또는 숏패딩:"+"${list.filter({it.name in keywords})}")

    //셔츠가 포함된 데이터만 추출 - 와이셔츠와 티셔츠 검색
    println("셔츠가 포함된 데이터:"+"${list.filter({it.name.indexOf("셔츠") >= 0})}")

    println(list.drop(2))
    println(list.take(2))
    println(list.slice(1..3))

    //list에서 name만 추출해서 새로운 컬렉션 만들기
    println("${list.map({it.name})}")

    //시퀀스 생성
    var sequence = generateSequence(1){it+1}

    //시퀀스에서 5개만 출력
    println(sequence.take(5).toList())
}