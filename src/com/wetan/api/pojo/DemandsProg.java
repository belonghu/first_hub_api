package com.wetan.api.pojo;

import java.util.Date;
import java.util.List;

/**
 * Created by dhu on 2017/3/20.
 */
public class DemandsProg {

    private int id;
    private String title;
    private String detail;
    private String raw_content;
    private String sender;
    private String to;
    private String cc;
    private String email_id;
    private String create_date;
    /**
     * 是否是原始需求 0：否，1：是
     **/
    private int is_raw_demand;
    /**
     * 0：npt，1：rem
     **/
    private int demand_type;
    /**
     * 原始邮件id
     **/
    private int raw_pro_tid;
    /**
     * 程序计算出的原始需求相似度
     **/
    private String raw_pro_sim;
    private int confirm_israw_demand;
    /**
     * nonraw记录， 如果rawid 错误,人为修正
     **/
    private int confirm_prog_raw_tid;
    /**
     * npt 表的id
     **/
    private int confirm_man_tid;
    /**
     * npt需求对应的project id
     **/
    private int confirm_man_projid;
    /**
     * 程序计算相似度得到的projectid
     **/
    private int calc_projid;
    /**
     * 程序计算的到的和project需求内容最大的相似度
     **/
    private String prog_sim;
    private String manual_detail;

    private String demand_ctype;
    private String pruning_detail;
    private String assigner;
    private String assignee;
    private Date assgin_time;
    private int assigner_uid;
    private int assignee_uid;
    private String lang_type;
    private String client_type;
    private String industry_name;
    private String skm_group;
    private String sug_labels;
    private String sug_lab_accuracy_mark;
    private String pruning_detail_v0;
    private String force_pruning;
    private String manual_demand_keywords;
    private String client_email_suffix;
    private String client_calc_name;
    private String manual_detail_v0;
    private int  calc_contact_id;
    private int  calc_client_id;
    private String calc_contact_name;
    private String calc_client_type;
    private String client_am_team;
    private String labels;

    private String[] label_arr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getRaw_content() {
        return raw_content;
    }

    public void setRaw_content(String raw_content) {
        this.raw_content = raw_content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public int getIs_raw_demand() {
        return is_raw_demand;
    }

    public void setIs_raw_demand(int is_raw_demand) {
        this.is_raw_demand = is_raw_demand;
    }

    public int getDemand_type() {
        return demand_type;
    }

    public void setDemand_type(int demand_type) {
        this.demand_type = demand_type;
    }

    public int getRaw_pro_tid() {
        return raw_pro_tid;
    }

    public void setRaw_pro_tid(int raw_pro_tid) {
        this.raw_pro_tid = raw_pro_tid;
    }

    public String getRaw_pro_sim() {
        return raw_pro_sim;
    }

    public void setRaw_pro_sim(String raw_pro_sim) {
        this.raw_pro_sim = raw_pro_sim;
    }

    public int getConfirm_israw_demand() {
        return confirm_israw_demand;
    }

    public void setConfirm_israw_demand(int confirm_israw_demand) {
        this.confirm_israw_demand = confirm_israw_demand;
    }

    public int getConfirm_prog_raw_tid() {
        return confirm_prog_raw_tid;
    }

    public void setConfirm_prog_raw_tid(int confirm_prog_raw_tid) {
        this.confirm_prog_raw_tid = confirm_prog_raw_tid;
    }

    public int getConfirm_man_tid() {
        return confirm_man_tid;
    }

    public void setConfirm_man_tid(int confirm_man_tid) {
        this.confirm_man_tid = confirm_man_tid;
    }

    public int getConfirm_man_projid() {
        return confirm_man_projid;
    }

    public void setConfirm_man_projid(int confirm_man_projid) {
        this.confirm_man_projid = confirm_man_projid;
    }

    public int getCalc_projid() {
        return calc_projid;
    }

    public void setCalc_projid(int calc_projid) {
        this.calc_projid = calc_projid;
    }

    public String getProg_sim() {
        return prog_sim;
    }

    public void setProg_sim(String prog_sim) {
        this.prog_sim = prog_sim;
    }

    public String getManual_detail() {
        return manual_detail;
    }

    public void setManual_detail(String manual_detail) {
        this.manual_detail = manual_detail;
    }

    public String getDemand_ctype() {
        return demand_ctype;
    }

    public void setDemand_ctype(String demand_ctype) {
        this.demand_ctype = demand_ctype;
    }

    public String getPruning_detail() {
        return pruning_detail;
    }

    public void setPruning_detail(String pruning_detail) {
        this.pruning_detail = pruning_detail;
    }

    public String getAssigner() {
        return assigner;
    }

    public void setAssigner(String assigner) {
        this.assigner = assigner;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public Date getAssgin_time() {
        return assgin_time;
    }

    public void setAssgin_time(Date assgin_time) {
        this.assgin_time = assgin_time;
    }

    public int getAssigner_uid() {
        return assigner_uid;
    }

    public void setAssigner_uid(int assigner_uid) {
        this.assigner_uid = assigner_uid;
    }

    public int getAssignee_uid() {
        return assignee_uid;
    }

    public void setAssignee_uid(int assignee_uid) {
        this.assignee_uid = assignee_uid;
    }

    public String getLang_type() {
        return lang_type;
    }

    public void setLang_type(String lang_type) {
        this.lang_type = lang_type;
    }

    public String getClient_type() {
        return client_type;
    }

    public void setClient_type(String client_type) {
        this.client_type = client_type;
    }

    public String getIndustry_name() {
        return industry_name;
    }

    public void setIndustry_name(String industry_name) {
        this.industry_name = industry_name;
    }

    public String getSkm_group() {
        return skm_group;
    }

    public void setSkm_group(String skm_group) {
        this.skm_group = skm_group;
    }

    public String getSug_labels() {
        return sug_labels;
    }

    public void setSug_labels(String sug_labels) {
        this.sug_labels = sug_labels;
    }

    public String getSug_lab_accuracy_mark() {
        return sug_lab_accuracy_mark;
    }

    public void setSug_lab_accuracy_mark(String sug_lab_accuracy_mark) {
        this.sug_lab_accuracy_mark = sug_lab_accuracy_mark;
    }

    public String getPruning_detail_v0() {
        return pruning_detail_v0;
    }

    public void setPruning_detail_v0(String pruning_detail_v0) {
        this.pruning_detail_v0 = pruning_detail_v0;
    }

    public String getForce_pruning() {
        return force_pruning;
    }

    public void setForce_pruning(String force_pruning) {
        this.force_pruning = force_pruning;
    }

    public String getManual_demand_keywords() {
        return manual_demand_keywords;
    }

    public void setManual_demand_keywords(String manual_demand_keywords) {
        this.manual_demand_keywords = manual_demand_keywords;
    }

    public String getClient_email_suffix() {
        return client_email_suffix;
    }

    public void setClient_email_suffix(String client_email_suffix) {
        this.client_email_suffix = client_email_suffix;
    }

    public String getClient_calc_name() {
        return client_calc_name;
    }

    public void setClient_calc_name(String client_calc_name) {
        this.client_calc_name = client_calc_name;
    }

    public String getManual_detail_v0() {
        return manual_detail_v0;
    }

    public void setManual_detail_v0(String manual_detail_v0) {
        this.manual_detail_v0 = manual_detail_v0;
    }

    public int getCalc_contact_id() {
        return calc_contact_id;
    }

    public void setCalc_contact_id(int calc_contact_id) {
        this.calc_contact_id = calc_contact_id;
    }

    public int getCalc_client_id() {
        return calc_client_id;
    }

    public void setCalc_client_id(int calc_client_id) {
        this.calc_client_id = calc_client_id;
    }

    public String getCalc_contact_name() {
        return calc_contact_name;
    }

    public void setCalc_contact_name(String calc_contact_name) {
        this.calc_contact_name = calc_contact_name;
    }

    public String getCalc_client_type() {
        return calc_client_type;
    }

    public void setCalc_client_type(String calc_client_type) {
        this.calc_client_type = calc_client_type;
    }

    public String getClient_am_team() {
        return client_am_team;
    }

    public void setClient_am_team(String client_am_team) {
        this.client_am_team = client_am_team;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public String[] getLabel_arr() {
        return label_arr;
    }

    public void setLabel_arr(String[] label_arr) {
        this.label_arr = label_arr;
    }
}
