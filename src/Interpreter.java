import java.util.Scanner;

public class Interpreter {

    // initialize the array size
    // standard brainfu*k array size is 30000 1byte memory blocks
    public static final int  MEMORY = 3000;

    private int pointer = 0;
    private int[] memory;
    public Interpreter(int size) {
        memory = new int[size];
    }

    public void interpret(String code) {

        Scanner input = new Scanner(System.in);

        for (int i=0; i < code.length(); i++) {

            // moving the pointer in the memory
            if (code.charAt(i) == '>') { pointer++; }
            else if (code.charAt(i) == '<') { pointer--; }

            // increase/decrease value in the memory block at the pointer location
            else if (code.charAt(i) == '+') { memory[pointer]++; }
            else if (code.charAt(i) == '-') { memory[pointer]--; }

            // take user input ( one character at a time )
            // in case the user input more the one character it will take the first character
            else if (code.charAt(i) == ',') { 
                memory[pointer] = input.next().charAt(0);
             }

            // print the value in the memory block at the pointer location
            else if (code.charAt(i) == '.') {
                System.out.print((char)memory[pointer]);
            }

            // handling nested loops //
            // start loop
            else if (code.charAt(i) == '[') {

                if (memory[pointer] == 0) {
                    int loop = 1;
                    
                    while (loop != 0) {        
                        i++;
                        if (code.charAt(i) == '[') { loop++; }
                        else if (code.charAt(i) == ']') { loop--; }
                    }
                }
            }
            // end loop
            else if (code.charAt(i) == ']') {

                if (memory[pointer] != 0) {
                    int loop = 1;

                    while (loop != 0) {
                        i--;
                        if (code.charAt(i) == ']') { loop++; }
                        else if (code.charAt(i) == '[') { loop--; }
                    }
                }
            }

        }

    input.close();
    } 
}
