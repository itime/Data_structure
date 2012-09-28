/**
 *  打印一个菱形
 *  2012.09.26
 *   行数:9
 *   等差：2
 *   1,3,5,7,9,11,13,15,17
 */
package section1;


public class PrintDiamond {
	public static void main(String[] args) {
		for (int i = 1; i < 9; i++) {
			for (int j = 1; j < (2 * i - 1); j++) {
				System.out.println("*");
			}
			//System.out.println("*");
		}
	}
}
