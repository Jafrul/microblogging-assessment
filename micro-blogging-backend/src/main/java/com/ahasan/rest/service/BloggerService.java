package com.ahasan.rest.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahasan.rest.common.messages.BaseResponse;
import com.ahasan.rest.dao.BloggerDao;
import com.ahasan.rest.dto.BlogDTO;

@Service
public class BloggerService {
	
	@Autowired
	private BloggerDao bloggerDao;

	public BaseResponse  createBlogPostByBlogger(BlogDTO blogDTO) {
		return bloggerDao.createBlogPostByBlogger(blogDTO);
	}

//	public BaseResponse deleteOwnBlogPostById(int userId, long blogId);
//	
	public List<BlogDTO> findAllApproedBloggerPost(int status, int publish){
		return bloggerDao.findAllApproedBloggerPost(status, publish);
	}
	
//	public BaseResponse likeAndDislikeOtherApprvPost(LikeAndDislikeDTO likeAndDislikeDTO);
//	
//	public BaseResponse commentOtherApprovedPost(CommentDTO commentDTO);
}
