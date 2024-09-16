package com.rest.Intecap.Controller;

import com.rest.Intecap.Model.UsuarioModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @GetMapping("/saludar")
    public String saludar() {
        return "Holi, wenas";
    }

    @GetMapping("/listar")
    public List<UsuarioModel> obtenerusuario() {
        List<UsuarioModel> usuarios = new ArrayList<>();
        usuarios.add(new UsuarioModel("Maria Perez", "1 avenida 4-55 zona 4", 25));
        usuarios.add(new UsuarioModel("Juan Lopez", "4 calle 5-9 zona 5", 45));
        usuarios.add(new UsuarioModel("Juliana Ramirez", "5 calle 4-98 zona 11", 35));
        return usuarios;
    }

    // Método para sumar dos números
    @GetMapping("/sumar/{num1}/{num2}")
    public int sumar(@PathVariable int num1, @PathVariable int num2) {
        return num1 + num2;
    }

    // Método para restar dos números
    @GetMapping("/restar/{num1}/{num2}")
    public int restar(@PathVariable int num1, @PathVariable int num2) {
        return num1 - num2;
    }

    // Método para multiplicar dos números
    @GetMapping("/multiplicar/{num1}/{num2}")
    public int multiplicar(@PathVariable int num1, @PathVariable int num2) {
        return num1 * num2;
    }

    // Método para dividir dos números
    @GetMapping("/dividir/{num1}/{num2}")
    public double dividir(@PathVariable int num1, @PathVariable int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            throw new ArithmeticException("No se puede dividir por cero");
        }
    }
}