/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientemarshalling;
import java.util.ArrayList;
import java.util.List;
 
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "clientes")
@XmlAccessorType (XmlAccessType.FIELD)
public class Clientes
{
    @XmlElement(name = "cliente")
    private List<Cliente> clientes = null;
 
    public List<Cliente> getClientes() {
        return clientes;
    }
 
    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public void addCliente(Cliente cliente){
        this.clientes.add(cliente);
    }

    public Clientes() {
        this.clientes = new ArrayList<Cliente>();
    }

	@Override
	public String toString() {
		return "Clientes [clientes=" + clientes + "]";
	}
    
    
}
