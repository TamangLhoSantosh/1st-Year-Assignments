class E12{
    public void loop(){
        String a = "+--+--+--+";
        String b = "|  |  |  |";
        int c = 1;
        while(c < 4){
            System.out.println(a);
            System.out.println(b);
            c++;
        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        E12 e = new E12();
        e.loop();
    }
}