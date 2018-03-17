package classes;
public class Resultado extends NNaturais{
    //ATRIBUTOS
    private String input1;
    private String input2;
    //METODOS
    public Resultado(String input1, String input2){
        this.input1 = input1;
        this.input2 = input2;
    }
    public int getCampo1(){
        return Integer.parseInt(this.input1);
    }
    public int getCampo2(){
        return Integer.parseInt(this.input2);
    }
    public String fatorial() throws Exception{
        setNumero(this.getCampo1());
        int numResult1 = getFatorial();

        setNumero(this.getCampo2());
        int numResult2 = getFatorial();

        String result = "Primeiro Numero: " + String.valueOf(numResult1) + "\n" + "Segundo Numero: " +String.valueOf(numResult2);
        return result;
    }
    public String numPerfeito() throws Exception{
        setNumero(this.getCampo1());
        boolean numResult1 = getNumPerfeito();

        setNumero(this.getCampo2());
        boolean numResult2 = getNumPerfeito();

        String result = "Primeiro Numero: " + String.valueOf(numResult1) + "\n" + "Segundo Numero: " +String.valueOf(numResult2);
        return result;
    }
    public String capicua() throws Exception{
        setNumero(this.getCampo1());
        boolean numResult1 = getCapicua();

        setNumero(this.getCampo2());
        boolean numResult2 = getCapicua();

        String result = "Primeiro Numero: " + String.valueOf(numResult1) + "\n" + "Segundo Numero: " +String.valueOf(numResult2);
        return result;
    }
    public String quadradoPerfeito() throws Exception{
        setNumero(this.getCampo1());
        boolean numResult1 = getQuadradoPerfeito();

        setNumero(this.getCampo2());
        boolean numResult2 = getQuadradoPerfeito();

        String result = "Primeiro Numero: " + String.valueOf(numResult1) + "\n" + "Segundo Numero: " +String.valueOf(numResult2);
        return result;
    }
    public String NumeroPrimo() throws Exception{
        setNumero(this.getCampo1());
        boolean numResult1 = getNumeroPrimo();

        setNumero(this.getCampo2());
        boolean numResult2 = getNumeroPrimo();

        String result = "Primeiro Numero: " + String.valueOf(numResult1) + "\n" + "Segundo Numero: " +String.valueOf(numResult2);
        return result;
    }
    public String base10_2() throws Exception{
        setNumero(this.getCampo1());
        String numResult1 = getBase10Para2();

        setNumero(this.getCampo2());
        String numResult2 = getBase10Para2();

        String result = "Primeiro Numero: " + String.valueOf(numResult1) + "\n" + "Segundo Numero: " +String.valueOf(numResult2);
        return result;
    }
    public String base10_8() throws Exception{
        setNumero(this.getCampo1());
        String numResult1 = getBase10Para8();

        setNumero(this.getCampo2());
        String numResult2 = getBase10Para8();

        String result = "Primeiro Numero: " + String.valueOf(numResult1) + "\n" + "Segundo Numero: " +String.valueOf(numResult2);
        return result;
    }
    public String base10_16() throws Exception{
        setNumero(this.getCampo1());
        String numResult1 = getBase10Para16();

        setNumero(this.getCampo2());
        String numResult2 = getBase10Para16();

        String result = "Primeiro Numero: " + String.valueOf(numResult1) + "\n" + "Segundo Numero: " +String.valueOf(numResult2);
        return result;
    }
    public String MDC() throws Exception{
        setNumero(this.getCampo1(), this.getCampo2());
        int numResult = getMaxDivComum();

        String result = "Maximo divisor comum: " + String.valueOf(numResult);
        return result;
    }
    public String MMC() throws Exception{
        setNumero(this.getCampo1(), this.getCampo2());
        int numResult = getMMC();

        String result = "Minimo multiplo comum: " + String.valueOf(numResult);
        return result;
    }
    public String primosEntreSi() throws Exception{
        setNumero(this.getCampo1(), this.getCampo2());
        boolean numResult = getPrimosEntreSi();

        String result = "Primos entre si: " + String.valueOf(numResult);
        return result;
    }
}