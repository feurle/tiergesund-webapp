package com.feurle.tiergesund.blog.web;

import com.feurle.tiergesund.blog.model.Post;
import com.feurle.tiergesund.blog.model.PostRepository;
import io.micrometer.core.annotation.Timed;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
@Slf4j
@Timed("tiergesund.blog")
public class PostResource {

    private final PostRepository postRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Post createPost(@Valid @RequestBody Post post) {
        log.info("Saving blog {}", post);
        return postRepository.save(post);
    }

    @GetMapping
    public List<Post> findAll() {
        List<Post> posts = postRepository.findAll();
        log.info("Getting posts {}", posts);
        return posts;
    }
}
