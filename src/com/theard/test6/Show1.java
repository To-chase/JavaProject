package com.theard.test6;

public class Show1 {
    int count=1;
    public void show()throws Exception{
        for (int i = 0; i <20 ; i++) {
            synchronized (this){
                while (count!=1){
                    this.wait();
                }
                Thread.sleep(1000);
                System.out.println("我是中国人");
                count=2;
                this.notifyAll();
            }
        }
    }

    public void show3()throws Exception{
        for (int i = 0; i <20 ; i++) {
            synchronized (this){
                while (count!=2){
                    this.wait();
                }
                Thread.sleep(1000);
                System.out.println("犯我中华者");
                count=3;
                this.notifyAll();
            }
        }
    }

    public void show2()throws Exception{
        for (int i = 0; i <20 ; i++) {
            synchronized (this){
                while (count!=3){
                    this.wait();
                }
                Thread.sleep(1000);
                System.out.println("虽远必诛");
                count=1;
                this.notifyAll();
            }
        }
    }
}
