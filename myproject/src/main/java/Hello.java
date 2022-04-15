public class Hello {

    public static void main(String[] args) {
        Person person = new Person();
        person.hello();
        int age = 19; //基本資料型態
        Integer age1 = 19; //參照資料型態 Interger(包裝類別)
        System.out.println(age1.byteValue());
        char b = 'A';
        byte c = 120;
        float d = 5.5f;
        double e = 1.7;
        boolean f = true;
        boolean g = false;
        String name = "Xiang";
    }
}
