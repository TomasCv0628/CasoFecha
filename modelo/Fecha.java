package modelo;

public class Fecha
{

    // -----------------------
    // ------ Atributos ------
    // -----------------------

    private int dia;
    private int mes;
    private int annio;

    public int getDia()
    {
        return dia;
    }
    public int getMes()
    {
        return mes;
    }
    public int getAnnio()
    {
        return annio;
    }
    public void setAnnio(int annio) 
    {
        this.annio = annio;
    }
    public void setMes(int mes) 
    {
        this.mes = mes;
    }
    public void setDia(int dia) 
    {
        this.dia = dia;
    }
    public String toString()
    {
        return dia + "/" + mes + "/" + annio;
    }
}