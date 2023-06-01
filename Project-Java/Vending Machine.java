import java.util.Scanner;
public class Javaz{
public static void main(String args[]){ 

Scanner sc = new Scanner(System.in);
int sum = 0;

String news[][]= {{"หนังสือพิมพ์","25"},{"หนังสือการ์ตูน","45"},{"หนังสือวงการบันเทิง","95"},{"หนังสือแนะนำเกมส์","120"},{"หนังสือสอนJAVA","259"},
{"หนังสือนิตยสารรายสัปดาห์","159"},{"หนังสือสอนAnimetion","259"},{"หนังสืออัพเดทเรื่องIT","179"},{"หนังสือคนรักรถ","239"},{"หนังสือสอนทำอาหาร","169"}};

for(int i = 0; i <= news.length - 1; i++){
    System.out.print("กด" + (i + 1) +" ");

for(int j = 0; j <= news[0].length-1; j++){
    System.out.print(news[i][j] + " ");
}
    System.out.println();
} 

int a = sc.nextInt();
int price = selectnews(news,a);
while(true){
if (selectnews(news,a) == 0){
    System.out.println("ไม่มีรายการที่ท่านเลือก กรุณาเลือกใหม่ ^_^!");
a = sc.nextInt();
price = selectnews(news,a);
}
else break;
}
    System.out.println("กรุณาหยอดเหรียญ หรือ ธนบัตร");

while (true){
int coin = sc.nextInt();
if(coin == 1){
sum += 1;
}else if(coin == 2){
sum += 2;
}else if(coin == 5){
sum += 5;
}else if(coin == 10){
sum += 10; 
}else if(coin == 20){
sum += 20;
}else if(coin == 50){
sum += 50;
}else if(coin == 100){
sum += 100;
}else if(coin == 500){
sum += 500;
}else if(coin == 1000){
sum += 1000;
}else{ 
    System.out.println("ไม่ใช่เหรียญ หรือ ธนบัตร ^_^!");
}
if(sum >= price) 
break;
    System.out.println("Coin" + sum + "บาท");
}
    System.out.println(news[a - 1][0]);
if(sum - price == 0){
    System.out.println("เงินพอดี " + "_ขอบคุณที่มาอุดหนุนครับ ^o^");
}else{
    System.out.println("เงินทอน = " + (sum - price) + "บาท" + "_ขอบคุณที่มาอุดหนุนครับ ^o^");
}
} 

public static int selectnews(String news[][],int a){ 
int r = 0;
for(int i = 1; i <= news.length;i++){
if(i == a){
r = Integer.parseInt(news[i - 1][1]); break;
}
}
return r;
} 
}
