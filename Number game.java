import java.util.Scanner;
import java.util.Random;
public class Task1{
public static void main(String args[])
{
Random r=new Random();
Scanner ob=new Scanner(System.in);
int num=r.nextInt(100);
int attempt=0;
while(attempt<5){
System.out.println("enter your guess number");
int a=ob.nextInt();
attempt++;
if(a>(num+1)){
System.out.println("guess is high");
}
else if(a<(num+1)){
System.out.println("guess is low");
}
else if(a==(num+1)){
System.out.println("guess is correct");
System.out.println("genreted numbers is :"+(num+1));
if(attempt==1){
System.out.println("you scored 100%");
}
else if(attempt==2){
System.out.println("you scored 90%");
}
else if(attempt==3){
System.out.println("you scored 80%");
}
else if(attempt==4){
System.out.println("you scored 70%");
}
else if(attempt==5){
System.out.println("you scored 60%");
}
System.exit(0);
}
}

System.out.println("sorry the genreted numbers is :"+(num+1));

}
}