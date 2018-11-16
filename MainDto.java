package com.app.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String created;
	private String db;
	private String deleted;
	private String folder;
	private String id;
	private String language;
	private String name;
	private String num_columns;
	private String submissions;
	private String submissions_unread;
	private String updated;
	private String viewkey;
	private String views;
	private int submissions_today;
	private String last_submission_id;
	private String last_submission_time;
	private String url;
	private String data_url;
	private String summary_url;
	private String rss_url;
	private boolean encrypted;
	private String thumbnail_url;
	private String submit_button_title;
	private boolean inactive;
	private String timezone;
	private int permissions;
	private String javascript;
	private String html;
	private List<Field> fields=new ArrayList<Field>();

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getDb() {
		return db;
	}

	public void setDb(String db) {
		this.db = db;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	public String getFolder() {
		return folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNum_columns() {
		return num_columns;
	}

	public void setNum_columns(String num_columns) {
		this.num_columns = num_columns;
	}

	public String getSubmissions() {
		return submissions;
	}

	public void setSubmissions(String submissions) {
		this.submissions = submissions;
	}

	public String getSubmissions_unread() {
		return submissions_unread;
	}

	public void setSubmissions_unread(String submissions_unread) {
		this.submissions_unread = submissions_unread;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public String getViewkey() {
		return viewkey;
	}

	public void setViewkey(String viewkey) {
		this.viewkey = viewkey;
	}

	public String getViews() {
		return views;
	}

	public void setViews(String views) {
		this.views = views;
	}

	public int getSubmissions_today() {
		return submissions_today;
	}

	public void setSubmissions_today(int submissions_today) {
		this.submissions_today = submissions_today;
	}

	public String getLast_submission_id() {
		return last_submission_id;
	}

	public void setLast_submission_id(String last_submission_id) {
		this.last_submission_id = last_submission_id;
	}

	public String getLast_submission_time() {
		return last_submission_time;
	}

	public void setLast_submission_time(String last_submission_time) {
		this.last_submission_time = last_submission_time;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getData_url() {
		return data_url;
	}

	public void setData_url(String data_url) {
		this.data_url = data_url;
	}

	public String getSummary_url() {
		return summary_url;
	}

	public void setSummary_url(String summary_url) {
		this.summary_url = summary_url;
	}

	public String getRss_url() {
		return rss_url;
	}

	public void setRss_url(String rss_url) {
		this.rss_url = rss_url;
	}

	public boolean isEncrypted() {
		return encrypted;
	}

	public void setEncrypted(boolean encrypted) {
		this.encrypted = encrypted;
	}

	public String getThumbnail_url() {
		return thumbnail_url;
	}

	public void setThumbnail_url(String thumbnail_url) {
		this.thumbnail_url = thumbnail_url;
	}

	public String getSubmit_button_title() {
		return submit_button_title;
	}

	public void setSubmit_button_title(String submit_button_title) {
		this.submit_button_title = submit_button_title;
	}

	public boolean isInactive() {
		return inactive;
	}

	public void setInactive(boolean inactive) {
		this.inactive = inactive;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public int getPermissions() {
		return permissions;
	}

	public void setPermissions(int permissions) {
		this.permissions = permissions;
	}

	public String getJavascript() {
		return javascript;
	}

	public void setJavascript(String javascript) {
		this.javascript = javascript;
	}

	public String getHtml() {
		return html;
	}

	public void setHtml(String html) {
		this.html = html;
	}

	public List<Field> getFields() {
		return fields;
	}

	public void setFields(List<Field> fields) {
		this.fields = fields;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
