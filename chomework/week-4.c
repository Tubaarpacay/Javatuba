#include<stdio.h>


int factorial(int number );

int main (){
    int factorial_5=factorial(5);
    printf("Factorial %d\n",factorial_5);


    return 0 ;{

    }
}


int factorial(int number){
    if (number<0){
        return 0 ;
    }if (number==0){
        return 1 ;
    }
    int result = 1;
    for(int i=1;i<=number;i++){
       result=result*1;
    return result ;
    }
}

int factorialFor(int number);
int factorialWhile(int number);
int factorialRecursive(int number);
int fibonacci(int number);
int fibonacciWhile(int number);
int fibonacciRecursive(int number);
int main(){
    int factorial_5=factorialWhile(5);
    printf("Factorial %d\n",factorial_5);
    return 0 ;
}
int factorialWhile(int number){
    if (number<0){
        return 0 ;
    }
    if(number==0){
        return 1 ;
    }
    int result=1 ;
    for(int i =1 ; i <=number ;i++){
        result=result*i ;

    }
    while(number > 0){
         result=result*number;
         number --;
    }
}

int factorialRecursive(int number){
    //Base Case
    if (number==1 || number==0){
        return 1 ;
    }
    return number *factorialRecursive(number -1);
}

int fibonacciFor(int number){

    int first=1 , second=1,result=0 ;
    if (number==1 || number ==2){
    return 1 ;
    }
for (int i=3 ;i<=number;i++){
    result=first + second ;
    first=second;
    second=result ;
  }
  return result ;
}
int fibonacciWhile(int number){
    int first=1,second=1,result=0;
    if(number==1|| number==2){
        return 1 ;
    }
while(number>=3){
    result=first+ second;
    first=second;
    second=result;
    return result ;
  }
}
 int fibonacciResursive(int number){
    //Base Case
    if(number==1|| number==2){
        return 1 ;
    }
    return fibonacciRecursive(number -1)+fibonacciRecursive(number-2);
 }
 