#include <stdio.h>

void append(int array[] , int size , int element );
void prettyPrint(int array[],int size);
void perfectsquares(int num1,int num2);
int main () {
   /* int myArray[10] ;

    myArray[5]=5;
    for (int i =0 ; i<10 ; i++){
        printf("%d\n",myArray[i]);
    }
  */

 /*
    int multiArray [3][4];
    for (int i =0 ; i<3;i++){
        printf("%d\n",multiArray[i][0]);
    }
      
int matrix[3][3]={{1,2,3},{4,5,6},{7,8,9}};
for (int i =0 ; i<3;i++){
    for (int j =0 ; j<3 ;j++){
        if(j!=2)
        printf("%d,",matrix [i] [j]);
        else
        printf("%d",matrix[i][j]);
    }
    printf("\n");
}
    
*/
/*
 int example[10]={};
 for (int i=0;i<10;i++){
    printf("%d\n",example);
 }

void append(int array[] , int size , int element ){
void perttyPrint(int array[],int size){


int example[10]={};
for(int i =0;i<5;i++){
    perttyPrint(example ,10);
    append (example,10);
}
for (int i=0;i<size;i++){
    if (array[i]==0){
        array[i]==element ;
        break
    }
}
}
}


*/



void perfectsqaures(int start,int end){
    for(int i=0; i*i<end ;i++){
    if(i*i >=start  ){
       printf("%d\n",i*i);
     }
  }
}
perfectsqaures[2,90]
     return 0 ;
}
