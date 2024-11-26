public class Main {

    public static int calculatePunchDamage(int strength) {
        return strength * 2;
    }

    public static int calculateSpecialAttackDamage(
            int strength, String attacktype) {
        int damage = strength;
        if (attacktype.equals("Fire Punch")) {
            damage *= 3;
        } else if (attacktype.equals("Ice Blast")) {
            damage *= 2;
        }
        return damage;
    }

    public static void main(String[] args) {
        int villainHealth = 100;
        int punchStrength = 20;
        String attackType = "Fire Punch";

        int damageByPunch = calculatePunchDamage(punchStrength);
        int damageBySpecialAttack = calculateSpecialAttackDamage(punchStrength, attackType);

        System.out.println("Enemy was hit by the amount of " + damageByPunch);
        System.out.println("Villain got beaten by " + damageBySpecialAttack + " powerful damage! Whoo!");
    }
}