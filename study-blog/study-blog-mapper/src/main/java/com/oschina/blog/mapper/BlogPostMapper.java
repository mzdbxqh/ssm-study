package com.oschina.blog.mapper;

import com.oschina.blog.pojo.BlogPost;

import java.util.List;

/**
 * Created by mzdbxqh on 2017/3/18.
 */
public interface BlogPostMapper {
	List<BlogPost> selectByAuthorId(long authorId);
	BlogPost selectByPostId(long postId);
}
