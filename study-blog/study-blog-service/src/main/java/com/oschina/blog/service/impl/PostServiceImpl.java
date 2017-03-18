package com.oschina.blog.service.impl;

import com.oschina.blog.dto.BlogPostDTO;
import com.oschina.blog.mapper.BlogPostMapper;
import com.oschina.blog.service.PostService;
import com.oschina.blog.pojo.BlogPost;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mzdbxqh on 2017/3/18.
 */
@Service
public class PostServiceImpl implements PostService {

	@Resource
	private BlogPostMapper blogPostMapper;

	@Override
	public List<BlogPostDTO> selectPostByAuthorId(long authorId) {
		List<BlogPost> blogposts = blogPostMapper.selectByAuthorId(authorId);
		List<BlogPostDTO> blogPostDTOs = new ArrayList<>(blogposts.size());
		for(BlogPost blogPost:blogposts){
			BlogPostDTO blogPostDTO = new BlogPostDTO();
			BeanUtils.copyProperties(blogPost,blogPostDTO);
			blogPostDTOs.add(blogPostDTO);
		}
		return blogPostDTOs;
	}

	@Override
	public BlogPostDTO selectPostByPostId(long postId) {
		BlogPostDTO blogPostDTO = new BlogPostDTO();
		BeanUtils.copyProperties(blogPostMapper.selectByPostId(postId),blogPostDTO);
		return blogPostDTO;
	}
}
