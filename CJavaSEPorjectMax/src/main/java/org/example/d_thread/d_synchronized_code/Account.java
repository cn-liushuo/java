package org.example.d_thread.d_synchronized_code;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String cardId; // 卡号
    private double money; // 余额

    // 小明和小红都到这里来取钱
    public void drawMoney(int money) {
        // 拿到当前谁来取钱
        String name = Thread.currentThread().getName();
        /**
         * 对于实例方法建议使用 this 作为锁对象。
         * 对于静态方法建议使用字节码 (类名.class) 对象作为锁对象。
         */
        synchronized (this) {
            // 判断余额是否足够
            if (this.money >= money) {
                // 余额足够，取钱
                System.out.println(name + "取钱成功，取了" + money + "元成功！");
                // 更新余额
                this.money -= money;
                System.out.println(name + "取钱成功，取钱后，余额剩余" + this.money + "元");
            } else {
                // 余额不足
                System.out.println(name + "取钱失败，余额不足！");
            }
        }
    }
}
