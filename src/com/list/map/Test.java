package com.list.map;

import java.util.*;

public class Test {
    public static void main(String[] args) {
//        牌
        List<String> number=new ArrayList<>();
        List<String> flower=new ArrayList<>();
//        数字牌
        number.add(2+"");
        number.add("A");
        number.add("K");
        number.add("Q");
        number.add("J");
        for (int i=10;i>=3;i--){
            number.add(i+"");
        }
        flower.add("🖤");
        flower.add("♥");
        flower.add("♣");
        flower.add("♦");
        List<String> card=get(number,flower);
        HashMap<Integer,String> map=getCard(card);
        Set<Integer> keys=map.keySet();
        List<Integer> list=new ArrayList<>();
        list.addAll(keys);
        Collections.shuffle(list);
        List<Integer> play1=new ArrayList<>();
        List<Integer> play2=new ArrayList<>();
        List<Integer> play3=new ArrayList<>();
        List<Integer> diPai=new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            if(i<list.size()-3){
                if(i%3==0){
                    play1.add(list.get(i));
                }else if(i%3==1){
                    play2.add(i);
                }else if(i%3==2){
                    play3.add(list.get(i));
                }
            }else {
                diPai.add(list.get(i));
            }
        }
        List<String> noP1=sort(play1,map);
        List<String> noP2=sort(play2,map);
        List<String> noP3=sort(play3,map);
        List<String> di=sort(diPai,map);
        System.out.println("玩家一:"+noP1);
        System.out.println("玩家二:"+noP2);
        System.out.println("玩家三:"+noP3);
        System.out.println("底牌:"+di);
    }

    public static List<String> sort(List<Integer> play,HashMap<Integer,String> map){
        Collections.sort(play);
        List<String> list=new ArrayList<>();
        for(int i=0;i<play.size();i++){
            Integer key=play.get(i);
            list.add(map.get(key));
        }
        return list;
    }

    public static List<String> get(List<String> number,List<String> flower){
        List<String> card=new ArrayList<>();
        for(String str:number){
            for(String s:flower){
                card.add(s+str);
            }
        }
        return card;
    }

    public static HashMap<Integer,String> getCard(List<String> card){
        HashMap<Integer,String> cardMap=new HashMap<>();
        cardMap.put(1,"大王");
        cardMap.put(2,"小王");
        for (int i=0;i<card.size();i++){
            int num=i+3;
            cardMap.put(num,card.get(i));
        }
        return cardMap;
    }
}
