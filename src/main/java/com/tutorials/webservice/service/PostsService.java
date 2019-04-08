package com.tutorials.webservice.service;

import com.tutorials.webservice.domain.posts.Posts;
import com.tutorials.webservice.domain.posts.PostsRepository;
import com.tutorials.webservice.dto.posts.PostsMainResponseDto;
import com.tutorials.webservice.dto.posts.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto dto) {
        return postsRepository.save(dto.toEntity()).getId();
    }

    @Transactional
    public List<PostsMainResponseDto> findAllDesc() {
        return postsRepository.findAllDesc().map(PostsMainResponseDto::new).collect(Collectors.toList());
    }
}
