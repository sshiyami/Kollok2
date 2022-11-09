public class calculator
{
    int a, b;

    double Sum(double a, double b)
    {
        return a + b;
    }

    double Sub(double a, double b)
    {
        return a - b;
    }

    double Div(double a, double b)
    {
        if(b==0)
        {
            return 0;
        }
        return a / b;
    }

    double Proizv(double a, double b)
    {
        return a * b;
    }
}
