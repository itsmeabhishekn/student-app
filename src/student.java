import java.util.Scanner;
import java.util.ArrayList;
class student{

    String name;
    int adm_no;
    int roll_no;
    String college;

    student(String name,int adm_no,int roll_no,String college){
        this.name=name;
        this.adm_no = adm_no;
        this.roll_no = roll_no;
        this.college = college;
    }

    void display(){
        System.out.println("name: "+name);
        System.out.println("admission no: "+adm_no);
        System.out.println("Roll No: "+roll_no);
        System.out.println("college: "+college);
        System.out.println();
        System.out.println("-------------");

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<student> stud_list = new ArrayList<student>();

        while(true){
            System.out.println("Student");
            System.out.println("-------------");
            System.out.println();
            System.out.println("1:Add Student");
            System.out.println("2:View Student");
            System.out.println("3:Search Student");
            System.out.println("4:Delete Student");
            System.out.println("5:Exit");
            System.out.println();
            System.out.println("-------------");


            int choice=sc.nextInt();


            switch(choice){
                case 1:

                    Scanner sc1 =new Scanner(System.in);

                    System.out.println("name: ");
                    String name = sc1.nextLine();

                    System.out.println("admission no: ");
                    int adm_no = sc1.nextInt();

                    System.out.println("Roll no: ");
                    int roll_no = sc1.nextInt();

                    System.out.println("College name: ");
                    String college = sc1.next();

                    stud_list.add(new student(name, adm_no, roll_no, college));
                    break;


                case 2:{

                    for(student i:stud_list){
                        i.display();
                    }
                    break;



            }

                case 3:{
                    System.out.println("Enter Admission No: ");
                    int ad_no=sc.nextInt();

                    for(student i:stud_list){
                        if(i.adm_no == ad_no){
                            i.display();
                            break;
                        }
                    }
                    break;
        }
    }
}