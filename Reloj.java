public class Reloj
{
    private int horas;
    private int minutos;
    
    public Reloj(int horaInicial, int minInicial)
    {
        horas=horaInicial;
        minutos=minInicial;
    }
    
    public void ticTac()
    {
        if(minutos>=59)
        {
            horas+=01;
            minutos=00;
        }
        if(horas>23)
        {
            horas=00;
        }
        else
        {
            minutos+=01;
        }
    }
    
    public String dimeTuTiempo()
    {
        String cadResultado="";
        
        cadResultado+=horas;
        cadResultado+=":";
        cadResultado+=minutos;
        return cadResultado;
    }
}