// If else in java without user input and switch case
// No used oop concepts
void main(){

int num1=20;
int num2=30;
char ch='/';
switch(ch){
    case '+':
        int add= num1+num2;
        System.out.printf("Added result is : %d",add);
        break;
    case '-':
        int diffn;
        if(num1>num2){
             diffn= num1-num2;
        }
        else{
             diffn= num2-num1;
        }
    System.out.println("Difference  is : " + diffn);
        break;
    case '*':
        int multi;
        multi=num1*num2;
        System.out.println("Multiple of two number is : " + multi);
        break;
    case '/':
        float division;
        if(num2==0){
            System.out.println("Error!, Can't divide by 0");
        }
        else{
            division= (float)num1/num2;
            System.out.printf("Divided result is : %.2f",division); //no decimal printing

        }



}





}