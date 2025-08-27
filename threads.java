public class threads {
    public static void main(String[] args){
        Thread oddThread = new Thread(()->{
            for(int i = 1; i<=10;i++){
                if(i%2!=0)
                System.out.println("odd: "+i);
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }
            }
        });
        Thread evenThread = new Thread(()->{
            for(int i = 1; i<=10;i++){
                if(i%2==0)
                System.out.println("even: "+i);
                try {
                    Thread.sleep(1000);
                } 
                catch (Exception e) {
                }
            }
        });
        try {
            oddThread.start();
            oddThread.join();
            evenThread.start();
        } catch (Exception e) {
        }
    }
}
