@tag1 
Feature: OneYou landing page 
	As a User I want to start OneYou quiz

Scenario Outline: Quiz Time 
	Given I start quiz on OneYou website 
	When I fill first page "<Name>","<Gender>","<Age>" and click Next 
	Then I land on How are you feeling right now "<Really Knackered>","<CanRunForMiles>","<FeelingCalm>","<SleeplessNights>","<LeanMean>","<DownDump>" and click Next 
	Then I select options from What Stops you taking care of yourself "<options>" and click next 
	Then I choose who all depend on me for being healthy "<options_dependents>"and click next 
	Then I identify top three health priorities from the given options "<options_priorities>" 
	Then I choose one of my favorite drinks from given "<options_drink>" and click Next 
	Then I select my favorite snacks out of given options "<options_snacks>" 
	Then I choose my favorite breakfast out of given options "<options_bfast>" and click next 
	Then I choose my favorite cheese out of given options"<options_cheese>" 
	Then I choose my favorite NonVeg item from the available options "<options_nv>" and click next 
	Then I choose servings of fruits and vegetables from "<options_fruits>" 
	Then I choose my favorite snacks from given options "<options_snacks_ag>" 
	Then I select frequency of alcohol intake "<options_freq>","<options_days>","<options_volume_WD>","<options_volume_WE>" and click Next 
	Then I choose my exercise metrics "<options_exercise>" 
	Then I choose my strengthening metrics "<options_strength>"
	Then I am asked about my smoking habbits "<options_smoke>"
	When I do not opt for sign up
	Then I land on Result Page with the score "<expScore>" 
	And I validate messages against each section
	
	Examples: 
	
		|Name |Age|Gender|Really Knackered|CanRunForMiles|SleeplessNights|FeelingCalm|LeanMean|DownDump|options|options_dependents|options_priorities|options_drink|options_snacks|options_bfast|options_cheese|options_nv|options_fruits|options_snacks_ag|options_freq|options_days|options_volume_WD|options_volume_WE|options_exercise |options_strength  |options_smoke|expScore|
		|Mark |18 |M     |68              |31            |68             |1          |18      |30      |1      |1,2               |3,4,5             |3            |2             |4            |2             |2         |4             |1,2              |3           |1,3,5       |1,0;3,0;4,0      |1,5;2,5;3,7;4,10 |1,400;3,400;7,400|2,400;4,450;5,450 |3            |10      |
		#|Case2|29|F      |
		
		
		
		
