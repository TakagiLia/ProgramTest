fun main(args: Array<String>) {

    // 棋譜のリストを取得
    val gameRecodes: List<String> = readLine()?.toList()?.map { it.toString() } ?: emptyList()

    // 石のリストを作成
    val stones: MutableList<StoneType> = mutableListOf(StoneType.BLACK, StoneType.WHITE)

    for (index in gameRecodes.indices) {
        // 新しく追加する石を取得
        val newStone =
            if (index % 2 == 0) {
                // 奇数番目の要素（0から始まるので偶数インデックス）
                StoneType.BLACK
            } else {
                // 偶数番目の要素（0から始まるので奇数インデックス）
                StoneType.WHITE
            }

        // 左右どちらに追加するかを棋譜のリストから取得する
        val gameRecode = gameRecodes[index]

        // gameRecodeによって追加位置を変更
        when (gameRecode) {
            "L" -> {
                // 左の場合はリストの先頭に追加する
                stones.add(0, newStone)
            }
            "R" -> {
                // 右の場合はリストの最後に追加する
                stones.add(newStone)
            }
        }

        // 最初の石と最後の石が同じ場合は全て同じ石に変更
        if (stones.first() == stones.last()) {
            stones.replaceAll { newStone }
        }

    }

    // 白の数と黒の数を集計
    val black = stones.count { it == StoneType.BLACK }
    val white = stones.count { it == StoneType.WHITE }

    // 出力
    println("$black $white")
}

enum class StoneType {
    BLACK, WHITE
}