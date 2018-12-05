package com.vcgdev.pluginexample.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    //table PK always must be name id
    //use column annotation to map from table
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;
}
