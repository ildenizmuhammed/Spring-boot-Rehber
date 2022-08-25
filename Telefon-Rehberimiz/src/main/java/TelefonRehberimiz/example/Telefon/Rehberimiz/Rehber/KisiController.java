package TelefonRehberimiz.example.Telefon.Rehberimiz.Rehber;

import TelefonRehberimiz.example.Telefon.Rehberimiz.model.Kisi;

import TelefonRehberimiz.example.Telefon.Rehberimiz.service.KisiService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/kisiler")
@AllArgsConstructor
public class KisiController {
    private final KisiService kisiService;

    @GetMapping
    public ResponseEntity<List<Kisi>> getKisiler(@RequestParam(required = false) String unvan){
        return new ResponseEntity<>(kisiService.getKisiler(unvan), HttpStatus.OK);
    }

    @GetMapping("/{dahiliNo}")
    public ResponseEntity<Kisi> getKisi(@PathVariable String dahiliNo){
        return new ResponseEntity<>(getKisiByDahiliNo(dahiliNo), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Kisi> createKisi(@RequestBody Kisi newKisi){

        return new ResponseEntity<>(kisiService.createKisi(newKisi), HttpStatus.CREATED);
    }
    private Kisi getKisiByDahiliNo(String dahiliNo){
        return kisiService.getKisiByDahiliNo(dahiliNo);



    }
    @PutMapping("/{dahiliNo}")
    public ResponseEntity<Void> getKisi(@PathVariable String dahiliNo,@RequestBody Kisi newKisi) {

        kisiService.updateKisi(dahiliNo,newKisi);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @DeleteMapping("/{dahiliNo}")
    public ResponseEntity<Void> deleteKisi(@PathVariable String dahiliNo){ //id arıyoruz
        kisiService.deleteKisi(dahiliNo);
        return new ResponseEntity<>(HttpStatus.OK);

    }


}
