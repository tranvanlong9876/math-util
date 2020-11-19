/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longtv.util.test;

import longtv.util.MathUtility;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    //F6 chạy main mặc định, Shift-F6 chạy main() ở @Test
    //đây là 1 trong những cách đặt tên cho hàm test, để test code chính
    @Test
    public void getFactorial_RunsWell_IfValidArgument() {
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
    }
    //xanh chỉ đạt được nếu tất cả cùng xanh, hàm ý hàm đúng hết tất cả
    //đỏ: chỉ cần ít nhất 1 hàm đỏ, coi như đỏ tất cả
    
    
    
    //Viet code de test code chinh (MathUtility)
    //Viet code dung thu vien Junit, NUnit, xUnit, Jasmine,... de test
    //xem code chính chạy ổn không trước khi đem qua bên QC/Khách hàng trải nghiệm
    //và thư viện này cung cấp cái cơ chế bảo đúng sai qua màu sắc xanh đỏ
    //mắt chỉ nhìn 2 màu là đủ, khỏi cần so sánh expepted và actual rồi kết luận.
    
}


