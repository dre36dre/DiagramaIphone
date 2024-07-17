public class ReprodutorMusical{
    public static void main(String[] args){
        private String musica;
        private boolean tocando=false;
        
        public  tocar(){
           if(tocando == true){
            System.out.println("Tocando musica");
           }else{
               System.out.println("Musica esta em pausa");
           }
        }
        //Método pausar
        public pausar(){
            if(tocando != true ){
                System.out.println("Musica em pausa");
            }else{
                System.out.println("Musica esta em pausa");
            }
        }
        //Método selecionar musica
            public selecionarMusica(String musica){
                this.musica=musica;
            }
            public void setMusica(String musica){
                this.musica=musica;
        }
            public String getMusica(){
                return this.musica;
            }
}
