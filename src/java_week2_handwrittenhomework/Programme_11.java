package java_week2_handwrittenhomework;
/* Write a Java program to display the following pattern.
Sample Pattern :
J a v v a
J a a v v a a
J J aaaaa V V aaaaa
J J a a V a a
 */
public class Programme_11
{
    public static void main(String[] args) {
            Programme_11 t = new Programme_11();
            System.out.println("---------------------------------------------");
            t.javaPattern();
        }

        // Printing the Java Pattern
        public void javaPattern() {
            System.out.println("J  a  v   v a");
            System.out.println("J a a  v v a a");
            System.out.println("J J aaaaa  V V aaaaa");
            System.out.println("J J a   a  V a  a");
        }
}
