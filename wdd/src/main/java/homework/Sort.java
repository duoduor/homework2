package homework;

public class Sort {
	private static boolean[] temp = new boolean[10000];

	public void sort(int[] array) // 排序
	{
		init();
		for (int i = 0; i < array.length; i++) {
			temp[array[i]] = true;
		}
		int loc = 0;
		for (int j = 0; j < temp.length; j++) {
			if (temp[j])
				array[loc++] = j;
		}
	}

	private void init()// 其实在此方法中通过传一个整数可以剪枝，而整数为array数组中元素的最大值
	{
		for (int i = 0; i < temp.length; i++)
			temp[i] = false;
	}

	public void print(int[] array)// 遍历数组并输出
	{
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + "  ");
		System.out.println();
	}

	public static void main(String[] args) {
		Sort sort = new Sort();
		int array[] = new int[] { 8, 9, 4, 6, 7, 10, 5, 2, 1 };
		sort.print(array);
		sort.sort(array);
		sort.print(array);// 输出排序结果
		for (int i = 1; i < array.length; i++) {
			if (array[i] - array[i - 1] == 1) {
			} else {
				System.out.println("数组中所缺的数为:" + (array[i] - 1));
			}

		}

	}
}
