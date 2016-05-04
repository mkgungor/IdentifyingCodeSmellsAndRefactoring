# Identifying Code Smells And Refactoring

Identified several code smells like Long Method, God Class, Switch Statement Smell, Feature Envy, etc for an open source project and refactored code to remove them.

Original Project: http://www.math-cs.gordon.edu/courses/cs211/ATMExample/

Smells(s)/Violation(s)/Bug(s)						Tool(s)	          	Type of Tool
Feature Envy										JDeodorant	      	Eclipse Plugin
God Class											JDeodorant	        Eclipse Plugin
Switch Statement Smells 							JDeodorant	        Eclipse Plugin
Long method 										PMD	              	Eclipse Plugin
Short/Long variable	                               	PMD	              	Eclipse Plugin
Data Flow Anomalies (DU)	                       	PMD	              	Eclipse Plugin
Empty Catch	                                       	PMD	              	Eclipse Plugin
Dead Code	                                       	PMD                	Eclipse Plugin
                                                   	Incode	            Standalone
Data Class                                         	Incode	            Standalone
Similar Code	                                   	Eclipse	          	Out of the Box
Thread declared without name	                   	FindBugs	        Eclipse Plugin
Naked Notify	                                   	FindBugs	        Eclipse Plugin
Thread.sleep() with lock held	                   	FindBugs	        Eclipse Plugin
Unconditional Wait	                             	FindBugs	        Eclipse Plugin
Wait not in loop	                               	FindBugs	        Eclipse Plugin
Write to Static Field from Instance method	     	FindBugs	        Eclipse Plugin
Long Parameter List	                            	No tools used     	None
Middle Man	                                    	No tools used       None

