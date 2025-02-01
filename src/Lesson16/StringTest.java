package Lesson16;

public class StringTest {
    void stringTest (String email){
        String res= null;
       if (email.toLowerCase().contains("yahoo")){
           res = "yahoo \n";
       }
       if (email.toLowerCase().contains("gmail")){
           res += "gmail \n";
       }
       if (email.toLowerCase().contains("mail.ru")){
           res += "mail\n";
       } else System.out.println("почты нет");

        System.out.println(res);
    }

    void stringTest2 (String email){
        char[] emailChar = email.toCharArray();
        String res = "";
        Boolean flag= false;
        UPPER: for (int i = 0; i < emailChar.length; i++) {
            if (emailChar[i] == '@') {
                flag = true;
                if (!res.isEmpty()){
                    System.out.println("\n");
                }
            }


            if (flag && emailChar[i+1] != '.') {
                res += emailChar[i+1];
            } else {
                flag = false;

            }

        }
        System.out.println(res);

    }

    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        stringTest.stringTest2("sfs@yahoo.com, def@gmail.com, dfrg@mail.ru");
    }
}
