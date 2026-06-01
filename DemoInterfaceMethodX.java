// Here we create an interface and a class that inherits it & define the abstract method in Circle interface

class DemoInterfaceMethodX
{
    public static void main(String A[])
    {
        // Circle cobj = new Circle();  - Not allowed

        Marvellous mobj = new Marvellous();
        float Ret = 0.0f;

        Ret = mobj.Area(10.5f);
        System.out.println("Area is : "+Ret);

        Ret = mobj.Circumference(10.5f);
        System.out.println("Circumference is : "+Ret);
    }
}

interface Circle
{
    // Characteristics  (public static final )
    float PI = 3.14f;    
    
    // Behaviours   (public abstract)
    float Area(float Radius);
    float Circumference(float Radius);
}

class Marvellous implements Circle
{
    public float Area(float Radius)
    {
        return Circle.PI * Radius * Radius;
    }

    public float Circumference(float Radius)
    {
        return 2 * Circle.PI * Radius;
    }  
}

