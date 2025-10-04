#include <stdio.h>


int  main () {
    /* 
    //int  number1= 10;
    //int number2=2;


    int number1 = 10 , number2 = 2;

    int sum = number1+ number2;
    int modulo = number1 + number2;

    printf("Summation : %d , and Modulo : %d\n" , sum,modulo);
    printf("Adress int: %d\n " , &sum);
    printf("Adress hex: %x\n ",&sum);
    */

   /*
   int number1, number2 ;
   printf("Number 1 : %d\n ", number1);
   printf("Number 2 : %d \n", number2);
  */ 
   /*
   int number1 , number2 ;
   printf("please give me number1 :");
   scanf("%d" , &number1);
   printf("please give me number2 :");
   scanf("%d", &number2);

   int sum= number1+ number2;
   int mod = number1 % number2 ;

   printf("Summation : %d , and Modulo : %d\n",sum,mod); 
   */
/*
   int a=5;
   int b=a++;
   int c=++a ;
   printf("a:%d\n", a);
   printf("b:%d\n",b);
   printf("c:%d\n",c);
*/
/*
   for(int myVar =0; myVar <=10 ; myVar++)
      printf("MyVar is: %d", myVar);
*/
 /*
  int age ;
  printf("please give me the age :");
  scanf("%d\n",&age);

if (age >=18 ){
    printf("You are an adult.\n");
}   
else if (age<16){
printf("You cannot get moto DL. "); 
}
else{
    printf("You are minor.\n");
}
*/   
printf("**********");
int myVar=0;
while(myVar <10){
   if(myVar % 2 == 1){
   printf("MyVar : %d", myVar);
   }else{
       break;
   }

    myVar++;
}
printf("MyVar : %d", myVar);
    return 0 ;
}
   