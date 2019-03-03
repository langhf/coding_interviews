package cn.drelang.q02_singleton;

/**
 * 饿汉式单例模式，线程安全
 * 类加载时就初始化实例，因此类加载慢，但是获取实例速度快
 *
 * Created by Drelang on 2019/03/01 20:41
 */
class Solution2 {
    private static Solution2 instance = new Solution2();

    private Solution2() {

    }

    static Solution2 getInstance() {     // 不用同步，类加载时已经初始化，不会有多线程的问题
        return instance;
    }
}
