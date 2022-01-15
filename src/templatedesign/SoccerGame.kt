package templatedesign

class Soccer : GameAbstract() {
    public override fun initialize() {
        println("templatedesign.Soccer Game Initialized! Start playing.")
    }

    public override fun start() {
        println("Game Started. Welcome to in the templatedesign.Soccer game!")
    }

    public override fun end() {
        println("Game Finished!")
    }
}