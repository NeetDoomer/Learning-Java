public class ObjectPractice {//the class is considered the object
    String StringElement = "This is the String";//initiating each element
    Short NumberElement = 1;

    public static void main(String[] args) {
        ObjectPractice objectName = new ObjectPractice();//initialized the objected and giving the reference value of objectName
        objectName.StringElement = "rawrr 123 x3";//changing the value of elements
        objectName.NumberElement = 15;

        System.out.println(objectName.StringElement +"\n"+ objectName.NumberElement);
    }
}
