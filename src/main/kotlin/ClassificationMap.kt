fun main(){
    var riderm = arrayListOf<String>(
        "권도영", "차명진", "조종빈", "석유진" )
    var riderw = arrayListOf<String>(
        "문형경", "김진희", "류민정", "이수빈" )

    //2차원 배열 생성
    var rider = mutableListOf<List<String>>(riderm, riderw)

    //데이터 목록을 추가하면 출력 부분을 수정해야 합니다.
    val riderj = arrayListOf<String>(
        "홍승아", "이시윤")
    rider.add(riderj)


    //2차원 배열 출력
    for(idx in rider.indices){
        if(idx==0)
            print("남성라이더:")
        else
            print("여성라이더:")
        println(rider.get(idx))
    }
    println()

    //Map의 List 생성
    val riderMap = mutableListOf<MutableMap<String,Any>>()
    val map1 = mutableMapOf<String,Any>()
    map1.put("name", "남성라이더")
    map1.put("rider", riderm)
    riderMap.add(map1)

    val map2 = mutableMapOf<String,Any>()
    map2.put("name", "여성라이더")
    map2.put("rider", riderw)
    riderMap.add(map2)

    val map3 =mutableMapOf<String, Any>()
    map3.put("name", "주니어라이더")
    map3.put("rider", riderj)
    riderMap.add(map3)

    //출력
    for(map in riderMap){
        print("${map.get("name")}:")
        //Any로 만들어진 데이터를 출력하는 것이 아닌 목적으로
        //사용하는 경우는 원래의 자료형으로 형변환해서 사용해야 합니다.
        for(person in map.get("rider") as List<String>){
            print("${person}\t")
        }
        println()
    }
}