package com.oschina.blog.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by mzdbxqh on 2017/3/18.
 */
@XmlRootElement
public class BlogPostDTO {
	private long postId;
	private long authorId;
	private String postContent;
	private String postTitle;
	private String postStatus;

	public long getPostId() {
		return postId;
	}

	public void setPostId(long postId) {
		this.postId = postId;
	}

	public long getAuthorId() {
		return authorId;
	}

	public void setAuthorId(long authorId) {
		this.authorId = authorId;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public String getPostStatus() {
		return postStatus;
	}

	public void setPostStatus(String postStatus) {
		this.postStatus = postStatus;
	}

}
