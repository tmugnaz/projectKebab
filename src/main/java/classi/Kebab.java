package classi;

public class Kebab{
   private Boolean panino;
   private String salsa;
   private Boolean vegetariano;
   private Boolean patatine;
   private Boolean cipolle;

   public Kebab(Boolean panino, String salsa, Boolean vegetariano, Boolean patatine, Boolean cipolle){
       this.panino=panino;
       this.salsa=salsa;
       this.vegetariano=vegetariano;
       this.patatine=patatine;
       this.cipolle=cipolle;
   }

    public void setCipolle(Boolean cipolle) {
        this.cipolle=cipolle;
    }

    public String getCipolle() {
        String onions;
        if(this.patatine){
            onions ="con scipola";
        }else{
            onions="senza scipola";
        }
        return onions;

    }

    public void setPatatine(Boolean patatine) {
        this.patatine = patatine;
    }

    public String getPatatine() {
       String fries;
       if(this.patatine){
           fries ="con patatine";
       }else{
           fries="niente patate";
       }
       return fries;

    }

    public void setVegetariano(Boolean vegetariano) {
        this.vegetariano = vegetariano;
    }

    public String getVegetariano() {
        String contenuto;
        if(this.vegetariano){
            contenuto="falafel";
        }else{
            contenuto="carne (possibilmente di topo)";
        }
        return contenuto;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setPanino(Boolean panino) {
        this.panino = panino;
    }
    //bicante;

    public String getPanino() {
       String tipoDiPiatto;
       if(this.panino){
           tipoDiPiatto="Panino";
       }else{
           tipoDiPiatto="Piadina";
       }
       return tipoDiPiatto;
    }
    public  void toIngredienti(){
       String ingredienti ="gli ingredienti del tuo kebab "+this.getSalsa()+", "+this.getPanino()+", "+this.getVegetariano()
                                                         +", "+this.getPatatine()+", "+this.getCipolle();
        System.out.println(ingredienti);


    }

}