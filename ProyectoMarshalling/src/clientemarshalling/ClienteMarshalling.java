/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientemarshalling;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Administrador
 */
public class ClienteMarshalling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        	/*
            Cliente c1 = new Cliente(12345678, "Pepe", "Pérez Martínez",
                    "pepe@sincorreo.es", "+1555123456",
                    new Direccion(23008, "Calle", "Virgen de la Capilla", "1", "2º", "", "A"));
            
            Cliente c2 = new Cliente(87654321, "Juan", "García Pérez",
                    "juan@sincorreo.es", "+1555654321",
                    new Direccion(23008, "Paseo", "de la Estación", "44", "", "", ""));
            
            Clientes clientes = new Clientes();
            clientes.addCliente(c1);
            clientes.addCliente(c2);
            System.out.println(clientes);*/
            
            Clientes clientes = new Clientes();
            
            JAXBContext jaxbContext = JAXBContext.newInstance(clientes.getClass());
            Unmarshaller jaxbMarshaller = jaxbContext.createUnmarshaller();
            
            File file = new File("clientes.xml");
            clientes = (Clientes) jaxbMarshaller.unmarshal(file);
            
            System.out.println(clientes);
            //Formatea la salida del archivo con sus espacios y tabuladores
            //jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            
            //Marshal the employees list in file
            //Le pasamos la lista de clientes y el nombre del fichero que va a tener
            //jaxbMarshaller.marshal(clientes, new File("clientes.xml"));
        } catch (JAXBException ex) {
            Logger.getLogger(ClienteMarshalling.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
