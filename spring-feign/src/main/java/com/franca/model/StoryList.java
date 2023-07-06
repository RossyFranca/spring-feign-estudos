package model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * StoryList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-06-27T09:43:02.471354500-03:00[America/Bahia]")


public class StoryList   {
  @JsonProperty("available")
  private BigDecimal available = null;

  @JsonProperty("returned")
  private BigDecimal returned = null;

  @JsonProperty("collectionURI")
  private String collectionURI = null;

  @JsonProperty("items")
  @Valid
  private List<StorySummary> items = null;

  public StoryList available(BigDecimal available) {
    this.available = available;
    return this;
  }

  /**
   * The number of total available stories in this list. Will always be greater than or equal to the \"returned\" value.
   * @return available
   **/
  @ApiModelProperty(value = "The number of total available stories in this list. Will always be greater than or equal to the \"returned\" value.")
  
    @Valid
    public BigDecimal getAvailable() {
    return available;
  }

  public void setAvailable(BigDecimal available) {
    this.available = available;
  }

  public StoryList returned(BigDecimal returned) {
    this.returned = returned;
    return this;
  }

  /**
   * The number of stories returned in this collection (up to 20).
   * @return returned
   **/
  @ApiModelProperty(value = "The number of stories returned in this collection (up to 20).")
  
    @Valid
    public BigDecimal getReturned() {
    return returned;
  }

  public void setReturned(BigDecimal returned) {
    this.returned = returned;
  }

  public StoryList collectionURI(String collectionURI) {
    this.collectionURI = collectionURI;
    return this;
  }

  /**
   * The path to the full list of stories in this collection.
   * @return collectionURI
   **/
  @ApiModelProperty(value = "The path to the full list of stories in this collection.")
  
    public String getCollectionURI() {
    return collectionURI;
  }

  public void setCollectionURI(String collectionURI) {
    this.collectionURI = collectionURI;
  }

  public StoryList items(List<StorySummary> items) {
    this.items = items;
    return this;
  }

  public StoryList addItemsItem(StorySummary itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<StorySummary>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * The list of returned stories in this collection.
   * @return items
   **/
  @ApiModelProperty(value = "The list of returned stories in this collection.")
      @Valid
    public List<StorySummary> getItems() {
    return items;
  }

  public void setItems(List<StorySummary> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoryList storyList = (StoryList) o;
    return Objects.equals(this.available, storyList.available) &&
        Objects.equals(this.returned, storyList.returned) &&
        Objects.equals(this.collectionURI, storyList.collectionURI) &&
        Objects.equals(this.items, storyList.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, returned, collectionURI, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoryList {\n");
    
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    returned: ").append(toIndentedString(returned)).append("\n");
    sb.append("    collectionURI: ").append(toIndentedString(collectionURI)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
