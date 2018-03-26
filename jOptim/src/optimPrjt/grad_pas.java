/**
 * 
 */
package optimPrjt;

import java.util.*;

/**
 * @author B BOUALEM
 *
 */
public class grad_pas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random ();
		double[] x0 = {0.2,0.5};
		double alpha = 0.01;
		int itrMax=18;
		double [][] x = GradPasFixe(x0,alpha,itrMax);
		tab.printTab(x);


	}
	/**
	 * Utilisation de la méthode du gradient a pas fixe pour resoudre un problème d'optimisation
	 * min J(x)
	 * @param x0 position intiale
	 * @param alpha le pas de l'algorithme
	 * @param itrMax nombre maximale d'iteration
	 * @return l'ensemble des solutions calculer 
	 */
	public static double [][] GradPasFixe(double[]x0,double alpha, int itrMax)
	{
		double [][] x = new double [itrMax][x0.length];
		x[0] = x0;
		for (int i = 1; i<itrMax;i++ )
		{
			x[i]=tab.sub(x[i-1], tab.mul(gJ(x[i-1]),alpha));
		}
		return x;
	}
	/**
	 * Fonction objectif J(x1,x2)=(x1-1)^2 + 10(x1^2-x2)^2 
	 * @param x variable qui contient x = (x1,x2)
	 * @return J(x1,x2)
	 */
	public static double J(double[] x)
	{
		double j = Math.pow(x[0]-1 , 2) + 
				(10 * Math.pow(Math.pow(x[0],2)-x[1], 2));
				return j;
	}
	
	/**
	 * gradient de la fonction objectif
	 * @param x variable qui contient x = (x1,x2)
	 * @return grad J(x1,x2)
	 */
	public static double[] gJ(double[] x)
	{
		double[] j ={2*(x[0]-1)+
					( 40*x[0]*(Math.pow(x[0] , 2)-x[1])), 
					(20 * (x[1]- Math.pow(x[0],2)))};
				return j;
	}
	

}
