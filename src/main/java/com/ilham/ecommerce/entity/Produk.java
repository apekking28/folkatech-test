package com.ilham.ecommerce.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
public class Produk implements Serializable {
    @Id
    private String id;
    private String nama;
    private String deskripsi;
    private String gambar;
    private BigDecimal harga;
    private int stock;

}
