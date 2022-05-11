package com.example.postCrud.controller;


import com.example.postCrud.models.PageOfItems;
import com.example.postCrud.models.Post;
import com.example.postCrud.services.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(originPatterns = {"${fems.url}"}, allowCredentials = "true")
@RestController
@RequestMapping("/posts")
public class PostController {

    private PostService postService;
    private ModelMapper mapper;

    @Autowired
    public PostController(PostService postService, ModelMapper mapper){
        this.postService = postService;
        this.mapper = mapper;
    }

    @GetMapping
    public String test(){
        return "you hit the /posts controller";
    }

    @GetMapping(params = {"pageNumber", "pageSize"})
    public PageOfItems<Post> findPaginated(@RequestParam("pageNumber") int page, @RequestParam("pageSize") int size){
        return  postService.getAllPostsPaginated(page, size);
    }


}
