package com.uis.entornos.proyectologincrud.Datasets;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/datasets/v1")
public class DatasetsController {
    private final DatasetsService datasetsService;

    @GetMapping("/list")
    public List<Datasets> cargarDatasets(){
        return datasetsService.listarDatasets();
    }

    @GetMapping("/list/{id}")
    public Optional<Datasets> buscarPorId(@PathVariable int id){
        return datasetsService.buscarDataset(id);
    }

    @PostMapping("/")
    public ResponseEntity<Datasets> agregar(@RequestBody Datasets datasets){
        Datasets obj = datasetsService.guardar(datasets);
        return  new ResponseEntity<>(obj, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public  ResponseEntity<Datasets> eliminar(@PathVariable int id){
        Optional<Datasets> obj =  datasetsService.buscarDataset(id);
        if(obj != null){
            datasetsService.eliminar(id);
        }else {
            return new ResponseEntity<>( HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return  new ResponseEntity<>(HttpStatus.OK);
    }
}
