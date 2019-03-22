package arena;

public class Rouge extends Character{

	public int dexterity = 20;
	
	public Rouge() {
		super();
		this.strength = 8;
		this.defense = 4;
		this.health = 100;
	}
	public int attack(Character target){
			boolean criticalHit =  ( Arena.generator).nextInt(100) < dexterity;
			int damage = this.strength * 2;
        if(criticalHit){
            damage *= 2;
            System.out.println("*** Critical Hit ***");
        }
        int damageDealt = target.takeDamage(damage);
        return damageDealt;        
	}
	
}
