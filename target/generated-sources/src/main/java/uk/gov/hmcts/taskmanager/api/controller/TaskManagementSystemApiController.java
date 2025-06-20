package uk.gov.hmcts.taskmanager.api.controller;

import uk.gov.hmcts.taskmanager.domain.ErrorResponse;
import uk.gov.hmcts.taskmanager.domain.Task;
import uk.gov.hmcts.taskmanager.domain.TaskResponse;
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

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-06-20T11:39:43.243284200+01:00[Europe/London]")
@RestController
public class TaskManagementSystemApiController implements TaskManagementSystemApi {

    private final TaskManagementSystemApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public TaskManagementSystemApiController(TaskManagementSystemApiDelegate delegate) {
        this.delegate = delegate;
    }
    public ResponseEntity<Task> getTask(@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) @RequestHeader(value="transactionId", required=true) String transactionId
) {
        return delegate.getTask(transactionId);
    }

    public ResponseEntity<TaskResponse> getTasks(@Parameter(in = ParameterIn.HEADER, description = "" ,required=true,schema=@Schema()) @RequestHeader(value="transactionId", required=true) String transactionId
) {
        return delegate.getTasks(transactionId);
    }

}
