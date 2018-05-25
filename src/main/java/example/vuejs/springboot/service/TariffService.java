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
        tariff1.setTitle("Magenta Mobil S");
        tariff1.setDescription("Long description for Magenta Mobil S");
        tariff1.setPrice(45.4);

        Tariff tariff2 = new Tariff();
        tariff2.setId(2L);
        tariff2.setTitle("Magenta Mobil M");
        tariff2.setDescription("Very Long description for Magenta Mobil M");
        tariff2.setPrice(75.4);

        Tariff tariff3 = new Tariff();
        tariff3.setId(3L);
        tariff3.setTitle("Magenta Mobil L");
        tariff3.setDescription("Extremely Long description for Magenta Mobil L");
        tariff3.setPrice(175.4);

        tariffRepository.save(tariff1);
        tariffRepository.save(tariff2);
        tariffRepository.save(tariff3);
    }

    public List<Tariff> getAllTariffs() {
        return tariffRepository.findAll();
    }

}
