package optimPrjt;
/**
 * 
 * @author B BOUALEM
 *
 */
public class tab {
	/**
	 * Affichage des elements d'un tableau bidimentionnel de type double
	 * @param tab tableau bidimentionnel de type double
	 */
	public static void printTab (double[][] tab)
	{
		for (int i = 0; i<tab.length;i++)
		{
			printTab(tab[i]);
		}
	}
	/**
	 * Affichage des elements d'un tableau unidimentionnel de type double
	 * @param tab tableau unidimentionnel de type double
	 */
	public static void printTab (double[] tab)
	{
		int m = tab.length;
		System.out.print("[ ");
		for (int i = 0;i< m ;i++)
		{
			System.out.print(tab[i]+" ");
		}
		System.out.println("]");
	}
	/**
	 * multiplication des elements d'un tableau unidimentionnel de type double et un nombre de type double
	 * equivalent à resultat = tab1 * alpha
	 * @param tab tableau unidimentionnel de type double
	 * @param alpha un nombre réelle 
	 * @return tableau contenant les resultat de multiplication
	 */
	public static double[] mul(double [] tab, double alpha)
	{
		int n= tab.length;
		double [] result = new double [n];
		for (int i=0;i<n;i++ )
		{
			result[i] = tab[i]*alpha;
		}
		return result;
	}
	/**
	 * multiplication des elements d'un tableau unidimentionnel de type double et un nombre de type double
	 * equivalent à tab1 = tab1 * alpha
	 * @param tab tableau unidimentionnel de type double
	 * @param alpha un nombre réelle 
	 */
	public static void multi(double [] tab, double alpha)
	{
		int n= tab.length;
		for (int i=0;i<n;i++ )
		{
			tab[i]*=alpha;
		}
	}
	/**
	 * soustraction de deux tableaux
	 * @param tab
	 * @param tab1
	 * @return tab - tab1
	 */
	public static double[] sub(double [] tab, double[] tab1)
	{
		int n= tab.length;
		double [] result = new double [n];
		for (int i=0;i<n;i++ )
		{
			result[i] = tab[i]-tab1[i];
		}
		return result;
	}
	/**
	 * soustraction de deux tableaux
	 * tab = tab - tab1
	 * @param tab
	 * @param tab1
	 */
	public static void substract(double [] tab, double[] tab1)
	{
		int n= tab.length;
		for (int i=0;i<n;i++ )
		{
			tab[i]-=tab1[i];
		}
	}
}
