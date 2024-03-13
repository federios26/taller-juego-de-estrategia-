package tallerEstrategy;

public class Main {

    public static void main(String[] args) {
  
        Attack meleeAttack = new MeleeAttack();
        //ataque cuerpo a cuerpo//
        Attack rangedAttack = new RangedAttack();
        //ranged attack//
        Move walkMove = new WalkMove();
        //caminar//
        Move horseMove = new HorseMove();
        //movimiento de caballo//

       
        Military soldier = new Military(meleeAttack, walkMove);
        Military archer = new Military(rangedAttack, walkMove);
        Military knight = new Military(meleeAttack, horseMove);

        // Realizar acciones
        System.out.println("Soldado:");
        soldier.performAttack();
        soldier.performMove();

        System.out.println("\nArquero:");
        archer.performAttack();
        archer.performMove();

        System.out.println("\nCaballero:");
        knight.performAttack();
        knight.performMove();
    }
}
