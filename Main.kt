import java.text.NumberFormat
import java.util.*

fun main() {
    /** Latihan 3 */
    print("Input Payment: "); val input = readLine()
    val price = input!!.toInt()
//    val price = 10000000
    var discount : Int
    var priceAfterDiscount : String = ""
    val myCurrency = NumberFormat.getCurrencyInstance(Locale("in", "ID"))

    if(price <= 50000){
        discount = 5
    } else if (price <=75000){
        discount = 10
    } else if (price <= 100000){
        discount = 15
    } else {
        discount = 30
    }

    val hitungDiskon: Int = price - ((price * discount)/ 100)
    val afterDiscount = ((price * discount)/ 100)
    if (discount != 0){
        priceAfterDiscount = myCurrency.format(hitungDiskon)
    }

    println("Your Money : ${myCurrency.format(price)}")
    println("Discount : ${discount}%")
    println("Total Discount you get: ${myCurrency.format(afterDiscount)}")
    println("Total price after discount: $priceAfterDiscount")
}
