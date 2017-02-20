package party.infoo.entity;

import java.sql.Blob;

/**
 * Created by infoo on 2017/2/20.
 */
public class Image {
    private long imageId;
    private String imageName;
    private Blob  imageBlob;

    public Image() {
        super();
    }

    public long getImageId() {
        return imageId;
    }

    public void setImageId(long imageId) {
        this.imageId = imageId;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Blob getImageBlob() {
        return imageBlob;
    }

    public void setImageBlob(Blob imageBlob) {
        this.imageBlob = imageBlob;
    }
}
