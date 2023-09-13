import java.util.*;

public class HashMapNation {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("���� �̸��� �α��� 10�� �Է��ϼ���.(��: Korea 5000)");
		while(true) { // "�׸�"�� �Էµ� ������ �ݺ�
			System.out.print("���� �̸�, �α� >> ");
			String key = scanner.next();
			if(key.equals("�׸�")) {
				break;
			}
			Integer value = scanner.nextInt();
			nations.put(key, value);
			scanner.nextLine();
		}
		
		while(true) {
			System.out.print("�α� �˻� >> ");
			String sp = "�׸�";
			String name = scanner.next();
			if(name.equals(sp)) {
				break;
			}else if(nations.containsKey(name)){
				System.out.println(name + "�� �α��� " + nations.get(name));
			}else {
				System.out.println(name + "����� �����ϴ�.");
			}

			
		}
		
		scanner.close();
	}

}