package com.example.postCrud.services;


import com.example.postCrud.models.PageOfItems;
import com.example.postCrud.models.Post;
import com.example.postCrud.repositories.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepo postRepo;

    public PostServiceImpl(PostRepo postRepo) {
        this.postRepo = postRepo;
    }

    public PageOfItems<Post> getAllPostsPaginated(int pageNo, int pageSize){
        PageOfItems<Post> postPageOfItems = new PageOfItems<Post>();
        Page<Post> pageResult = getPageOfPost(pageNo, pageSize);
        postPageOfItems.setItems(pageResult.toList());
        postPageOfItems.setHasNext(pageResult.hasNext());
        postPageOfItems.setTotalElements((int)pageResult.getTotalElements());
        return postPageOfItems;
    }

    public Page<Post> getPageOfPost(int pageNo, int pageSize){
        Pageable paging = PageRequest.of(pageNo, pageSize);
        Page<Post> pageResult = postRepo.findAll(paging);
        return pageResult;
    }
}
