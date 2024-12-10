public class LOTR {
    public static void main(String[] args) {
        // Attributes of Hero 1: Legolas
        LOTRHero arrowMan = new LOTRHero();
        arrowMan.name = "Legolas";
        arrowMan.strength = 120;
        System.out.println("Name of the Hero: " + arrowMan.name);

        int punchDamage = arrowMan.calculatePunchDamage();
        System.out.print("Ouch, your bow caused "
                + punchDamage + "% damage.");

        // Attributes of Hero 1: Aragorn
        LOTRHero swordMan = new LOTRHero();
        swordMan.name = "Aragorn";
        swordMan.strength = 150;

        int specialAttackDamage =
                swordMan.calculateSpecialAttackDamage("sword");
        System.out.print("Your sword caused " + specialAttackDamage + "% damage.");
    }
}

