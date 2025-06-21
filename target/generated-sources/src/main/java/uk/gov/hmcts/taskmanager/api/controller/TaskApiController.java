package uk.gov.hmcts.taskmanager.api.controller;

import uk.gov.hmcts.taskmanager.domain.CreateTaskRequest;
import java.util.Date;
import uk.gov.hmcts.taskmanager.domain.ErrorResponse;
import uk.gov.hmcts.taskmanager.domain.SuccessResponse;
import uk.gov.hmcts.taskmanager.domain.Task;
import uk.gov.hmcts.taskmanager.domain.UpdateStatusRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-06-21T18:38:18.464715700+01:00[Europe/London]")
@RestController
public class TaskApiController implements TaskApi {

    private final TaskApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public TaskApiController(TaskApiDelegate delegate) {
        this.delegate = delegate;
    }
    public ResponseEntity<SuccessResponse> createTask(@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) @RequestHeader(value="transactionId", required=true) String transactionId
,@Parameter(in = ParameterIn.DEFAULT, description = "Create a new task in the task management system.", required=true, schema=@Schema()) @Valid @RequestBody CreateTaskRequest body
) {
        return delegate.createTask(transactionId, body);
    }

    public ResponseEntity<Task> getTask(@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) @RequestHeader(value="transactionId", required=true) String transactionId
) {
        return delegate.getTask(transactionId);
    }

    public ResponseEntity<SuccessResponse> updateStatus(@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) @RequestHeader(value="transactionId", required=true) String transactionId
,@Parameter(in = ParameterIn.DEFAULT, description = "Update the status of a task.", required=true, schema=@Schema()) @Valid @RequestBody UpdateStatusRequest body
) {
        return delegate.updateStatus(transactionId, body);
    }

}
