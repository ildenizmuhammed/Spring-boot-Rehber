package TelefonRehberimiz.example.Telefon.Rehberimiz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data //Getter-Setter
@NoArgsConstructor//Boş Consructor
@AllArgsConstructor//Dolu Constructor
public class Kisi {
    @Id

    private Date createDate = new Date();
    private String ad;
    private String soyad;
    private String unvan;
    private String odaNo;
    private String dahiliNo;
    private Integer cep;


}
