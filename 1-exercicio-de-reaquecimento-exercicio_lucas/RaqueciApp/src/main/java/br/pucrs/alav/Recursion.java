package br.pucrs.alav;

public class Recursion {
    public static void main(String[] args){
        Recursion recursao = new Recursion();
        System.out.println("Somas Sucessivas = " + recursao.somaSucessiva(6,30));
        System.out.println("Somas Iterativa = " + recursao.somaIterativa(6,30));
    }

    public int somaSucessiva(int fatorA, int fatorB){
        if(fatorA == 1)
            return fatorB;
        return somaSucessiva(fatorA-1,fatorB)+fatorB;
    }

    public int somaIterativa(int fatorA, int fatorB){
        if(fatorA == 0)
            return 1;
        return somaIterativa(fatorA-1,0)+1+somaIterativa(0,fatorB-1)+1;
    }
}
