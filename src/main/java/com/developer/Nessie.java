package com.developer;

public class Nessie {
    public static boolean isLockNessMonster(String s){
        //FIND THE LOCH NESS MONSTER. SAVE YOUR TREE FIDDY
        return s.contains("tree fiddy") || s.contains("3.50");
    }
    
    public static void main(String[] args) {
        String s = "I'm from Scottland. I moved here to be with my family sir. Please, $3.50 would go a long way to help me find them";
        boolean lockNessMonster = isLockNessMonster("Yo, I heard you were on the lookout for Nessie. Let me know if you need assistance.");
        System.out.println(lockNessMonster);
        System.out.println(isLockNessMonster(s));
    }
}
