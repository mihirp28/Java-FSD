package com.jap.collection;

import java.util.*;

public class ResidentService {

    private static final List<Resident> residentsRepository = new ArrayList<>();

    public ResidentService(){

    }

    /**
     * create list of all the residents.
     */
    public boolean addResident(Resident resident) {
        residentsRepository.add(resident);
        return true;
    }

   //Search for people with their social security number.

    public Resident searchResident(int socialSecurityNumber){

       for (Resident resident:residentsRepository){
           if(resident!=null && resident.getSocialSecurityNumber()==socialSecurityNumber){
               return resident;
           }
       }
       return null;

    }

   // Sort the name of the residents in alphabetical order.

    public List<Resident> getAllNamesSorted(List residentsRepository){
        List<Resident> nameSorted=new ArrayList<>(residentsRepository);
        NameComparator nameComparator = new NameComparator();
        nameSorted.sort(nameComparator);
        return nameSorted;

    }

   // Fetch the list of residents based on their gender.
    public List<Resident> getAllResidentsByGender(char gender){
        List<Resident> residentsByGender=new ArrayList<>();
       for (Resident resident:residentsRepository){
           if(resident!=null && resident.getGender()==gender){
               residentsByGender.add(resident);
           }
       }
       return residentsByGender;


    }

}
