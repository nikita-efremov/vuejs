package example.vuejs.springboot.service;

import javax.annotation.PostConstruct;
import java.util.List;

import example.vuejs.springboot.entity.Tariff;
import example.vuejs.springboot.repositories.TariffRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nefremov on 25.05.2018.
 *
 * @author Nikita Efremov
 */
@Service
public class TariffService {

    @Autowired
    private TariffRepository tariffRepository;

    @PostConstruct
    public void init() {
        Tariff tariff1 = new Tariff();
        tariff1.setId(1L);
        tariff1.setTitle("Magenta Mobil XL Premium");
        tariff1.setDescription("Telefon- und SMS Flat in alle dt. Netze. Unbegrenzte Daten-Flat (LTE Max). Inkl. Top-Smartphone, HotSpot-Flat, 2 zubuchbare MultiSIMs, Telefon- und SMS-Flat von Deutschland in die EU, Schweiz, USA, Kanada & Türkei sowie Roaming in diesen Ländern");
        tariff1.setPrice(199.95);

        Tariff tariff2 = new Tariff();
        tariff2.setId(2L);
        tariff2.setTitle("Magenta Mobil L Top-H. Premium");
        tariff2.setDescription("Das Flat-Paket mit TOP-Smartphone für Daten-Vielnutzer! Highspeed-Daten-Flat (6 GB, SSD, Max Speed) mit LTE-Nutzung inklusive sowie Telefon- und SMS-Flat in alle dt. Netze. HotSpot-Flat und All Inclusive und Premium VVL inklusive.");
        tariff2.setPrice(84.95);

        Tariff tariff3 = new Tariff();
        tariff3.setId(3L);
        tariff3.setTitle("Magenta Mobil M mit Top-Handy");
        tariff3.setDescription("Das Sorglospaket mit TOP-Smartphone für den Daten-Normalnutzer! Daten-Flat (4 GB, SSD, Max Speed) mit LTE-Nutzung inklusive sowie Telefon- und SMS-Flat in alle dt. Netze. Zusätzlich jetzt mit HotSpot-Flat und der Option All Inclusive inklusive.");
        tariff3.setPrice(64.95);

        tariffRepository.save(tariff1);
        tariffRepository.save(tariff2);
        tariffRepository.save(tariff3);
    }

    public List<Tariff> getAllTariffs() {
        return tariffRepository.findAll();
    }

}
