package com.uis.entornos.proyectologincrud.Datasets;

import java.util.List;
import java.util.Optional;

public interface IDatasetsService {

    public Datasets guardar(Datasets datasets);

    public void eliminar(int id_datasets);

    public List<Datasets> listarDatasets();

    public Optional<Datasets> buscarDataset(int id_datasets);
}
