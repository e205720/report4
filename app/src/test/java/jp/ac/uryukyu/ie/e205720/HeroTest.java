package jp.ac.uryukyu.ie.e205720;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    @Test
    void attackTest() {
        int defaultHeroHp = 100;
        Warrior demoHero = new Warrior("デモ勇者", defaultHeroHp, 10);
        Enemy slime = new Enemy("スライムもどき", 100, 10);
        for (int i = 0; i < 3; i++){
            demoHero.attackWithWeponSkill(slime);
            slime.attack(demoHero);
        }
        assertEquals(55, slime.getHitPoint());
    }
}