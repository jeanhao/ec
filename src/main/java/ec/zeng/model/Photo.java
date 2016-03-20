package ec.zeng.model;

public class Photo {
    private Integer id;

    private String description;

    private String url;

    private Integer albumsId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getAlbumsId() {
        return albumsId;
    }

    public void setAlbumsId(Integer albumsId) {
        this.albumsId = albumsId;
    }
}