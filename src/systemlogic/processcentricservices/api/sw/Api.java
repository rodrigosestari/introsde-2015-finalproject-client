package systemlogic.processcentricservices.api.sw;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import systemlogic.businesslogicservices.dto.goal.valutation.Goalview;
import systemlogic.businesslogicservices.dto.goals.Goals;
import systemlogic.processcentricservices.soap.sw.MeasureHistoryView;
import systemlogic.processcentricservices.soap.sw.PersonDto;




@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL) //optional
public interface Api {
	
	/**
	 * Method #2: readPerson(Long id) => Person | should give all the 
	 * Personal information plus current measures of one Person identified by {id} (e.g., current measures means current healthProfile)
	 * @param id
	 * @return
	 */
    @WebMethod(operationName="readPerson")
    @WebResult(name="person") 
    public PersonDto readPerson(@WebParam(name="personId") Long id);

    /**
     * Method #1: readPersonList() => List | should list all the people in the database
     *  (see below Person model to know what data to return here) in your database
     * @return
     */
    @WebMethod(operationName="readPersonList")
    @WebResult(name="people") 
    public ArrayList<Integer> getPeople();

    
    /**
     * Method #4: createPerson(Person p) => Person | should create a new Person and return the 
     * newly created Person with its assigned id (if a health profile is included, create also those measurements for the new Person).
     * @param person
     * @return
     */
    @WebMethod(operationName="createPerson")
    @WebResult(name="personId") 
    public Long addPerson(@WebParam(name="person") PersonDto person);

  

    /**
     * Method #5: deletePerson(Long id) should delete the Person identified by {id} from the system
     * @param id
     * @return
     */
    @WebMethod(operationName="deletePerson")
    @WebResult(name="personId") 
    public int deletePerson(@WebParam(name="personId") Long id);

    
/**
 *  Method #6: readPersonHistory(Long id, String measureType) => 
 *  List should return the list of values (the history) of {measureType} (e.g. weight) for Person identified by {id} 
 * @param id
 * @return
 */
    @WebMethod(operationName="readPersonHistory")
    @WebResult(name="MeasureProfile") 
    public MeasureHistoryView readPersonHistory(@WebParam(name="personId") Long id, @WebParam(name="type") String measureType);

    
    
    /**
     * Method #7: readMeasureTypes() => List should return the list of measures
     * @param id
     * @param type
     * @return
     */
    @WebMethod(operationName="readMeasureTypes")
    @WebResult(name="MeasureProfile") 
    public  ArrayList<String> readMeasureTypes();

    

    
    /**
     * Method #9: savePersonMeasure(Long id, Measure m) =>should save a new measure object {m}
     *  (e.g. weight) of Person identified by {id} and archive the old value in the history
     * @param id
     * @param type
     * @param mid
     * @return
     */
    @WebMethod(operationName="savePersonMeasure")
    @WebResult(name="measureHistory") 
    public boolean savePersonMeasure(@WebParam(name="personId") Long id, @WebParam(name="measure") String type,  @WebParam(name="value") Float value, @WebParam(name="data")  String data);

    /**
     * Method #9: importMeasure(Long id, Measure m) =>should save a new measure object {m}
     *  (e.g. weight) of Person identified by {id} and archive the old value in the history
     * @param id
     * @param type
     * @param mid
     * @return
     */
    @WebMethod(operationName="importMeasure")
    @WebResult(name="result") 
    public boolean importMeasure(@WebParam(name="personId") Long id, @WebParam(name="token") String token,  @WebParam(name="type") String type);

    /**
     * Method #9: getGoals(Long id, Measure m) =>should save a new measure object {m}
     *  (e.g. weight) of Person identified by {id} and archive the old value in the history
     * @param id
     * @param type
     * @param mid
     * @return
     */
    @WebMethod(operationName="getGoals")
    @WebResult(name="Goals") 
    public Goals getGoals(@WebParam(name="goalID") Long id);

    /**
     * Method #9: getGoals(Long id, Measure m) =>should save a new measure object {m}
     *  (e.g. weight) of Person identified by {id} and archive the old value in the history
     * @param id
     * @param type
     * @param mid
     * @return
     */
    @WebMethod(operationName="getGoalValitation")
    @WebResult(name="Goalview") 
    public Goalview getGoalValitation(@WebParam(name="goalID") Long id);
    
    
    
    
    /**
     * Method #9: getGoals(Long id, Measure m) =>should save a new measure object {m}
     *  (e.g. weight) of Person identified by {id} and archive the old value in the history
     * @param id
     * @param type
     * @param mid
     * @return
     */
    @WebMethod(operationName="saveGoal")
    @WebResult(name="Goalview") 
    public boolean saveGoal(@WebParam(name="personID") Long idperson, @WebParam(name="measure") String measure,
    		@WebParam(name="datastart") String start,@WebParam(name="dataend") String end,
    		@WebParam(name="type") String type,	@WebParam(name="signal") String signal, @WebParam(name="value") String value);

   
}
