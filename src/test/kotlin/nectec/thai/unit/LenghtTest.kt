package nectec.thai.unit

/**
 * Created by Max on 12/7/2560.
 */

import org.junit.Test
import kotlin.test.assertEquals
class LenghtTest {

  val lenght = Length(1200.0)


  @Test fun getsok() {
    assertEquals(0, lenght.sok)
  }

  @Test fun getkhup() {
    assertEquals(0, lenght.khuep)
  }

  @Test fun prtAll() {
    assertEquals("0 โยชน์ 0 เส้น 6 วา 0 ศอก 0 คืบ 0 นิ้ว 0 กระเบียด", lenght.prtAll())
  }
  @Test fun prtAll2() {
    assertEquals("10 โยชน์ 1 เส้น 1 วา 1 ศอก 1 คืบ 1 นิ้ว 1 กระเบียด", Length(10,1,1,1,1,1,1).prtAll())
  }

  @Test fun prtAll3() {
    assertEquals("10 โยชน์ 7 เส้น 8 วา 0 ศอก 1 คืบ 7 นิ้ว 1 กระเบียด", Length(10,7,6,6,5,7,1).prtAll())
  }

}