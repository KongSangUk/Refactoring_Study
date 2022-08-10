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
        public int getpriceCode() {
            return _priceCode;
        }
        public void setpriceCode(int arg) {
            _priceCode = arg;
        }
        public String gettitle() {
            return _title;
        };
    }