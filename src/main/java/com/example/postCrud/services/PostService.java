package com.example.postCrud.services;

import com.example.postCrud.models.PageOfItems;
import com.example.postCrud.models.Post;
import org.springframework.data.domain.Page;

public interface PostService {

    public PageOfItems<Post> getAllPostsPaginated(int pageNo, int pageSize);
    public Page<Post> getPageOfPost(int pageNo, int pageSize);


}
