fun main(args:Array<String>){
    //데이터를 변경할 수 있는 String의 List를 생성
    var os = mutableListOf<String>()

    //데이터를 4개 삽입
    os.add("android")
    os.add("iOS")
    os.add("webOS")
    os.add("Tizen")

    //데이터를 순회
    for(temp in os){
        print("${temp}\t")
    }
    println()

    //앞의 2개만 출력
    var start=0
    for(i in start..start+1){
        print("${os.get(i)}\t")
    }
    println()

    //다음 2개 출력
    start = start+2
    for(i in start..start+1){
        print("${os.get(i)}\t")
    }
    println()

    //중간 데이터를 수정하거나 삭제
    os.set(0, "ios")
    os.removeAt(3)
    println(os)
}