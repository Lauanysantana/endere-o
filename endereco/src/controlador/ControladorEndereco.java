/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import dao.enderecodao;
import javax.swing.JOptionPane;
import modelo.endereco;
import tela.manutencao.Manutencao_endereco;

/**
 *
 * @author Administrador
 */
public class ControladorEndereco {

    public static void inserir(Manutencao_endereco man){
        endereco objeto = new endereco();
        objeto.setBairro(man.jtfbairro.getText());
        objeto.setComplemento(man.jtfcomplemento.getText());
        objeto.setLogradouro(man.jtflogradouro.getText());
        
        boolean resultado = enderecodao.inserir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
}
    public static void alterar(Manutencao_endereco man){
        endereco objeto = new endereco();
        //definir todos os atributos
        objeto.setBairro(man.jtfbairro.getText());
        objeto.setComplemento(man.jtfcomplemento.getText());
        objeto.setLogradouro(man.jtflogradouro.getText());
        objeto.setCodigo(man.jtfcodigo.getText());
        
        boolean resultado = enderecodao.alterar(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    } 
    public static void excluir(Manutencao_endereco man){
        endereco objeto = new endereco();
        objeto.setCodigo(Integer.parseInt(man.jtfcodigo.getText())); //só precisa definir a chave primeira
        
        boolean resultado = enderecodao.excluir(objeto);
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }
}
