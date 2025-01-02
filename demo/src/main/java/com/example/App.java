package com.example;

import java.util.List;

import com.example.DataManagment.DataManagmentImplementation;
import com.example.DataManagment.DataManagmentInterface;
import com.example.UserManagment.User;
import com.example.UserManagment.UserImplementation;
import com.example.UserManagment.UserInterface;

public class App {
    public static void main(String[] args) {

        UserInterface user = new UserImplementation();
        List<String> userInput = user.getInputUser(); // methods from the user UserImplementation()
        User users = new User(userInput.get(0), userInput.get(1), userInput.get(2));

        DataManagmentInterface dataManagment = new DataManagmentImplementation();
        dataManagment.AddNotes(users);
    }
}

  private static String viewAll;
  public static void main(String[] args) throws Exception {
    hashmap = new HashMap < > ();
	Task = new HashMap < > ();	//
	Event = new HashMap < > ();	//
	Remainder = new HashMap < > ();	//
    input = new Scanner(System.in);
    AllMethods methods = new Over_Method(); // Polymerphysim
    methods.Dots(5);
    methods.ClearConsole();
    methods.Members();
    System.out.print("Click Any key to Procced: ");
    input.nextLine();
    methods.ClearConsole();
    int delay = 350;
    String[] loading = {
      "|",
      "/",
      "-",
      "\\"
    };
    methods.LoadingAnimation(loading, delay);
    System.out.println();
    System.out.print("You Are Human?(yes/no): ");
    String inputHuman = input.nextLine().toLowerCase();
    if (inputHuman.equals("yes") || inputHuman.equals("y")) {

//Method
 methods.LoadingAnimation(loading, delay);
    System.out.println();
    methods.ClearConsole();
	 System.out.println("Recorded Notes in your Files:");
	 System.out.println();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
          String line;
          while ((line = reader.readLine()) != null) {
			  lengthDate = methods.extractDate(line); // function/method na kinukuha yung index ng date
			  lengthNote = methods.extractNote(line);// function/method na kinukuha yung index ng notes
			  hashmap.put(lengthDate , lengthNote);
			  System.out.println(line);
          }
        } catch (IOException e) {
          System.out.println(e);
        }
      do {
        methods.Display(); // call Display
        System.out.print("Enter Choices: ");
        int UserChoice = input.nextInt();
        methods.ClearConsole();
        methods.Options(UserChoice);
        System.out.print("Do You Want to Use Again?(Y/N): ");
        //input.nextLine(); // For Logically Error!
        TryAgain = input.nextLine().toUpperCase();
      } while (TryAgain.equals("Y") || TryAgain.equals("YES")); // if the user Ended or typed N or No the all listed is Added to the txt file
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
				for (Map.Entry < String, String > entry: hashmap.entrySet()) {
					viewAll = entry.getKey() + " : " + entry.getValue();
					writer.write(viewAll + "\n");
				}
		} catch (IOException e) {
			System.out.println(e);
			}
    } else {
      System.exit(0);
    }
  } //end of method

 // Abstract Class
  public static abstract class AllMethods {
    public abstract void LoadingAnimation(String[] arr, int Loading) throws Exception;
    // -----Main Function----
    public abstract void Options(int Choices) throws Exception;
    //------Main Function----
    public abstract void ClearConsole();
    public abstract int Dots(int count) throws Exception;
    public abstract void Display();
    public abstract void Members() throws Exception;
	public abstract String extractDate(String line1);
	public abstract String extractNote(String lines);
  } // end Of Abstract Class

  // Inheritance Class
  public static class Over_Method extends AllMethods {

    // ovverided
    public void LoadingAnimation(String[] arr, int Loading) throws Exception {

      // For Each the Array
      for (String animation: arr) {
        // r is meaning read
        System.out.print("\r" + "Processing: ");

        // use Char to Convert Letter by Letter the String
        for (char c: animation.toCharArray()) {
          System.out.print(c);
          Thread.sleep(Loading);
        }
      }
    } // end of Loading Method
	public String extractDate(String line1){
		String extractedDate = line1; // get line1 value
		int colonIndex = line1.indexOf(":"); // Getting the index of Colon
		if(colonIndex != -1){ // check if colon is not in the index -1
			extracted_Date= line1.substring(0 , colonIndex).trim(); // them the text started index 0 to before colon
		}
		return extracted_Date; // return the value of the before color(extact Date)
	}
	public String extractNote(String lines){ // same logic to the extractDate
		String extractedNote = lines;
		int colonIndex1 = lines.indexOf(":");
		if(colonIndex1 != -1){
			extracted_Notes= lines.substring(colonIndex1 + 1).trim();
		}
		return extracted_Notes;

   // -----Main Function----
    public void Options(int Choices) throws Exception {

      switch (Choices) {
      case 1:
        // Method for add
        Add();
        break;
      case 2:
        // Method for Remove
        Remove();
        break;
      case 3:
        // Method for View
        View();
        break;
      case 4:
        // Method for Display All
        DisplayAll();
        break;
      case 5:
        // Method for Exit Console
        ExitConsole();
        break;
      }
    }
    // Add Method
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

// Remove Method
    public void Remove() {
		System.out.println("-- REMOVE YOUR NOTE --");
		System.out.print("Enter Date: ");
		input.nextLine();
		String userDate = input.nextLine().toLowerCase();
		
	if(userDate.matches("^\\d{1,2}-\\d{1,2}-\\d{4}$")){
		if (hashmap.containsKey(userDate)) {
			String removedValue = hashmap.remove(userDate);
			System.out.println("Successfully Deleted The Notes!");

			// Update the file after removing the note (Update The Writed)
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
				for (Map.Entry<String, String> entry : hashmap.entrySet()) {
					writer.write(" ");
				}
			} catch (IOException e) {
				System.out.println(e);
			}
			try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME, true))) {
				for (Map.Entry < String, String > entry: hashmap.entrySet()) {
				viewAll = entry.getKey() + " : " + entry.getValue();
				writer.write(viewAll + "\n");
				}
				} catch (IOException e) {
					System.out.println(e);
					}

		} else {
			System.out.println("Date Not found!");
		}

	}else{
		System.out.println("Number only in Date!");
	}
	}
 // View Method
    public void View() {
      System.out.println("-- VIEW YOUR NOTE --");
      System.out.print("Enter Date: ");
      input.nextLine();
      String Dates = input.nextLine();
      String Keys = hashmap.get(Dates);
		
		if(Dates.matches("^\\d{1,2}-\\d{1,2}-\\d{4}$")){
			if (Keys != null) {
			System.out.println("Your Notes on: " + Dates + " is: " + Keys);
			} else {
			System.out.println("There are no task on this Day");
			}
		}
		else{
			System.out.println("Number Only on the Date!");
		}
    }
    public void DisplayAll() {
      System.out.println("-- DISPLAY-ALL YOUR NOTE --");
      input.nextLine();

      for (Map.Entry < String, String > entry: hashmap.entrySet()) {
        System.out.println("-" + entry.getKey() + " : " + entry.getValue());
      }
    }

    public void ExitConsole() throws Exception {
      System.out.println("-- EXIT-CONSOLE YOUR NOTE --");
      System.out.print("Proccessing");
      Thread.sleep(1000);
      System.out.print(".");
      Thread.sleep(1000);
      System.out.print(".");
      Thread.sleep(1000);
      System.out.print(".");
      Thread.sleep(1000);
      System.out.print(".");
      System.exit(0);
    }

//------Main Function----
    public int Dots(int count) throws Exception {
      if (count <= 1) {
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        Thread.sleep(1000);
        System.out.print(".");
        return 1;
      }
      return Dots(count - 1);
    }
    public void Members() throws Exception {
      Thread.sleep(1000);
      System.out.println("------- TITLE ------");
      System.out.println("TECH NOTE ADVANCED TAKING NOTE SYSTEM");
	  System.out.println();
      System.out.println("------- LEADER ------");
      System.out.println("DJ N>>BAGASINA");
      System.out.println();
      System.out.println("------ MEMBERS ------");
      System.out.println("JOSEPH RAILEY J. PACHECO");
      System.out.println("BRYALLE B. RESPECIA");
      System.out.println("DARREN H. GRIMALDO");
      System.out.println("MARIA KIRSTEN M. CABUNGAN");
      System.out.println("WILIAN V. SPAÑA");
      System.out.println("-------------------");

    }






