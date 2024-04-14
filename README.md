# state-pattern-spring-boot
This project is template for implementing state pattern for a game service, it allows us to handle the state of an object through the use of different state managers. 
In short, This pattern allows us to separate the concern of managing the behavior under each state to individual responsible state managers. 

# what is state pattern?
The State pattern is a behavioral design pattern that allows an object to alter its behavior when its internal state changes. This pattern is particularly useful when an object's behavior depends on its state and the object needs to change its behavior dynamically at runtime based on its state.

# use case
1. Games - Player movement state to ensure the type of animation to be played.
2. Online orders - To ensure end user is informed properly of each state change in their order status and accordingly things are handled on their end for visual purpose.
3. Document editing - States need to be managed based on the mode of view i.e., Viewer, Editing, Commentator.
4. Traffic Lights - Behaviour of each light is different hence states need to be managed for each of them e.g., When it's red light and someone crosses the light take the photo of their number plate to send ticket to them, whereas during green the behaviour is more towards verifying only for overspeeding.

# files
1. StateContext - The entity whose states we are managing / whose behaviour we are changing based on the state.
2. States> - All the possible states that inherit the State Interface, each object can have separate states for itself.
3. StateController - Endpoints for changing the state of object using PUT api calls.
4. GameSession - A session service which is maintaining the states and objects for the purpose of our work.