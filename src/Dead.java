public class Dead implements Runnable {

    public boolean flag ;
    public Dead(){}
    public Dead(boolean f){
        this.flag=f;
    }
    public void run(){
        while (true){
            if(flag){
                //aadd
                synchronized (Lock.loke1){
                    System.out.println("1 lock1");
                    synchronized (Lock.loke2){
                        System.out.println("1 lock2");
                    }
                }
            }else{
                synchronized (Lock.loke2){
                    System.out.println("2 lock2");
                    synchronized (Lock.loke1){
                        System.out.println("2 lock1");
                    }
                }
            }
        }
    }
}
class Lock{
    static Object loke1=new Object();
    static Object loke2=new Object();
}
