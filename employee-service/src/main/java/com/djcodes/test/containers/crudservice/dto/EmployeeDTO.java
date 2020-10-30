package com.djcodes.test.containers.crudservice.dto;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class EmployeeDTO {


    private Integer id;

    @NotBlank(message = "First name can not be null!")
    private String fname;

    @NotBlank(message = "Last name can not be null!")
    private String lname;

    @NotBlank(message = "Email can not be null!")
    @Email(message = "Invalid Email")
    private String email;


}
