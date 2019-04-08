package com.tutorials.webservice.service;

import static org.assertj.core.api.Assertions.assertThat;
import com.tutorials.webservice.domain.posts.Posts;
import com.tutorials.webservice.domain.posts.PostsRepository;
import com.tutorials.webservice.dto.posts.PostsSaveRequestDto;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostServiceTest {
    @Autowired
    private PostsService postsService;
    @Autowired
    private PostsRepository postsRepository;
    @After
    public void cleanup() {
        postsRepository.deleteAll();
    }
    @Test
    public void Dto데이터가_posts테이블에_저장된다() {
        // given
        PostsSaveRequestDto dto = PostsSaveRequestDto.builder()
                .title("타이틀 테스트").content("테스트").author("jo@jol.com").build();

        // when
        postsService.save(dto);

        // then
        Posts posts = postsRepository.findAll().get(0);
        assertThat(posts.getTitle()).isEqualTo(dto.getTitle());
        assertThat(posts.getContent()).isEqualTo(dto.getContent());
        assertThat(posts.getAuthor()).isEqualTo(dto.getAuthor());
    }
}
