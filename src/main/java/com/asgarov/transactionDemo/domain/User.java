package com.asgarov.transactionDemo.domain;

import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User extends AbstractPersistable<Long> {
    @Column
    private String name;

    @Column
    private String email;
}
