package uk.gov.hmcts.taskmanager.domain;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.time.LocalDateTime;
import org.springframework.validation.annotation.Validated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

/**
 * Task
 */
@Validated
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-07-14T19:32:13.872798800+01:00[Europe/London]")


public class Task   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("taskDescription")
  private String taskDescription = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("dueDate")
  private LocalDateTime dueDate = null;

  public Task id(String id) {
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

  public Task title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
   **/
  @Schema(description = "")
      @NotNull

    public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Task taskDescription(String taskDescription) {
    this.taskDescription = taskDescription;
    return this;
  }

  /**
   * Get taskDescription
   * @return taskDescription
   **/
  @Schema(description = "")
  
    public String getTaskDescription() {
    return taskDescription;
  }

  public void setTaskDescription(String taskDescription) {
    this.taskDescription = taskDescription;
  }

  public Task status(String status) {
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

  public Task dueDate(LocalDateTime dueDate) {
    this.dueDate = dueDate;
    return this;
  }

  /**
   * Get dueDate
   * @return dueDate
   **/
  @Schema(description = "")
      @NotNull

    @Valid
    public LocalDateTime getDueDate() {
    return dueDate;
  }

  public void setDueDate(LocalDateTime dueDate) {
    this.dueDate = dueDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.id, task.id) &&
        Objects.equals(this.title, task.title) &&
        Objects.equals(this.taskDescription, task.taskDescription) &&
        Objects.equals(this.status, task.status) &&
        Objects.equals(this.dueDate, task.dueDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, taskDescription, status, dueDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    taskDescription: ").append(toIndentedString(taskDescription)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
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
