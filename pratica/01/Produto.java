public class Produto {
    
    String descricao;
    float preco;
    float aliquota;
    Scanner ler = new Scanner(System.in);
    
    public void getProduto(){
        
        System.out.print("Descrição: ");
        descricao = ler.nextLine();
        System.out.print("Preço: ");
        preco = ler.nextFloat();
        System.out.print("Aliquota: ");
        aliquota = ler.nextFloat();
        
    }
    
}