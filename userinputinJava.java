import java.util.Scanner; //pre defined java library for user input and output
Scanner scann = new Scanner(System.in); //scann is object and can be changed
void main(){
    IO.println("Enter the first number:");
    int a= scann.nextInt();
    IO.println("Enter the second number:");
    int b= scann.nextInt();

    IO.println("Please enter operation to perform +,-,/,*... :");
    String cha= scann.next();
    float r=0;
    switch(cha){
        case "+":
            r=a+b;
            System.out.printf("The addition result is : %d",r);
            break;
        case "-":
            if(a>=b){
                r=a-b;
                System.out.printf("The addition result is : %d",r);
                break;
            }
            else{
                r=b-a;
                 System.out.printf("The addition result is : %d",r);
            break;

            }
           

        case "*":
            r=a*b;
            System.out.printf("The multiplication result is : %d",r);
            break;
        
        case "/":
            r=(float)a/b; //typecasting into float(not require in this case as r is already float)
            System.out.printf("The division result is : %.2f",r);
            break;

            
            default:
                IO.println("invalid input");
            break;
    }

}