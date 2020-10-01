/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;
/**
 *
 * @author SUNREN
 */
public class CreatePersonHistory {
    private ArrayList<CreatePerson> CreatePHistory;
    
    public CreatePersonHistory()
    {
        CreatePHistory =new ArrayList<CreatePerson>();
    }
    
    public ArrayList<CreatePerson> getCreatePHistory() {
        return CreatePHistory;
    }

    public void setCreatePHistory(ArrayList<CreatePerson> CreatePHistory) {
        this.CreatePHistory = CreatePHistory;
    }
    
    public CreatePerson addVital(){
       CreatePerson cp = new CreatePerson();
       CreatePHistory.add(cp);
       return cp;
    }
    public void deleteVitals(CreatePerson v)
    {
        CreatePHistory.remove(v);
    }
            
}
