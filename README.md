# gitTask
# Compulsory Task 1  
Follow these steps:  
● Create an empty folder called task1_project. 
● Open your terminal or command prompt and then changedirectory(cd) to your newly created folder.
● Enter the​ git init​ command to Initialise your new repository.    
● Enter the ​git status command and make a note of what you see. You should have a clean working directory. 
● Create a new file in the task1_project folder called helloWorld.java and write a program that prints out the message “Hello World!”  
● Run the ​git status command again. You should now see that your helloWorld.java file is untracked. 
● Enter the ​git add command followed by helloWorld.java to start tracking your new file. 
● Once again, run the ​git status ​command. You should now see that your helloWorld.java file is tracked and staged to be committed  
● Now that it is tracked, let us change the file helloWorld.java. Change the message printed out by the program to “Git is Awesome!”   
● Run ​git status again.You should see that helloWorld.java appears under a  section called “Changes not staged for commit”. This means that the file is tracked but has been modified and not yet staged. 
● To stage your file, simply run​ git add​ again. 
● If you run ​git status again you should see that it is once again staged for your next commit. 

# Compulsory Task 2    
Follow these steps: 
● Open your terminal or command prompt and change directory (cd) to the folder task1_project created above. 
● Create a new branch called issue-1 using the​ git branch ​command. 
● Switch to your new issue-1 branch by using the​ git checkout ​command. 
● Once you are on the the issue-1 branch, change the helloWorld.java file. Modify your program to accept input from the user and then print out the inputted data. 
● Add and commit your changes. 
● Checkout the master branch and use the git merge command to merge branches. 
● Take a screenshot of the output after running the ​git merge command and send it to your mentor.        
