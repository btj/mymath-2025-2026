package mymath;

import java.util.stream.IntStream;

public class MyMath {

	/**
	 * Berekent de vierkantswortel, naar beneden
	 * afgerond, van het gegeven niet-negatieve
	 * getal.
	 * 
	 * @pre `x` is niet negatief.
	 *    | 0 <= x
	 * @post Het kwadraat van het resultaat is niet
	 *       groter dan `x`, en het kwadraat van
	 *       één meer dan het resultaat is groter dan
	 *       `x`.
	 *    | result * result <= x &&
	 *    | x < (result + 1) * (result + 1)
	 */
	static int sqrt(int x) {
		int result = 0;
		while ((result + 1) * (result + 1) <= x)
			result++;
		return result;
	}
	
	/**
	 * @pre | true
	 * @post Het resultaat is het grootste van de
	 *       gegeven getallen
	 *     | result >= x && result >= y && result >= z
	 *     | &&
	 *     | (result == x || result == y || result == z)
	 */
	static int max(int x, int y, int z) {
		if (x >= y)
			if (x >= z)
				return x;
			else
				return z;
		else
			if (y >= z)
				return y;
			else
				return z;
	}
	
	/**
	 * Documenteer!
	 */
	static int mediaan(int x, int y, int z) {
		return 0;
	}
	
	/**
	 * Geeft de index terug van het eerste voorkomen
	 * van `needle` in `haystack`, of -1 als `needle`
	 * niet voorkomt in `haystack`.
	 * 
	 * @pre `haystack` is niet null
	 *    | haystack != null
	 * 
	 * @post | result < haystack.length
	 * @post
	 *    | result < 0 || haystack[result] == needle
	 * @post
	 *    | result < 0 ||
	 *    | IntStream.range(0, result).allMatch(i ->
	 *    |     haystack[i] != needle)
	 * @post 
	 *    | result >= 0 ||
	 *    | IntStream.range(0, haystack.length).allMatch(i ->
	 *    |     haystack[i] != needle
	 *    | )
	 */
	static int find(int[] haystack, int needle) {
		int index = 0;
		while (index < haystack.length) {
			if (haystack[index] == needle)
				return index;
			index++;
		}
		return -1;
	}
	
	/**
	 * @pre | array != null
	 * @inspects | array
	 * @post
	 *    | result == 
	 *    | IntStream.range(0, array.length - 1).allMatch(i ->
	 *    |     array[i] <= array[i + 1]
	 *    | )
	 */
	static boolean isSorted(int[] array) {
		for (int i = 1; i < array.length; i++)
			if (array[i - 1] > array[i])
				return false;
		return true;
	}
	
	/**
	 * Vervangt elk element van de gegeven array
	 * door haar tegengestelde.
	 * 
	 * @pre | array != null
	 * @post
	 *   | IntStream.range(0, array.length).allMatch(i ->
	 *   |     array[i] == -old(array.clone())[i]
	 *   | ) 
	 */
	static void negate(int[] array) {
		for (int i = 0; i < array.length; i++)
			array[i] = -array[i];
	}
	
	/**
	 * @pre | array != null
	 * @pre | 0 <= index
	 * @pre | index < array.length
	 * 
	 * @mutates | array
	 * 
	 * @post | array[index] == value
	 * @post | IntStream.range(0, array.length).allMatch(i ->
	 *       |     i == index || array[i] == old(array.clone())[i]
	 *       | )
	 */
	static void set(int[] array, int index, int value) {
		array[index] = value;
	}
	
	/**
	 * @post | result == IntStream.range(0, array.length).filter(i -> array[i] == 0).count()
	 */
	static int countZeros(int[] array) {
		// Implementeer!
	}
	
	/**
	 * Voegt het element van `array` op index `n` in in het gesorteerde segment van `array` tussen index
	 * 0 en `n - 1`. Schuift de gesorteerde elementen groter dan `n` één plaats naar rechts op.
	 * 
	 * @pre De elementen van `array` op indices 0 tot en met `n - 1` staan gesorteerd.
	 * @post De elementen van `array` op indices 0 tot en met `n` staan gesorteerd.
	 * @post Het stuk van de array op indices 0 tot en met `n` bevat dezelfde elementen als voor de oproep,
	 *       en met hetzelfde aantal voorkomens.
	 * @post De elementen op indices groter dan `n` zijn ongewijzigd.
	 */
	static void insert(int[] array, int n) {
		
	}
	
	/** Documenteer! */
	static void sort(int[] array) {
		// Implementeer, gebruikmakend van `insert`
	}

}
