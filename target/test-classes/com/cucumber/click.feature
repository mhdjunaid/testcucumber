Feature: Angry Birds CLicks rest api gets
 

 
  Scenario Outline: Get many clicks by clickid
    Given I click a banner by "<clickid>"
    When I get the rest response
    Then response should contain "<code>"
    
    Examples: Each Campaign Clciks
    
    | clickid        | code |
    | pub001___cpn005___ldp001_mbp | 200 |
    | pub999___cpn999___ldp999_mbp | 200 |
    
                          