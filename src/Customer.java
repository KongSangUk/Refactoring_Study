// Customer 고객 클래스

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    //
    public String statement() {
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = getName() + "고객님의 대여 기록/n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            //이번에 대여하는 비디오 정보와 대여료 출출
            result += "\t" + each.getMovie().getTitle() + "\t" +
                    String.valueOf(each.getCharge()) + "\n";
        }

        result += "누적 대여료: " + String.valueOf(getTotalCharge()) + "\n";
        result += "적립 포인트: " + String.valueOf(getTotalFrequentRenterPoints());
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

}


//비디오 종류별 대려료 => 72 줄로 이동

// 전
//            switch (each.getMovie().getPriceCode()) {
//                case Movie.REGULAR:
//                    thisAmount += 2;
//                    if (each.getDaysRented() > 2)
//                        thisAmount += (each.getDaysRented() - 2) * 1.5;
//                    break;
//                case Movie.NEW_RELEASE:
//                    thisAmount += each.getDaysRented() * 3;
//                    break;
//                case Movie.CHILDRENS:
//                    thisAmount += 1.5;
//                    if (each.getDaysRented() > 3)
//                        thisAmount += (each.getDaysRented() - 3) * 1.5;
//                    break;
//            }


//    public double amountFor(Rental aRental) {
//        double result = 0;
//        switch (aRental.getMovie().getPriceCode()) {
//            case Movie.REGULAR:
//                result += 2;
//                if (aRental.getDaysRented() > 2)
//                    result += (aRental.getDaysRented() - 2) * 1.5;
//                break;
//            case Movie.NEW_RELEASE:
//                result += aRental.getDaysRented() * 3;
//                break;
//            case Movie.CHILDRENS:
//                result += 1.5;
//                if (aRental.getDaysRented() > 3)
//                    result += (aRental.getDaysRented() - 3) * 1.5;
//                break;
//        }
//        return result;
//    }


//            // 최신물을 이틍 이상 대여하면 보너스 포인트 지급
//            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE)
//                    && each.getDaysRented() > 1) frequentRenterPoints++;