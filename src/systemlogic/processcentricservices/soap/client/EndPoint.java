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
	



	/*
	 * 
	 * public static void request1() { try { peopleList = people.getPeople(); if
	 * (peopleList != null) { for (PersonBean pb : peopleList) { write(
	 * "result: " +pb.toString()); } } } catch (Exception e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 * 
	 * public static void request2() { try { if ((peopleList != null) &&
	 * (peopleList.size() > 0)) { idperson = peopleList.get(0).getId(); personB
	 * = people.readPerson(idperson); write("readPerson: " + idperson); write(
	 * "result: " + personB.toString()); } } catch (Exception e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 * 
	 * public static void request3() { try { if ((peopleList != null) &&
	 * (peopleList.size() > 0)) { PersonBean pUpdate =
	 * peopleList.get(peopleList.size() - 1); write("id: " + pUpdate.getId());
	 * write("before: " + pUpdate.getFirstname()); String uuid =
	 * UUID.randomUUID().toString();
	 * 
	 * pUpdate.setFirstname("updatePerson: " + uuid); Long id =
	 * people.updatePerson(pUpdate); pUpdate = people.readPerson(id); write(
	 * "result: " + pUpdate.getFirstname()); } } catch (Exception e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 * 
	 * public static void request4() { try {
	 * 
	 * newPersonB = new PersonBean(); String uuid =
	 * UUID.randomUUID().toString(); newPersonB.setFirstname("create " + uuid);
	 * newPersonB.setLastname("last: " + new Date()); newMeasureB = new
	 * MeasureBean(); newMeasureB.setMeasureType("height"); Random nr = new
	 * Random(); newMeasureB.setMeasureValue("" + nr.nextInt(100));
	 * newMeasureB.setMeasureValueType("integer");
	 * newPersonB.getCurrentHealth().add(newMeasureB); Long id =
	 * people.addPerson(newPersonB); write("addPerson: " +
	 * newPersonB.toString()); newPersonB = people.readPerson(id);
	 * write("result:" + newPersonB.toString());
	 * 
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 * 
	 * public static void request5() { try {
	 * 
	 * if (newPersonB != null) { Long id = newPersonB.getId();
	 * people.deletePerson(id); newPersonB = people.readPerson(id); write(
	 * "readPerson: " + id); if (newPersonB == null) { write("OK"); } else {
	 * write("result:" + newPersonB.toString()); } }
	 * 
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 * 
	 * public static void request6() { try { if (idperson != null) { measureList
	 * = people.readPersonHistory(idperson, "weight");
	 * write("readPersonHistory:" + idperson + " weight"); if ((measureList !=
	 * null) && (measureList.getCurrentHealth() != null)) { for (MeasureBean mb
	 * : measureList.getCurrentHealth()) { write("result: " +mb.toString()); } }
	 * } } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 * 
	 * public static void request7() { try { measureType =
	 * people.readMeasureTypes(); if (measureType != null) { for (String mt :
	 * measureType) { write("result: " +mt); } }
	 * 
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 * 
	 * public static void request8() { try { if ((measureList != null) &&
	 * (measureList.getCurrentHealth().size() > 0)) { Long mid =
	 * measureList.getCurrentHealth().get(0).getMid(); type =
	 * measureList.getCurrentHealth().get(0).getMeasureType();
	 * 
	 * measureList = people.readPersonMeasure(idperson, type, mid); write(
	 * "readPersonMeasure: " +idperson +" "+ type + " "+ mid); if (measureList
	 * != null) { for (MeasureBean mb : measureList.getCurrentHealth()) { write(
	 * "result "+ mb.toString()); } } } } catch (Exception e) { // TODO
	 * Auto-generated catch block e.printStackTrace(); } }
	 * 
	 * public static void request9() { try { newmb = new MeasureBean();
	 * newmb.setMeasureType("newType"); Random nr = new Random();
	 * newmb.setMeasureValue("" + nr.nextInt(100));
	 * newmb.setMeasureValueType("integer");
	 * 
	 * Long mid = people.savePersonMeasure(idperson, newmb); newmb.setMid(mid);
	 * measureList = people.readPersonMeasure(idperson, "newType", mid); write(
	 * "readPersonMeasure "+idperson + " "+"newType" + " " +mid); if
	 * ((measureList != null) && (measureList.getCurrentHealth() != null)) { for
	 * (MeasureBean mb : measureList.getCurrentHealth()) { write("result" +
	 * mb.toString()); } }
	 * 
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 * 
	 * public static void request10() { try {
	 * 
	 * if (newmb != null) { Random rd = new Random();
	 * 
	 * Integer newvalue = rd.nextInt(100);
	 * newmb.setMeasureValue(newvalue.toString());
	 * people.updatePersonMeasure(idperson, newmb);
	 * 
	 * measureList = people.readPersonMeasure(idperson, newmb.getMeasureType(),
	 * newmb.getMid()); write("readPersonMeasure: " + idperson + " " +
	 * newmb.getMeasureType() + " "+newmb.getMid()); if (measureList != null) {
	 * for (MeasureBean mb : measureList.getCurrentHealth()) { write("result" +
	 * mb.toString()); } } }
	 * 
	 * } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } }
	 */
}
