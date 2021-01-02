package manager;

import ru.netology.vkdevelopment.domain.PostData;
public class PostManager {
    private PostData[] posts;
    PostData postData = new PostData();

    public PostData[] getPostsToArray() {
        //to do
        return null;
    }

    public PostData[] search(int ownerID) {
        //to do
        return null;
    }

    public void delete(int postID, int ownerID) {
        //to find the post in Array and delete it
    }

    public void share (int ownerID, boolean CanShare){
        //to share post to friends
    }
    public void commentclose (int ownerID, boolean canClose){
        // to close the commention
    }
    public void commentopen (int ownerId, boolean canOpen){
        // to open the commentation
    }
}

