package com.rcplatform.livechat.model;


import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "rc_language")

public class Language implements Serializable {
    @Id
    private Integer id;

    @Column(name = "language_ab")

    private String languageAb;

    @Column(name = "language_name")

    private String languageName;

    @Column(name = "language_country")

    private String languageCountry;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return language_ab
     */
    public String getLanguageAb() {
        return languageAb;
    }

    /**
     * @param languageAb
     */
    public void setLanguageAb(String languageAb) {
        this.languageAb = languageAb;
    }

    /**
     * @return language_name
     */
    public String getLanguageName() {
        return languageName;
    }

    /**
     * @param languageName
     */
    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    /**
     * @return language_country
     */
    public String getLanguageCountry() {
        return languageCountry;
    }

    /**
     * @param languageCountry
     */
    public void setLanguageCountry(String languageCountry) {
        this.languageCountry = languageCountry;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", languageAb=").append(languageAb);
        sb.append(", languageName=").append(languageName);
        sb.append(", languageCountry=").append(languageCountry);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}