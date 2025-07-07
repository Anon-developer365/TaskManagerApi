package uk.gov.hmcts.taskmanager.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * UpdateStatusRequest
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-07-07T12:08:13.061066500+01:00[Europe/London]")


public class UpdateStatusRequest   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("status")
  private String status = null;

  public UpdateStatusRequest id(String id) {
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

  public UpdateStatusRequest status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(description = "")
      @NotNull

    public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateStatusRequest updateStatusRequest = (UpdateStatusRequest) o;
    return Objects.equals(this.id, updateStatusRequest.id) &&
        Objects.equals(this.status, updateStatusRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateStatusRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
