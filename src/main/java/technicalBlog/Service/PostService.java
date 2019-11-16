package technicalBlog.Service;

import org.springframework.stereotype.Service;
import technicalBlog.model.Post;

import java.util.ArrayList;
import java.util.Date;

@Service
public class PostService {

    public PostService(){
        System.out.println("this is postService");
    }

    public ArrayList<Post> getAllposts(){
        ArrayList<Post> posts =new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("Post1");
        post1.setBody("This is post 1");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post2");
        post2.setBody("This is post 2");
        post2.setDate(new Date());

        Post post3 = new Post();
        post3.setTitle("Post3");
        post3.setBody("This is post 3");
        post3.setDate(new Date());

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        return posts;

    }
    public ArrayList<Post> getOnePost() {
        ArrayList<Post> posts = new ArrayList<>();

        Post post1 = new Post();
        post1.setTitle("This is your Post");
        post1.setBody("This is your Post. It has some valid content");
        post1.setDate(new Date());
        posts.add(post1);

        return posts;

    }
}