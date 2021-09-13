package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarsServiceImpl carsServiceImpl;

    private CarsController(CarsServiceImpl carsServiceImpl) {
        this.carsServiceImpl = carsServiceImpl;
    }

    @GetMapping     // направляем на представление
    public String getNumberOfCars(@RequestParam(value = "count", required = false)
                                          Integer number, Model model) {

        if (number == null) {
            // обращаемся в модель за данными по имени бина и методу
            model.addAttribute("carsList", carsServiceImpl.getCars());
        } else {
            model.addAttribute("carsList", carsServiceImpl.getCars(number));
        }
        return "car";
    }
}
