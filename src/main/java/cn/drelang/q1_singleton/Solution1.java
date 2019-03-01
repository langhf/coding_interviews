package cn.drelang.q1_singleton;

/**
 *  懒汉式，线程安全
 *  类加载时不创建实例，因此加载速度快，但运行时获取对象的速度慢
 *
 * Created by Drelang on 2019/03/01 20:36
 */
class Solution1 {
    private static Solution1 instance;

    private Solution1() {

    }

    synchronized static Solution1 getInstance() {
        if(instance == null) {
            instance = new Solution1();
        }
        return instance;
    }
}
