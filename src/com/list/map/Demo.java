package com.list.map;

import com.sun.scenario.effect.impl.state.LinearConvolveRenderState;

import java.util.*;

public class Demo {
    public static void main(String[] args){
        HashMap<Integer,String> cardList=cardList();
//        打乱牌
        ArrayList<Integer> list=shuff(cardList);
//        玩家
        HashMap<Integer,String> play1=new HashMap<>();
        HashMap<Integer,String> play2=new HashMap<>();
        HashMap<Integer,String> play3=new HashMap<>();
        HashMap<Integer,String> diPai=new HashMap<>();
        for(int i=0;i<list.size();i++){
            Integer index=list.get(i);
            String card=cardList.get(index);
            if(i<list.size()-3){
                if(i%3==0){
                    play1.put(index,card);
                }else if(i%3==1){
                    play2.put(index,card);
                }else if(i%3==2){
                    play3.put(index,card);
                }
            }else {
                diPai.put(index,card);
            }
        }
        System.out.println("玩家一:"+sort(play1));
        System.out.println("玩家二:"+sort(play2));
        System.out.println("玩家三:"+sort(play3));
        System.out.println("底牌:"+sort(diPai));
//        print(cardList);
    }

//    54张牌
    public static HashMap<Integer,String> cardList(){
        HashMap<Integer,String> cardList=new HashMap<>();
//        花色
        List<String> flower=new ArrayList<>();
        flower.add("♠");
        flower.add("♥");
        flower.add("♣");
        flower.add("♦");
//        牌
        List<String> number=new ArrayList<>();
        number.add("2");
        number.add("A");
        number.add("K");
        number.add("Q");
        number.add("J");
        for (int i=10;i>2;i--){
            number.add(i+"");
        }
        int count=1;
        cardList.put(count,"大王");
        cardList.put(++count,"小王");
        for (String str:number){
            for (String s:flower){
                String strs=s+str;
                cardList.put(++count,strs);
            }
        }
        return cardList;
    }
//    打印牌
    public static void print(HashMap<Integer,String> map){
        Set<Integer> keys=map.keySet();
        for(Integer key:keys){
            System.out.print(map.get(key)+" ");
        }
        System.out.println();
    }
//    打乱牌
    public static ArrayList<Integer> shuff(HashMap<Integer,String> map){
        Set<Integer> keys=map.keySet();
        ArrayList<Integer> cardList=new ArrayList<>();
        cardList.addAll(keys);
        Collections.shuffle(cardList);
        return cardList;
    }

//     玩家的牌排序
    public static LinkedHashMap<Integer,String> sort(HashMap<Integer,String> map){
        LinkedHashMap<Integer,String> sortList=new LinkedHashMap<>();
        Set<Integer> key=map.keySet();
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(key);
        Collections.sort(list);
        for(Integer num:list){
            sortList.put(num,map.get(num));
        }
        return sortList;
    }
}
