package chapter8;

import java.util.ArrayList;
import java.util.Scanner;

public class Entry {
    Scanner input = new Scanner(System.in);
    public ArrayList<String> entry;

    private String title;
    private String body;

    public void add(String title, String body) {
        this.title = title;
        this.body = body;
        System.out.println("Enter title: ");
        title = input.nextLine();
        System.out.println("Enter body: ");
        body = input.nextLine();
        entry.add(0, body);

    }


}
