import java.util.Stack;
public class Pino {
    private Stack<Disco> discos;
    private String nome;

    public Pino(String nome){
            this.nome = nome;
            this.discos = new Stack<>();

    }

    public void adicionarDiscos(Disco disco) {
        if (!disco.isEmpty() && discos.peek().getTamanho() <= disco.getTamanho()){
            throw new IllegalArgumentException("Não é possível sobrepor um disco maior em um menor");
        }discos.push(disco);
    }
    public Disco removerDisco(){
        if(Disco.isEmpty()){
            throw new IllegalStateException("o disco no pino é inexistente")
        }
        return discos.pop();
    }
    public boolean estaVazio(){
        return discos.isEmpty();

    }
    public String getNome(){
        return  nome;
    }
    @Override
    public String toString(){
        return "Pino{" +
                "nome =" + nome +  '\'' +
                        "discos=" + discos + '}';
        }
    }




