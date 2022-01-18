public class Employee {
    String name,lastName;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, String lastName, double salary, int workHours, int hireYear) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        double tax;
        if(salary<1000){
            tax=0;
        }else{
            tax=salary*0.03;
        }
        return tax;
    }

    double bonus(){
        double bonus=0;
        if(workHours>40){
            bonus=(workHours-40)*30;
        }
        return bonus;
    }

    double raiseSalary(){
        double artıs;
        int year=2021-hireYear;
        if(year<10){
             artıs=salary*0.05;
        }else if(year>9 && year<20){
            artıs=salary*0.10;
        }else if(year>19){
            artıs=salary*0.15;
        }else{
            artıs=0;
        }
        return artıs;
    }

     void info() {
        System.out.println("Adı : " + this.name);
        System.out.println("Soyadı : " + this.lastName);
        System.out.println("Çalışma saati : " + this.workHours);
        System.out.println("Başlangıç yılı : " + this.hireYear);
        System.out.println("Vergi : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("Maaş Artışı : " + this.raiseSalary());
        System.out.println("Toplam maaş : " + this.salary+this.raiseSalary());
    }
}
