package ar.edu.unju.edm.TP3;

import java.io.Serializable;

public class Producto implements Serializable {
  private String title;
  private String description;
  private String imgUrl;

  public String getImgUrl() {
    return imgUrl;
  }

  public void setImgUrl(String imgUrl) {
    this.imgUrl = imgUrl;
  }

  public Producto(String title, String description, String imgUrl) {
    this.title = title;
    this.description = description;
    this.imgUrl = imgUrl;
  }

  public Producto() {
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
