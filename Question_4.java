package Internpe.Task2;

public class Question_4 {
    public static void main(String[] args) {
        String s1 = "* * * * * * ==================================";
        String s2 = " * * * * *  ==================================";
        String s3 = "==============================================";
        for (int i=0; i<4; i++){
            System.out.println(s1+"\n"+s2);
        }
        System.out.println(s1);
        for (int j=0; j<6; j++){
            System.out.println(s3);
        }
    }
}
