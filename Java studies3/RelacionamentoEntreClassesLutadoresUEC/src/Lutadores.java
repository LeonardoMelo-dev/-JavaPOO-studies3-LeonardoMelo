public class Lutadores {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutadores(String no, String na,int id,double al,double pe,int vi,int de,int em) {

        setNome(no);
        setNacionalidade(na);
        setIdade(id);
        setAltura(al);
        setPeso(pe);
        setVitorias(vi);
        setDerrotas(de);
        setEmpates(em);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria()
    {
        return categoria;
    }

    private void setCategoria() {
        if(this.getPeso()<52.2)
        {
            this.categoria= "Inválido";
        }
        else if(this.getPeso()<=70.3)
        {
            this.categoria = "Leve";
        }
        else if (this.getPeso()<=83.9)
        {
            this.categoria = "Médio";
        }
        else if(this.getPeso()<=120.2)
        {
            this.categoria = "pesado";
        }
        else
        {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }


    public void apresentarLutador()
    {
        System.out.print("Lutador: "+getNome());
        System.out.print("\nOrigem: "+getNacionalidade());
        System.out.print("\nIade: "+getIdade());
        System.out.print("\nAltura: "+getAltura());
        System.out.print("\nPesando "+getPeso()+"Kg");
        System.out.print("\nGanhou :"+getVitorias()+" Lutas");
        System.out.print("\nPerdeu :"+getDerrotas()+" Lutas");
        System.out.print("\nEmpatou :"+getEmpates()+" Lutas");
    }

    public void statusLutador()
    {
        System.out.print(getNome()+": ");
        System.out.print("\nÉ do peso: "+getCategoria());
        System.out.print("\n"+getVitorias()+" Vitorias");
        System.out.print("\n"+getDerrotas()+" Derrotas");
        System.out.print("\n"+getEmpates()+" Empates");
    }

    public void ganharLuta()
    {
        setVitorias(getVitorias()+1);
    }

    public void perderLuta()
    {
        setDerrotas(getDerrotas()+1);
    }

    public void empatarLuta()
    {
        setEmpates(getEmpates()+1);
    }
}
