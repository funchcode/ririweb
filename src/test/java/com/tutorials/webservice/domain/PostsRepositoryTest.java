package com.tutorials.webservice.domain;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import com.tutorials.webservice.domain.posts.Posts;
import com.tutorials.webservice.domain.posts.PostsRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {
    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    public void 게시저장_불러오기() {
        //given
        postsRepository.save(Posts.builder()
            .title("테스트 게시글").content("테스트 본문")
            .author("funchcode@gmail.com").build());

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle(), is("테스트 게시글"));
    }

    @Test
    public void BaseTimeEntity_등록() {
        //given
        LocalDateTime now = LocalDateTime.now();
        postsRepository.save(Posts.builder()
            .title("테스트 게시글").content("테스트 본문").author("funchcode@gmail.com").build());

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertTrue(posts.getCreatedDate().isAfter(now));
        assertTrue(posts.getModifiedDate().isAfter(now));
    }
}
