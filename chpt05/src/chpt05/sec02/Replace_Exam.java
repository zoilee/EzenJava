package chpt05.sec02;

public class Replace_Exam {

	public static void main(String[] args) {
		
		String str = "�ڹ� ���ڿ��� ������ �ʾƿ�. �ֳ� �ϸ� �ڹٹ��ڿ��� String�̴ϱ��.";
		String newStr = str.replace("�ڹ�", "JAVA");
		
		System.out.println(str);
		System.out.println(newStr);
		
		String ssn = "990824-1230126";
		//1.�ֹι�ȣ�� ������ϸ� �ڸ��ÿ�.
		//2.�¾ �⵵�� �߶� ����Ͻÿ�. ex)yyyy��
		//3.�¾ ���� �߶� ����Ͻÿ�. ex)mm��
		//4.�¾ ���� �߶� ����Ͻÿ�. ex)dd��
		//���ڿ� �ڸ��� : substring( beginIndex, endIndex )
		
		String birth = ssn.substring(0,6);
		System.out.println(birth);
		String year = birth.substring(0,2);
		int intY = Integer.parseInt(year);
		String month = birth.substring(2,4);
		String day = birth.substring(4);
		int rsY;
		if(0 <= intY && 25 > intY) {
			rsY = 2000 + intY;
		}else {
			rsY = 1900 + intY;
		}
		
		System.out.println(rsY+"�� "+month+"�� "+day+"��");
		
		
		int index = str.indexOf("String");
		if(index == -1) {
			System.out.println("ã�� ���ڿ��� �����!");
		}else {
			System.out.println("ã�� ���ڿ��� "+index+" ��ġ���� ���۵ǿ�!");
		}
		
		String members = "ȫ�浿, 35, ������, ����";
		
		String [] arrMember =members.split(",");
		System.out.println(arrMember[0]);
		System.out.println(arrMember[1]);
		System.out.println(arrMember[2]);
		System.out.println(arrMember[3]);
		
		for (int i=0; i<arrMember.length; i++) {
			System.out.println(arrMember[i]);
		}
		System.out.println();
		for(String mem : arrMember) {
			System.out.println(mem);
		}
	}
	
	
}