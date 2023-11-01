package com.uis.entornos.proyectologincrud.Datasets;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DatasetsService  implements IDatasetsService{

    private final DatasetsRepository datasetsRepository;

    @Override
    public Datasets guardar(Datasets datasets) {
        return datasetsRepository.save(datasets);
    }

    @Override
    public void eliminar(int id_datasets) {
        datasetsRepository.deleteById(id_datasets);
    }

    @Override
    public List<Datasets> listarDatasets() {
        return (List<Datasets>)  datasetsRepository.findAll();
    }

    @Override
    public Optional<Datasets> buscarDataset(int id_datasets) {
        return datasetsRepository.findById(id_datasets);
    }
}
