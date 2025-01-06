package com.example.UserManagment;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserImplementation implements UserInterface {

    @Override
    public List<String> getInputUser() {
        Scanner input = new Scanner(System.in);
        String date = "";
        String title = "";
        String content = "";

        try {
            while (true) {
                System.out.print("Enter Date of Notes (YYYY-MM-DD): ");
                date = input.nextLine();
                if (isValidDate(date)) {
                    break;
                } else {
                    System.out.println("Invalid date. Please enter a valid date in YYYY-MM-DD format.");
                }
            }

            System.out.print("Enter a Title of Your Notes: ");
            title = input.nextLine();
            System.out.print("Enter Content of your Notes: ");
            content = input.nextLine();

        } catch (Exception e) {
            e.printStackTrace();
        }
        input.close();

        List<String> userInput = new ArrayList<>();
        userInput.add(date);
        userInput.add(title);
        userInput.add(content);

        return userInput;
    }

    // this is for checker if valid the date format
    private boolean isValidDate(String date) {
        try {
            LocalDate.parse(date);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

}
   // Add Method
    public void Add() throws Exception {
      System.out.println("-- ADD YOUR NOTE --");
      System.out.println("Format: (M-D-YYYY) , (1-2-2023)");
      while (true) {
        try {
          System.out.print("Enter Month:");
          String Month = String.valueOf(input.nextInt()); // Integer Convert to String

          if (Month.matches("^[1-9]|1[0-2]$")) {
            int VerMonth = Integer.parseInt(Month); // Convert String back to Integer to check conditions
            if (VerMonth >= 1 && VerMonth <= 12) {
              if (VerMonth == 1) { // Jan
                System.out.print("Enter Day:");
                int UserDay = input.nextInt();
                if (UserDay >= 1 && UserDay <= 31) {
                  System.out.print("Enter A Year:");
                  input.nextLine();
                  int UserYear = input.nextInt();
                  if (UserYear >= 2023 && UserYear <= 2023) {
                    String FormatYear = VerMonth + "-" + UserDay + "-" + UserYear;
                    System.out.println("Your Date:" + FormatYear);
					System.out.print("Choice One: (1.TAKS , 2.EVENT , 3.REMAINDER): ");
					ChoiceTypeNotes = input.nextInt();
					if(ChoiceTypeNotes == 1){
					System.out.print("Enter Task : ");
                    input.nextLine();
                    String Notes = input.nextLine();
                    Task.put(FormatYear, Notes);
						try (BufferedWriter TaskWriter = new BufferedWriter(new FileWriter(TaskData, true))) {
							for (Map.Entry < String, String > entry: Task.entrySet()) {
							  String TaskView = "Task :	" + 	entry.getKey() + " : " + entry.getValue();
							  TaskWriter.write(TaskView + "\n");
							}
						} catch (IOException e) {
							System.out.println(e);
							}
						System.out.println("Successfully Added!");	
						} //1
						else if(ChoiceTypeNotes == 2){
							try (BufferedWriter TaskWriter = new BufferedWriter(new FileWriter(TaskData, true))) {
								for (Map.Entry < String, String > entry: Task.entrySet()) {
								  String TaskView = "Task :	" + 	entry.getKey() + " : " + entry.getValue();
								  TaskWriter.write(TaskView + "\n");
								}
							} catch (IOException e) {
								System.out.println(e);
								}
						}// 2
						else{
							System.out.println("Invalid Input");
						}
						
                  } else {
                    System.out.println("error: This Teach-Note is Created 2023, And 2023 can support this programm.");
                    continue;
                  }
                } else {
                  System.out.println("error: Invalid Day On This Month");
                  input.nextLine();
                  continue;
                }
              } // End of Jan
              else if (VerMonth == 2) { // feb
                System.out.print("Enter Day: ");
                int UserDay = input.nextInt();
                if (UserDay >= 1 && UserDay <= 28) {
                  System.out.print("Enter A Year: ");
                  int UserYear = input.nextInt();
                  if (UserYear >= 2023 && UserYear <= 2023) {
                    String FormatYear = VerMonth + "-" + UserDay + "-" + UserYear;
                    System.out.println("Your Date: " + FormatYear);
                    System.out.print("Enter Note: ");
                    input.nextLine();
                    String Notes = input.nextLine();
                    hashmap.put(FormatYear, Notes);
                    System.out.println("Successfully Added!");
					try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
						for (Map.Entry < String, String > entry: hashmap.entrySet()) {
						  viewAll = entry.getKey() + " : " + entry.getValue();
						  writer.write(viewAll + "\n");
						}
					  } catch (IOException e) {
						System.out.println(e);
					  }
                  } else {
                    System.out.println("error: This Teach-Note is Created 2023, And 2023 can support this programm.");
                    continue;
                  }
                } else {
                  System.out.println("error: Invalid Day On This Month");
                  input.nextLine();
                  continue;
                }
              } else if (VerMonth == 3) { // march
                System.out.print("Enter Day: ");
                int UserDay = input.nextInt();
                if (UserDay >= 1 && UserDay <= 31) {
                  System.out.print("Enter A Year: ");
                  int UserYear = input.nextInt();
                  if (UserYear >= 2023 && UserYear <= 2023) {
                    String FormatYear = VerMonth + "-" + UserDay + "-" + UserYear;
                    System.out.println("Your Date: " + FormatYear);
                    System.out.print("Enter Note: ");
                    input.nextLine();
                    String Notes = input.nextLine();
                    hashmap.put(FormatYear, Notes);
					try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
						for (Map.Entry < String, String > entry: hashmap.entrySet()) {
						  viewAll = entry.getKey() + " : " + entry.getValue();
						  writer.write(viewAll + "\n");
						}
					  } catch (IOException e) {
						System.out.println(e);
					  }
                    System.out.println("Successfully Added!");
                  } else {
                    System.out.println("error: This Teach-Note is Created 2023, And 2023 can support this programm.");
                    continue;
                  }
                } else {
                  System.out.println("error: Invalid Day On This Month");
                  input.nextLine();
                  continue;
                }
              } else if (VerMonth == 4) { // April 
                System.out.print("Enter Day: ");
                int UserDay = input.nextInt();
                if (UserDay >= 1 && UserDay <= 30) {
                  System.out.print("Enter A Year: ");
                  int UserYear = input.nextInt();
                  if (UserYear >= 2023 && UserYear <= 2023) {
                    String FormatYear = VerMonth + "-" + UserDay + "-" + UserYear;
                    System.out.println("Your Date: " + FormatYear);
                    System.out.print("Enter Note: ");
                    input.nextLine();
                    String Notes = input.nextLine();
                    hashmap.put(FormatYear, Notes);
					try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
						for (Map.Entry < String, String > entry: hashmap.entrySet()) {
						  viewAll = entry.getKey() + " : " + entry.getValue();
						  writer.write(viewAll + "\n");
						}
					  } catch (IOException e) {
						System.out.println(e);
					  }
                    System.out.println("Successfully Added!");
                  } else {
                    System.out.println("error: This Teach-Note is Created 2023, Less than 2023 Is not Supported.");
                    continue;
                  }
                } else {
                  System.out.println("error: Invalid Day On This Month");
                  input.nextLine();
                  continue;
                }
              } else if (VerMonth == 5) { // may
                System.out.print("Enter Day: ");
                int UserDay = input.nextInt();
                if (UserDay >= 1 && UserDay <= 31) {
                  System.out.print("Enter A Year: ");
                  int UserYear = input.nextInt();
                  if (UserYear >= 2023 && UserYear <= 2023) {
                    String FormatYear = VerMonth + "-" + UserDay + "-" + UserYear;
                    System.out.println("Your Date: " + FormatYear);
                    System.out.print("Enter Note: ");
                    input.nextLine();
                    String Notes = input.nextLine();
                    hashmap.put(FormatYear, Notes);
					try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
						for (Map.Entry < String, String > entry: hashmap.entrySet()) {
						  viewAll = entry.getKey() + " : " + entry.getValue();
						  writer.write(viewAll + "\n");
						}
					  } catch (IOException e) {
						System.out.println(e);
					  }
                    System.out.println("Successfully Added!");
                  } else {
                    System.out.println("error: This Teach-Note is Created 2023, And 2023 can support this programm.");
                    continue;
                  }
                } else {
                  System.out.println("error: Invalid Day On This Month");
                  input.nextLine();
                  continue;
                }
              } else if (VerMonth == 6) { // June
                System.out.print("Enter Day: ");
                int UserDay = input.nextInt();
                if (UserDay >= 1 && UserDay <= 30) {
                  System.out.print("Enter A Year: ");
                  int UserYear = input.nextInt();
                  if (UserYear >= 2023 && UserYear <= 2023) {
                    String FormatYear = VerMonth + "-" + UserDay + "-" + UserYear;
                    System.out.println("Your Date: " + FormatYear);
                    System.out.print("Enter Note: ");
                    input.nextLine();
                    String Notes = input.nextLine();
                    hashmap.put(FormatYear, Notes);
					try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
						for (Map.Entry < String, String > entry: hashmap.entrySet()) {
						  viewAll = entry.getKey() + " : " + entry.getValue();
						  writer.write(viewAll + "\n");
						}
					  } catch (IOException e) {
						System.out.println(e);
					  }
                    System.out.println("Successfully Added!");
                  } else {
                    System.out.println("error: This Teach-Note is Created 2023, And 2023 can support this programm.");
                    continue;
                  }
                } else {
                  System.out.println("error: Invalid Day On This Month");
                  input.nextLine();
                  continue;
                }
              } else if (VerMonth == 7 ) { // july
                System.out.print("Enter Day: ");
                int UserDay = input.nextInt();
                if (UserDay >= 1 && UserDay <= 31) {
                  System.out.print("Enter A Year: ");
                  int UserYear = input.nextInt();
                  if (UserYear >= 2023&& UserYear <= 2023) {
                    String FormatYear = VerMonth + "-" + UserDay + "-" + UserYear;
                    System.out.println("Your Date: " + FormatYear);
                    System.out.print("Enter Note: ");
                    input.nextLine();
                    String Notes = input.nextLine();
                    hashmap.put(FormatYear, Notes);
					try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
						for (Map.Entry < String, String > entry: hashmap.entrySet()) {
						  viewAll = entry.getKey() + " : " + entry.getValue();
						  writer.write(viewAll + "\n");
						}
					  } catch (IOException e) {
						System.out.println(e);
					  }
                    System.out.println("Successfully Added!");
                  } else {
                    System.out.println("error: This Teach-Note is Created 2023, And 2023 can support this programm.");
                    continue;
                  }
                } else {
                  System.out.println("error: Invalid Day On This Month");
                  input.nextLine();
                  continue;
                }
              } else if (VerMonth == 8) { // Aug
                System.out.print("Enter Day: ");
                int UserDay = input.nextInt();
                if (UserDay >= 1 && UserDay <= 31) {
                  System.out.print("Enter A Year: ");
                  int UserYear = input.nextInt();
                  if (UserYear >= 2023 && UserYear <= 2023) {
                    String FormatYear = VerMonth + "-" + UserDay + "-" + UserYear;
                    System.out.println("Your Date: " + FormatYear);
                    System.out.print("Enter Note: ");
                    input.nextLine();
                    String Notes = input.nextLine();
                    hashmap.put(FormatYear, Notes);
					try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
						for (Map.Entry < String, String > entry: hashmap.entrySet()) {
						  viewAll = entry.getKey() + " : " + entry.getValue();
						  writer.write(viewAll + "\n");
						}
					  } catch (IOException e) {
						System.out.println(e);
					  }
                    System.out.println("Successfully Added!");
                  } else {
                    System.out.println("error: This Teach-Note is Created 2023, And 2023 can support this programm.");
                    continue;
                  }
                } else {
                  System.out.println("error: Invalid Day On This Month");
                  input.nextLine();
                  continue;
                }
              } else if (VerMonth == 9 ) { // sep
                System.out.print("Enter Day: ");
                int UserDay = input.nextInt();
                if (UserDay >= 1 && UserDay <= 30) {
                  System.out.print("Enter A Year: ");
                  int UserYear = input.nextInt();
                  if (UserYear >= 2023 && UserYear <= 2023) {
                    String FormatYear = VerMonth + "-" + UserDay + "-" + UserYear;
                    System.out.println("Your Date: " + FormatYear);
                    System.out.print("Enter Note: ");
                    input.nextLine();
                    String Notes = input.nextLine();
                    hashmap.put(FormatYear, Notes);
					try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
						for (Map.Entry < String, String > entry: hashmap.entrySet()) {
						  viewAll = entry.getKey() + " : " + entry.getValue();
						  writer.write(viewAll + "\n");
						}
					  } catch (IOException e) {
						System.out.println(e);
					  }
                    System.out.println("Successfully Added!");
                  } else {
					System.out.println("error: This Teach-Note is Created 2023, And 2023 can support this programm.");
                    continue;
                  }
                } else {
                  System.out.println("error: Invalid Day On This Month");
                  input.nextLine();
                  continue;
                }
              } else if (VerMonth == 10) { // oct
                System.out.print("Enter Day: ");
                int UserDay = input.nextInt();
                if (UserDay >= 1 && UserDay <= 31) {	
                  System.out.print("Enter A Year: ");
                  int UserYear = input.nextInt();
                  if (UserYear >= 2023 && UserYear <= 2023) {
                    String FormatYear = VerMonth + "-" + UserDay + "-" + UserYear;
                    System.out.println("Your Date: " + FormatYear);
                    System.out.print("Enter Note: ");
                    input.nextLine();
                    String Notes = input.nextLine();
                    hashmap.put(FormatYear, Notes);
					try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
						for (Map.Entry < String, String > entry: hashmap.entrySet()) {
						  viewAll = entry.getKey() + " : " + entry.getValue();
						  writer.write(viewAll + "\n");
						}
					  } catch (IOException e) {
						System.out.println(e);
					  }
                    System.out.println("Successfully Added!");
                  } else {
                    System.out.println("error: This Teach-Note is Created 2023, And 2023 can support this programm.");
                    continue;
                  }
                } else {
                  System.out.println("error: Invalid Day On This Month");
                  input.nextLine();
                  continue;
                }
              } else if (VerMonth == 11) { // nov
                System.out.print("Enter Day: ");
                int UserDay = input.nextInt();
                if (UserDay >= 1 && UserDay <= 30) {
                  System.out.print("Enter A Year: ");
                  int UserYear = input.nextInt();
                  if (UserYear >= 2023 && UserYear <= 2023) {
                    String FormatYear = VerMonth + "-" + UserDay + "-" + UserYear;
                    System.out.println("Your Date: " + FormatYear);
                    System.out.print("Enter Note: ");
                    input.nextLine();
                    String Notes = input.nextLine();
                    hashmap.put(FormatYear, Notes);
					try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
						for (Map.Entry < String, String > entry: hashmap.entrySet()) {
						  viewAll = entry.getKey() + " : " + entry.getValue();
						  writer.write(viewAll + "\n");
						}
					  } catch (IOException e) {
						System.out.println(e);
					  }
                    System.out.println("Successfully Added!");
                  } else {
                    System.out.println("error: This Teach-Note is Created 2023, And 2023 can support this programm.");
                    continue;
                  }
                } else {
                  System.out.println("error: Invalid Day On This Month");
                  input.nextLine();
                  continue;
                }
              } else if (VerMonth == 12) { // sep
                System.out.print("Enter Day: ");
                int UserDay = input.nextInt();
                if (UserDay >= 1 && UserDay <= 31) {
                  System.out.print("Enter A Year: ");
                  int UserYear = input.nextInt();
                  if (UserYear >= 2023 && UserYear <= 2023) {
                    String FormatYear = VerMonth + "-" + UserDay + "-" + UserYear;
                    System.out.println("Your Date: " + FormatYear);
                    System.out.print("Enter Note: ");
                    input.nextLine();
                    String Notes = input.nextLine();
                    hashmap.put(FormatYear, Notes);
					try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
						for (Map.Entry < String, String > entry: hashmap.entrySet()) {
						  viewAll = entry.getKey() + " : " + entry.getValue();
						  writer.write(viewAll + "\n");
						}
					  } catch (IOException e) {
						System.out.println(e);
					  }
                    System.out.println("Successfully Added!");
                  } else {
                    System.out.println("error: This Teach-Note is Created 2023, And 2023 can support this programm.");
                    continue;
                  }
                } else {
                  System.out.println("error: Invalid Day On This Month");
                  input.nextLine();
                  continue;
                }
              }
              break;
            } else {
              System.out.println("error: Invalid Date"); // Change color to Red and back to Default
              continue;
            }
          } else {
            System.out.println("error: Invalid Month"); // Change color to Red and back to Default
            continue;
          }
        } catch (InputMismatchException e) {
          System.out.println("error: Invalid Input. Please enter a number.");
          // Clear the scanner buffer to avoid an infinite loop caused by incorrect input
          input.nextLine();
        }
      } // end of Loop
    } // End of Add Method
