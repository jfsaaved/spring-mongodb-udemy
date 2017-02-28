package com.jfsaaved;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfsaaved.domain.Author;
import com.jfsaaved.domain.Post;
import com.jfsaaved.repository.AuthorRepository;
import com.jfsaaved.repository.PostRepository;

@Service
public class DatabaseLoader {
	
	private static final Logger logger = LoggerFactory.getLogger(SpringMongodbUdemyApplication.class);
	private final PostRepository postRepository;
	private final AuthorRepository authorRepository;
	
	@Autowired
	public DatabaseLoader(PostRepository postRepository, AuthorRepository authorRepository) {
		this.postRepository = postRepository;
		this.authorRepository = authorRepository;
	}
	
	@PostConstruct
	private void initDatabase() {
		
		authorRepository.deleteAll();
		
		Author dv = new Author();
		dv.setFirstName("Julian");
		dv.setLastName("Saavedra");
		dv.setEmail("julian.felipe.saavedra@gmail.com");
		authorRepository.save(dv);
		
		postRepository.deleteAll();
		
		Post post = new Post();
		post.setAuthor(dv);
		post.setBody("Body");
		post.setPostedOn(new Date());
		post.setSlug("Slug");
		post.setTeaser("Teaser");
		post.setTitle("Title");
		postRepository.save(post);
		
	}

}
