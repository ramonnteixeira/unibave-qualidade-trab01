package net.unibave.factory.secreto;

class Arquivo {

    final ArquivoBehavior behavior;

    public Arquivo(ArquivoBehavior behavior) {
        this.behavior = behavior;
    }
    
    void print() {
        System.out.println(behavior.getConteudo());
    }

}
