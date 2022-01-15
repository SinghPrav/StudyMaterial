package templatedesign

class Chess : GameAbstract() {
    public override fun initialize() {
        println("templatedesign.Chess Game Initialized! Start playing.")
    }

    public override fun start() {
        println("Game Started. Welcome to in the chess game!")
    }

    public override fun end() {
        println("Game Finished!")
    }
}