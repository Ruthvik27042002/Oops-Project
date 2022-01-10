||||
| :- | :-: | -: |

**19CSE204 OBJECT ORIENTED PROGRAMMING**

**CASE STUDY REPORT**

**MOVIE TICKET BOOKING SYSTEM**

**Problem statement:** 

The main purpose of this project “Movie ticket booking system” is to provide easy and alternate way for a customer to buy movie tickets through online. For this, customer needs to register/login to the system at first. All the data of the customers will be saved in the database for the future purposes. And all the details regarding the movie and theatre can be viewed by the customers. Customer should choose a movie from the list displayed in the system and should select the seats and number of tickets. Customer will pay the money through net banking or through card payment and he will receive a notification that his amount was credited successfully. Customer can also cancel his ticket at any time before his movie time. Customer will also get updates and announcements regarding the website. Customer can also update their profile. Booking movie ticket through online is the best way in all aspects.

**Different Use Cases:**

- Login, Register, pick a movie
- select time and venue, Seat selection, Payment, Cancel ticket
- update profile, Add movies, Add shows
- Deleting shows, Deleting movies, Notifications, Logout.

**Actors:** Customer, Admin, System.



**Use case documents:**

**Use Case – 1:**

|**Use Case Name**|Login|
| :- | :- |
|**Description**|The customer, admin can login to the system by entering the login id and password. The system opens the main page after the login|
|**Primary Actor(s)**|Customer, Admin|
|**Secondary Actors(s)**|System|
|**Pre-Condition**|Login page should be opened|
|**Post-Condition**|If the customer enters the login id and password correctly, he will be logged into the main page. Otherwise, an error will be occurred.|
|**Trigger**|Customer selects the “Login” button|

**Normal Scenario:**

|**1.**|Customer types his/her username|
| :- | :- |
|**2.**|Customer types his/her password|
|**3.**|The system verifies if the login credentials given by the customer are valid|
|**4.**|The system will redirect to the main page if the login credentials are valid else an error will be occurred|

**Alternate Scenario/ Exception:**

|**Exception**|If customer enters invalid login credentials (Invalid Login)|
| :- | :- |



**Use Case – 2:**

|**Use Case Name**|Register|
| :- | :- |
|**Description**|Customers need to fill their details in the system like their id, password, username, address, Email id, phone number|
|**Primary Actor(s)**|Customer|
|**Secondary Actor(s)**|System|
|**Pre-Condition**|Customer is not logged in to the system|
|**Post-Condition**|Customer is successfully registered to the website and redirect to the main page|
|**Trigger**|Customer selects the “Register” button|

**Normal Scenario:**

|**1.**|Customer types his/her username|
| :- | :- |
|**2.**|Customer types his/her password|
|**3.**|Customer types his/her date of birth|
|**4.**|Customer types his/her email id|
|**5.**|Customer types his/her phone number|
|**6.**|Customer types his/her Address|
|**7.**|Customer should not be allowed to register twice|
|**8.**|Customer is redirected to the login page|

**Alternate Scenario/ Exception:**

|**Exception**|If customer enters invalid email id (invalid registration)|
| :- | :- |
|**Alternate**|Customer can provide other alternate phone number in the system|



**Use Case – 3:**

|**Use Case Name**|Pick a Movie|
| :- | :- |
|**Description**|The customer will check the movie details|
|**Primary Actor(s)**|Customer|
|**Secondary Actors(s)**|System|
|**Pre-Condition**|<p>1. Customer should have an account.</p><p>2. Movie should be in the list in which the customer is showing interest.</p>|
|**Post-Condition**|System should open the details of selected movie by the customer.|
|**Trigger**|Customer select the movie that he is interested in.|

**Normal Scenario/basic flow:**

|**1.**|After the completion of registration, the user needs to select movie genre or movie name which he wanted to see.|
| :- | :- |
|**2.**|On selecting the movie, the use case will display the movie records like movie name, language, genre, release date, etc.|

**Alternate Scenario/ Exception:**

|**Alternate**|If the movie was not available in the specified theatre, the user should select another theatre or terminate the use case.|
| :- | :- |



**Use Case – 4:**

|**Use Case Name**|Select Time and Venue|
| :- | :- |
|**Description**|Customer will select the time and venue for his show.|
|**Primary Actor(s)**|Customer|
|**Secondary Actors(s)**|System|
|**Pre-Condition**|Movie should be selected by the Customer.|
|**Post-Condition**|Customer should select the time and venue.|
|**Trigger**|Customer choose the time and venue for the movie that he/she is interested in.|

**Normal Scenario/Basic flow:**

|**1.**|Customer should select any one of the shows (i.e) first, second, third|
| :- | :- |
|**2.**|Customer should select one of the theatres displayed on the system|

**Alternate Scenario/ Exception:**

|<p>**Alternate**</p><p></p>|If there are no theatres in that show the user should select another show or terminate the use case|
| :- | :- |



**Use Case – 5:**

|**Use Case Name**|Seat Selection|
| :- | :- |
|**Description**|Customer will select the seat of the show.|
|**Primary Actor(s)**|Customer|
|**Secondary Actors(s)**|System|
|**Pre-Condition**|Customer should select the time and venue of the show|
|**Post-Condition**|Customer should set the Seat of the show.|
|**Trigger**|Customer selects the options to book the seats.|

**Normal Scenario:**

|**1.**|Customer should enter the seat number for booking.|
| :- | :- |
|**2.**|Customer should select the seat type for booking.|

**Alternate Scenario/ Exception:**

|**Alternate**|If the seat was already booked then user need to select another seat.|
| :- | :- |
|**Exception**|Customer cannot book the seats if the tickets are not available in that respective theatre.|



**Use Case - 6:**

|**Use Case Name**|Payment|
| :- | :- |
|**Description**|The customer pays the amount for a movie ticket he booked through the website|
|**Primary Actor(s)**|Customer|
|**Secondary Actor(s)**|System|
|**Pre-Condition**|<p>1. In order to make payment online, customer should make sure that he has a good internet connection.</p><p>2. Customer should have a card with him to make payment.</p>|
|**Post-Condition**|The payment is done and the ticket is booked for the movie.|
|**Trigger**|The customer clicks on payment button.|

**Normal Scenario:**

|**1.**|After selecting the seat for the movie, the customer now proceeds to the payment section.|
| :- | :- |
|**2.**|Now customer will accept the agree the term and conditions and click should pay now|
|**2.**|the customer needs to pay money for the movie either through Net banking or through card payment.|
|**3.**|<p>After successful payment, a unique ID will be generated by the theatre and it will be provided to the app server.</p><p></p>|

**Alternate Scenario/ Exception:**

|**Exception**|<p>1. If customer has no sufficient money to book the movie ticket.</p><p>2. If the server is down, he/she could not make successful payment.</p><p>3. If customer has poor internet connection, he/she could not make successful payment.</p>|
| :- | :- |
|**Alternate**|If the customer fails to pay the amount in either net banking or through card payment, he can use the alternate payment method to book the ticket.|



**Use Case – 7:**

|**Use Case Name**|Cancel Ticket|
| :- | :- |
|**Description**|Customer will cancel the ticket|
|**Primary Actor(s)**|Customer|
|**Secondary Actors(s)**|System|
|**Pre-Condition**|<p>Customer should have ticket that has to be cancelled,</p><p>And it should be in the given period of cancelation.</p>|
|**Post-Condition**|Customer should get the notification that the ticket has been cancelled.|
|**Trigger**|Customer should select the ticket cancelation option.|

**Normal Scenario:**

|**1.**|customer can decide to cancel a ticket after the ticket is booked. The customer has to provide details about ticket for searching.|
| :- | :- |
|**2.**|When the user cancels the ticket, the money will be refunded into their respective account.|

**Alternate Scenario/ Exception:**

|**Exception**|It is not possible to cancel the ticket after the show has been started.|
| :- | :- |



**Use Case – 8:**

|**Use Case Name**|Update profile|
| :- | :- |
|**Description**|Customer can update the registered information|
|**Primary Actor(s)**|Customer|
|**Secondary Actors(s)**|System|
|**Pre-Condition**|Customer should be registered.|
|**Post-Condition**|Customer should need to update the correct information.|
|**Trigger**|Customer selecting the update option.|

**Normal Scenario:**

|**1.**|The system will allow the user to update the following customer information: first name, last name, home address, billing address, birth date.|
| :- | :- |
|**2.**|The customer needs to update the info which he wanted to change and the system will validate the information entered by the user.|
|**3.**|This use case terminates when the user has finished establishing or updating the customer profile.|
** 

**Alternate Scenario/ Exception:**

|**Exception**|If the customer has not entered all the mandatory information for the customer profile. The system will ask the actor to re-enter the customer profile mandatory information and the use case will continue.|
| :- | :- |



**Use Case – 9:**

|**Use Case Name**|Add movies|
| :- | :- |
|**Description**|Admin will add the new movies.|
|**Primary Actor(s)**|Admin|
|**Secondary Actors(s)**|System|
|**Pre-Condition**|Movie which was added should not be there in present movies list.|
|**Post-Condition**|All the details of the movies should be entered correctly.|
|**Trigger**|Admin selecting the movies adding option.|

**Normal Scenario:**

|**1.**|The admin provides Film Details, including Title, Age Rating, Duration, Short Trailer|
| :- | :- |

**Alternate Scenario/ Exception:**

|**Exception**|If the added movie has already been existing, then no changes will made further.|
| :- | :- |



**Use Case – 10:**

|**Use Case Name**|Add shows|
| :- | :- |
|**Description**|Admin will add the new shows.|
|**Primary Actor(s)**|Admin|
|**Secondary Actors(s)**|System|
|**Pre-Condition**|The shows adding point should be filled empty.|
|**Post-Condition**|Show should be filled in the allocated zone.|
|**Trigger**|Admin should select the add show option.|

**Normal Scenario:**

|**1.**|Admin supplies Showing Details, including Date and Time, Title, Screen Number.|
| :- | :- |

**Alternate Scenario/ Exception:**

|**Exception**|To add shows which already been allocated, then the show must be first deleted and then it should be added.|
| :- | :- |



**Use Case – 11:**

|**Use Case Name**|Deleting Shows|
| :- | :- |
|**Description**|Deleting the shows that has been running slowly in theatre.|
|**Primary Actor(s)**|Admin|
|**Secondary Actors(s)**|System|
|**Pre-Condition**|Show that has been deleted should be existing before.|
|**Post-Condition**|The persons who have been booked to this show should be refunded.|
|**Trigger**|Admin should select the option of the deleting shows.|

**Normal Scenario:**

|**1.**|When Admin requests to cancel a Show, the System retrieves a list of current Showings|
| :- | :- |
|**2.**|<p>Now, the Admin selects a Show Number and asks confirmation to cancel, then the System cancels the show.</p><p></p>|

**Alternate Scenario/ Exception:**

|**Exception**|If the deleting shows is already booked, then the Customers who had booked the shows should be refunded.|
| :- | :- |



**Use Case – 12:**

|**Use Case Name**|Deleting movies|
| :- | :- |
|**Description**|Deleting the shows that has been running slowly in theatre.|
|**Primary Actor(s)**|Admin|
|**Secondary Actors(s)**|System|
|**Pre-Condition**|Movie that has been deleted should be existing before.|
|**Post-Condition**|Shows that has been having this movie should be deleted.|
|**Trigger**|Admin should select the option of the deleting Movie.|

**Normal Scenario:**

|**1.**|The admin searches the movie title and deletes the respective movies|
| :- | :- |

**Alternate Scenario/ Exception:**

|**Exception**|If the deleting movie is already booked, then the Customers who had booked the movies should be refunded|
| :- | :- |



**Use Case – 13:**

|**Use Case Name**|Notification|
| :- | :- |
|**Description**|Customer will get the notification of the movie details that has been booked.|
|**Primary Actor(s)**|Customer|
|**Secondary Actors(s)**|System|
|**Pre-Condition**|User need to switch to the particular email or the given phone. |
|**Post-Condition**|User should able to access the notification.|
|**Trigger**|User checking for the notification of his/her booking.|

**Normal Scenario:**

|**1.**|There are mainly two types of activities in the system|
| :- | :- |
|**2.**|<p>1. One from the user side.</p><p>2. Second from the people from the user’s network.</p>|
|**3.**|Any event from the user’s network side should be notified immediately. This may be via message, or through the email that which the user has been given.|
|**4.**|The user then can able to view or delete the message and this permission should be given by the system to the user.|

**Alternate Scenario/ Exception:**

|**Exception**|If the notifications are not coming to the user, then he should be get informed to the system serves persons to resolve their problem.|
| :- | :- |



**Use Case – 14:**

|**Use Case Name**|Logout|
| :- | :- |
|**Description**|Customer will logout from the system.|
|**Primary Actor(s)**|Customer, Admin|
|**Secondary Actors(s)**|System|
|**Pre-Condition**|Customer Should be Logged in.|
|**Post-Condition**|Customer should be logged out from the System.|
|**Trigger**|Customer clicks on the logout button|

**Normal Scenario:**

|**1.**|Customer clicks on logout button in the system interface.|
| :- | :- |
|**2.**|<p>System will logout automatically after the user clicks logout button.</p><p></p>|

**Alternate Scenario/ Exception:**

|**Exception**|If there is a Network issue, then Customer should wait until there is proper network to get logged out.|
| :- | :- |



**Stakeholders for the system:**

|Producers|They will either get profits or loss based on the number of tickets sold for a theatre|
| :- | :- |
|Actor|Admin will get revenue from the number of active users for the given application.|

**Use case diagram:**



**Time sequence diagram:** 




**Object Diagram:**




**From the Conceptual classes identify the following:** 

**Interface List:** 

1. ` `Search

**Inheritance relationship:** 

1. Announcements
- Phone\_announcements
- Email\_announcements
1. Registered User
- Admin
- Customer
1. Payment Method
- Net banking
- UPI
- Card payment

**Composition:**

1. Movie Details
1. Book Ticket
1. Registered User















**Class Diagram:**



**Task done by each team member:**

|**S.NO.**|**Use Cases**|**Team Member**|
| :-: | :-: | :-: |
|1|Register, Login, Pick a movie|NUKALA VENKATA SAI KRISHNA AKHILESH|
|2|Select time and venue, seat selection, payment, cancel ticket|RAVIPATI VENKATA BALAJI|
|3|Update profile, add movies, add shows|BHYRAVARAPU NANDAGOPAL|
|4|Deleting shows, deleting movies, notification, logout|NARAYANAREDDY RUTHVIK REDDY|

**Screenshots of the application:**

**Welcome page** – 


**Register page** –

**Registration successful** –


**Login page** –

**Login successful** –


**Admin movie events** –

**Add movies** –





**Search interface** –

Search by movie name:

Search by genre:

Search by language:


**Delete movies** –

**Deletion successful** -


Search after deleting movie -

**Update movie** –


**After updating the movie** -


**Search of updated movie** –


**Selection** –

**Booking** –



**Credit card** -


**Net Banking-**

**Upi Payment -** 

**Payment successful** -









**After booking a seat successfully** -


He need to change the number of seats before selecting the seats otherwise, he cannot select other seats and he will be asked to change the number of seats.

**Booking seats by another user** -


**Cancellation of the ticket** -



**Thank you page** -


Cancellation of the ticket will be done only if the booking name exists.



||||
| :- | :-: | -: |

