package com.oschina.blog.service;

import com.oschina.blog.dto.BlogPostDTO;

import java.util.List;

/**
 * Created by mzdbxqh on 2017/3/18.
 */
public interface PostService {
	List<BlogPostDTO> selectPostByAuthorId(long authorId);
	BlogPostDTO selectPostByPostId(long postId);
}
