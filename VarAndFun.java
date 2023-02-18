/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package varandfun;

/**
 *
 * @author FPTSHOP
 */
public class VarAndFun {

    public static void main(String[] args) {
        //playWithVariables();
        //playWithIntegers();
        //playWithDoubles();
        //playWithCharacters();
        //playWithBooleans();
        printIntegerList();
    }
    //in ra các số tự nhiên từ 1 đến 100
    public static void printIntegerList(){
        System.out.println("The list of 100 first integer");
        for(int i = 0; i <= 100; i++){
            System.out.println(i + ". em yêu anh");//muốn nó ko xuống hàng thì prinln bỏ ln đi
        }
        
    }
    public static void playWithBooleans(){
       //C: đúng 1, >0 sai 0
       //Java: đúng:true, sai:false,-->boolean
       boolean marriedStatus = true;
       if(marriedStatus == true)
            System.out.println("Tui có người chồng gòi");
       else
            System.out.println("Vườn hồng có lối nhưng chưa ai vào");
    }
    public static void playWithCharacters(){
        //2 byte cho kiểu char heng, lưu bãng mã Unicode
        char m = '$';
        System.out.println("unit: " + m);
        //ví dụ em muốn in tên em thì sao? là một chuổi kí tự phức tạp
        //trong C là char name[]= "Ahihi";
        String name = "Nguyễn Thị Ngọc Quyên"; //loại data type mới hoàn toàn
                                              //phức tạp,gom nhiều thứ
        System.out.println("name: " + name);
        System.out.println("1st letter of my name: " +name.charAt(0));
        System.out.println("My name as in a lowercase: " + name.toLowerCase());
    }
    //Java ưu tiên dùng double hơn float
    public static void playWithDoubles(){
       double pi = 3.14;
        System.out.println("pi: " + pi);
        System.out.printf("pi: %.2f\n", pi);//cấm tuyệt đối không dùng %lf
        float vat = 0.1F;
        System.out.println("vat: " + vat);
    }
    public static void playWithIntegers(){
        int n = 39; //mọi con số, kí hiệu xuất hiện trong code được gọi là 'literal value'
                    //số nguyên xuất hiện trong code mặc định là int
        System.out.println("n: " + n); //muốn nó xuất hiện gia trị thì ko có dấu ""
        long m = 3000_000_000L;
        System.out.println("m: " + m);//tại vì mọi số nguyên đều mặc định là int ,4 byte là 
                                      //cao nhất 2 tỉ 1 ,muốn cao hơn ví dụ 3 tỉ thì dùng kiểu long
                                      //vì thế nên phải có L đằng sau
        int status = 0xFA; //hệ 16
        System.out.println("status: " +status);
        
        int phone = 010;  //10 thì mới là 10,còn có số 0 thì chưa chắc
                          //nó là hệ 8 đó octal
        System.out.println("phone:" +phone);
        
    }
            
    public static void playWithVariables(){
        //biến là một vùng ram được đặt tên chiếm một số byte nhất định tùy loại
        //dữ liệu hay thông tin mà nó sẽ chứa bên trong
        int age = 20;
        int a = 5;
        int b = 100;
        //tốn 12 byte trong ram
        System.out.println("age:"+ age); //~printf("age: %d\n", age) trong C
        int yob = 2001;
        age = 2023 - yob; //biến giúp ta linh hoạt hơn
        
        System.out.println("age again:" +age);
        System.out.println("age using transtive tech:" +(2023-yob));
        System.out.printf("age printed by using %% as in C: %d\n", (2023-yob));
        
    }
    
}
