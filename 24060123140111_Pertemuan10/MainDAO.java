/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package person;

/**
 *
 * @author unsa
 */
public class MainDAO {
    public static void main(String args[]){
        Person person = new Person("Unsza");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDao());
        try {
            m.getPersonDAO().savePerson(person);
        } catch(Exception e) {
            e.printStackTrace();
        }       
    }
}