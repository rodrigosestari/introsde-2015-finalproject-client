package systemlogic.processcentricservices.api.sw;

import java.util.ArrayList;

import javax.jws.WebService;

import systemlogic.businesslogicservices.dto.goal.valutation.Goalview;
import systemlogic.businesslogicservices.dto.goals.Goals;
import systemlogic.processcentricservices.endpoint.client.EndPoint;
import systemlogic.processcentricservices.interfaces.Client;
import systemlogic.processcentricservices.rest.client.AdapterWS;
import systemlogic.processcentricservices.rest.client.GoalWS;
import systemlogic.processcentricservices.soap.sw.MeasureHistoryView;
import systemlogic.processcentricservices.soap.sw.PersonDto;

//Service Implementation

@WebService(endpointInterface = "systemlogic.processcentricservices.api.sw.Api", serviceName = "ApiService")
public class ApiImpl implements Api {

	@Override
	public PersonDto readPerson(Long id) {
		
		return EndPoint.peopleExist(id);
	}

	@Override
	public ArrayList<Integer> getPeople() {
		
		return EndPoint.idPeople();
	}

	@Override
	public Long addPerson(PersonDto person) {
		// TODO Auto-generated method stub
		return Client.getHealth().addPerson(person);
	}


	@Override
	public int deletePerson(Long id) {
		// TODO Auto-generated method stub
		return Client.getHealth().deletePerson(id);
	}

	@Override
	public MeasureHistoryView readPersonHistory(Long id, String measureType) {
		// TODO Auto-generated method stub
		return EndPoint.personHistory(id, measureType);
	}

	@Override
	public  ArrayList<String> readMeasureTypes() {
		// TODO Auto-generated method stub
		return EndPoint.measureType();
	}



	@Override
	public boolean savePersonMeasure(Long id, String type, Float value, String data) {
		// TODO Auto-generated method stub
		return EndPoint.saveMeasure(id, type, value, data);
	}

	@Override
	public boolean importMeasure(Long id, String token, String type) {
		// TODO Auto-generated method stub
		return AdapterWS.importMeasure(id , token, type);
	}

	@Override
	public Goals getGoals(Long id) {
		// TODO Auto-generated method stub
		return GoalWS.getGoals(id);
	}

	@Override
	public Goalview getGoalValitation(Long id) {
		// TODO Auto-generated method stub
		return GoalWS.getGoalValitation(id);
	}

	@Override
	public boolean saveGoal(Long idperson, String measure, String start, String end, String type, String signal,
			String value) {
		
		return GoalWS.saveGoal(idperson, measure, start, end, type, signal, value);
	}


	
}
