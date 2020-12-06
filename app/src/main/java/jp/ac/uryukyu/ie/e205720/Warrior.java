package jp.ac.uryukyu.ie.e205720;

public class Warrior extends LivingThing {
    public Warrior(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }
    public void attackWithWeponSkill(LivingThing opponent){
        if (hitPoint > 0) {
            int damage = (int) (1.5 * attack);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
}