// Movìe 간단한 비디오 데이터 클래스다

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getTitle() {
        return _title;
    };

//    double getCharge() {
//        double result = 0;
//        switch (getMovie().getPriceCode()) {
//            case Movie.REGULAR:
//                result += 2;
//                if (getDaysRented() > 2)
//                    result += (getDaysRented() - 2) * 1.5;
//                break;
//            case Movie.NEW_RELEASE:
//                result += getDaysRented() * 3;
//                break;
//            case Movie.CHILDRENS:
//                result += 1.5;
//                if (getDaysRented() > 3)
//                    result += (getDaysRented() - 3) * 1.5;
//                break;
//        }
//        return result;
//    }

}