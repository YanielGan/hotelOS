package net.suncaper.demo.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Hotel {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.hotel_id
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    private Integer hotelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.city_id
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    private Integer cityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.hotel_name
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    private String hotelName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.addressline
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    private String addressline;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.photo1
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    private String photo1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.photo2
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    private String photo2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.photo3
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    private String photo3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.photo4
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    private String photo4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.photo5
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    private String photo5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.star_rating
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    private BigDecimal starRating;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.checkin
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    private Date checkin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.checkout
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    private Date checkout;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.longitude
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    private Double longitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.latitude
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    private Double latitude;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.rates_from
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    private Integer ratesFrom;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.rating_average
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    private BigDecimal ratingAverage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column hotel.overview
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    private String overview;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public Hotel(Integer hotelId, Integer cityId, String hotelName, String addressline, String photo1, String photo2, String photo3, String photo4, String photo5, BigDecimal starRating, Date checkin, Date checkout, Double longitude, Double latitude, Integer ratesFrom, BigDecimal ratingAverage) {
        this.hotelId = hotelId;
        this.cityId = cityId;
        this.hotelName = hotelName;
        this.addressline = addressline;
        this.photo1 = photo1;
        this.photo2 = photo2;
        this.photo3 = photo3;
        this.photo4 = photo4;
        this.photo5 = photo5;
        this.starRating = starRating;
        this.checkin = checkin;
        this.checkout = checkout;
        this.longitude = longitude;
        this.latitude = latitude;
        this.ratesFrom = ratesFrom;
        this.ratingAverage = ratingAverage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public Hotel(Integer hotelId, Integer cityId, String hotelName, String addressline, String photo1, String photo2, String photo3, String photo4, String photo5, BigDecimal starRating, Date checkin, Date checkout, Double longitude, Double latitude, Integer ratesFrom, BigDecimal ratingAverage, String overview) {
        this.hotelId = hotelId;
        this.cityId = cityId;
        this.hotelName = hotelName;
        this.addressline = addressline;
        this.photo1 = photo1;
        this.photo2 = photo2;
        this.photo3 = photo3;
        this.photo4 = photo4;
        this.photo5 = photo5;
        this.starRating = starRating;
        this.checkin = checkin;
        this.checkout = checkout;
        this.longitude = longitude;
        this.latitude = latitude;
        this.ratesFrom = ratesFrom;
        this.ratingAverage = ratingAverage;
        this.overview = overview;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public Hotel() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.hotel_id
     *
     * @return the value of hotel.hotel_id
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public Integer getHotelId() {
        return hotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.hotel_id
     *
     * @param hotelId the value for hotel.hotel_id
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.city_id
     *
     * @return the value of hotel.city_id
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.city_id
     *
     * @param cityId the value for hotel.city_id
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.hotel_name
     *
     * @return the value of hotel.hotel_name
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.hotel_name
     *
     * @param hotelName the value for hotel.hotel_name
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName == null ? null : hotelName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.addressline
     *
     * @return the value of hotel.addressline
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public String getAddressline() {
        return addressline;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.addressline
     *
     * @param addressline the value for hotel.addressline
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public void setAddressline(String addressline) {
        this.addressline = addressline == null ? null : addressline.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.photo1
     *
     * @return the value of hotel.photo1
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public String getPhoto1() {
        return photo1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.photo1
     *
     * @param photo1 the value for hotel.photo1
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public void setPhoto1(String photo1) {
        this.photo1 = photo1 == null ? null : photo1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.photo2
     *
     * @return the value of hotel.photo2
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public String getPhoto2() {
        return photo2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.photo2
     *
     * @param photo2 the value for hotel.photo2
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public void setPhoto2(String photo2) {
        this.photo2 = photo2 == null ? null : photo2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.photo3
     *
     * @return the value of hotel.photo3
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public String getPhoto3() {
        return photo3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.photo3
     *
     * @param photo3 the value for hotel.photo3
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public void setPhoto3(String photo3) {
        this.photo3 = photo3 == null ? null : photo3.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.photo4
     *
     * @return the value of hotel.photo4
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public String getPhoto4() {
        return photo4;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.photo4
     *
     * @param photo4 the value for hotel.photo4
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public void setPhoto4(String photo4) {
        this.photo4 = photo4 == null ? null : photo4.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.photo5
     *
     * @return the value of hotel.photo5
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public String getPhoto5() {
        return photo5;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.photo5
     *
     * @param photo5 the value for hotel.photo5
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public void setPhoto5(String photo5) {
        this.photo5 = photo5 == null ? null : photo5.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.star_rating
     *
     * @return the value of hotel.star_rating
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public BigDecimal getStarRating() {
        return starRating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.star_rating
     *
     * @param starRating the value for hotel.star_rating
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public void setStarRating(BigDecimal starRating) {
        this.starRating = starRating;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.checkin
     *
     * @return the value of hotel.checkin
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public Date getCheckin() {
        return checkin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.checkin
     *
     * @param checkin the value for hotel.checkin
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.checkout
     *
     * @return the value of hotel.checkout
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public Date getCheckout() {
        return checkout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.checkout
     *
     * @param checkout the value for hotel.checkout
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.longitude
     *
     * @return the value of hotel.longitude
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public Double getLongitude() {
        return longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.longitude
     *
     * @param longitude the value for hotel.longitude
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.latitude
     *
     * @return the value of hotel.latitude
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public Double getLatitude() {
        return latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.latitude
     *
     * @param latitude the value for hotel.latitude
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.rates_from
     *
     * @return the value of hotel.rates_from
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public Integer getRatesFrom() {
        return ratesFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.rates_from
     *
     * @param ratesFrom the value for hotel.rates_from
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public void setRatesFrom(Integer ratesFrom) {
        this.ratesFrom = ratesFrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.rating_average
     *
     * @return the value of hotel.rating_average
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public BigDecimal getRatingAverage() {
        return ratingAverage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.rating_average
     *
     * @param ratingAverage the value for hotel.rating_average
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public void setRatingAverage(BigDecimal ratingAverage) {
        this.ratingAverage = ratingAverage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column hotel.overview
     *
     * @return the value of hotel.overview
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public String getOverview() {
        return overview;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column hotel.overview
     *
     * @param overview the value for hotel.overview
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    public void setOverview(String overview) {
        this.overview = overview == null ? null : overview.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Hotel other = (Hotel) that;
        return (this.getHotelId() == null ? other.getHotelId() == null : this.getHotelId().equals(other.getHotelId()))
            && (this.getCityId() == null ? other.getCityId() == null : this.getCityId().equals(other.getCityId()))
            && (this.getHotelName() == null ? other.getHotelName() == null : this.getHotelName().equals(other.getHotelName()))
            && (this.getAddressline() == null ? other.getAddressline() == null : this.getAddressline().equals(other.getAddressline()))
            && (this.getPhoto1() == null ? other.getPhoto1() == null : this.getPhoto1().equals(other.getPhoto1()))
            && (this.getPhoto2() == null ? other.getPhoto2() == null : this.getPhoto2().equals(other.getPhoto2()))
            && (this.getPhoto3() == null ? other.getPhoto3() == null : this.getPhoto3().equals(other.getPhoto3()))
            && (this.getPhoto4() == null ? other.getPhoto4() == null : this.getPhoto4().equals(other.getPhoto4()))
            && (this.getPhoto5() == null ? other.getPhoto5() == null : this.getPhoto5().equals(other.getPhoto5()))
            && (this.getStarRating() == null ? other.getStarRating() == null : this.getStarRating().equals(other.getStarRating()))
            && (this.getCheckin() == null ? other.getCheckin() == null : this.getCheckin().equals(other.getCheckin()))
            && (this.getCheckout() == null ? other.getCheckout() == null : this.getCheckout().equals(other.getCheckout()))
            && (this.getLongitude() == null ? other.getLongitude() == null : this.getLongitude().equals(other.getLongitude()))
            && (this.getLatitude() == null ? other.getLatitude() == null : this.getLatitude().equals(other.getLatitude()))
            && (this.getRatesFrom() == null ? other.getRatesFrom() == null : this.getRatesFrom().equals(other.getRatesFrom()))
            && (this.getRatingAverage() == null ? other.getRatingAverage() == null : this.getRatingAverage().equals(other.getRatingAverage()))
            && (this.getOverview() == null ? other.getOverview() == null : this.getOverview().equals(other.getOverview()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hotel
     *
     * @mbg.generated Thu Jul 04 22:45:26 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHotelId() == null) ? 0 : getHotelId().hashCode());
        result = prime * result + ((getCityId() == null) ? 0 : getCityId().hashCode());
        result = prime * result + ((getHotelName() == null) ? 0 : getHotelName().hashCode());
        result = prime * result + ((getAddressline() == null) ? 0 : getAddressline().hashCode());
        result = prime * result + ((getPhoto1() == null) ? 0 : getPhoto1().hashCode());
        result = prime * result + ((getPhoto2() == null) ? 0 : getPhoto2().hashCode());
        result = prime * result + ((getPhoto3() == null) ? 0 : getPhoto3().hashCode());
        result = prime * result + ((getPhoto4() == null) ? 0 : getPhoto4().hashCode());
        result = prime * result + ((getPhoto5() == null) ? 0 : getPhoto5().hashCode());
        result = prime * result + ((getStarRating() == null) ? 0 : getStarRating().hashCode());
        result = prime * result + ((getCheckin() == null) ? 0 : getCheckin().hashCode());
        result = prime * result + ((getCheckout() == null) ? 0 : getCheckout().hashCode());
        result = prime * result + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        result = prime * result + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        result = prime * result + ((getRatesFrom() == null) ? 0 : getRatesFrom().hashCode());
        result = prime * result + ((getRatingAverage() == null) ? 0 : getRatingAverage().hashCode());
        result = prime * result + ((getOverview() == null) ? 0 : getOverview().hashCode());
        return result;
    }
}