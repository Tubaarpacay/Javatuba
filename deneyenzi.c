 /*#include <stdio.h> 
int main () {
    printf("hello world \n");
    return 0 ;
}
*/
/* aritmetik ortalama hesaplama
#include <stdio.h>
int main(){
    float toplam=0.0;
    float sayılar[5];
    int i;
    for(i=0;i<5;i++){
        printf("bir sayı giriniz: ");
        scanf("%f",&sayılar[i]);
    }
    for(i=0;i<5;i++){
        toplam+=sayılar[i];
    }
    printf("girdiğiniz sayıların aritmetik ortalaması %2f'dir",toplam/5);
     return 0 ;
}
*/
/* fonksiyonla faktoriyel hesaplama
#include <stdio.h>
int factoriyel(int sayi){
    int fact=1;
    for (;sayi>0;sayi--){
        fact*=sayi;

    }
return (fact);
}
int main(){
    int n ;
    printf("faktoriyelini istediğiniz sayıyı giriniz:");
    scanf("%d",&n);
    printf("faktoriyel: %d ",factoriyel(n));

return 0 ;
}

*/
 
/*     //asal sayı mı değil mi ona bakıcaz fonksiyonlar yardımıyla

#include <stdio.h>
int prime(int number){
    int i=2;
    for(i=2;i<number;i++){
        if(number%i==0){
            return 0;
        }
    }
    return 1;
}
int main(){
    int n ;
    printf("enter a number :");
    scanf("%d",&n);
    if (prime(n)==0){
        printf("bu sayı asal sayı değildir");
    }
    else{
        printf("bu sayı asal sayıdır.");
    }
   
    
return 0;
}
*/
 
/*    //parametre olarak arraylar .Tek boyutlu .

#include <stdio.h>
int carp(int matris[],int size){
    int carpım=1;
    int i=0;
    for(;i<size;i++){
        carpım*=matris[i];
    }
return carpım;
}

int main(){
    int sayılar[5]={1,2,3,4,5};
    printf("%d",carp(sayılar,5));
    return 0;
}

*/

/*
#include <stdio.h>
void bastir(int matrisimiz[][4],int size){
    int i,j;
    for(i=0;i<size;i++){
        for(j=0;j<4;j++){
            printf("%d",matrisimiz[i][j]);
        }
        printf("\n");
    }
}

int main(){
    int matris[3][4];
    int i,j;
    printf("Matrisi doldurunuz : ");
    
    for(i=0;i<3;i++){
        for(j=0;j<4;j++){
            scanf("%d",&matris[i][j]);
        }
    }
    
    bastir(matris,3);

    return 0;
}

*/

/*
#include <stdio.h>
#include <string.h>

int uzunlukdon(char name[]){

    int uzunluk=0;
    int i;
    for(i=0;name[i]!='\0';i++){
        uzunluk++;
    }
    return uzunluk;
    
    M
    u
    s
    t
    a
    f
    a
    \0 nul karakteri. Bitiriyor.Sadece char arreylerde geçerli.
    
}

int main(){

    char isim[]="Mustafa";
    printf("%d",uzunlukdon(isim));


    return 0;
}
*/