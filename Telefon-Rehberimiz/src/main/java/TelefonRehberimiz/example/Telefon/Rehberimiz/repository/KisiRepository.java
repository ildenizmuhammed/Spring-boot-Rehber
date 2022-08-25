package TelefonRehberimiz.example.Telefon.Rehberimiz.repository;

import TelefonRehberimiz.example.Telefon.Rehberimiz.model.Kisi;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface KisiRepository extends MongoRepository<Kisi, String> {

    List<Kisi> findByUnvan(String ad);


}
