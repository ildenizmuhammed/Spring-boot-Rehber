package TelefonRehberimiz.example.Telefon.Rehberimiz.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class AspectService {

    @Before("execution(* TelefonRehberimiz.example.Telefon.Rehberimiz.Rehber.KisiController.createKisi( ..))")


    public void beforeCreateMethod(JoinPoint joinPoint){
        System.out.println("PostMapping Anatasyonu Çalıştırılıyor.          : " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());


    }
    @After("execution(* TelefonRehberimiz.example.Telefon.Rehberimiz.Rehber.KisiController.createKisi(..))")
    public void afterCreateMethod(JoinPoint  joinPoint){
        System.out.println("PostMapping Anatasyonu Çalıştırıldı. : " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());

    }
    @Before("execution(* TelefonRehberimiz.example.Telefon.Rehberimiz.Rehber.KisiController.deleteKisi( ..))")
    public void beforeDeleteMethod(JoinPoint joinPoint){
        System.out.println("Delete Anatasyonu Çalıştırılıyor. : " + joinPoint.getArgs()[0] + " Id-li kişi silindi");
        System.out.println(joinPoint.getSignature());


    }
    @After("execution(* TelefonRehberimiz.example.Telefon.Rehberimiz.Rehber.KisiController.deleteKisi(..))")
    public void afterDeleteMethod(JoinPoint  joinPoint){
        System.out.println("Delete Anatasyonu Çalıştırıldı. : "+ joinPoint.getArgs()[0] + " Id'li kişi silindi");
        System.out.println(joinPoint.getSignature());


    }

}

