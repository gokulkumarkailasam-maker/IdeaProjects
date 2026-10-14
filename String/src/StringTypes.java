
public class StringTypes {
    public void immutableType() {
        String s1 = "Bike";
        String s2 = "Bike";
        System.out.println("Value present in s1:"+s1);
        System.out.println("Value present in s2:"+s2);

        System.out.println("Memory address of s1:"+System.identityHashCode(s1));
        System.out.println("Memory address of s2:"+System.identityHashCode(s2));
        s2=s2.concat("Price");

        System.out.println("After concat value present in s2:"+s2);
        System.out.println("After concat memory address of s2:"+System.identityHashCode(s2));

    }
    public void mutableType() {
        StringBuffer sb1 = new StringBuffer("Car");
        StringBuffer sb2 = new StringBuffer("Car");

        System.out.println("Value present in sb1:"+sb1);
        System.out.println("Value present in sb2:"+sb2);

        //Memory Address
        System.out.println("Memory address of sb1:"+System.identityHashCode(sb1));
        System.out.println("Memory address of sb2:"+System.identityHashCode(sb2));

        //Append
        sb2 = sb2.append("Price");

        System.out.println("After append value present in sb2:"+sb2);
        System.out.println("After append memory address of sb2:"+System.identityHashCode(sb2));

    }
    public void manipulations() {
        String s = "Jave and Selenium";
        String s1 = "Java and selenium";
        String s2 = " ";
        //length
        System.out.println("s.length()");

        int len_s = s.length();
        System.out.println("Length of the String s:"+len_s);

        int len_s1 = s1.length();
        System.out.println("Length of the string s1:"+len_s1);

        int len_s2 = s2.length();
        System.out.println("length of the string s2:"+len_s2);

        //equals

        boolean equals = s.equals(s1);
        System.out.println("Equals:"+equals);
        boolean equals1 = s.equals(s2);
        System.out.println("Equals1:"+equals1);
        boolean equals2 = s1.equals(s2);
        System.out.println("Equals2:"+equals2);

        //equalsIgnorecase
        boolean equalsIgnoreCase =s.equalsIgnoreCase(s1);
        System.out.println("equalsIgnoreCase:"+equalsIgnoreCase);

        //touppercase
        //tolowercase
        //startswith
        boolean startsWith = s.startsWith("j");
        System.out.println("startsWith:"+startsWith);

        //endswith
        //contains
        boolean contains = s.contains("u");
        System.out.println("contains:"+contains);

        //indexOf
        int indexOf = s.indexOf("a");
        System.out.println("indexOf:"+indexOf);

        //lastindexOf
        //charAt
        char charAt = s.charAt(6);
        System.out.println("charAt :"+charAt);

        //replace
        String replace = s.replace('a','e');
        System.out.println("replace:"+replace);

        //substring
        String substring = s.substring(4);
        System.out.println("Substring:"+substring);
        //substring
        //isEmpty
        //spilt
        //trim
    }
    public static void main(String[]args) {
        StringTypes st = new StringTypes();
        //st.immutableType();
        //st.mutableType();
        st.manipulations();
    }
}
