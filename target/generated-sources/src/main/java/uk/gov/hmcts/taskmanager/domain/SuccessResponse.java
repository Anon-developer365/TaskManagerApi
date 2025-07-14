package uk.gov.hmcts.taskmanager.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * SuccessResponse
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-07-14T19:32:13.872798800+01:00[Europe/London]")


public class SuccessResponse   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("message")
  private String message = null;

  public SuccessResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique Task ID for the created task.
   * @return id
   **/
  @Schema(example = "c73ce3f9-40C7-a8f6b7ae7b7fb5", description = "Unique Task ID for the created task.")
      @NotNull

  @Pattern(regexp="^[{}0-9a-zA-Z-]{1-60}$")   public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SuccessResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @Schema(description = "")
      @NotNull

    public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
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
    SuccessResponse successResponse = (SuccessResponse) o;
    return Objects.equals(this.id, successResponse.id) &&
        Objects.equals(this.message, successResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuccessResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
