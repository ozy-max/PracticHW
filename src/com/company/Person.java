package com.company;

public class Person {
   private String name;
   private int age;
   private String profession;
   private Gender gender;

   public Person(String name, int age, String profession, Gender gender) {
      this.name = name;
      this.age = age;
      this.profession = profession;
      this.gender = gender;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getProfession() {
      return profession;
   }

   public void setProfession(String profession) {
      this.profession = profession;
   }

   public Gender getGender() {
      return gender;
   }

   public void setGender(Gender gender) {
      this.gender = gender;
   }

   @Override
   public String toString() {
      return "Person{" +
              "name='" + name + '\'' +
              ", age=" + age +
              ", profession='" + profession + '\'' +
              ", gender=" + gender +
              '}';
   }
}
