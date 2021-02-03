/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingbat;

/**
 *
 * @author Danirx
 */

public class Logic2 {
    public boolean makeBricks(int small, int big, int goal) {
    //si la meta es menos que cero o lod ladrillos grandes son menos que cero o los ladrillos 
    //pequeños son menor que cero, se ejecuta el if
   if (goal < 0 || big < 0 || small < 0) {
   //si goal que es la meta es mayor que el ladrillo big por 5 mas ladrillo small, retorna falso 
  }else if (goal > big * 5 + small){
    return false;
    //si el numero de la derecha es menor que 5 retorna true
  } else if (goal % 5 <= small) {
    return true;
  }
  //y sino pues retorna false
   return false;
}

  
    
    
public int loneSum(int a, int b, int c) {
  
    //cuando todos los numeros son iguales saca 0
    if ( (a==b) && (b==c) && (c==a) ) return 0;
    
    else
        {
        //aqui comprobamos si son iguales entre los 3 valores
        //los que sean iguales no se suman y hace el return del unico numero no igual
         if (a==b) return c ;
         if (b==c) return a;
         
         if (a==c) return b;
         
         
        //aqui saca el resultado de la suma en el caso que no este repetido ningun numero
         else  return a+b+c;
        }
}




public int luckySum(int a, int b, int c) {
  
  //si el primero ya es 13 ya no se suma ninguno y saca 0
  if(a == 13)
		return 0;
	//si el b es 13 saca a
	if(b == 13)
		return a;	
	//si c es 13 hace a + b
	if(c == 13)
		return (a + b);
		
		
	//sino hace la suma de todos los numeros	
		return (a+b+c);
}





public int noTeenSum(int a, int b, int c) {
  
  //aqui hace la suma con la variable que hemos creado antes con los numeros "teen" fuera
  //menos la excepcion que son el 15 y el 16
  
  return fixTeen(a) + fixTeen(b) + fixTeen(c);
  
}
  //creamos la variable fixTeen
  public int fixTeen(int n) {
    //si n es mayor que 13 y menos que 19 pero no es ni 15 ni 16 saca 0
  if(13 <= n && n <= 19 && n != 15 && n != 16)
  return 0;
  //y sino saca el numero
 return n; 
}
  
  
  
  
  
  
public int roundSum(int a, int b, int c){
  
  //aqui hace la suma de los numeros con los redondeos ya hechos
	return (round10(a) + round10(b) + round10(c));	
  
}


//creamos la variable que va redondear el numero parriba si es 5 o mas y pabajo
//si es menos de 5
public int round10(int num){
//sacamos el digito con el % y vemos si es mayor o menor que 5
	int digit = num % 10;
//si es mayor que 5 devuelve el numero y se le suma 10 menos el digito
	if(digit >= 5)
	
		return num + (10 - digit);
		
		
		
	return num - digit;
	

}



public boolean closeFar(int a, int b, int c) {
  //restamos  los tres numeros entre si, de dos en dos para saber cuanto es la
  //diferencia entre ellos, si es 1 es close, y si la diferencia es 2 o mas es far
return (Math.abs (b - a) <= 1 && Math.abs (c - a) >= 2 && Math.abs (c - b) >= 2

		|| Math.abs (c - a) <= 1 && Math.abs (b - a) >= 2 && Math.abs (b - c) >= 2);
}




public int blackjack(int a, int b) {
  
  //si a es mayor que 21 pasa al b
  if(a > 21){
    //si b es mayor que 21 saca 0 y devuelve b
    if(b > 21)
			return 0;
			return b;
  }
  //si a es menor que b y b es menor o igual a 21 saca b
  if(a < b && b <= 21)
  return b;
  
  //sino retorna a
  	return a;
}



public boolean evenlySpaced(int a, int b, int c) {
  
  //creamos la variable dif
  int dif;
    //si b es mayor que a, va a valer dif
	  if(b > a){
  		dif = a;
  		a = b;
  		b = dif;
  	}
  	
  	if(c > b){
		dif = b;
		b =c;
		c = dif;
	  }

  	if(b > a){
  		dif = a;
  		a = b;
  		b = dif;
  	}
  	
  	
  	//retorna la diferencia entre a y b que es la misma entre b y c
  	return(a - b == b - c);
}

}

    
   
