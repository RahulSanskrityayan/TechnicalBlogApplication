package technicalBlog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalBlog.Service.PostService;
import technicalBlog.model.Post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HomeController {
    public HomeController(){
        System.out.println("this is HomeController");
    }
    @Autowired
    private PostService postService;
    @RequestMapping("/")

    public String getAllPosts(Model model){
        List<Post> posts=postService.getAllposts();

        model.addAttribute("posts",posts);

        return "index";
    }



}
