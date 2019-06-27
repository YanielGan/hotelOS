package net.suncaper.demo.mapper;

import java.util.List;
import net.suncaper.demo.domain.Room_quantity;
import net.suncaper.demo.domain.Room_quantityExample;
import net.suncaper.demo.domain.Room_quantityKey;
import org.apache.ibatis.annotations.Param;

public interface Room_quantityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_quantity
     *
     * @mbg.generated Wed Jun 26 12:42:28 CST 2019
     */
    long countByExample(Room_quantityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_quantity
     *
     * @mbg.generated Wed Jun 26 12:42:28 CST 2019
     */
    int deleteByExample(Room_quantityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_quantity
     *
     * @mbg.generated Wed Jun 26 12:42:28 CST 2019
     */
    int deleteByPrimaryKey(Room_quantityKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_quantity
     *
     * @mbg.generated Wed Jun 26 12:42:28 CST 2019
     */
    int insert(Room_quantity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_quantity
     *
     * @mbg.generated Wed Jun 26 12:42:28 CST 2019
     */
    int insertSelective(Room_quantity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_quantity
     *
     * @mbg.generated Wed Jun 26 12:42:28 CST 2019
     */
    List<Room_quantity> selectByExample(Room_quantityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_quantity
     *
     * @mbg.generated Wed Jun 26 12:42:28 CST 2019
     */
    Room_quantity selectByPrimaryKey(Room_quantityKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_quantity
     *
     * @mbg.generated Wed Jun 26 12:42:28 CST 2019
     */
    int updateByExampleSelective(@Param("record") Room_quantity record, @Param("example") Room_quantityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_quantity
     *
     * @mbg.generated Wed Jun 26 12:42:28 CST 2019
     */
    int updateByExample(@Param("record") Room_quantity record, @Param("example") Room_quantityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_quantity
     *
     * @mbg.generated Wed Jun 26 12:42:28 CST 2019
     */
    int updateByPrimaryKeySelective(Room_quantity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table room_quantity
     *
     * @mbg.generated Wed Jun 26 12:42:28 CST 2019
     */
    int updateByPrimaryKey(Room_quantity record);
}