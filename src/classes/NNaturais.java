package classes;
public class NNaturais {    
    //ATRIBUTOS
    private int numero = 0;
    private int numero2 = 0;
    //METODOS
    public void setNumero(int numero){
        this.numero = numero;
    }
    public void setNumero(int numero, int numero2){
        this.numero = numero;
        this.numero2 = numero2;
    }
    public int getFatorial() throws Exception{
        if(this.numero<=0)throw new Exception("Numero invalido");
        int valor = this.numero;
        int i = valor-1;
        while(i > 1){
            valor *= i;
            i--;
        }
        return valor;
    }
    public boolean getNumPerfeito() throws Exception{
        if(this.numero<=0)throw new Exception("Numero invalido");
        int num = this.numero;
        int somaDivisores = 1;
        
        for(int i=2; i< num; i++){
            if(num%i == 0){
                somaDivisores += num / i;
            }
        }
        if(somaDivisores == num){
            return true;
        }
        return false;
    }
    public boolean getCapicua() throws Exception{
        if(this.numero<=0)throw new Exception("Numero invalido");
        int num = this.numero;
        int original = num;
        int reverso = 0;
        
        while(num>0){
            int posicao = num % 10;
            reverso = (reverso * 10) + posicao;
            num = num / 10;
        }
        return original == reverso?true:false;
    }
    public boolean getQuadradoPerfeito() throws Exception{
        if(this.numero<=0)throw new Exception("Numero invalido");
        int raiz = 0;
        raiz = (int)(Math.sqrt(this.numero));
        if(Math.pow(raiz, 2) == this.numero){
            return true;
        }
        return false;
    }
    public boolean getNumeroPrimo() throws Exception{
        if(this.numero<=0)throw new Exception("Numero invalido");
        int n,cont;
        n=this.numero;
        cont=0;
        for (int i=1;i<=n;i++){
            if(n%i == 0)
            cont=cont+1;
        }
        
        return cont==2?true:false;
    }
    public String getBase10Para2() throws Exception{
        if(this.numero<=0)throw new Exception("Numero invalido");
        return "Valor em Binario: " + Integer.toBinaryString(this.numero);
    }
    public String getBase10Para8() throws Exception{
        if(this.numero<=0)throw new Exception("Numero invalido");
        return "Valor em Octal: " + Integer.toOctalString(this.numero);
    }
    public String getBase10Para16() throws Exception{
        if(this.numero<=0)throw new Exception("Numero invalido");
        return "Valor em Hexa: " + Integer.toHexString(this.numero);
    }
    public int getMaxDivComum() throws Exception{
        if(this.numero<=0)throw new Exception("Numero invalido");
        int resto;
        int num1 = this.numero;
        int num2 = this.numero2;
        
        while(num2 != 0) {
            resto = num1 % num2;
            num1 = num2;
            num2 = resto;
        }
        return num1;
    }
    public int getMMC() throws Exception{
        if(this.numero<=0)throw new Exception("Numero invalido");
        int num1 = this.numero;
        int num2 = this.numero2;
        int n = 2;
        int resultado = 1;
        while(num1 != num2 || num2 != 1){
            while(num1 % n != 0 && num2 % n != 0){
                n++;
            }
            if(num1 % n == 0){
                num1 = num1 / n;
            }
            if(num2 % n == 0){
                num2 = num2 / n;
            }
            resultado = resultado * n;
        }
        return resultado;
    }
    public boolean getPrimosEntreSi() throws Exception{
        if(this.numero<=0)throw new Exception("Numero invalido");
        int resto;
        int num1 = this.numero;
        int num2 = this.numero2;
        
        while(num2 != 0) {
            resto = num1 % num2;
            num1 = num2;
            num2 = resto;
        }
        
        return num1 == 1?true:false;
    }
}