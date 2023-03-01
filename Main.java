/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    // Application code
    public static void main(String args[]) {
        School sk1 = new School();

        // Direct access to attributes is not a good practices
        sk1.setName("SK Satu");

        Address addr = new Address();
        addr.setStreet("Jalan 2");
        addr.setDistrict("JB");
        addr.setPostcode("30021");
        addr.setState("Johor");
        sk1.setAddress(addr);


        System.out.println("Name of school is "+sk1.getName());

        Marks marks = new Marks();
        marks.createData(100);
        
        try 
        {
            marks.setMark(50, 0);
            marks.setMark(-10, 1);
            marks.setMark(93, 2);
            marks.setMark(80, 100); 
        } 
        
        catch (IllegalArgumentException e) 
        {
            System.out.println("Error: " + e.getMessage());
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }

       
        float mark = marks.getMark(0);
        System.out.println("Marks for student [0] is " + mark);
    }
}
