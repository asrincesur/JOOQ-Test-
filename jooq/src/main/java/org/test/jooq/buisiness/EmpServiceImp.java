package org.test.jooq.buisiness;

import org.jooq.DSLContext;
import org.jooq.generated.Tables;
import org.jooq.generated.tables.Employees;
import org.jooq.generated.tables.records.EmployeesRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.jooq.entities.EmployeeDTO;

import java.util.List;
import java.util.Optional;

@Service
public class EmpServiceImp {

    @Autowired
    private DSLContext dsl;

    private final Employees EMPLOYEES = Tables.EMPLOYEES;

    public List<EmployeeDTO> getAllEmployees() {
        return dsl.selectFrom(EMPLOYEES).fetch().
                map(record ->
                        new EmployeeDTO(
                                record.getFirstName(),
                                record.getLastName(),
                                record.getEmail(),
                                record.getPhoneNumber(),
                                record.getDepartment(),
                                record.getJobTitle(),
                                record.getSalary(), record.getHireDate()));
    }

    public Optional<EmployeeDTO> getEmployeeByEmail(String email) {
        EmployeesRecord record = dsl.selectFrom(EMPLOYEES).where(EMPLOYEES.EMAİL.eq(email)).fetchOne();
        return Optional.ofNullable(record).map(emp ->
                new EmployeeDTO(emp.getFirstName(),
                        emp.getLastName(),
                        emp.getEmail(),
                        emp.getPhoneNumber(),
                        emp.getDepartment(),
                        emp.getJobTitle(),
                        emp.getSalary(),
                        emp.getHireDate()));
    }

    public void addEmployee(EmployeeDTO employee) {
        dsl.insertInto(EMPLOYEES).columns(EMPLOYEES.FİRST_NAME,
                EMPLOYEES.LAST_NAME,
                EMPLOYEES.EMAİL,
                EMPLOYEES.PHONE_NUMBER,
                EMPLOYEES.DEPARTMENT,
                EMPLOYEES.JOB_TİTLE,
                EMPLOYEES.SALARY,
                EMPLOYEES.HİRE_DATE).values(employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getPhoneNumber(),
                employee.getDepartment(),
                employee.getJobTitle(),
                employee.getSalary(),
                employee.getHireDate()).execute();
    }

    public void updateEmployee(String email, EmployeeDTO updatedEmployee) {
        dsl.update(EMPLOYEES)
                .set(EMPLOYEES.FİRST_NAME,
                        updatedEmployee.getFirstName()).set(EMPLOYEES.LAST_NAME,
                        updatedEmployee.getLastName()).set(EMPLOYEES.PHONE_NUMBER,
                        updatedEmployee.getPhoneNumber()).set(EMPLOYEES.DEPARTMENT,
                        updatedEmployee.getDepartment()).set(EMPLOYEES.JOB_TİTLE,
                        updatedEmployee.getJobTitle()).set(EMPLOYEES.SALARY,
                        updatedEmployee.getSalary()).set(EMPLOYEES.HİRE_DATE,
                        updatedEmployee.getHireDate()).where(EMPLOYEES.EMAİL.eq(email)).execute();
    }

    public void deleteEmployee(String email) {
        dsl.deleteFrom(EMPLOYEES).where(EMPLOYEES.EMAİL.eq(email)).execute();
    }

}