Feature:Check DragAndDrop functionality
@DragAndDrop
Scenario: To use drag and drop on DemoQA Website
  Given User goes to the DragAndDrop url "DragAndDrop"
  Then User clicks on Drag Me box
  And User drops it in Drop here box