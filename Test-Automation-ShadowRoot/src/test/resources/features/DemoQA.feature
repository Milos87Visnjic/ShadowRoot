Feature: Qa Training

  @qaAlerts
  Scenario: Ability to handle alerts
    Given User navigates to demoQa page
    When User clicks on first click me button
    Then User handles alerts
    When User clicks on second click me button
    Then User handles timer alerts
    When User clicks on third click me button
    Then User handles confirm alerts
    When User clicks on fourth click me button
    Then User handles prompt alerts

  @windows
  Scenario: Ability to handle windowHandles
    Given User navigates to demoQa windows page
    When User clicks on new tab button
    Then User validates new tab
    When User clicks on new window button
    Then User validates new window
    And Users opens new tab
    And User navigates to Game Portal on new tab

  @windowsHandles
  Scenario: Ability to handle windowHandles using SET
    Given User navigates to demoQa windows page
    When User clicks on new tab button
    Then User validates new tab using Set
    When User clicks on new window button
    Then User validates new window using Set
    And Users opens new tab
    And User navigates to Game Portal on new tab using Set

  @actions
  Scenario: Drag and Drop
    Given User navigates to Demo QA droppable page
    When User drags dragMe item to DropHere
    Then User verifies text changed in DropHere item

  @assignment_19
  Scenario: Practice using JSE
    Given User navigates to DemoQa page
    Then User prints title using jse
    Then User Double clicks on double click me button using jse
    Then User verifies double clickMe message using jse
    Then User right clicks on the right click me button
    Then User gets coordinates of clickMe button
    Then User clicks on the clickMe button using jse
    Then User verifies dynamic clickMe message




