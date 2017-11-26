
import Business.*;
import com.sun.javafx.css.CalculatedValue;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rohan
 */
public class FlightManagement {
    private static FlightSchedule fs1;
    public static void main(String[] args) {
        
        String filename = "csv_data/Customer_Emirates.csv";
        File file = new File (filename);
        ArrayList<Person> custList = new ArrayList<Person>() ;
        try
        {
            Scanner inputStream = new Scanner(file);
            while (inputStream.hasNext())
            {
                String data = inputStream.nextLine();
                String [] customer = data.split(",");
                Person p = new Person();
                
                p.setFirstname(customer[0]);
                p.setLastname(customer[1]);
                p.setGender(customer[2]);
                System.out.println(customer[2]);
                p.setSsn(Integer.parseInt(customer[3]));
                custList.add(p);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            
        } 
        
        
        String filename_Qatar = "csv_data/Customer_Qatar.csv";
        File file2 = new File (filename_Qatar);
        ArrayList<Person> custListQatar = new ArrayList<Person>() ;
        try
        {
            Scanner inputStream = new Scanner(file2);
            while (inputStream.hasNext())
            {
                String data = inputStream.nextLine();
                String [] customer = data.split(",");
                Person p1 = new Person();
                //System.out.println(values[4]);
                p1.setFirstname(customer[0]);
                System.out.println(customer[0]);
                p1.setLastname(customer[1]);
                p1.setGender(customer[2]);
                p1.setSsn(Integer.parseInt(customer[3]));
                System.out.println(customer[3]);
                custListQatar.add(p1);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            
        } 
     String filename_Emirates_Info = "csv_data/Airplane_Emirates.csv";
        File file3 = new File (filename_Emirates_Info);
        ArrayList<Airplane> planeListEmirates = new ArrayList<Airplane>() ;
        try
        {
            Scanner inputStream = new Scanner(file3);
            while (inputStream.hasNext())
            {
                String data = inputStream.nextLine();
                String [] plane = data.split(",");
                Airplane emirates = new Airplane();
                emirates.setModelNumber(plane[0]);
                System.out.println(plane[0]);
                emirates.setManufacName(plane[1]);
                System.out.println(plane[1]);
                planeListEmirates.add(emirates);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            
        }    
        
        String filename_Qatar_Info = "csv_data/Airplane_Qatar.csv";
        File file4 = new File (filename_Qatar_Info);
        ArrayList<Airplane> planeListQatar = new ArrayList<Airplane>() ;
        try
        {
            Scanner inputStream = new Scanner(file4);
            while (inputStream.hasNext())
            {
                String data = inputStream.nextLine();
                String [] plane = data.split(",");
                Airplane qatar = new Airplane();
                //System.out.println(values[4]);
                qatar.setModelNumber(plane[0]);
                qatar.setManufacName(plane[1]);
                planeListQatar.add(qatar);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            
        }    
        
        String filename_f1_Info = "csv_data/Flight1.csv";
        File file5 = new File (filename_f1_Info);
        ArrayList<Flight> flightList1 = new ArrayList<Flight>() ;
        try
        {
            Scanner inputStream = new Scanner(file5);
            while (inputStream.hasNext())
            {
                String data = inputStream.nextLine();
                String [] flight = data.split(",");
                Flight f1 = new Flight();
                //System.out.println(values[4]);
                f1.setFlightName(flight[0]);
                f1.setArrival(flight[1]);
                f1.setDepart(flight[2]);
                f1.setTimestamp(flight[3]);
                flightList1.add(f1);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            
        }    
        
        String filename_f2_Info = "csv_data/Flight2.csv";
        File file6 = new File (filename_f2_Info);
        ArrayList<Flight> flightList2 = new ArrayList<Flight>() ;
        try
        {
            Scanner inputStream = new Scanner(file6);
            while (inputStream.hasNext())
            {
                String data = inputStream.nextLine();
                String [] flight = data.split(",");
                Flight f2  = new Flight();
                f2.setFlightName(flight[0]);
                f2.setArrival(flight[1]);
                f2.setDepart(flight[2]);
                f2.setTimestamp(flight[3]);
                flightList2.add(f2);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            
        }    
        
        
        String filename_seat_Info = "csv_data/seats.csv";
        File file7 = new File (filename_seat_Info);
        ArrayList<Seats> seatflightListE1 = new ArrayList<Seats>() ;
        ArrayList<Seats> seatflightListE2 = new ArrayList<Seats>() ;
        ArrayList<Seats> seatflightListQ1 = new ArrayList<Seats>() ;
        ArrayList<Seats> seatflightListQ2 = new ArrayList<Seats>() ;

        try
        {
            Scanner inputStream = new Scanner(file7);
            while (inputStream.hasNext())
            {
                String data = inputStream.nextLine();
                String [] seatE1 = data.split(",");
                Seats s1  = new Seats();
                Random r = new Random();
                s1.setPrice(ThreadLocalRandom.current().nextInt(100, 1000 + 1));
                System.out.println(seatE1[0]);
                //s1.setSeatType(SeatCategoryEnum.valueOf(seatE1[0].toUpperCase()));
                s1.setSeatType(display(seatE1[0]));
                s1.setIsOccupied(r.nextBoolean());
                s1.setSeatNumber(seatE1[1]);
                s1.setSeatAssignedTo(custList.get(r.nextInt(custList.size())));
                seatflightListE1.add(s1);
                flightList1.get(0).setSeatsList(seatflightListE1);
                
            
                String [] seatE2 = data.split(",");
                Seats s2  = new Seats();
                s2.setPrice(ThreadLocalRandom.current().nextInt(100, 1000 + 1));
               // s2.setSeatType(SeatCategoryEnum.valueOf(seatE2[0].toUpperCase()));
               s2.setSeatType(display(seatE2[0]));
                s2.setIsOccupied(r.nextBoolean());
                s2.setSeatNumber(seatE2[1]);
                s2.setSeatAssignedTo(custListQatar.get(r.nextInt(custListQatar.size())));
                seatflightListE2.add(s2);
                flightList1.get(0).setSeatsList(seatflightListE2);
                
                
                String [] seatQ1 = data.split(",");
                Seats s3  = new Seats();
                s3.setPrice(ThreadLocalRandom.current().nextInt(100, 1000 + 1));
                //s3.setSeatType(SeatCategoryEnum.valueOf(seatQ1[0].toUpperCase()));
                s3.setSeatType(display(seatQ1[0]));
                s3.setIsOccupied(r.nextBoolean());
                s3.setSeatNumber(seatQ1[1]);
                s3.setSeatAssignedTo(custList.get(r.nextInt(custList.size())));
                seatflightListQ1.add(s3);
                flightList2.get(0).setSeatsList(seatflightListQ1);
                
                
                String [] seatQ2 = data.split(",");
                Seats s4  = new Seats();
                s4.setPrice(ThreadLocalRandom.current().nextInt(100, 1000 + 1));
                //s4.setSeatType(SeatCategoryEnum.valueOf(seatQ2[0].toUpperCase()));
                s4.setSeatType(display(seatQ2[0]));
                s4.setIsOccupied(r.nextBoolean());
                s4.setSeatNumber(seatQ2[1]);
                s4.setSeatAssignedTo(custListQatar.get(r.nextInt(custListQatar.size())));
                seatflightListQ2.add(s4);
                flightList2.get(1).setSeatsList(seatflightListQ2);
                
                
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            
        }    
    ////////////////////////////////////////////////////////////////////////////////////////////////////////

  flightList1.get(0).setSeatsList(seatflightListE1);
  flightList1.get(1).setSeatsList(seatflightListE2);
  flightList2.get(0).setSeatsList(seatflightListQ1);
  flightList2.get(1).setSeatsList(seatflightListQ2);       
  
  
  Airliner airliner1 = new Airliner();
  airliner1.setAirlineName("Emirates");
  FlightSchedule flightSchedule1 = new FlightSchedule();
  fs1 = flightSchedule1;
  flightSchedule1.setFlightCollection(flightList1);
  flightSchedule1.setAirliner(airliner1);
  Airliner airliner2 = new Airliner();
  airliner2.setAirlineName("Qatar");
  FlightSchedule flightSchedule2 = new FlightSchedule();
  flightSchedule2.setFlightCollection(flightList2);
  flightSchedule2.setAirliner(airliner2);
  
  //arraylist for masterschedule that contains two flight schedules 
  ArrayList<FlightSchedule> flightScheduleList  = new ArrayList();
  flightScheduleList.add(flightSchedule1);
  flightScheduleList.add(flightSchedule2);
  
  MasterSchedule masterScheduleObject = new MasterSchedule();
  masterScheduleObject.setFlightschedule(flightScheduleList);
  
  Fleet fleet1 = new Fleet();
  fleet1.setAirplaneList(planeListEmirates);
  airliner1.setFcatalog(fleet1);
  Fleet fleet2 = new Fleet();
  fleet2.setAirplaneList(planeListQatar);
  airliner2.setFcatalog(fleet2);
  
  ArrayList<Person> personList = new ArrayList();
  personList.addAll(custList);
  personList.addAll(custListQatar);
  
  CustomerDirectory customerDirectory = new CustomerDirectory();
  customerDirectory.setCustDetails(personList);
  
  TravelAgency travelAgency = new TravelAgency();
  travelAgency.setMaster(masterScheduleObject);
  
  
  //calling all methods
  FlightManagement result = new FlightManagement();
  result.revenuePerFlight(flightList1);
  result.revenuePerFlight(flightList2);
  result.revenueCalculatedPerAirLiner(flightSchedule1, true);
  result.revenueCalculatedPerAirLiner(flightSchedule2, true);
  result.revenueGeneratedAllFlightsAllAirliner(flightScheduleList);
  
        calculate();
  }  
    
  public static SeatCategoryEnum display(String s)
  {
      if(s.equals(SeatCategoryEnum.WINDOW.toString()))
          return SeatCategoryEnum.WINDOW;
      
      else if (s.equals(SeatCategoryEnum.MIDDLE.toString()))
          return SeatCategoryEnum.MIDDLE;
      
      else return SeatCategoryEnum.AISLE;
  }
  
 public static void calculate ()      
  {
      //private int revenueGeneratedPerFlight = 0;
      int x=0;
      for(Flight f : fs1.getFlightCollection())
      {
        //  for(Seats s : f.getSeatsList())
          //{
          ArrayList<Seats> seatList = f.getSeatsList();
              for (int j = 0; j < seatList.size(); j++) {
              Seats currentSeat = seatList.get(j);
              if (currentSeat.isIsOccupied()) {

                  x += currentSeat.getPrice();
              }

          }
          //}
          //System.out.println("Revenue is"+x);
      }
}  
  public void revenuePerFlight(ArrayList<Flight> flightList){
     
      
      for (int i = 0; i < flightList.size(); i++) {
          int revenueGeneratedPerFlight = 0;
          Flight currentFlight = flightList.get(i);
          ArrayList<Seats> seatList = currentFlight.getSeatsList();
          for (int j = 0; j < seatList.size(); j++) {
              Seats currentSeat = seatList.get(j);
              if (currentSeat.isIsOccupied()) {

                  revenueGeneratedPerFlight += currentSeat.getPrice();
              }

          }
           System.out.println("Revenue Generated for flight number " + currentFlight.getFlightName()+ " is " +revenueGeneratedPerFlight);
      }
      
  }
  
  public int revenueCalculatedPerAirLiner(FlightSchedule flightScheduleObject, boolean printToConsole){
      ArrayList<Flight> flightList = flightScheduleObject.getFlightCollection();
      int revenueGeneratedPerAirLiner = 0;
      for (int i = 0; i < flightList.size(); i++) {
          Flight currentFlight = flightList.get(i);
          ArrayList<Seats> seatList = currentFlight.getSeatsList();
          for (int j = 0; j < seatList.size(); j++) {
              Seats currentSeat = seatList.get(j);
              if (currentSeat.isIsOccupied()) {

                  revenueGeneratedPerAirLiner += currentSeat.getPrice();
              }

          }
      }
      if(printToConsole) {
          System.out.println("Revenue Generated for Airliner " + flightScheduleObject.getAirliner().getAirlineName() + " is " +revenueGeneratedPerAirLiner);
      }
      return revenueGeneratedPerAirLiner;
  }
  
  public void revenueGeneratedAllFlightsAllAirliner(ArrayList<FlightSchedule> flightScheduleList){
      int revenueGeneratedAllFlightsAllAirliner = 0;
      for (int i = 0; i < flightScheduleList.size(); i++){
          FlightSchedule currentFlightSchedule = flightScheduleList.get(i);
          int currentFlightScheduleRevenue =  revenueCalculatedPerAirLiner(currentFlightSchedule, false);
          revenueGeneratedAllFlightsAllAirliner += currentFlightScheduleRevenue;
         
      }
     System.out.println("Revenue Generated for all Flights and all Airliners is " + revenueGeneratedAllFlightsAllAirliner);
  }    
        
   /* public void revenueCalculatedPerFlight(ArrayList<Flight> flightCollection)
    {
        for(int i = 0; i<flightCollection.size(); i++) 
        {
            int revenuePerFlight = 0;
            Flight f = flightCollection.get(i);
            ArrayList<Seats> seatList = f.getSeatsList();
            for(int j = 0; j<seatList.size(); j++) 
            {
                Seats curSeat = seatList.get(j);
                
                if (curSeat.isIsOccupied()){
                    revenuePerFlight += curSeat.getPrice();
                }
            }
            System.out.println("Revenue Generated" + f.getFlightName() + "is" +revenuePerFlight);
        }
    }*/
    
    
    
    
   /*public void printPersonList(ArrayList<Person> custList, String airlineName)
   {
        System.out.println("Person Details" + airlineName);
        for(int i = 0; i<custList.size(); i++)
        {
            System.out.println("Details:"+ custList.get(i) );
        }
        } */
}
