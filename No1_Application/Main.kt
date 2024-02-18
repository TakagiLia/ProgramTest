fun main(args: Array<String>) {
    // 標準入力
    val squareCount = readLine()!!.toInt()

    // サイコロの最大出目
    val max = 6

    // 双六のスタート位置
    val startCount = 1

    // 残りの移動数
    val reamingCount = squareCount - startCount

    // 最大出目でのサイコロの実行回数
    var executeCount = reamingCount / max

    // あまりマス数がある場合は実行回数をプラス一回する
    if (reamingCount % max != 0) {
        executeCount++
    }

    // 結果
    print(executeCount)
}