package com.grokonez.jwtauthentication.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;




@Entity
@Table(name = "empresas", uniqueConstraints = {
       /* @UniqueConstraint(columnNames = {
            "idestado"
        }),
        @UniqueConstraint(columnNames = {
            "idmunicipio"
        }) */
       
})
public class Empresa{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idestado;
    private String estado;
    private Long casostotales;
 
   
    public Empresa() {}

    public Empresa(Long casostotales) {
        
        this.casostotales = casostotales;
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdestado() {
        return idestado;
    }

    public void setIdestado(Long idestado) {
        this.idestado = idestado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getCasosTotales() {
        return casostotales;
    }

    public void setCasosTotales(Double casostotales) {
        this.casostotales = casostotales;
    }
   
}