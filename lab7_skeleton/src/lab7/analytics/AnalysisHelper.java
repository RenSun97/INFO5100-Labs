/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

/**
 *
 * @author harshalneelkamal
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

public class AnalysisHelper {

    //Find Average number of likes per comment.
    //TODO
    public void getAverageLikesPerCommets() {
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
        int likeNumber = 0;
        int commentNumber = comments.size();
        for (Comment c : comments.values()) {
            likeNumber += c.getLikes();
        }

        System.out.println("average of likes per comments: " + likeNumber / commentNumber);

    }

    public void getMostLikesCommetsPost() {
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        List<Map.Entry<Integer, Post>> list = new ArrayList<>(posts.entrySet());
        Comparator<Map.Entry<Integer, Post>> comparator = new Comparator<Map.Entry<Integer, Post>>() {
            @Override
            public int compare(Map.Entry<Integer, Post> arg0, Map.Entry<Integer, Post> arg1) {
                int likeNumber0 = 0;
                for (Comment c : arg0.getValue().getComments()) {
                    likeNumber0 += c.getLikes();
                }
                int likeNumber1 = 0;
                for (Comment c : arg1.getValue().getComments()) {
                    likeNumber1 += c.getLikes();
                }
                return likeNumber0 - likeNumber1;
            }
        };
        Collections.sort(list, comparator);
        for (Map.Entry<Integer, Post> entry : list) {
            int likeNumber = 0;
            for (Comment c : entry.getValue().getComments()) {
                likeNumber += c.getLikes();
            }
            System.out.println(likeNumber);
        }
        Map.Entry<Integer, Post> entry = list.get(list.size() - 1);
        int likeNumber = 0;
        for (Comment c : entry.getValue().getComments()) {
            likeNumber += c.getLikes();
        }
        System.out.println("the post with most liked comments: " + entry.getValue() + " with " + likeNumber + " comments");
    }

    public void getMostCommetsPost() {
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        List<Map.Entry<Integer, Post>> list = new ArrayList<>(posts.entrySet());
        Comparator<Map.Entry<Integer, Post>> comparator = new Comparator<Map.Entry<Integer, Post>>() {
            @Override
            public int compare(Map.Entry<Integer, Post> arg0, Map.Entry<Integer, Post> arg1) {
                return arg0.getValue().getComments().size() - arg1.getValue().getComments().size();
            }
        };
        Collections.sort(list, comparator);
        for (Map.Entry<Integer, Post> entry : list) {
            System.out.println(entry.getValue().getComments().size());
        }
        Map.Entry<Integer, Post> entry = list.get(list.size() - 1);
        System.out.println("the post with most comments: " + entry.getValue() + " with " + entry.getValue().getComments().size() + " comments");
    }

    public void getTop5InactiveUsersByTotalPostsNumber() {
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        List<Map.Entry<Integer, User>> list = new ArrayList<>(users.entrySet());
        Comparator<Map.Entry<Integer, User>> comparator = new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> arg0, Map.Entry<Integer, User> arg1) {
                HashSet<Integer> postsNumbers0 = new HashSet<>();
                for (Comment c : arg0.getValue().getComments()) {
                    postsNumbers0.add(c.getPostId());
                }
                HashSet<Integer> postsNumbers1 = new HashSet<>();
                for (Comment c : arg1.getValue().getComments()) {
                    postsNumbers1.add(c.getPostId());
                }
                return postsNumbers0.size() - postsNumbers1.size();
            }
        };
        Collections.sort(list, comparator);
        for (Map.Entry<Integer, User> entry : list) {
            HashSet<Integer> postsNumbers = new HashSet<>();
            for (Comment c : entry.getValue().getComments()) {
                postsNumbers.add(c.getPostId());
            }
            System.out.println(postsNumbers.size());
        }
        for (int i = 0; i < 5; i++) {
            Map.Entry<Integer, User> entry = list.get(i);
            HashSet<Integer> postsNumbers = new HashSet<>();
            for (Comment c : entry.getValue().getComments()) {
                postsNumbers.add(c.getPostId());
            }
            System.out.println(entry.getValue() + "with posts numbers " + postsNumbers.size());
        }
    }

    public void getTop5InactiveUsersByTotalComments() {
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        List<Map.Entry<Integer, User>> list = new ArrayList<>(users.entrySet());
        Comparator<Map.Entry<Integer, User>> comparator = new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> arg0, Map.Entry<Integer, User> arg1) {
                return arg0.getValue().getComments().size() - arg1.getValue().getComments().size();
            }
        };
        Collections.sort(list, comparator);
        for (Map.Entry<Integer, User> entry : list) {
            System.out.println(entry.getValue().getComments().size());
        }
        for (int i = 0; i < 5; i++) {
            Map.Entry<Integer, User> entry = list.get(i);
            System.out.println(entry.getValue() + "with comments numbers " + entry.getValue().getComments().size());
        }
    }

    public void getTop5InactiveUsersByOverall() {
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        List<Map.Entry<Integer, User>> list = new ArrayList<>(users.entrySet());
        Comparator<Map.Entry<Integer, User>> comparator = new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> arg0, Map.Entry<Integer, User> arg1) {
                int comments0 = arg0.getValue().getComments().size();
                HashSet<Integer> postsNumbers0 = new HashSet<>();
                for (Comment c : arg0.getValue().getComments()) {
                    postsNumbers0.add(c.getPostId());
                }
                int postsNumber0 = postsNumbers0.size();
                int likeNumber0 = 0;
                for (Comment c : arg0.getValue().getComments()) {
                    likeNumber0 += c.getLikes();
                }

                int comments1 = arg1.getValue().getComments().size();
                HashSet<Integer> postsNumbers1 = new HashSet<>();
                for (Comment c : arg1.getValue().getComments()) {
                    postsNumbers1.add(c.getPostId());
                }
                int postsNumber1 = postsNumbers1.size();
                int likeNumber1 = 0;
                for (Comment c : arg1.getValue().getComments()) {
                    likeNumber1 += c.getLikes();
                }

                return (comments0 + postsNumber0 + likeNumber0) - (comments1 + postsNumber1 + likeNumber1);
            }
        };
        Collections.sort(list, comparator);
        for (Map.Entry<Integer, User> entry : list) {
            int comments = entry.getValue().getComments().size();
            HashSet<Integer> postsNumbers0 = new HashSet<>();
            for (Comment c : entry.getValue().getComments()) {
                postsNumbers0.add(c.getPostId());
            }
            int postsNumber = postsNumbers0.size();
            int likeNumber = 0;
            for (Comment c : entry.getValue().getComments()) {
                likeNumber += c.getLikes();
            }
            System.out.println(comments + postsNumber + likeNumber);
        }
        for (int i = 0; i < 5; i++) {
            Map.Entry<Integer, User> entry = list.get(i);
            int comments = entry.getValue().getComments().size();
            HashSet<Integer> postsNumbers0 = new HashSet<>();
            for (Comment c : entry.getValue().getComments()) {
                postsNumbers0.add(c.getPostId());
            }
            int postsNumber = postsNumbers0.size();
            int likeNumber = 0;
            for (Comment c : entry.getValue().getComments()) {
                likeNumber += c.getLikes();
            }
            System.out.println(entry.getValue() + "with overall " + (comments + postsNumber + likeNumber));
        }
    }

    public void getTop5ProactiveUsersByOverall() {
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        List<Map.Entry<Integer, User>> list = new ArrayList<>(users.entrySet());
        Comparator<Map.Entry<Integer, User>> comparator = new Comparator<Map.Entry<Integer, User>>() {
            @Override
            public int compare(Map.Entry<Integer, User> arg0, Map.Entry<Integer, User> arg1) {
                int comments0 = arg0.getValue().getComments().size();
                HashSet<Integer> postsNumbers0 = new HashSet<>();
                for (Comment c : arg0.getValue().getComments()) {
                    postsNumbers0.add(c.getPostId());
                }
                int postsNumber0 = postsNumbers0.size();
                int likeNumber0 = 0;
                for (Comment c : arg0.getValue().getComments()) {
                    likeNumber0 += c.getLikes();
                }

                int comments1 = arg1.getValue().getComments().size();
                HashSet<Integer> postsNumbers1 = new HashSet<>();
                for (Comment c : arg1.getValue().getComments()) {
                    postsNumbers1.add(c.getPostId());
                }
                int postsNumber1 = postsNumbers1.size();
                int likeNumber1 = 0;
                for (Comment c : arg1.getValue().getComments()) {
                    likeNumber1 += c.getLikes();
                }

                return (comments1 + postsNumber1 + likeNumber1) - (comments0 + postsNumber0 + likeNumber0);
            }
        };
        Collections.sort(list, comparator);
        for (Map.Entry<Integer, User> entry : list) {
            int comments = entry.getValue().getComments().size();
            HashSet<Integer> postsNumbers0 = new HashSet<>();
            for (Comment c : entry.getValue().getComments()) {
                postsNumbers0.add(c.getPostId());
            }
            int postsNumber = postsNumbers0.size();
            int likeNumber = 0;
            for (Comment c : entry.getValue().getComments()) {
                likeNumber += c.getLikes();
            }
            System.out.println(comments + postsNumber + likeNumber);
        }
        for (int i = 0; i < 5; i++) {
            Map.Entry<Integer, User> entry = list.get(i);
            int comments = entry.getValue().getComments().size();
            HashSet<Integer> postsNumbers0 = new HashSet<>();
            for (Comment c : entry.getValue().getComments()) {
                postsNumbers0.add(c.getPostId());
            }
            int postsNumber = postsNumbers0.size();
            int likeNumber = 0;
            for (Comment c : entry.getValue().getComments()) {
                likeNumber += c.getLikes();
            }
            System.out.println(entry.getValue() + "with overall " + (comments + postsNumber + likeNumber));
        }
    }

}
