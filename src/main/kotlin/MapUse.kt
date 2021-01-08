fun main(){
    //변경 가능한 Map을 생성
    var map = mutableMapOf<String, Any>()
    //번호와 이름을 저장
    map.put("num", 1)
    map.put("name", "아담")
    //번호와 이름을 출력
    println("번호:${map.get("num")}")
    println("이름:${map["name"]}")

    //주소를 추가
    map.put("address", "서울")

    //전체 데이터를 출력
    for(key in map.keys){
        print("${key}:${map[key]}\t")
    }
    println()
}