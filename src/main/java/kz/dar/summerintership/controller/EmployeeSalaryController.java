package kz.dar.summerintership.controller;

import kz.dar.summerintership.repository.entity.EmployeeSalaryEntity;
import kz.dar.summerintership.repository.entity.EmployeeSalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/salary")
public class EmployeeSalaryController {

    @Autowired
    EmployeeSalaryRepository employeeSalaryRepository;

    @PostMapping
    public String createSalary(@RequestBody EmployeeSalaryEntity entity) {

        employeeSalaryRepository.save(entity);

        return "OK";
    }

    @GetMapping("/type")
    public List<EmployeeSalaryEntity> getSalaryByTypeOperation(@RequestParam String typeOperation) {
        List<EmployeeSalaryEntity> entity = employeeSalaryRepository.findByTypeOperation(typeOperation);
        return entity;
    }

}
