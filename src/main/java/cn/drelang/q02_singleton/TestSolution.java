package cn.drelang.q02_singleton;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Drelang on 2019/03/01 20:50
 */
public class TestSolution {
    @Test
    public void test() {
        Assert.assertEquals(Solution1.getInstance(), Solution1.getInstance());
        Assert.assertEquals(Solution2.getInstance(), Solution2.getInstance());
        Assert.assertEquals(Solution3.INSTANCE, Solution3.INSTANCE);
    }
}
