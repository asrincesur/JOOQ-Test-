package org.test.jooq.apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.test.jooq.buisiness.EmpServiceImp;
import org.test.jooq.entities.EmployeeDTO;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmpServiceImp employeeService;

    @GetMapping
    public List<EmployeeDTO> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{email}")
    public EmployeeDTO getEmployeeByEmail(@PathVariable String email) {
        return employeeService.getEmployeeByEmail(email).orElse(null);
    }

    @PostMapping
    public String addEmployee(@RequestBody EmployeeDTO employee) {
        employeeService.addEmployee(employee);
        return "Çalışan başarıyla eklendi!";
    }

    @PutMapping("/{email}")
    public String updateEmployee(@PathVariable String email, @RequestBody EmployeeDTO updatedEmployee) {
        employeeService.updateEmployee(email, updatedEmployee);
        return "Çalışan başarıyla güncellendi!";
    }

    @DeleteMapping("/{email}")
    public String deleteEmployee(@PathVariable String email) {
        employeeService.deleteEmployee(email);
        return "Çalışan başarıyla silindi!";
    }
}
