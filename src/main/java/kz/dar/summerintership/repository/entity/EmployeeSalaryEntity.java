package kz.dar.summerintership.repository.entity;


import kz.dar.summerintership.model.BankModel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

@Getter
@Setter
@Document(indexName = "employee-salary", createIndex = true)
public class EmployeeSalaryEntity {

    @Id
    @Field(type = FieldType.Keyword)
    private String employeeSalaryId;

    @Field(type = FieldType.Keyword)
    private double salary;

    @Field(type = FieldType.Keyword)
    private String typeOperation;

    private List<BankModel> bank;

}
