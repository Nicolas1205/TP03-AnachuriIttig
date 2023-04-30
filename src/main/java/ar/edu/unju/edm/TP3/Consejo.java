package ar.edu.unju.edm.TP3;

import java.io.Serializable;

public class Consejo implements Serializable {
  private String title;
  private String description;

  public Consejo(String title, String description) {
    this.title = title;
    this.description = description;
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