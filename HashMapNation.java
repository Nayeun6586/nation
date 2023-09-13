import java.util.*;

public class HashMapNation {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("나라 이름과 인구를 10개 입력하세요.(예: Korea 5000)");
		while(true) { // "그만"이 입력될 때까지 반복
			System.out.print("나라 이름, 인구 >> ");
			String key = scanner.next();
			if(key.equals("그만")) {
				break;
			}
			Integer value = scanner.nextInt();
			nations.put(key, value);
			scanner.nextLine();
		}
		
		while(true) {
			System.out.print("인구 검색 >> ");
			String sp = "그만";
			String name = scanner.next();
			if(name.equals(sp)) {
				break;
			}else if(nations.containsKey(name)){
				System.out.println(name + "의 인구는 " + nations.get(name));
			}else {
				System.out.println(name + "나라는 없습니다.");
			}

			
		}
		
		scanner.close();
	}

}