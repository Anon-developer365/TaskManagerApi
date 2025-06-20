package uk.gov.hmcts.taskmanager.api.controller;

import uk.gov.hmcts.taskmanager.domain.CreateTaskRequest;
import java.util.Date;
import uk.gov.hmcts.taskmanager.domain.ErrorResponse;
import uk.gov.hmcts.taskmanager.domain.SuccessResponse;
import uk.gov.hmcts.taskmanager.domain.Task;
import uk.gov.hmcts.taskmanager.domain.TaskResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;

/**
 * A delegate to be called by the {@link TaskManagementSystemApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-06-20T12:11:19.710409+01:00[Europe/London]")
public interface TaskManagementSystemApiDelegate {

    /**
     * @see TaskManagementSystemApi#createTask
     */
    ResponseEntity<SuccessResponse> createTask( String  transactionId,
         CreateTaskRequest  body);

    /**
     * @see TaskManagementSystemApi#getTask
     */
    ResponseEntity<Task> getTask( String  transactionId);

    /**
     * @see TaskManagementSystemApi#getTasks
     */
    ResponseEntity<TaskResponse> getTasks( String  transactionId);

}
