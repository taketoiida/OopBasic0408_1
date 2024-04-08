package company;

import java.lang.invoke.VarHandle;

import javax.management.ValueExp;

public class ObjectSample {

    public static void main(String[] args) {
        
        var employee = new Employee("鈴木", "営業部", "課長", 100);
        
        employee.report();
        employee.report(2);
                // TODO 自動生成されたメソッド・スタブ

    }

}
