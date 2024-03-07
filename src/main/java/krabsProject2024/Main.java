package krabsProject2024;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {

//        using XML configuration
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //using Java configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        Doctor doctor = context.getBean(Doctor.class);
        //Doctor doctor = context.getBean(Doctor.class);
        doctor.assist();
        doctor.setQualification("VU");
        System.out.println(doctor);

        //sito object instance toks pat kaip ir "doctor", todel ir jo qualification bus "VU"
        Doctor doctor1 = context.getBean(Doctor.class);
        System.out.println(doctor1);

//37min

    }
}


