
class students
{
    String Name;
    int rollno;
    int id;
    float marks;
}
public class ArrayObject 
{
    public static void main(String args[])
    {

        students s1 = new students();
        s1.Name = "NAME";
        s1.Name = "Roll NO";
        s1.Name = "ID";
        s1.Name = "CGPA";
        
        
        students s4 = new students();
        s4.Name = "Himanshu";
        s4.rollno = 35;
        s4.id = 666;
        s4.marks = 8.16f;
        
        students s2 = new students();
        s2.Name = "Sanjib";
        s2.rollno = 33;
        s2.id = 664;
        s2.marks = 7.34f;
        
        students s3 = new students();
        s3.rollno = 02;
        s3.Name = "Aman";
        s3.id = 176;
        s3.marks = 9.2f;
    
        students std[] = {s1, s3, s2, s4};
    
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Name", "Roll No", "ID", "CGPA");
        

        for (students st: std) 
        {
             
            System.out.printf("%-10s %-10d %-10d %-10.2f\n", st.Name, st.rollno, st.id, st.marks);
            
        }
    }
}
