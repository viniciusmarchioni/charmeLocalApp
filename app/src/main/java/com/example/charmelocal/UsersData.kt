package com.example.charmelocal

public class UsersData {
   /*var array = mutableListOf<Person>()
    fun addElements(Elemento:Person){
        array.add(Elemento)
    }*/
}

public class Custome(private var cpf:String,
                      private var nameAndSurname:String, private var cellPhone:String,
                      private var email:String, private var password:String){
    public fun getCpf():String{
        return cpf
    }
    public fun getNameAndSurname():String{
        return nameAndSurname
    }
    public fun getCellPhone():String{
        return cellPhone
    }
    public fun getEmail():String{
        return email
    }
    public fun getPassword():String{
        return password
    }
    public fun setCpf(value:String){
        this.cpf = value
    }
    public fun setNameAndSurname(value:String){
        this.nameAndSurname = value
    }
    public fun setCellPhone(value:String){
        this.cellPhone = value
    }
    public fun setEmail(value:String){
        this.email = value
    }
    public fun setPassword(value:String){
        this.password = value
    }



}