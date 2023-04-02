
/*
    AUTHOR : OM MANGESH WAGH
    TITLE : JAVA SINGLETON PATTERN
*/

class JavaSingletonPattern
{
    public static JavaSingletonPattern instance;
    public String str;
    private JavaSingletonPattern()
    {}
    public static JavaSingletonPattern getSingleInstance()
    {
        if(instance == null)
        {
            instance =  new JavaSingletonPattern();
        }
        return (instance);
    }
}
