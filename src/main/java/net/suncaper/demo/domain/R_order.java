package net.suncaper.demo.domain;

import java.util.Date;

public class R_order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_order.o_id
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    private Integer oId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_order.u_id
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    private String uId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_order.room_id
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    private Integer roomId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_order.o_time
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    private Date oTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_order.arr_date
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    private Date arrDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_order.dep_date
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    private Date depDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_order.quantity
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    private Integer quantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_order.total_price
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    private Integer totalPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_order.g_name
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    private String gName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_order.g_phone
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    private String gPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column r_order.o_status
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    private String oStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_order
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public R_order(Integer oId, String uId, Integer roomId, Date oTime, Date arrDate, Date depDate, Integer quantity, Integer totalPrice, String gName, String gPhone, String oStatus) {
        this.oId = oId;
        this.uId = uId;
        this.roomId = roomId;
        this.oTime = oTime;
        this.arrDate = arrDate;
        this.depDate = depDate;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.gName = gName;
        this.gPhone = gPhone;
        this.oStatus = oStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_order
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public R_order() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_order.o_id
     *
     * @return the value of r_order.o_id
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public Integer getoId() {
        return oId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_order.o_id
     *
     * @param oId the value for r_order.o_id
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public void setoId(Integer oId) {
        this.oId = oId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_order.u_id
     *
     * @return the value of r_order.u_id
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public String getuId() {
        return uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_order.u_id
     *
     * @param uId the value for r_order.u_id
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public void setuId(String uId) {
        this.uId = uId == null ? null : uId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_order.room_id
     *
     * @return the value of r_order.room_id
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public Integer getRoomId() {
        return roomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_order.room_id
     *
     * @param roomId the value for r_order.room_id
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_order.o_time
     *
     * @return the value of r_order.o_time
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public Date getoTime() {
        return oTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_order.o_time
     *
     * @param oTime the value for r_order.o_time
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public void setoTime(Date oTime) {
        this.oTime = oTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_order.arr_date
     *
     * @return the value of r_order.arr_date
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public Date getArrDate() {
        return arrDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_order.arr_date
     *
     * @param arrDate the value for r_order.arr_date
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public void setArrDate(Date arrDate) {
        this.arrDate = arrDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_order.dep_date
     *
     * @return the value of r_order.dep_date
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public Date getDepDate() {
        return depDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_order.dep_date
     *
     * @param depDate the value for r_order.dep_date
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public void setDepDate(Date depDate) {
        this.depDate = depDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_order.quantity
     *
     * @return the value of r_order.quantity
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_order.quantity
     *
     * @param quantity the value for r_order.quantity
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_order.total_price
     *
     * @return the value of r_order.total_price
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public Integer getTotalPrice() {
        return totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_order.total_price
     *
     * @param totalPrice the value for r_order.total_price
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_order.g_name
     *
     * @return the value of r_order.g_name
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public String getgName() {
        return gName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_order.g_name
     *
     * @param gName the value for r_order.g_name
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_order.g_phone
     *
     * @return the value of r_order.g_phone
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public String getgPhone() {
        return gPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_order.g_phone
     *
     * @param gPhone the value for r_order.g_phone
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public void setgPhone(String gPhone) {
        this.gPhone = gPhone == null ? null : gPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column r_order.o_status
     *
     * @return the value of r_order.o_status
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public String getoStatus() {
        return oStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column r_order.o_status
     *
     * @param oStatus the value for r_order.o_status
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    public void setoStatus(String oStatus) {
        this.oStatus = oStatus == null ? null : oStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_order
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
        R_order other = (R_order) that;
        return (this.getoId() == null ? other.getoId() == null : this.getoId().equals(other.getoId()))
            && (this.getuId() == null ? other.getuId() == null : this.getuId().equals(other.getuId()))
            && (this.getRoomId() == null ? other.getRoomId() == null : this.getRoomId().equals(other.getRoomId()))
            && (this.getoTime() == null ? other.getoTime() == null : this.getoTime().equals(other.getoTime()))
            && (this.getArrDate() == null ? other.getArrDate() == null : this.getArrDate().equals(other.getArrDate()))
            && (this.getDepDate() == null ? other.getDepDate() == null : this.getDepDate().equals(other.getDepDate()))
            && (this.getQuantity() == null ? other.getQuantity() == null : this.getQuantity().equals(other.getQuantity()))
            && (this.getTotalPrice() == null ? other.getTotalPrice() == null : this.getTotalPrice().equals(other.getTotalPrice()))
            && (this.getgName() == null ? other.getgName() == null : this.getgName().equals(other.getgName()))
            && (this.getgPhone() == null ? other.getgPhone() == null : this.getgPhone().equals(other.getgPhone()))
            && (this.getoStatus() == null ? other.getoStatus() == null : this.getoStatus().equals(other.getoStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table r_order
     *
     * @mbg.generated Wed Jun 26 20:07:26 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getoId() == null) ? 0 : getoId().hashCode());
        result = prime * result + ((getuId() == null) ? 0 : getuId().hashCode());
        result = prime * result + ((getRoomId() == null) ? 0 : getRoomId().hashCode());
        result = prime * result + ((getoTime() == null) ? 0 : getoTime().hashCode());
        result = prime * result + ((getArrDate() == null) ? 0 : getArrDate().hashCode());
        result = prime * result + ((getDepDate() == null) ? 0 : getDepDate().hashCode());
        result = prime * result + ((getQuantity() == null) ? 0 : getQuantity().hashCode());
        result = prime * result + ((getTotalPrice() == null) ? 0 : getTotalPrice().hashCode());
        result = prime * result + ((getgName() == null) ? 0 : getgName().hashCode());
        result = prime * result + ((getgPhone() == null) ? 0 : getgPhone().hashCode());
        result = prime * result + ((getoStatus() == null) ? 0 : getoStatus().hashCode());
        return result;
    }
}