package com.oracle.hrb.cloudnote.entity;

import javax.xml.crypto.Data;

public class Note {
	private String id;
	private String title;
	private String body;
	private Data modifyTime;
	private String notebookId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Data getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Data modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getNotebookId() {
		return notebookId;
	}

	public void setNotebookId(String notebookId) {
		this.notebookId = notebookId;
	}

	@Override
	public String toString() {
		return "Note{" +
				"id='" + id + '\'' +
				", title='" + title + '\'' +
				", body='" + body + '\'' +
				", modifyTime=" + modifyTime +
				", notebookId='" + notebookId + '\'' +
				'}';
	}
}
