package Day40.MultipleInheritance;

public class ChildClass implements ParentOne, ParentTwo {

    @Override
    public void methodOne() {
        System.out.println(ParentOne.variable2);
        System.out.println(ParentTwo.variable2);
    }

    // We have this same named method in both Parent Interfaces but overriding once is enough!!
    @Override
    public void methodTwo() {

    }

    @Override
    public void methodThree() {

    }

}
