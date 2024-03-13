package tallerEstrategy;

public class Military {
    private Attack attack;
    private Move move;

    public Military(Attack attack, Move move) {
        this.attack = attack;
        this.move = move;
    }

    public void performAttack() {
        attack.attack();
    }

    public void performMove() {
        move.move();
    }
}

