package multi;


public class MultiThreadSum {

    static void sum (int[] arr, int threadNumber){
        int size = arr.length/threadNumber;
        int res = 0;
        for (int i = 0; i<threadNumber; i++){
            int begin = size*i;
            int end = ((i+1)*size);
            if ((end-begin)<size){
                end = threadNumber;
            }
            SingleThreadSum s = new SingleThreadSum(arr, begin, end);
            s.run();
            res += s.getSum();

        }

        System.out.println(res);

    }
}
