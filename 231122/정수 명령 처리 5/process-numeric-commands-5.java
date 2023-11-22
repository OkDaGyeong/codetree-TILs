import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.nextLine(); // Consume the newline character after reading N

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i < N; i++){
            String ment[] = in.nextLine().split(" ");
            switch(ment[0]){
                case "push_back":
                    arr.add(Integer.parseInt(ment[1]));
                    break;
                case "pop_back":
                    if (!arr.isEmpty()) {
                        arr.remove(arr.size() - 1);
                    }
                    break;
                case "size":
                    System.out.println(arr.size());
                    break;
                case "get":
                    int index = Integer.parseInt(ment[1]) - 1;
                    if (index >= 0 && index < arr.size()) {
                        System.out.println(arr.get(index));
                    }
                    break;
            }
        }
    }
}