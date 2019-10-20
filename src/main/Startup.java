package main;

import com.sort.Sorter;


/**
 * 配列データのソート処理
 *
 * @author t.yoshida
 */
public class Startup
{
	public static void main(String[] args)
	{
		/*
		 * 整数の配列ソート - 選択ソート
		 */
		int[] target1 = { 3, 1, 9, 2, 4, 6, 0, 8, 7, 5 };
		System.out.println("─ 選択ソート ─────────────");
		System.out.println(" [使用前] " + toString(target1));
		Sorter.selectionSort(target1);
		System.out.println(" [使用後] " + toString(target1));

		System.out.println();

		/*
		 * 整数の配列ソート - バブルソート
		 */
		int[] target2 = { 3, 1, 9, 2, 4, 6, 0, 8, 7, 5 };
		System.out.println("─ バブルソート ────────────");
		System.out.println(" [使用前] " + toString(target2));
		Sorter.bubbleSort(target2);
		System.out.println(" [使用後] " + toString(target2));
	}

	/*
	 * 配列データを文字列として連結する。
	 */
	private static String toString(int[] arrays)
	{
		StringBuilder sb = new StringBuilder(50);
		for(int i=0; i<arrays.length; i++)
		{
			if(i != 0)
			{
				sb.append(", ");
			}
			sb.append(arrays[i]);
		}

		return sb.toString();
	}
}
