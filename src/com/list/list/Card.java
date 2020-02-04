package com.list.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Card {
    public static void main(String[] args) {
        List<String> flower = new ArrayList<>();
        List<String> number = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            number.add(i + "");
        }
        number.add("J");
        number.add("Q");
        number.add("K");
        flower.add("🖤");
        flower.add("♥");
        flower.add("♣");
        flower.add("♦");
        List<String> card = new ArrayList<>();
        for (int i = 0; i < number.size(); i++) {
            for (int j = 0; j < flower.size(); j++) {
                if (number.get(i).equals("1")) {
                    card.add(flower.get(j)+"A");
                } else {
                    card.add(flower.get(j) + number.get(i));
                }
            }
        }
//        card.add("A");
        card.add("大王");
        card.add("小王");
//       打乱牌
        Collections.shuffle(card);
//        System.out.println(card);
//        发牌
        List<String> play1=new ArrayList<>();
        List<String> play2=new ArrayList<>();
        List<String> play3=new ArrayList<>();
//        底牌
        List<String> diPai=new ArrayList<>();
        for (int i = 0; i <card.size() ; i++) {
            int num=i+1;
            if(num<=card.size()-3){
                if(num%3==1){
                    play1.add(card.get(i));
                }else if(num%3==2){
                    play2.add(card.get(i));
                }else {
                    play3.add(card.get(i));
                }
            }else {
                diPai.add(card.get(i));
            }
        }
        System.out.println("玩家一:"+play1);
        System.out.println("玩家二:"+play2);
        System.out.println("玩家三:"+play3);
        System.out.println("底牌:"+diPai);
    }
}
