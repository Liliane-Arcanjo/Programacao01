
package ibirama.programacao01;


public class programa {
    public static void main(String[] args) {
        Estudante liliane = new Estudante();
        Estudante lucas = new Estudante();
        Estudante luan = new Estudante();
        
        liliane.setNome ("liliane");
        lucas.setNome  ("lucas");
        luan.setNome ("luan");
        
        System.out.println(liliane.getNome());
        System.out.println(lucas.getNome());
        System.out.println(luan.getNome());
        
    }
}
