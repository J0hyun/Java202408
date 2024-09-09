package movie;

import java.io.IOException;
import java.util.List;

public class AdminMenu extends AbstractMenu {
	
	private static final AdminMenu instance = new AdminMenu(null);
	
	private static final String ADMIN_MENU_TEXT = // 기본 문구
			"1: 영화 등록 하기\n" +
			"2: 영화 목록 보기\n" +
			"3: 영화 삭제 하기\n" +
			"b: 메인 메뉴로 이동\n\n" +
			"메뉴를 선택하세요: ";

	private AdminMenu(Menu prevMenu) {
		super(ADMIN_MENU_TEXT, prevMenu);
	}	
	public static AdminMenu getInstance() {
		return instance;  // MainMenu 객체 생성 주소반환(싱글톤 패턴)
	}
	
	@Override
	public Menu next() {
		switch(sc.nextLine()) {
		case "1":
			createMovies();
			return this;
		case "2":
			printAllMovies();
			return this;
		case "3":
			deleteMovies();
			return this;
		case "b": return prevMenu;
		default : return this;
		}
	}
	
	private void deleteMovies() {
		printAllMovies();
		System.out.println("삭제할 영화를 ID값을 입력하세요: "); // 1725842136 입력
		Movie.delete(sc.nextLine()); // Movie.delete(1725842136); --> 함수 호출
		System.out.println(">> 삭제되었습니다.");
	}
	private void createMovies() {
		System.out.println("제목: ");
		String title = sc.nextLine();
		System.out.println("장르: ");
		String genre = sc.nextLine();
		
		Movie movie = new Movie(title, genre);
		
		try {
			movie.save();
			System.out.println(">> 등록되었습니다.");
		} catch (IOException e) {
			System.out.println(">> 실패하였습니다.");
		}
		
		
}
		
	private void printAllMovies() {
		try {
			List<Movie> movies = Movie.finAll();
			System.out.println();
			
			for(Movie movie : movies)
				System.out.printf("%s\n", movie);
		}catch (Exception e) {
			System.out.println("데이터 접근에 실패하였습니다.");
		}
	}
}

