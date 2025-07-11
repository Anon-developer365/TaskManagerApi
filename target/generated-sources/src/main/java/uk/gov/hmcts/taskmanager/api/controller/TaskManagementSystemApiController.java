package uk.gov.hmcts.taskmanager.api.controller;

import org.springframework.web.bind.annotation.RestController;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-07-08T11:46:23.404774300+01:00[Europe/London]")
@RestController
public class TaskManagementSystemApiController implements TaskManagementSystemApi {

    private final TaskManagementSystemApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public TaskManagementSystemApiController(TaskManagementSystemApiDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public TaskManagementSystemApiDelegate getDelegate() {
        return delegate;
    }
}
