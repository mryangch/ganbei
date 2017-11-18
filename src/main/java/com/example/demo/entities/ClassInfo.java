package com.example.demo.entities;

import lombok.*;

import javax.persistence.*;
import javax.print.DocFlavor;

@Builder
@Data
@Entity
@Table(name="case_calssinfo")
@AllArgsConstructor
@NoArgsConstructor
public class ClassInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="classid")
    private Integer classid;
    @Column(name="classname")
    @Getter@Setter
    public String classname;
    @Column(name="classdescription")
    @Getter@Setter
    public String classdescription;
}
