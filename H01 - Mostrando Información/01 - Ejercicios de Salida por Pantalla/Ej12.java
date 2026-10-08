public class Ej12 {
    public static void main(String[] args) {
        int entero;
        float decimal;
        String texto;
        entero = 42;
        decimal = 123.4567f;
        texto = "Explorador";

        System.out.printf("\033[38;2;80;220;255mLABORATORIO DE FORMATOS\033[0m\n");
        System.out.println();
        System.out.printf("\033[38;2;80;220;255mNUMERO ENTERO: %d\033[0m\n",entero);
        System.out.printf("Decimal:\t\t\t\033[38;2;255;210;60m|\033[0m%d\033[38;2;255;210;60m|\033[0m\n",entero);
        System.out.printf("Alineando a la derecha:\t\t\033[38;2;255;210;60m|\033[0m%8d\033[38;2;255;210;60m|\033[0m\n",entero);
        System.out.printf("Alineando a la izquierda:\t\033[38;2;255;210;60m|\033[0m%-8d\033[38;2;255;210;60m|\033[0m\n",entero);
        System.out.printf("Con ceros a la izquierda:\t\033[38;2;255;210;60m|\033[0m%08d\033[38;2;255;210;60m|\033[0m\n",entero);
        System.out.printf("Con signo positivo:\t\t\033[38;2;255;210;60m|\033[0m%+d\033[38;2;255;210;60m|\033[0m\n",entero);
        System.out.printf("Hexadecimal:\t\t\t\033[38;2;255;210;60m|\033[0m%x\033[38;2;255;210;60m|\033[0m\n",entero);
        System.out.printf("Octal:\t\t\t\t\033[38;2;255;210;60m|\033[0m%o\033[38;2;255;210;60m|\033[0m\n",entero);
        System.out.println();
        System.out.printf("\033[38;2;80;220;255mNUMERO DECIMAL: %f\033[0m\n",decimal);
        System.out.printf("Una cifra decimal:\t\t\033[38;2;255;210;60m|\033[0m%.1f\033[38;2;255;210;60m|\033[0m\n",decimal);
        System.out.printf("Dos cifras decimales:\t\t\033[38;2;255;210;60m|\033[0m%.2f\033[38;2;255;210;60m|\033[0m\n",decimal);
        System.out.printf("Cuatro cifras decimales:\t\033[38;2;255;210;60m|\033[0m%.4f\033[38;2;255;210;60m|\033[0m\n",decimal);
        System.out.printf("Notacion cientifica:\t\t\033[38;2;255;210;60m|\033[0m%e\033[38;2;255;210;60m|\033[0m\n",decimal);
        System.out.println();
        System.out.printf("\033[38;2;80;220;255mTEXTO: %s\033[0m\n",texto);
        System.out.printf("Alineacion a la derecha:\t\033[38;2;255;210;60m|\033[0m%15s\033[38;2;255;210;60m|\033[0m\n",texto);
        System.out.printf("Alineacion a la izquierda:\t\033[38;2;255;210;60m|\033[0m%-15s\033[38;2;255;210;60m|\033[0m\n",texto);
        System.out.printf("Cinco primeros caracteres:\t\033[38;2;255;210;60m|\033[0m%.5s\033[38;2;255;210;60m|\033[0m\n",texto);
    }
    
}
