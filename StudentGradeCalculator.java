import java.util.*;
class StuGradeCalc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double eng,maths,chem,phy,bio,totalMarks=0,avg;
        System.out.println("Enter the marks obtained by student in eng : ");
        eng=sc.nextDouble();
        System.out.println("Enter the marks obtained by student in maths : ");
        maths=sc.nextDouble();
        System.out.println("Enter the marks obtained by student in chem : ");
        chem=sc.nextDouble();
        System.out.println("Enter the marks obtained by student in phy : ");
        phy=sc.nextDouble();
        System.out.println("Enter the marks obtained by student in bio : ");
        bio=sc.nextDouble();
        totalMarks=(eng+maths+chem+phy+bio);
        avg=totalMarks/5;
        if(avg<=99&&avg>=89)
        
            System.out.println("GRADE : A+");
        else if(avg<=89&&avg>=79)
            System.out.println("GRADE : B+");
        else if(avg<=79&&avg>=59)
            System.out.println("GRADE : C+");
        else if(avg<=59&&avg>=39)
            System.out.println("GRADE : D+");
        else
            System.out.println("FAIL");
            
        System.out.println("Total marks : "+totalMarks);
        System.out.println("Average percent  : "+avg+"%");
    }
}
