package uk.gov.hmcts.taskmanager.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * ErrorResponse
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-06-19T12:00:16.237226+01:00[Europe/London]")


public class ErrorResponse   {
  @JsonProperty("date")
  private Date date = null;

  @JsonProperty("error")
  private String error = null;

  @JsonProperty("message")
  @Valid
  private List<String> message = null;

  public ErrorResponse date(Date date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public ErrorResponse error(String error) {
    this.error = error;
    return this;
  }

  /**
   * The type of error.
   * @return error
   **/
  @Schema(example = "Internal Error", description = "The type of error.")
      @NotNull

    public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public ErrorResponse message(List<String> message) {
    this.message = message;
    return this;
  }

  public ErrorResponse addMessageItem(String messageItem) {
    if (this.message == null) {
      this.message = new ArrayList<String>();
    }
    this.message.add(messageItem);
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @Schema(description = "")
      @NotNull

  @Size(max=999)   public List<String> getMessage() {
    return message;
  }

  public void setMessage(List<String> message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.date, errorResponse.date) &&
        Objects.equals(this.error, errorResponse.error) &&
        Objects.equals(this.message, errorResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, error, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
