package example.vuejs.springboot.controller;

import java.util.Arrays;
import java.util.List;

import example.vuejs.springboot.entity.Post;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nefremov on 23.05.2018.
 *
 * @author Nikita Efremov
 */
@RestController
public class TestController {

    @GetMapping(value = "/test")
    public String index() {
        return "test";
    }

    @GetMapping(value = "/posts")
    public List<Post> getPosts() {
        Post post1 = new Post();
        post1.setTitle("TitleOne");
        post1.setBody("Body1 Body1Body1 Body1 Body1");

        Post post2 = new Post();
        post2.setTitle("TitleTwo");
        post2.setBody("Body2 Body2Body2Body2Body2 Body2");

        return Arrays.asList(post1, post2);
    }
}
