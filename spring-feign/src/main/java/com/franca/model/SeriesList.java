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
 * SeriesList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-06-27T09:43:02.471354500-03:00[America/Bahia]")


public class SeriesList   {
  @JsonProperty("available")
  private BigDecimal available = null;

  @JsonProperty("returned")
  private BigDecimal returned = null;

  @JsonProperty("collectionURI")
  private String collectionURI = null;

  @JsonProperty("items")
  @Valid
  private List<SeriesSummary> items = null;

  public SeriesList available(BigDecimal available) {
    this.available = available;
    return this;
  }

  /**
   * The number of total available series in this list. Will always be greater than or equal to the \"returned\" value.
   * @return available
   **/
  @ApiModelProperty(value = "The number of total available series in this list. Will always be greater than or equal to the \"returned\" value.")
  
    @Valid
    public BigDecimal getAvailable() {
    return available;
  }

  public void setAvailable(BigDecimal available) {
    this.available = available;
  }

  public SeriesList returned(BigDecimal returned) {
    this.returned = returned;
    return this;
  }

  /**
   * The number of series returned in this collection (up to 20).
   * @return returned
   **/
  @ApiModelProperty(value = "The number of series returned in this collection (up to 20).")
  
    @Valid
    public BigDecimal getReturned() {
    return returned;
  }

  public void setReturned(BigDecimal returned) {
    this.returned = returned;
  }

  public SeriesList collectionURI(String collectionURI) {
    this.collectionURI = collectionURI;
    return this;
  }

  /**
   * The path to the full list of series in this collection.
   * @return collectionURI
   **/
  @ApiModelProperty(value = "The path to the full list of series in this collection.")
  
    public String getCollectionURI() {
    return collectionURI;
  }

  public void setCollectionURI(String collectionURI) {
    this.collectionURI = collectionURI;
  }

  public SeriesList items(List<SeriesSummary> items) {
    this.items = items;
    return this;
  }

  public SeriesList addItemsItem(SeriesSummary itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<SeriesSummary>();
    }
    this.items.add(itemsItem);
    return this;
  }

  /**
   * The list of returned series in this collection.
   * @return items
   **/
  @ApiModelProperty(value = "The list of returned series in this collection.")
      @Valid
    public List<SeriesSummary> getItems() {
    return items;
  }

  public void setItems(List<SeriesSummary> items) {
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
    SeriesList seriesList = (SeriesList) o;
    return Objects.equals(this.available, seriesList.available) &&
        Objects.equals(this.returned, seriesList.returned) &&
        Objects.equals(this.collectionURI, seriesList.collectionURI) &&
        Objects.equals(this.items, seriesList.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, returned, collectionURI, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeriesList {\n");
    
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
