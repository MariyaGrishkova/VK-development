package ru.netology.vkdevelopment.domain;

public class PostData {
    private int postID;
    private int AuthorID;
    private int ownerID;
    private int postTime;
    private String text;
    private int replyOwnerID;
    private int replyPostID;

    private CommentingInfo commentsService;
    private LikesInfo likesService;
    private ViewsInfo viewsService;
    private GeoData geoService;

    int signedID;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavourite;

    private String imageURL;


    private String postType;


    public int getPostID() {
        return postID;
    }

    public void setPostID(int postID) {
        this.postID = postID;
    }

    public int getAuthorID() {
        return AuthorID;
    }

    public void setAuthorID(int authorID) {
        AuthorID = authorID;
    }

    public int getOwnerID() {
        return ownerID;
    }

    public void setOwnerID(int ownerID) {
        this.ownerID = ownerID;
    }

    public int getPostTime() {
        return postTime;
    }

    public void setPostTime(int postTime) {
        this.postTime = postTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerID() {
        return replyOwnerID;
    }

    public void setReplyOwnerID(int replyOwnerID) {
        this.replyOwnerID = replyOwnerID;
    }

    public int getReplyPostID() {
        return replyPostID;
    }

    public void setReplyPostID(int replyPostID) {
        this.replyPostID = replyPostID;
    }

    public CommentingInfo getCommentsService() {
        return commentsService;
    }

    public void setCommentsService(CommentingInfo commentsService) {
        this.commentsService = commentsService;
    }

    public LikesInfo getLikesService() {
        return likesService;
    }

    public void setLikesService(LikesInfo likesService) {
        this.likesService = likesService;
    }

    public ViewsInfo getViewsService() {
        return viewsService;
    }

    public void setViesService(ViewsInfo viesService) {
        this.viewsService = viewsService;
    }

    public GeoData getGeoService() {
        return geoService;
    }

    public void setGeoService(GeoData geoService) {
        this.geoService = geoService;
    }

    public int getSignedID() {
        return signedID;
    }

    public void setSignedID(int signedID) {
        this.signedID = signedID;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean favourite) {
        isFavourite = favourite;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }
}
