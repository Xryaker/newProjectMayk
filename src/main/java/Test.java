import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Size ss=Size.LARGE;
      //  System.out.println(ss.ordinal());
//        System.out.println(ss);

//        for (Size s:Size.values()){
//            System.out.println(s);
//        }
        Dog dog=new Dog("MONSTER");
        Dog dog1=new Dog("monster");
        System.out.println(dog.equals(dog1));
//        System.out.println(dog);
        String s1="bunny";
        String s2="\\bunny\\";
//        System.out.println(s2.length());
//        System.out.println(s2.charAt(2));
//        System.out.println(s2.indexOf('b'));
//        System.out.println(s2.indexOf("nn"));
//        System.out.println(s2.lastIndexOf('n'));
//        System.out.println(s2.substring(2));
//        System.out.println(s2.substring(2, 5));
//        String string = "animals";
//        System.out.println(string.toUpperCase());
//        System.out.println("ABC123".toLowerCase());

        System.out.println(s2.contains(s1));
        s2.replace("u", "a");
        System.out.println(s2);
        String s=s2.replace("u","a");
        System.out.println(s);
//        System.out.println(s2);
//        System.out.println(s1.equals(new String("bunny")));
        System.out.println("\t a b c\n".trim());
        String s3="\t a b c \n";
        System.out.println(s3.length());
        String s4=s3.trim();
        System.out.println(s4.length());


        String sentence = "Hello my dear friend!";
        String[] words = sentence.split("e");
        System.out.println(Arrays.toString(words));
        for (String l:words){
            System.out.println(l);
        }

        String result=String.valueOf("Animal ".trim().toLowerCase().replace('a','o').length());
        System.out.println(result);

        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Vasiliy");
        stringBuilder.append(" now ");
        stringBuilder.append(sentence);
        String s5=stringBuilder.toString();
        System.out.println(s5);

    }
}
