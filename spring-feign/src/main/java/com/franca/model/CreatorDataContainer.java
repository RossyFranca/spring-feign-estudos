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
 * CreatorDataContainer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-06-27T09:43:02.471354500-03:00[America/Bahia]")


public class CreatorDataContainer   {
  @JsonProperty("offset")
  private BigDecimal offset = null;

  @JsonProperty("limit")
  private BigDecimal limit = null;

  @JsonProperty("total")
  private BigDecimal total = null;

  @JsonProperty("count")
  private BigDecimal count = null;

  @JsonProperty("results")
  @Valid
  private List<Creator> results = null;

  public CreatorDataContainer offset(BigDecimal offset) {
    this.offset = offset;
    return this;
  }

  /**
   * The requested offset (number of skipped results) of the call.
   * @return offset
   **/
  @ApiModelProperty(value = "The requested offset (number of skipped results) of the call.")
  
    @Valid
    public BigDecimal getOffset() {
    return offset;
  }

  public void setOffset(BigDecimal offset) {
    this.offset = offset;
  }

  public CreatorDataContainer limit(BigDecimal limit) {
    this.limit = limit;
    return this;
  }

  /**
   * The requested result limit.
   * @return limit
   **/
  @ApiModelProperty(value = "The requested result limit.")
  
    @Valid
    public BigDecimal getLimit() {
    return limit;
  }

  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }

  public CreatorDataContainer total(BigDecimal total) {
    this.total = total;
    return this;
  }

  /**
   * The total number of resources available given the current filter set.
   * @return total
   **/
  @ApiModelProperty(value = "The total number of resources available given the current filter set.")
  
    @Valid
    public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }

  public CreatorDataContainer count(BigDecimal count) {
    this.count = count;
    return this;
  }

  /**
   * The total number of results returned by this call.
   * @return count
   **/
  @ApiModelProperty(value = "The total number of results returned by this call.")
  
    @Valid
    public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }

  public CreatorDataContainer results(List<Creator> results) {
    this.results = results;
    return this;
  }

  public CreatorDataContainer addResultsItem(Creator resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<Creator>();
    }
    this.results.add(resultsItem);
    return this;
  }

  /**
   * The list of creators returned by the call.
   * @return results
   **/
  @ApiModelProperty(value = "The list of creators returned by the call.")
      @Valid
    public List<Creator> getResults() {
    return results;
  }

  public void setResults(List<Creator> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatorDataContainer creatorDataContainer = (CreatorDataContainer) o;
    return Objects.equals(this.offset, creatorDataContainer.offset) &&
        Objects.equals(this.limit, creatorDataContainer.limit) &&
        Objects.equals(this.total, creatorDataContainer.total) &&
        Objects.equals(this.count, creatorDataContainer.count) &&
        Objects.equals(this.results, creatorDataContainer.results);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offset, limit, total, count, results);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatorDataContainer {\n");
    
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
