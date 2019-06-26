package net.suncaper.demo.domain;

public class Room {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.room_id
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    private Integer roomId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.hotel_id
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    private Integer hotelId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.room_type
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    private String roomType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.breakfast
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    private String breakfast;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.price
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    private Integer price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.amout
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    private Integer amout;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public Room(Integer roomId, Integer hotelId, String roomType, String breakfast, Integer price, Integer amout) {
        this.roomId = roomId;
        this.hotelId = hotelId;
        this.roomType = roomType;
        this.breakfast = breakfast;
        this.price = price;
        this.amout = amout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public Room() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.room_id
     *
     * @return the value of room.room_id
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.room_id
     *
     * @param roomId the value for room.room_id
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.hotel_id
     *
     * @return the value of room.hotel_id
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public Integer getHotelId() {
        return hotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.hotel_id
     *
     * @param hotelId the value for room.hotel_id
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.room_type
     *
     * @return the value of room.room_type
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.room_type
     *
     * @param roomType the value for room.room_type
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public void setRoomType(String roomType) {
        this.roomType = roomType == null ? null : roomType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.breakfast
     *
     * @return the value of room.breakfast
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public String getBreakfast() {
        return breakfast;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.breakfast
     *
     * @param breakfast the value for room.breakfast
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public void setBreakfast(String breakfast) {
        this.breakfast = breakfast == null ? null : breakfast.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.price
     *
     * @return the value of room.price
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.price
     *
     * @param price the value for room.price
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.amout
     *
     * @return the value of room.amout
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public Integer getAmout() {
        return amout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.amout
     *
     * @param amout the value for room.amout
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public void setAmout(Integer amout) {
        this.amout = amout;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
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
        Room other = (Room) that;
        return (this.getRoomId() == null ? other.getRoomId() == null : this.getRoomId().equals(other.getRoomId()))
            && (this.getHotelId() == null ? other.getHotelId() == null : this.getHotelId().equals(other.getHotelId()))
            && (this.getRoomType() == null ? other.getRoomType() == null : this.getRoomType().equals(other.getRoomType()))
            && (this.getBreakfast() == null ? other.getBreakfast() == null : this.getBreakfast().equals(other.getBreakfast()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getAmout() == null ? other.getAmout() == null : this.getAmout().equals(other.getAmout()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoomId() == null) ? 0 : getRoomId().hashCode());
        result = prime * result + ((getHotelId() == null) ? 0 : getHotelId().hashCode());
        result = prime * result + ((getRoomType() == null) ? 0 : getRoomType().hashCode());
        result = prime * result + ((getBreakfast() == null) ? 0 : getBreakfast().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getAmout() == null) ? 0 : getAmout().hashCode());
        return result;
    }
}