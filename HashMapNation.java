import java.util.*;

public class HashMapNation {
	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나라 이름과 인구를 10개 입력하세요.(예: Korea 5000)");
		while(true) { // "그만"이 입력될 때까지 반복
			System.out.print("나라 이름, 인구 >> ");		
			
		}
		
		while(true) {
			System.out.print("인구 검색 >> ");
			String sp = "그만";
			String name = scanner.next();
			if(name.equals(sp)) {
				break;
			}else if(name.equals(nations.keySet())){
				System.out.println(nations.keySet() + "의 인구는 " + nations.values());
			}else {
				System.out.println(nations.keySet() + "나라는 없습니다.");
			}
		}
		
		scanner.close();
	}

}
