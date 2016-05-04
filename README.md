# Identifying Code Smells And Refactoring

Identified several code smells like Long Method, God Class, Switch Statement Smell, Feature Envy, etc for an open source project and Refactored code to remove them.

Original Project: http://www.math-cs.gordon.edu/courses/cs211/ATMExample/

Smells(s)/Violation(s)/Bug(s)	                    Tool(s)	          Type of Tool
Feature Envy	                                   JDeodorant	        Eclipse Plugin
God Class	                                       JDeodorant	        Eclipse Plugin
Switch Statement Smell	                         JDeodorant	        Eclipse Plugin
Long Method	                                     PMD	              Eclipse Plugin
Short/Long variable	                             PMD	              Eclipse Plugin
Data Flow Anomalies (DU)	                       PMD	              Eclipse Plugin
Empty Catch	                                     PMD	              Eclipse Plugin
Dead Code	                                       PMD                Eclipse Plugin
                                                 Incode	            Standalone                              
Data Class                                       Incode	            Standalone
Similar Code	                                   Eclipse	          Out of the Box
Thread declared without name	                   FindBugs	          Eclipse Plugin
Naked Notify	                                   FindBugs	          Eclipse Plugin
Thread.sleep() with lock held	                   FindBugs	          Eclipse Plugin
Unconditional Wait	                             FindBugs	          Eclipse Plugin
Wait not in loop	                               FindBugs	          Eclipse Plugin
Write to Static Field from Instance method	     FindBugs	          Eclipse Plugin
Long Parameter List	                            No tools used     	None
Middle Man	                                    No tools used       Manual Review	None

Smells(s)/Violation(s)/Bug(s)	                  File Name(s)	                 Lines of Code
Feature Envy	                                  ATM.java	                      266 - 271
Long Method	                                    Transaction.java	              94 - 205
Dead Code	                                      ATM.java	                      226 – 233, 11
God Class	                                      Simulation.java	                76 – 113, 203 – 217
Data Class	                                    Message.java	                  99 - 226
Long Parameter List	                            ATMPanel.java	                  29 - 36
Switch Statement Smell	                        SimKeyboard.java	              174 - 218
Middle Man	                                    Log.java	                      27 - 60
Short/Long variable	                            ATM.java	                      286, 369
Empty Catch	                                    ATM.java	                      79 - 81
Thread declared without name	                  ATMMain.java	                  55
Similar Code	                                  SimEnvelopeAcceptor.java	      58 - 84
Naked Notify	                                  SimEnvelopeAcceptor.java	      99
Thread.sleep() with lock held	                  SimEnvelopeAcceptor.java	      71
Unconditional Wait	                            ATM.java	                      77
Wait not in loop	                              ATM.java	                      77
Write to Static Field from Instance method	    Simulation.java	                55
Data Flow Anomalies (DU)	                      SimKeyboard.java	              100

Metrics Improved in Refactored Code
Metric(s) Improved	        Before Refactoring	After Refactoring
Abstractness	                    4.6%	              5.7%
Average Cyclomatic Complexity	    1.54 (maximum: 16)	1.45 (maximum: 9)
Average LOC per method	          10.90 	            9.11 
Average number of fields per type	1.44	              1.38
