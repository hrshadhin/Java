/**
* Created by 0xAX on 3/10/2015.
*/
public class goldenRatio {
public static void main(String[] args) {
System.out.println("The Golden Ratio:");//fibonacci series
long i=0,j=1,k=0,l;
System.out.print(i+","+j);
for(l=0;l<100;l++){
k=i+j;
System.out.print(","+k);
i=j;
j=k;
}
System.out.println(" ...");
}
