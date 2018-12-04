package com.neuedu.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.category_id
     *
     * @mbg.generated
     */
    private Integer categoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.subtitle
     *
     * @mbg.generated
     */
    private String subtitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.main_image
     *
     * @mbg.generated
     */
    private String mainImage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.sub_image
     *
     * @mbg.generated
     */
    private String subImage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.stock
     *
     * @mbg.generated
     */
    private Integer stock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.status
     *
     * @mbg.generated
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column neuedu_product.datail
     *
     * @mbg.generated
     */
    private String datail;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.id
     *
     * @return the value of neuedu_product.id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.id
     *
     * @param id the value for neuedu_product.id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.category_id
     *
     * @return the value of neuedu_product.category_id
     *
     * @mbg.generated
     */
    public Integer getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.category_id
     *
     * @param categoryId the value for neuedu_product.category_id
     *
     * @mbg.generated
     */
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.name
     *
     * @return the value of neuedu_product.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.name
     *
     * @param name the value for neuedu_product.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.subtitle
     *
     * @return the value of neuedu_product.subtitle
     *
     * @mbg.generated
     */
    public String getSubtitle() {
        return subtitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.subtitle
     *
     * @param subtitle the value for neuedu_product.subtitle
     *
     * @mbg.generated
     */
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle == null ? null : subtitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.main_image
     *
     * @return the value of neuedu_product.main_image
     *
     * @mbg.generated
     */
    public String getMainImage() {
        return mainImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.main_image
     *
     * @param mainImage the value for neuedu_product.main_image
     *
     * @mbg.generated
     */
    public void setMainImage(String mainImage) {
        this.mainImage = mainImage == null ? null : mainImage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.sub_image
     *
     * @return the value of neuedu_product.sub_image
     *
     * @mbg.generated
     */
    public String getSubImage() {
        return subImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.sub_image
     *
     * @param subImage the value for neuedu_product.sub_image
     *
     * @mbg.generated
     */
    public void setSubImage(String subImage) {
        this.subImage = subImage == null ? null : subImage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.price
     *
     * @return the value of neuedu_product.price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.price
     *
     * @param price the value for neuedu_product.price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.stock
     *
     * @return the value of neuedu_product.stock
     *
     * @mbg.generated
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.stock
     *
     * @param stock the value for neuedu_product.stock
     *
     * @mbg.generated
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.status
     *
     * @return the value of neuedu_product.status
     *
     * @mbg.generated
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.status
     *
     * @param status the value for neuedu_product.status
     *
     * @mbg.generated
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.create_time
     *
     * @return the value of neuedu_product.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.create_time
     *
     * @param createTime the value for neuedu_product.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.update_time
     *
     * @return the value of neuedu_product.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.update_time
     *
     * @param updateTime the value for neuedu_product.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column neuedu_product.datail
     *
     * @return the value of neuedu_product.datail
     *
     * @mbg.generated
     */
    public String getDatail() {
        return datail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column neuedu_product.datail
     *
     * @param datail the value for neuedu_product.datail
     *
     * @mbg.generated
     */
    public void setDatail(String datail) {
        this.datail = datail == null ? null : datail.trim();
    }
}