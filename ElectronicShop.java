/*Link--- https://www.hackerrank.com/challenges/electronics-shop/problem
 *  Sort Keyboard Prices in descending order.
 *  Sort USB Prices in ascending order.
 */

package hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ElectronicShop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter total amount: ");
		int amount = sc.nextInt();

		System.out.print("\nEnter key board nos: ");
		int keyBoardsNos = sc.nextInt();

		System.out.print("\nEnter USB nos: ");
		int usbNos = sc.nextInt();

		System.out.print("Enter key board prices: ");
		Integer[] keyBoardPrices = new Integer[keyBoardsNos];
		for (int i = 0; i < keyBoardsNos; i++) {
			keyBoardPrices[i] = sc.nextInt();
		}

		System.out.print("Enter key board prices: ");
		Integer[] usbPrices = new Integer[usbNos];
		for (int i = 0; i < usbNos; i++) {
			usbPrices[i] = sc.nextInt();
		}

		// Sort key board price in descending order
		Arrays.sort(keyBoardPrices, Collections.reverseOrder());

		// Sort usb prices in ascending order
		Arrays.sort(usbPrices, Collections.reverseOrder());

		int max = 0;
		// Below code we check incrementing USB prices with a keyboard
		// prices.When it crosses the total amount then we decrease the keyboard
		// price by taking next value from keyboard price array
		for (int i = 0, j = 0; i < keyBoardPrices.length; i++) {
			for (; j < usbPrices[j]; j++) {
				if (keyBoardPrices[i] + usbPrices[j] > amount) {
					max = -1;
					break;
				}
				if (keyBoardPrices[i] + usbPrices[j] > max) {
					max = keyBoardPrices[i] + usbPrices[j];
				}
			}
		}
		System.out.println(max);
	}
}
