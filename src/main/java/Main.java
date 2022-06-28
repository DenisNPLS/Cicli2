import ru.netology.stats.StaticService;

public class Main {

    public static void main(String[] args) {
        StaticService service = new StaticService();

        int[] sales = {5, 12, 21, 11, 9, 19, 16, 20, 7, 13, 12, 11};

        int data = service.sum(sales);
        System.out.println("Сумма всех продаж за год равна: " + data);

        int data1 = service.avarageAmount(sales);
        System.out.println("Средняя сумма всех продаж за год равна: " + data1);

        int data2 = service.maxSales(sales);
        System.out.println("Номер месяца в котором был пик продаж: " + data2);

        int data3 = service.minSales(sales);
        System.out.println("Номер месяца в котором был минимум продаж: " + data3);

        int data4 = service.underCount(sales);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + data4);

        int data5 = service.overCount(sales);
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + data5);
    }
}
