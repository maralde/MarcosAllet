package claseED;

import java.util.Arrays;

public class Burbujas {
	public static void main(String[] args) {
		int aux = 0;
		int i = 0;
		int[] v ={5, 3, 1, 4, 2};
		int n = v.length;
		System.out.println(Arrays.toString(v));
		for(i=n; i>1;i--){
			for (int j = 0; j < i-1; j++) {
				if(v[j]>v[j+1]){
					aux = v[j];
					v[j]=v[j+1];
					v[j+1]=aux;
				}
			}
		}
		System.out.println(Arrays.toString(v));
	}
	
}
