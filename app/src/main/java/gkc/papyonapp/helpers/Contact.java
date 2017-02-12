package gkc.papyonapp.helpers;

/**
 * Created by gkc on 06/08/16.
 */
public class Contact {

    private int id;
    private String name;
    private String phoneNumber;
    private String uriPhotoThumbnail;
    private String uriPhoto;

    public Contact(int id, String name, String phoneNumber, String uriPhotoThumbnail, String uriPhoto) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.uriPhotoThumbnail = uriPhotoThumbnail;
        this.uriPhoto = uriPhoto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUriPhotoThumbnail() {
        return uriPhotoThumbnail;
    }

    public void setUriPhotoThumbnail(String uriPhotoThumbnail) {
        this.uriPhotoThumbnail = uriPhotoThumbnail;
    }

    public String getUriPhoto() {
        return uriPhoto;
    }

    public void setUriPhoto(String uriPhoto) {
        this.uriPhoto = uriPhoto;
    }
}
