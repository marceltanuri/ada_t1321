class ConstruirUmObjeto{

    public static void main(String a[]){

        Paciente p = new Paciente();
        
        p.nome = a[0];
        p.peso = Double.parseDouble(a[1]);

        System.out.println("Nome: " + p.nome);
        System.out.println("Peso: " + p.peso);

    }

}