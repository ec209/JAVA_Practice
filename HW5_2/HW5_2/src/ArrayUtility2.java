public class ArrayUtility2 {
	static int[] concat(int[] s1, int[] s2) {
		int merged[] = new int[s1.length+s2.length]; // ���ڷ� �Ѿ�� �� ������ �迭  ũ���� �հ� ���� ������ �迭 ����
		int index = 0;
		for (int i=0; i<s1.length; i++)
			merged[index++] = s1[i];  // merged �迭 ���ݺο� s1 �迭 ����
		for (int i=0; i<s2.length; i++)
			merged[index++] = s2[i];  // merged �迭 �Ĺݺο� s2 �迭 ����
		return merged;
	}
	
	static int[] remove(int[] s1, int[] s2) {
		boolean mark[] = new boolean[s1.length]; // s1���� s2 �迭�� �ִ� ������ ��ġ�� ǥ���ϱ� ���� �迭
		int count = 0; // s1�� �ִ� s2 �迭�� ������ ����
		int removed[] = null;
		for (int i=0; i<s1.length; i++) mark[i] = false; // �迭 �ʱ�ȭ
		for (int i=0; i<s1.length; i++) {
			for (int j=0; j<s2.length; j++) { 
                         // s1 �迭�� ���ҿ� s2 �迭�� ���Ұ� ���� ���� ���� s1�迭�� index ��ġ�� ǥ����
				if (s1[i] == s2[j]) { 
					mark[i] = true; 
					count++;
					break;
				}
			}
		}
		if (s1.length - count > 0) {
			removed = new int[s1.length - count]; // s1���� s2 �迭�� �ִ� ���ڸ� ������ ũ�⸸ŭ�� �迭 ����
			int index = 0;
			for (int i=0; i<s1.length; i++) // ��ũ�� ���Ҵ� �ǳʶٸ� �������� removed�迭�� ����
                        {
				if (mark[i]) continue; 
				else removed[index++] = s1[i] ;
			}
		}
		return removed;
	}
	
	public static void main (String args[])  {
		int i1[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		int i2[] = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		
		int tmp_int[] = concat(i1, i2);
		for (int j=0; j<tmp_int.length; j++) System.out.println(tmp_int[j]);
		tmp_int = remove(i1, i2);
		for (int j=0; j<tmp_int.length; j++) System.out.println(tmp_int[j]);
	}
}
