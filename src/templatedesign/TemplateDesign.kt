package templatedesign

fun main(){
    var game: GameAbstract = Chess()
    game.play()
    println()
    game = Soccer()
    game.play()

}
