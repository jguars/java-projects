public class LOTRHero {

    // properties of a Hero
    String name = "Hero";
    int strength = 20;
    int health = 100;

    public int calculatePunchDamage() {
        return strength * 2;
    }

    public int calculateSpecialAttackDamage(String attacktype) {
        int damage = strength;
        if (attacktype.equals("arrow")) {
            damage *= 2;
        } else if (attacktype.equals("sword")) {
            damage *= 3;
        }
        return damage;
    }
}
