package practice;

import java.util.ArrayList;

public class task {
    static int c;
    public static void main(String[] args) {
        new task();
        ArrayList<String> list=new ArrayList<>();
        list.add("e");
        list.add("3");
        list.add("j");
        list.add("1");
        list.remove(1);
        list.add("2");
        list.add("i");
        list.remove("2");
        System.out.println(list);
        System.out.println(task.c);

    }
}
