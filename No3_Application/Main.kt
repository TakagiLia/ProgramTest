fun main(args: Array<String>) {

    //numbersリスト取得
    val numbers = readLine()?.toList()?.map { it.toString() }!!.sorted().toMutableList()

    //numbersで0の次に小さい数を取得
    val movingTarget = numbers.first{ it != "0" }

    //numbersからmovingTargetを除去
    numbers.remove(movingTarget)

    //movingTargetを先頭に置き換える
    numbers.add(0,movingTarget)

    //文字列に変換して出力
    println(numbers.joinToString(separator = ""))

}