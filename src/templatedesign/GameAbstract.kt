package templatedesign

abstract class GameAbstract {
    abstract fun initialize()
    abstract fun start()
    abstract fun end()
    //template method
    fun play() { //initialize the game
        initialize()
        //start game
        start()
        //end game
        end()
    }
}