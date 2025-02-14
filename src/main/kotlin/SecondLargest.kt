
    fun main(){

        val arr=intArrayOf(2,10,3,4,7,92)
        var largest=Int.MIN_VALUE
        var secondLargest:Int?=null
        for(num in arr){
            if(num > largest){
                //secondLargest=largest
                largest=num
            }else if(num> (secondLargest ?: Int.MIN_VALUE) && num <largest){
                secondLargest=num

            }

        }
        print("second largest:"+secondLargest)

        //write a program to find second largest number in array using loop
        //second largest number means the largest number in array except the largest number in array  in simplest way
        val arr1= intArrayOf(1,4,5,2,6,72,22)
        var largest1=Int.MIN_VALUE
        var secondLargest1:Int?=null
        for(num in arr1){
            if(num > largest1){
               // secondLargest1=largest1
                largest1=num
            }/*else if(num> (secondLargest1 ?: Int.MIN_VALUE) && num <largest1){
                secondLargest1=num
            }*/
        }
        print("largest:"+largest1)


        val arr2=intArrayOf(2,10,3,4,7,92)
        var largest2=Int.MIN_VALUE
        var secondLargest2:Int?=null
        var thirdLarges2:Int?=null
        for(num in arr){
            if(num > largest2){
                secondLargest2=largest
                largest2=num
            }else if(num> (secondLargest2 ?: Int.MIN_VALUE) && num <largest2){
                secondLargest2=num

            }else if (num>(thirdLarges2 ?: Int.MIN_VALUE) && num < secondLargest2 ?: Int.MIN_VALUE && num < largest2){
                thirdLarges2=num
            }

        }
        print("third largest:"+thirdLarges2)

}