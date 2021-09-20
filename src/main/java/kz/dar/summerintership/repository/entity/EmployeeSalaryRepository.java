package kz.dar.summerintership.repository.entity;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface EmployeeSalaryRepository extends ElasticsearchRepository<EmployeeSalaryEntity, String> {


    List<EmployeeSalaryEntity> findByTypeOperation(String typeOperation);
}
