class GameNode {
    // Declareer hier de attributen die je nodig hebt
    private GameNode three;
    private GameNode one;
    private int remaining;
    private boolean playerATurn;

    public GameNode(int marbles, boolean playerATurn) {
        remaining = marbles;
        this.playerATurn = playerATurn;
        if (marbles > 0) {
            if (playerATurn) {
                playerATurn = false;
            } else {
                playerATurn = true;
            }
            this.one = new GameNode(marbles - 1, playerATurn);
            this.three = new GameNode(marbles - 3, playerATurn);
        }
        // Geef je attributen een waarde en maak children als dat nodig is

    }

    public int countPlayerWins (boolean playerA) {
    // Deze methode telt het aantal keer dat speler A wint als de boolean parameter true is, anders telt // de methode het aantal keer dat speler B wint.
    // Tel hier recursief hoe vaak de gevraagde speler wint
        if(this.one != null) {
            return this.one.countPlayerWins(playerA) + this.three.countPlayerWins(playerA);
        } else {
            if(playerATurn != playerA) return 1;
            return 0;
        }
    }
}