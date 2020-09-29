package io.quind.Calculator_Week1;

import com.sun.org.apache.xpath.internal.operations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


// pour appeller  tout  //
@RestController
public class Calculadora {


        // Somme
    @GetMapping("Sum/{a}/{b}")
    public int sum(@PathVariable int a, @PathVariable int b){
        // creacion del objeto
        Sum operationSum = new Sum(a,b,0);
        return operationSum.sum(a,b);
    }

    // Soustraction

    //
    @GetMapping("Res/{a}/{b}")
    public int resta(@PathVariable int a, @PathVariable int b){
        // creacion del objeto
        Res operationRes = new Res(a,b,0);
        return operationRes.res(a,b);
    }

    // division
    @GetMapping("Div/{a}/{b}")
    public double division(@PathVariable int a, @PathVariable int b){
        // creacion del objeto
        Div operationDiv = new Div(a,b,0);
        return operationDiv.div(a,b);
    }


    // Multiplication

    @GetMapping("Multi/{a}/{b}")
    public double multi(@PathVariable int a, @PathVariable int b){
        // creacion del objeto
        Multi operationMulti = new Multi(a,b,0);
        return operationMulti.mult(a,b);
    }

    // La racine carrée

    @GetMapping("rai/{a}")
    public double raiz(@PathVariable int a){
        // creacion del objeto
        raiz  operationRaiz = new raiz(a);
        return operationRaiz.raiz(a);
    }








}




