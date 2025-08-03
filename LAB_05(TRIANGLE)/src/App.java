public class App {
    public static void main(String[] args) throws Exception {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(20);
        Triangle t3 = new Triangle(20,30);
        Triangle t4 = new Triangle(5,4,3);
        Triangle t5 = new Triangle(t3);

        System.out.println("TRIANGLE 1: \n"+t1+"\n");
        System.out.println("TRIANGLE 2: \n"+t2+"\n");
        System.out.println("TRIANGLE 3: \n"+t3+"\n");
        System.out.println("TRIANGLE 4: \n"+t4+"\n");
        System.out.println("TRIANGLE 5: \n"+t5+"\n");
        
        System.out.println("THE TOTAL OBJECT: "+Triangle.objectcount());
          
    }
}
