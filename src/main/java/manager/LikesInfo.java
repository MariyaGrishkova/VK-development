package manager;

public class LikesInfo {
    private int count;
    private boolean userPutLike;
    private boolean canLike;
    private boolean canShare;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isUserPutLike() {
        return userPutLike;
    }

    public void setUserLikes(boolean userPutLike) {
        this.userPutLike = userPutLike;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public boolean isCanShare() {
        return canShare;
    }

    public void setCanPublish(boolean canShare) {
        this.canShare = canShare;
    }

}
