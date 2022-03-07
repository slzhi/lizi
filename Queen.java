public class Queen {
    int[] arr = new int[8];
    static  int sum = 0;

    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.put(0);
        System.out.println(sum);

    }

    public void put(int a) {
        for (int i = 0; i < 8; i++) {
            if(a == 8){
                printIn();

                return;
            }
            arr[a] = i;
            if (jueen(a)) {

                put(a + 1);
            }
        }
    }

    public boolean jueen(int a) {
        for (int i = 0; i < a; i++) {
            if (arr[i] == arr[a] || Math.abs(a - i) == Math.abs(arr[i] - arr[a])) {
                return false;
            }
        }
        return true;
    }

    public void printIn(){
       for(int i=0;i< arr.length;i++){
           System.out.print(arr[i]+" ");
       }
        sum++;
        System.out.println();

    }
}
