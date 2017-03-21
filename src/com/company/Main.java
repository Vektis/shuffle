package com.company;
import java.io.IOException;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{
	// write your code here
        Scanner sf = new Scanner(new File("/Users/vianrosal/IdeaProjects/shuffle/src/class.txt"));
        ArrayList<String> ar = new ArrayList();
        while(sf.hasNext()){
            ar.add(sf.next());
        }
        System.out.println(ar);
        ArrayList<String> ar2 = new ArrayList();
        Random r = new Random();
        int i = 0;
        while(!ar.isEmpty()){

                i = r.nextInt(ar.size());
            String temp  =  ar.get(i);
            ar2.add(temp);
            ar.remove(temp);
        }

        System.out.println("thing");
        System.out.println(ar2);
        FileWriter fw = new FileWriter("/Users/vianrosal/IdeaProjects/shuffle/src/class.txt");
        PrintWriter op = new PrintWriter(fw);
        for(String s : ar2){
            op.println(s);
        }
        op.close();
       fw.close();
        sf.close();

    }
}
