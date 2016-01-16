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
	 * readPerson(Long id) => Person | should give all the 
	 * Personal information plus current measures of one Person identified by {id} (e.g., current measures means current healthProfile)
	 * @param id
	 * @return
	 */
	@WebMethod(operationName="readPerson")
	@WebResult(name="PersonDto") 
	public PersonDto readPerson(@WebParam(name="personId") Long id);

	/**
	 * readPersonList() => List | should list all the people in the database
	 *  (see below Person model to know what data to return here) in your database
	 * @return
	 */
	@WebMethod(operationName="readPersonList")
	@WebResult(name="person") 
	public ArrayList<Integer> getPeople();


	/**
	 * createPerson(Person p) => Person | should create a new Person and return the 
	 * newly created Person with its assigned id (if a health profile is included, create also those measurements for the new Person).
	 * @param person
	 * @return
	 */
	@WebMethod(operationName="createPerson")
	@WebResult(name="personId") 
	public Long addPerson(@WebParam(name="person") PersonDto person);



	/**
	 * deletePerson(Long id) should delete the Person identified by {id} from the system
	 * @param id
	 * @return
	 */
	@WebMethod(operationName="deletePerson")
	@WebResult(name="personId") 
	public int deletePerson(@WebParam(name="personId") Long id);


	/**
	 *  readPersonHistory(Long id, String measureType) => 
	 *  List should return the list of values (the history) of {measureType} (e.g. weight) for Person identified by {id} 
	 * @param id
	 * @return
	 */
	@WebMethod(operationName="readPersonHistory")
	@WebResult(name="MeasureHistoryView") 
	public MeasureHistoryView readPersonHistory(@WebParam(name="personId") Long id, @WebParam(name="type") String measureType);



	/**
	 * readMeasureTypes() => List should return the list of measures
	 * @param id
	 * @param measure
	 * @return
	 */
	@WebMethod(operationName="readMeasureTypes")
	@WebResult(name="measure") 
	public  ArrayList<String> readMeasureTypes();




	/**
	 *  savePersonMeasure(Long id, Measure m) =>should save a new measure object {m}
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
	 * importMeasure(Long id, String token,String type)
	 * import all measure type from an adapter 
	 * @param id
	 * @param token
	 * @param type
	 * @return
	 */
	@WebMethod(operationName="importMeasure")
	@WebResult(name="result") 
	public boolean importMeasure(@WebParam(name="personId") Long id, @WebParam(name="token") String token,  @WebParam(name="type") String type);

	/**
	 * getGoals(Long id) => Goals get all goals from a person
	 * @param id
	 * @return
	 */
	@WebMethod(operationName="getGoals")
	@WebResult(name="Goals") 
	public Goals getGoals(@WebParam(name="personId") Long id);

	/**
	 * getGoalValitation(Long id) => Goalview it validation the goal id
	 * @param id
	 * @return
	 */
	@WebMethod(operationName="getGoalValitation")
	@WebResult(name="Goalview") 
	public Goalview getGoalValitation(@WebParam(name="goalID") Long id);



	/**
	 * saveGoal should save a new goal
	 * @param idperson
	 * @param measure
	 * @param start
	 * @param end
	 * @param type
	 * @param signal
	 * @param value
	 * @return
	 */
	@WebMethod(operationName="saveGoal")
	@WebResult(name="Goalview") 
	public boolean saveGoal(@WebParam(name="personID") Long idperson, @WebParam(name="measure") String measure,
			@WebParam(name="datastart") String start,@WebParam(name="dataend") String end,
			@WebParam(name="type") String type,	@WebParam(name="signal") String signal, @WebParam(name="value") String value);


}
