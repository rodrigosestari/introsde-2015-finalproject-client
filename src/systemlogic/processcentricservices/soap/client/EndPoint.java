package systemlogic.processcentricservices.soap.client;

import java.util.ArrayList;

import systemlogic.processcentricservices.soap.sw.Person;
import userinterface.Client;

public class EndPoint {

	public static Person peopleExist(Long idPerson) {
		Person person = null;
		try {
			person = Client.getHealth().readPerson(idPerson);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			person = null;
			e.printStackTrace();
		}
		return person;
	}

	public static ArrayList<Integer> idPeople() {
		ArrayList<Integer> result = null;
		systemlogic.processcentricservices.soap.sw.ReadPersonListResponse.People people = null;

		try {
			people = Client.getHealth().readPersonList();
			if (null != people) {
				result = new ArrayList<>();
				for (systemlogic.processcentricservices.soap.sw.ReadPersonListResponse.People.Person p : people
						.getPerson()) {
					result.add(p.getIdPerson());
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			result = null;
			e.printStackTrace();
		}
		return result;
	}

	public static systemlogic.processcentricservices.soap.sw.ReadPersonHistoryResponse.MeasureProfile personHistory(
			Long idPerson, String type) {
		systemlogic.processcentricservices.soap.sw.ReadPersonHistoryResponse.MeasureProfile history = null;
		try {
			history = Client.getHealth().readPersonHistory(idPerson, type);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			history = null;
			e.printStackTrace();
		}
		return history;
	}
	
	public static ArrayList<String> measureType(){		
		 systemlogic.processcentricservices.soap.sw.ReadMeasureTypesResponse.MeasureProfile me = null;
		try {
			me = Client.getHealth().readMeasureTypes();
			if (null != me){
				return (ArrayList<String>) me.getMeasureType();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block			
			e.printStackTrace();
		}
		return null;
	}
	
	public static boolean saveMeasure( Long personId,String measure, Float value,String data){		
		systemlogic.processcentricservices.soap.sw.SavePersonMeasureResponse.MeasureHistory me = null;
		try {
			me = Client.getHealth().savePersonMeasure(personId, measure, value, data);
			if (null != me){
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block			
			e.printStackTrace();
		}
		return false;
	}
	

}
