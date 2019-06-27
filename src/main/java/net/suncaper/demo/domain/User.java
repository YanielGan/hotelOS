package net.suncaper.demo.domain;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.u_id
     *
     * @mbg.generated Thu Jun 27 16:16:26 CST 2019
     */
    private Integer uId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.u_name
     *
     * @mbg.generated Thu Jun 27 16:16:26 CST 2019
     */
    private String uName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.u_password
     *
     * @mbg.generated Thu Jun 27 16:16:26 CST 2019
     */
    private String uPassword;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Jun 27 16:16:26 CST 2019
     */
    public User(Integer uId, String uName, String uPassword) {
        this.uId = uId;
        this.uName = uName;
        this.uPassword = uPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Jun 27 16:16:26 CST 2019
     */
    public User() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.u_id
     *
     * @return the value of user.u_id
     *
     * @mbg.generated Thu Jun 27 16:16:26 CST 2019
     */
    public Integer getuId() {
        return uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.u_id
     *
     * @param uId the value for user.u_id
     *
     * @mbg.generated Thu Jun 27 16:16:26 CST 2019
     */
    public void setuId(Integer uId) {
        this.uId = uId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.u_name
     *
     * @return the value of user.u_name
     *
     * @mbg.generated Thu Jun 27 16:16:26 CST 2019
     */
    public String getuName() {
        return uName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.u_name
     *
     * @param uName the value for user.u_name
     *
     * @mbg.generated Thu Jun 27 16:16:26 CST 2019
     */
    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.u_password
     *
     * @return the value of user.u_password
     *
     * @mbg.generated Thu Jun 27 16:16:26 CST 2019
     */
    public String getuPassword() {
        return uPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.u_password
     *
     * @param uPassword the value for user.u_password
     *
     * @mbg.generated Thu Jun 27 16:16:26 CST 2019
     */
    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Jun 27 16:16:26 CST 2019
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
        User other = (User) that;
        return (this.getuId() == null ? other.getuId() == null : this.getuId().equals(other.getuId()))
            && (this.getuName() == null ? other.getuName() == null : this.getuName().equals(other.getuName()))
            && (this.getuPassword() == null ? other.getuPassword() == null : this.getuPassword().equals(other.getuPassword()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Jun 27 16:16:26 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getuId() == null) ? 0 : getuId().hashCode());
        result = prime * result + ((getuName() == null) ? 0 : getuName().hashCode());
        result = prime * result + ((getuPassword() == null) ? 0 : getuPassword().hashCode());
        return result;
    }
}