package vo;

public class MovieApp {

	public static void main(String[] args) {
		
		Movie movie = new Movie();
		
		movie.setName("맘마미아2");
		String name = movie.getName();
		
		System.out.println(name);
		////////////////////////////////
		movie.setRunningTime(137);
		int runningTime = movie.getRunningTime();
		
		System.out.println(runningTime);
		////////////////////////////////
		
		movie.setGenre("drama");
		String genre = movie.getGenre();
		
		System.out.println(genre);
		
	} //main() end
	
} //MovieApp end
