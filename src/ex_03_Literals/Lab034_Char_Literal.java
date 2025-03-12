package ex_03_Literals;

    public class Lab034_Char_Literal {
        public static void main(String[] args) {

            char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
            //char c2 = "A"; // this is not a char, it is string
            char c2 = 'B';
            char c3 = '@';
            char c4 = '_';
            char c5 = '9';
            char c6 = '1';
            char c7 = '(';
            char c8 = ' '; // blank space

            // Escape Char
            char new_line = '\n';
            char tab_line = '\t';
            char back_space = '\b';
            char carriage_return = '\r';

//        System.out.println("PramodDutta");
            System.out.println("Rupa"+new_line+"Rani");
            System.out.println("Rupa\nRani");
            System.out.println("Rupa"+tab_line+"Rani");
            System.out.println("Rupa\tRani");
            System.out.println("Rani"+back_space+"Rupa");
            System.out.println("Joe is old"+carriage_return+"Mira");

            System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");

            char c10 = 'A';
            //  // ASCII, (limited numbers) - A -> 65

            char ruppes = '₹';
            System.out.println(ruppes);
            char my_laugh_smily = '\u1f60'; // :)
            System.out.println(my_laugh_smily);

            char c11  = '\u1F60';
            System.out.println(c11);


        }

}
