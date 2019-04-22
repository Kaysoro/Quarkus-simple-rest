package com.github.kaysoro.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Cacheable
public class Deck extends PanacheEntity {

    public String name;
    @OneToMany
    public List<Card> cards;
}
