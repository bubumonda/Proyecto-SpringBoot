package com.uis.entornos.proyectologincrud.Datasets;

import com.uis.entornos.proyectologincrud.User.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "datasets")
public class Datasets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_dataset;
    private String comentarios;
    private String descripcion;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private User user;



}
