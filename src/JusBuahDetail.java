//inheritence
public class JusBuahDetail extends JusBuah{

    
    public int toping;
    public JusBuahDetail(String nama, int harga) {
        super(nama, harga);
    }
    
    
    public int getHargaTotal(){
        return getHarga()+toping;
    }
    
   
    //Polymorphs (override)
    @Override
    public String tampilData(int toping){
        this.toping = toping;
        return super.tampilData()+
        "\nHarga Toping : "+toping+
        "\nHarga Total : "+getHargaTotal()+
        "\n----------------";
    }
}