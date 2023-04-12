package TelefonRehberimiz.example.Telefon.Rehberimiz.service;

import TelefonRehberimiz.example.Telefon.Rehberimiz.model.Kisi;
import TelefonRehberimiz.example.Telefon.Rehberimiz.repository.KisiRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service

public class KisiService {


    private final KisiRepository kisiRepository;

    public KisiService(KisiRepository kisiRepository){

        this.kisiRepository = kisiRepository;
    }

    public List<Kisi> getKisiler(String unvan){
        if (unvan == null) {
            System.out.println("Ünvan bulunamadı, Tüm ünvanlar listelendi.");
            return kisiRepository.findAll();
                    }
        else{
            return kisiRepository.findByUnvan(unvan);
        }
    }

    public Kisi createKisi(Kisi newKisi) {

        return kisiRepository.save(newKisi);
    }

    public void deleteKisi(String dahiliNo) {

        kisiRepository.deleteById(dahiliNo);

    }


    public Kisi getKisiByDahiliNo(String dahiliNo) {
        return kisiRepository.findById(dahiliNo)
                .orElseThrow(() -> new RuntimeException(" dahili numaralı kişi bulunamdı!"));
    }

    public void updateKisi(String dahiliNo, Kisi newKisi) {
        Kisi oldKisi = getKisiByDahiliNo(dahiliNo);
        oldKisi.setAd(newKisi.getAd());
        oldKisi.setSoyad(newKisi.getSoyad());
        oldKisi.setUnvan(newKisi.getUnvan());
        oldKisi.setOdaNo(newKisi.getOdaNo());
        oldKisi.setCep(newKisi.getCep());
        kisiRepository.save(oldKisi);
    }
}
