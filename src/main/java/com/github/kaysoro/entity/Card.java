package com.github.kaysoro.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;

@Entity
@Cacheable
public class Card extends PanacheEntity {
    public String name;
    public String url;
    public int gold;
    public int cost;
}