package com.tango.springbootmysql.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ITEM_TBL")
public class Item {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    private int checkbox;


}
