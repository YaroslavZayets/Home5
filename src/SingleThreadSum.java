package multi;


public class SingleThreadSum implements Runnable {
    private int[] arr;
    private int begin;
    private int end;
    private int sum;


    public SingleThreadSum (int[] arr, int begin, int end){
        this.arr=arr;
        this.begin = begin;
        this.end = end;
    }


    public int getSum() {
        return sum;
    }

    @Override
    public void run(){
        for (int i = begin; i<end; i++){
            sum +=arr[i];
        }
    }

}
