package example.vuejs.springboot.controller;

import java.util.List;

import example.vuejs.springboot.entity.Tariff;
import example.vuejs.springboot.service.TariffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nefremov on 25.05.2018.
 *
 * @author Nikita Efremov
 */
@RestController
public class TariffController {

    @Autowired
    private TariffService tariffService;

    @GetMapping(value = "/tariffs")
    public List<Tariff> getAllTariffs() {
        return tariffService.getAllTariffs();
    }
}
