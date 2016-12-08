package com.rcplatform.livechat.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "rc_match_num_day")
public class MatchNumDay implements Serializable {
    @Id
    private Integer id;

    /**
     * 每日匹配失败次数
     */
    @Column(name = "match_fail")
    private Integer matchFail;

    /**
     * 每日匹配成功次数
     */
    @Column(name = "match_success")
    private Integer matchSuccess;

    /**
     * 每日匹配总次数
     */
    @Column(name = "match_total")
    private Integer matchTotal;

    /**
     * 每日男性匹配总次数
     */
    @Column(name = "match_boy_count")
    private Integer matchBoyCount;

    /**
     * 每日女性匹配总次数
     */
    @Column(name = "match_girl_count")
    private Integer matchGirlCount;

    /**
     * 每日女女匹配总次数
     */
    @Column(name = "match_girl_girl_count")
    private Integer matchGirlGirlCount;

    /**
     * 每日男女匹配总次数
     */
    @Column(name = "match_boy_girl_count")
    private Integer matchBoyGirlCount;

    /**
     * 每日男男匹配总次数
     */
    @Column(name = "match_boy_boy_count")
    private Integer matchBoyBoyCount;

    /**
     * 每日男性匹配成功次数
     */
    @Column(name = "match_boy_success_count")
    private Integer matchBoySuccessCount;

    /**
     * 每日女性匹配成功次数
     */
    @Column(name = "match_girl_success_count")
    private Integer matchGirlSuccessCount;

    /**
     * 每日付费匹配总人数
     */
    @Column(name = "match_pay_people")
    private Integer matchPayPeople;

    /**
     * 每日付费匹配总次数
     */
    @Column(name = "match_pay_count")
    private Integer matchPayCount;

    /**
     * 每日男性付费总人数
     */
    @Column(name = "match_boy_pay_people")
    private Integer matchBoyPayPeople;

    /**
     * 每日男性付费总次数
     */
    @Column(name = "match_boy_pay_count")
    private Integer matchBoyPayCount;

    /**
     * 每日女性付费总人数
     */
    @Column(name = "match_girl_pay_people")
    private Integer matchGirlPayPeople;

    /**
     * 每日女性付费总次数
     */
    @Column(name = "match_girl_pay_count")
    private Integer matchGirlPayCount;

    /**
     * 每日android付费总人数
     */
    @Column(name = "match_android_pay_people")
    private Integer matchAndroidPayPeople;

    /**
     * 每日android付费总次数
     */
    @Column(name = "match_android_pay_count")
    private Integer matchAndroidPayCount;

    /**
     * 每日ios付费总人数
     */
    @Column(name = "match_ios_pay_people")
    private Integer matchIosPayPeople;

    /**
     * 每日男性付费匹配无人次数
     */
    @Column(name = "match_boy_pay_fail_count")
    private Integer matchBoyPayFailCount;

    /**
     * 每日男性付费匹配成功次数
     */
    @Column(name = "match_boy_pay_success_count")
    private Integer matchBoyPaySuccessCount;

    /**
     * 每日女性付费匹配无人次数
     */
    @Column(name = "match_girl_pay_fail_count")
    private Integer matchGirlPayFailCount;

    /**
     * 每日女性付费匹配成功次数
     */
    @Column(name = "match_girl_pay_success_count")
    private Integer matchGirlPaySuccessCount;

    /**
     * 每日ios付费总次数
     */
    @Column(name = "match_ios_pay_count")
    private Integer matchIosPayCount;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取每日匹配失败次数
     *
     * @return match_fail - 每日匹配失败次数
     */
    public Integer getMatchFail() {
        return matchFail;
    }

    /**
     * 设置每日匹配失败次数
     *
     * @param matchFail 每日匹配失败次数
     */
    public void setMatchFail(Integer matchFail) {
        this.matchFail = matchFail;
    }

    /**
     * 获取每日匹配成功次数
     *
     * @return match_success - 每日匹配成功次数
     */
    public Integer getMatchSuccess() {
        return matchSuccess;
    }

    /**
     * 设置每日匹配成功次数
     *
     * @param matchSuccess 每日匹配成功次数
     */
    public void setMatchSuccess(Integer matchSuccess) {
        this.matchSuccess = matchSuccess;
    }

    /**
     * 获取每日匹配总次数
     *
     * @return match_total - 每日匹配总次数
     */
    public Integer getMatchTotal() {
        return matchTotal;
    }

    /**
     * 设置每日匹配总次数
     *
     * @param matchTotal 每日匹配总次数
     */
    public void setMatchTotal(Integer matchTotal) {
        this.matchTotal = matchTotal;
    }

    /**
     * 获取每日男性匹配总次数
     *
     * @return match_boy_count - 每日男性匹配总次数
     */
    public Integer getMatchBoyCount() {
        return matchBoyCount;
    }

    /**
     * 设置每日男性匹配总次数
     *
     * @param matchBoyCount 每日男性匹配总次数
     */
    public void setMatchBoyCount(Integer matchBoyCount) {
        this.matchBoyCount = matchBoyCount;
    }

    /**
     * 获取每日女性匹配总次数
     *
     * @return match_girl_count - 每日女性匹配总次数
     */
    public Integer getMatchGirlCount() {
        return matchGirlCount;
    }

    /**
     * 设置每日女性匹配总次数
     *
     * @param matchGirlCount 每日女性匹配总次数
     */
    public void setMatchGirlCount(Integer matchGirlCount) {
        this.matchGirlCount = matchGirlCount;
    }

    /**
     * 获取每日女女匹配总次数
     *
     * @return match_girl_girl_count - 每日女女匹配总次数
     */
    public Integer getMatchGirlGirlCount() {
        return matchGirlGirlCount;
    }

    /**
     * 设置每日女女匹配总次数
     *
     * @param matchGirlGirlCount 每日女女匹配总次数
     */
    public void setMatchGirlGirlCount(Integer matchGirlGirlCount) {
        this.matchGirlGirlCount = matchGirlGirlCount;
    }

    /**
     * 获取每日男女匹配总次数
     *
     * @return match_boy_girl_count - 每日男女匹配总次数
     */
    public Integer getMatchBoyGirlCount() {
        return matchBoyGirlCount;
    }

    /**
     * 设置每日男女匹配总次数
     *
     * @param matchBoyGirlCount 每日男女匹配总次数
     */
    public void setMatchBoyGirlCount(Integer matchBoyGirlCount) {
        this.matchBoyGirlCount = matchBoyGirlCount;
    }

    /**
     * 获取每日男男匹配总次数
     *
     * @return match_boy_boy_count - 每日男男匹配总次数
     */
    public Integer getMatchBoyBoyCount() {
        return matchBoyBoyCount;
    }

    /**
     * 设置每日男男匹配总次数
     *
     * @param matchBoyBoyCount 每日男男匹配总次数
     */
    public void setMatchBoyBoyCount(Integer matchBoyBoyCount) {
        this.matchBoyBoyCount = matchBoyBoyCount;
    }

    /**
     * 获取每日男性匹配成功次数
     *
     * @return match_boy_success_count - 每日男性匹配成功次数
     */
    public Integer getMatchBoySuccessCount() {
        return matchBoySuccessCount;
    }

    /**
     * 设置每日男性匹配成功次数
     *
     * @param matchBoySuccessCount 每日男性匹配成功次数
     */
    public void setMatchBoySuccessCount(Integer matchBoySuccessCount) {
        this.matchBoySuccessCount = matchBoySuccessCount;
    }

    /**
     * 获取每日女性匹配成功次数
     *
     * @return match_girl_success_count - 每日女性匹配成功次数
     */
    public Integer getMatchGirlSuccessCount() {
        return matchGirlSuccessCount;
    }

    /**
     * 设置每日女性匹配成功次数
     *
     * @param matchGirlSuccessCount 每日女性匹配成功次数
     */
    public void setMatchGirlSuccessCount(Integer matchGirlSuccessCount) {
        this.matchGirlSuccessCount = matchGirlSuccessCount;
    }

    /**
     * 获取每日付费匹配总人数
     *
     * @return match_pay_people - 每日付费匹配总人数
     */
    public Integer getMatchPayPeople() {
        return matchPayPeople;
    }

    /**
     * 设置每日付费匹配总人数
     *
     * @param matchPayPeople 每日付费匹配总人数
     */
    public void setMatchPayPeople(Integer matchPayPeople) {
        this.matchPayPeople = matchPayPeople;
    }

    /**
     * 获取每日付费匹配总次数
     *
     * @return match_pay_count - 每日付费匹配总次数
     */
    public Integer getMatchPayCount() {
        return matchPayCount;
    }

    /**
     * 设置每日付费匹配总次数
     *
     * @param matchPayCount 每日付费匹配总次数
     */
    public void setMatchPayCount(Integer matchPayCount) {
        this.matchPayCount = matchPayCount;
    }

    /**
     * 获取每日男性付费总人数
     *
     * @return match_boy_pay_people - 每日男性付费总人数
     */
    public Integer getMatchBoyPayPeople() {
        return matchBoyPayPeople;
    }

    /**
     * 设置每日男性付费总人数
     *
     * @param matchBoyPayPeople 每日男性付费总人数
     */
    public void setMatchBoyPayPeople(Integer matchBoyPayPeople) {
        this.matchBoyPayPeople = matchBoyPayPeople;
    }

    /**
     * 获取每日男性付费总次数
     *
     * @return match_boy_pay_count - 每日男性付费总次数
     */
    public Integer getMatchBoyPayCount() {
        return matchBoyPayCount;
    }

    /**
     * 设置每日男性付费总次数
     *
     * @param matchBoyPayCount 每日男性付费总次数
     */
    public void setMatchBoyPayCount(Integer matchBoyPayCount) {
        this.matchBoyPayCount = matchBoyPayCount;
    }

    /**
     * 获取每日女性付费总人数
     *
     * @return match_girl_pay_people - 每日女性付费总人数
     */
    public Integer getMatchGirlPayPeople() {
        return matchGirlPayPeople;
    }

    /**
     * 设置每日女性付费总人数
     *
     * @param matchGirlPayPeople 每日女性付费总人数
     */
    public void setMatchGirlPayPeople(Integer matchGirlPayPeople) {
        this.matchGirlPayPeople = matchGirlPayPeople;
    }

    /**
     * 获取每日女性付费总次数
     *
     * @return match_girl_pay_count - 每日女性付费总次数
     */
    public Integer getMatchGirlPayCount() {
        return matchGirlPayCount;
    }

    /**
     * 设置每日女性付费总次数
     *
     * @param matchGirlPayCount 每日女性付费总次数
     */
    public void setMatchGirlPayCount(Integer matchGirlPayCount) {
        this.matchGirlPayCount = matchGirlPayCount;
    }

    /**
     * 获取每日android付费总人数
     *
     * @return match_android_pay_people - 每日android付费总人数
     */
    public Integer getMatchAndroidPayPeople() {
        return matchAndroidPayPeople;
    }

    /**
     * 设置每日android付费总人数
     *
     * @param matchAndroidPayPeople 每日android付费总人数
     */
    public void setMatchAndroidPayPeople(Integer matchAndroidPayPeople) {
        this.matchAndroidPayPeople = matchAndroidPayPeople;
    }

    /**
     * 获取每日android付费总次数
     *
     * @return match_android_pay_count - 每日android付费总次数
     */
    public Integer getMatchAndroidPayCount() {
        return matchAndroidPayCount;
    }

    /**
     * 设置每日android付费总次数
     *
     * @param matchAndroidPayCount 每日android付费总次数
     */
    public void setMatchAndroidPayCount(Integer matchAndroidPayCount) {
        this.matchAndroidPayCount = matchAndroidPayCount;
    }

    /**
     * 获取每日ios付费总人数
     *
     * @return match_ios_pay_people - 每日ios付费总人数
     */
    public Integer getMatchIosPayPeople() {
        return matchIosPayPeople;
    }

    /**
     * 设置每日ios付费总人数
     *
     * @param matchIosPayPeople 每日ios付费总人数
     */
    public void setMatchIosPayPeople(Integer matchIosPayPeople) {
        this.matchIosPayPeople = matchIosPayPeople;
    }

    /**
     * 获取每日男性付费匹配无人次数
     *
     * @return match_boy_pay_fail_count - 每日男性付费匹配无人次数
     */
    public Integer getMatchBoyPayFailCount() {
        return matchBoyPayFailCount;
    }

    /**
     * 设置每日男性付费匹配无人次数
     *
     * @param matchBoyPayFailCount 每日男性付费匹配无人次数
     */
    public void setMatchBoyPayFailCount(Integer matchBoyPayFailCount) {
        this.matchBoyPayFailCount = matchBoyPayFailCount;
    }

    /**
     * 获取每日男性付费匹配成功次数
     *
     * @return match_boy_pay_success_count - 每日男性付费匹配成功次数
     */
    public Integer getMatchBoyPaySuccessCount() {
        return matchBoyPaySuccessCount;
    }

    /**
     * 设置每日男性付费匹配成功次数
     *
     * @param matchBoyPaySuccessCount 每日男性付费匹配成功次数
     */
    public void setMatchBoyPaySuccessCount(Integer matchBoyPaySuccessCount) {
        this.matchBoyPaySuccessCount = matchBoyPaySuccessCount;
    }

    /**
     * 获取每日女性付费匹配无人次数
     *
     * @return match_girl_pay_fail_count - 每日女性付费匹配无人次数
     */
    public Integer getMatchGirlPayFailCount() {
        return matchGirlPayFailCount;
    }

    /**
     * 设置每日女性付费匹配无人次数
     *
     * @param matchGirlPayFailCount 每日女性付费匹配无人次数
     */
    public void setMatchGirlPayFailCount(Integer matchGirlPayFailCount) {
        this.matchGirlPayFailCount = matchGirlPayFailCount;
    }

    /**
     * 获取每日女性付费匹配成功次数
     *
     * @return match_girl_pay_success_count - 每日女性付费匹配成功次数
     */
    public Integer getMatchGirlPaySuccessCount() {
        return matchGirlPaySuccessCount;
    }

    /**
     * 设置每日女性付费匹配成功次数
     *
     * @param matchGirlPaySuccessCount 每日女性付费匹配成功次数
     */
    public void setMatchGirlPaySuccessCount(Integer matchGirlPaySuccessCount) {
        this.matchGirlPaySuccessCount = matchGirlPaySuccessCount;
    }

    /**
     * 获取每日ios付费总次数
     *
     * @return match_ios_pay_count - 每日ios付费总次数
     */
    public Integer getMatchIosPayCount() {
        return matchIosPayCount;
    }

    /**
     * 设置每日ios付费总次数
     *
     * @param matchIosPayCount 每日ios付费总次数
     */
    public void setMatchIosPayCount(Integer matchIosPayCount) {
        this.matchIosPayCount = matchIosPayCount;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", matchFail=").append(matchFail);
        sb.append(", matchSuccess=").append(matchSuccess);
        sb.append(", matchTotal=").append(matchTotal);
        sb.append(", matchBoyCount=").append(matchBoyCount);
        sb.append(", matchGirlCount=").append(matchGirlCount);
        sb.append(", matchGirlGirlCount=").append(matchGirlGirlCount);
        sb.append(", matchBoyGirlCount=").append(matchBoyGirlCount);
        sb.append(", matchBoyBoyCount=").append(matchBoyBoyCount);
        sb.append(", matchBoySuccessCount=").append(matchBoySuccessCount);
        sb.append(", matchGirlSuccessCount=").append(matchGirlSuccessCount);
        sb.append(", matchPayPeople=").append(matchPayPeople);
        sb.append(", matchPayCount=").append(matchPayCount);
        sb.append(", matchBoyPayPeople=").append(matchBoyPayPeople);
        sb.append(", matchBoyPayCount=").append(matchBoyPayCount);
        sb.append(", matchGirlPayPeople=").append(matchGirlPayPeople);
        sb.append(", matchGirlPayCount=").append(matchGirlPayCount);
        sb.append(", matchAndroidPayPeople=").append(matchAndroidPayPeople);
        sb.append(", matchAndroidPayCount=").append(matchAndroidPayCount);
        sb.append(", matchIosPayPeople=").append(matchIosPayPeople);
        sb.append(", matchBoyPayFailCount=").append(matchBoyPayFailCount);
        sb.append(", matchBoyPaySuccessCount=").append(matchBoyPaySuccessCount);
        sb.append(", matchGirlPayFailCount=").append(matchGirlPayFailCount);
        sb.append(", matchGirlPaySuccessCount=").append(matchGirlPaySuccessCount);
        sb.append(", matchIosPayCount=").append(matchIosPayCount);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}