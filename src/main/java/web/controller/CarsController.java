package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarsDao;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    CarsDao carsDao;

    @GetMapping()
    public String getNumerOfCars(@RequestParam(value
            = "count", required = false) Integer number, Model model) {
        if (number == null) {
            model.addAttribute("carsList", carsDao.getCars(0));
        } else {
            model.addAttribute("carsList", carsDao.getCars(number));
        }
        return "car";
    }
}
