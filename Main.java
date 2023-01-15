import java.util.*;
public class Main{
public static void main(String[] args){
int sum =0;
ArrayList <Integer> arrayList = new ArrayList<>();
arrayList.add(10);
arrayList.add(40);
arrayList.add(30);
arrayList.add(20);
for(Integer ele : arrayList){
sum +=ele;
}
System.out.println("Sum of all the elements of an array: " + sum);
}
}
