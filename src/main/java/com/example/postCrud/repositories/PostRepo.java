package com.example.postCrud.repositories;


import com.example.postCrud.models.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface PostRepo extends PagingAndSortingRepository<Post, Long> {

    List<Post> findAll();
    Page<Post> findAll(Pageable pageable);
}
