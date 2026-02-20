import com.myapp.*;

public class practical07 {
  public static void main(String[] args) {
    Employee e1 = new Employee(101, 200000, "Saumya Kanti Sarma", "saumyakantisarma@gmail.com", "Vichube Panvel");

    System.out.println(e1.getValues("id"));
    System.out.println(e1.getValues("name"));
    System.out.println(e1.getValues("email"));
    System.out.println(e1.getValues("password"));
  }

}