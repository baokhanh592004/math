package com.giaolang.util.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilDDTTest {
    //CHUẨN BỊ BỘ DATA ĐỂ RIÊNG - DD - DATA DRIVEN
    //LÁT HỒI FILL VÀO HÀM SO SÁNH T  TESTING
    //FILL VÀO QUA THAM SỐ HÀM - HÀM LÀM VIỆC VỚI NHIỀU DATA
    //DDT CÒN GỌI TÊN KHÁC : PARAMETERIZED TESTING -> KIỂM THỬ THEO THAM SỐ HÓA

    //BỘ DATA : NẰM TRONG HÀM STATIC - TĨNH MỘT CHỖ ĐỂ CÁC NƠI VÀO LẤY
    //BỘ DATA : THƯỜNG LÀ MẢNG 2 CHIỀU, GIÁ TRỊ ĐẦU VÀO VÀ GIÁ TRỊ KÌ VỌNG
    public static Object[][] initData() {
        int[] a = {5, 10, 15, 20}; //mảng 1 chiều
        return new Object[][] {{0, 1},
                               {1, 1},
                               {3, 6},
                               {4, 24},
                                {5, 120},
                                {6, 720}};
        //n expected
    }

    @ParameterizedTest
    @MethodSource("initData")

    public void testFactorialGivenRightArgsRunWel(int n, long expected) {
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}