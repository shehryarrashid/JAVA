package Week15;

import java.util.ArrayList;
import java.util.Scanner;

public class UserOps {

    private ArrayList<Integer> list = new ArrayList<Integer>();
    private int size;

    public UserOps(ArrayList<Integer> list){
        this.list.addAll(list);
        this.size = list.size();
    }

    public UserOps(int size) throws Exception {
        if(size > 0) {
            this.size = size;
            for (int i = 0; i < size; i++) {
                list.add(i);
            }
        }
        else {
            throw new Exception("Invalid Size, Object Not Created\n");
        }
    }
    public UserOps(){
        this.size = 5;
        for (int i = 0 ; i < size; i++){
            this.list.add(i);
        }
    }

    public void createArray(){
        for (int i = 0; i < this.size; i++){
            System.out.println("Enter Value in pos: " + i);
            this.list.set(i,askNumber());
        }
    }
    public int askNumber() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        try {
            num = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Wrong Input");
            askNumber();
        }
    return num;
    }

    @Override
    public String toString() {
        return
                "list=" + list ;
    }

    public int getSize() {
        return size;
    }

    public ArrayList<Integer> getList() {
        return list;
    }
}
