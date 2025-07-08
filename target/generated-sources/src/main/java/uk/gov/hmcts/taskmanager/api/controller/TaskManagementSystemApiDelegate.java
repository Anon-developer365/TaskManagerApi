package uk.gov.hmcts.taskmanager.api.controller;

import uk.gov.hmcts.taskmanager.domain.CreateTaskRequest;
import uk.gov.hmcts.taskmanager.domain.ErrorResponse;
import java.time.LocalDateTime;
import uk.gov.hmcts.taskmanager.domain.SuccessResponse;
import uk.gov.hmcts.taskmanager.domain.Task;
import uk.gov.hmcts.taskmanager.domain.TaskResponse;
import uk.gov.hmcts.taskmanager.domain.UpdateStatusRequest;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import jakarta.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link TaskManagementSystemApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-07-08T11:46:23.404774300+01:00[Europe/London]")
public interface TaskManagementSystemApiDelegate {

    Logger log = LoggerFactory.getLogger(TaskManagementSystemApi.class);

    default Optional<ObjectMapper> getObjectMapper(){
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest(){
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    /**
     * @see TaskManagementSystemApi#createTask
     */
    default ResponseEntity<SuccessResponse> createTask( String  transactionId,
         CreateTaskRequest  body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"id\" : \"c73ce3f9-40C7-a8f6b7ae7b7fb5\",\r\n  \"message\" : \"message\"\r\n}", SuccessResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TaskManagementSystemApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see TaskManagementSystemApi#deleteTask
     */
    default ResponseEntity<SuccessResponse> deleteTask( String  transactionId,
         String  taskId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"id\" : \"c73ce3f9-40C7-a8f6b7ae7b7fb5\",\r\n  \"message\" : \"message\"\r\n}", SuccessResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TaskManagementSystemApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see TaskManagementSystemApi#getTask
     */
    default ResponseEntity<Task> getTask( String  transactionId,
         String  taskId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"taskDescription\" : \"taskDescription\",\r\n  \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n  \"id\" : \"c73ce3f9-40C7-a8f6b7ae7b7fb5\",\r\n  \"title\" : \"title\",\r\n  \"status\" : \"status\"\r\n}", Task.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TaskManagementSystemApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see TaskManagementSystemApi#getTasks
     */
    default ResponseEntity<TaskResponse> getTasks( String  transactionId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"tasks\" : [ {\r\n    \"taskDescription\" : \"taskDescription\",\r\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"id\" : \"c73ce3f9-40C7-a8f6b7ae7b7fb5\",\r\n    \"title\" : \"title\",\r\n    \"status\" : \"status\"\r\n  }, {\r\n    \"taskDescription\" : \"taskDescription\",\r\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"id\" : \"c73ce3f9-40C7-a8f6b7ae7b7fb5\",\r\n    \"title\" : \"title\",\r\n    \"status\" : \"status\"\r\n  }, {\r\n    \"taskDescription\" : \"taskDescription\",\r\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"id\" : \"c73ce3f9-40C7-a8f6b7ae7b7fb5\",\r\n    \"title\" : \"title\",\r\n    \"status\" : \"status\"\r\n  }, {\r\n    \"taskDescription\" : \"taskDescription\",\r\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"id\" : \"c73ce3f9-40C7-a8f6b7ae7b7fb5\",\r\n    \"title\" : \"title\",\r\n    \"status\" : \"status\"\r\n  }, {\r\n    \"taskDescription\" : \"taskDescription\",\r\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"id\" : \"c73ce3f9-40C7-a8f6b7ae7b7fb5\",\r\n    \"title\" : \"title\",\r\n    \"status\" : \"status\"\r\n  }, {\r\n    \"taskDescription\" : \"taskDescription\",\r\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"id\" : \"c73ce3f9-40C7-a8f6b7ae7b7fb5\",\r\n    \"title\" : \"title\",\r\n    \"status\" : \"status\"\r\n  }, {\r\n    \"taskDescription\" : \"taskDescription\",\r\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"id\" : \"c73ce3f9-40C7-a8f6b7ae7b7fb5\",\r\n    \"title\" : \"title\",\r\n    \"status\" : \"status\"\r\n  }, {\r\n    \"taskDescription\" : \"taskDescription\",\r\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"id\" : \"c73ce3f9-40C7-a8f6b7ae7b7fb5\",\r\n    \"title\" : \"title\",\r\n    \"status\" : \"status\"\r\n  }, {\r\n    \"taskDescription\" : \"taskDescription\",\r\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"id\" : \"c73ce3f9-40C7-a8f6b7ae7b7fb5\",\r\n    \"title\" : \"title\",\r\n    \"status\" : \"status\"\r\n  }, {\r\n    \"taskDescription\" : \"taskDescription\",\r\n    \"dueDate\" : \"2000-01-23T04:56:07.000+00:00\",\r\n    \"id\" : \"c73ce3f9-40C7-a8f6b7ae7b7fb5\",\r\n    \"title\" : \"title\",\r\n    \"status\" : \"status\"\r\n  } ]\r\n}", TaskResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TaskManagementSystemApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see TaskManagementSystemApi#updateStatus
     */
    default ResponseEntity<SuccessResponse> updateStatus( String  transactionId,
         UpdateStatusRequest  body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{\r\n  \"id\" : \"c73ce3f9-40C7-a8f6b7ae7b7fb5\",\r\n  \"message\" : \"message\"\r\n}", SuccessResponse.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default TaskManagementSystemApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
