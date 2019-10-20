package com.sort;

/**
 * ソートクラス
 *
 * @author t.yoshida
 */
public class Sorter
{
	/**
	 * 選択ソート
	 * <pre>
	 * 最小値を探し、先頭の値と入れ替え ← これを範囲を狭めながら続ける。
	 * </pre>
	 *
	 * @param target 並び替え対象配列
	 */
	public static void selectionSort(int[] target)
	{
		int count = target.length;
		for(int i=0; i<count; i++)
		{
			/*
			 * i ～ (count - 1) の間で最小値のインデックスを探索
			 */
			int idxMin = i;
			for(int j=(i+1); j<count; j++)
			{
				if(target[idxMin] > target[j])
				{
					idxMin = j;
				}
			}

			// 最小値のインデックス idxMin の値と i を交換
			int tmp = target[i];
			target[i] = target[idxMin];
			target[idxMin] = tmp;
		}
	}

	/**
	 * バブルソート
	 * <pre>
	 * 隣り合う値同士を比較し、[大][小]の並びの場合、これを入れ替える。
	 * ↑これを範囲を狭めながら続ける。
	 * </pre>
	 *
	 * @param target
	 */
	public static void bubbleSort(int[] target)
	{
		int count = target.length;
		for(int loop=0; loop<(count-1); loop++)
		{
			for(int i=0; i<(count-(loop+1)); i++)
			{
				// 隣り合う値同士を比較し、小,大の順になるよう入替
				if(target[i] > target[i+1])
				{
					int tmp = target[i];
					target[i] = target[i+1];
					target[i+1] = tmp;
				}
			}
		}
	}
}
