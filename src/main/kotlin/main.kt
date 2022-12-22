fun main(args: Array<String>) {

    // Variable can be null
    var name_model1: String? = null
    // for you didn't compiler erro, you need check your variable
    if (name_model1 != null)
        println("name_model1, isn't null")
    else
        println("name_model1 is null")


    /*
    another implementation
    */
    var name_model2: String? = null
    // to compiler this code, i define a value
    name_model2 = "luis fernando"
    // required variable not can be null
    println(name_model2!!.length)
}