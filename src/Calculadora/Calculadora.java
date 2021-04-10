package Calculadora;

public class Calculadora {
Boolean status;
double display=0.0;

    public Calculadora() {
    status=false;
    }

    public Boolean estado() {
        return status;
    }

    public void onOff() {
        status=!status;
    }

    public void operacion(double i, char c, double i1) {
        if(!status)return ;

        switch (c){
            case '+':
                display = i + i1;
                break;
            case '-':
                display = i - i1;
                break;
            case '*':
                display = i * i1;
                break;
            case '/':
                display = i / i1;
                break;
            case '^':
                display=1.0;
                if(i1 > 0) {
                    for (int a = 0; a < i1; a++) {
                        display *= i;
                    }
                    break;
                }else {
                    for (int b = 0; b < (-i1); b++) {
                        display *= (1 / i);
                    }
                    break;
                }
            default:
                display = 0.0;
        }

    }

    public void operacion(double i,char c) {
        if(!status) return ;
        if(c!='$')return;
        display=Math.sqrt(i);
    }

    public double display(){
        return display;
    }

}
