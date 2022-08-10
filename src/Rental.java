// Rental 대여 정보 클래스

public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }
    public int getdaysRented() {
        return _daysRented;
    }
    public Movie getmovie() {
        return _movie;
    }
}