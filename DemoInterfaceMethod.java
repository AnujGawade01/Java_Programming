// Here we create an interface and a class that inherits it but doesn't define the abstract method in Circle interface which wil lead to error

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
    // Error due to missing body of area and circumference
}

class DemoInterfaceMethod
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
    }
}
