package class07;

public class Task01 {
    public static void main(String[] args) {
        /*Create a boolean variable workDay and assign true create int variable day and assign it to 1
        As long as it is workDay print “I need a day off” and increase day.
                Once day is 6 print “I do not need a day off any more”*/

        boolean workDay=true;
        int day=1;
        while (workDay){
            if(day<=5){
                System.out.println("I need a day off");
            }else{
                System.out.println("I do not need a day off anymore");
                workDay=false;
            }
            day=day+1; // it is equal to day=day+1 day+1
        }

        System.out.println("******************************");


        for (int i=1; i<20; i+=2) {
            System.out.println(i);
        }

        System.out.println("*******************************");



        for (int num=1;num<20;num=num+2){
            System.out.println(num);

        }
        }

    }

