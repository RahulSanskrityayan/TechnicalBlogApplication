package technicalBlog.Service;

import org.springframework.stereotype.Service;
import technicalBlog.model.Post;

import javax.persistence.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    @PersistenceUnit(unitName="techblog")
   private EntityManagerFactory emf;

    public List<Post> getAllposts(){
        ArrayList<Post> posts =new ArrayList<>();


        EntityManager em=emf.createEntityManager();
        TypedQuery<Post> query = em.createNamedQuery("SELECT p from Post p", Post.class);
         List<Post> resultList = query.getResultList();

//        Connection connection=null;
//        try {
//            Class.forName("org.postgresql.Driver");
//            try {
//                 connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/technicalblog","postgres","Ani@1991");
//                Statement statement=connection.createStatement();
//                ResultSet rs=statement.executeQuery("SELECT * FROM posts");
//
//                while(rs.next()){
//                    Post post=new Post();
//                    post.setTitle(rs.getString("title"));
//                    post.setBody(rs.getString("body"));
//                    posts.add(post);
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//
//
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        finally {
//            try {
//                connection.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }


        return resultList;

    }
    public ArrayList<Post> getOnePost() {
        ArrayList<Post> posts = new ArrayList<>();

//        Post post1 = new Post();
//        post1.setTitle("This is your Post");
//        post1.setBody("This is your Post. It has some valid content");
//        post1.setDate(new Date());
//        posts.add(post1);
        Connection connection=null;
        try {
            Class.forName("org.postgresql.Driver");
            try {
                 connection= DriverManager.getConnection("jdbc:postgresql://localhost:5432/technicalblog","postgres","Ani@1991");
                Statement statement=connection.createStatement();
                ResultSet rs=statement.executeQuery("SELECT * FROM posts where id=2");

                while(rs.next()){
                    Post post=new Post();
                    post.setTitle(rs.getString("title"));
                    post.setBody(rs.getString("body"));
                    posts.add(post);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        return posts;

    }
    public void createPost (Post newPost){
    }
}
