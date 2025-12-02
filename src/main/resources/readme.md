## Proof Joey's golfAPI works


All screenshots displayed below are of functionality asked for the in the QAP instructions

<br>


<h4>Get All Members</h4>
![Get All Members](images/getAllMembers.png)

<br>

<h4>Get All Tournaments</h4>
![Get All Tournaments](images/getAllTournaments.png)

<br>

<h4>Get Tournament Participating Members</h4>
![Get Tournament Participating Members](images/getTournamentParticipatingMembers.png)

<br>

<h4>Create a Member</h4>
![Post Member](images/postMember.png)

<br>

<h4>Add Member to Tournament</h4>
![Post Member to Tournament](images/postMembertoTournament.png)

<br>

<h4>Create a Tournament</h4>
![Post Tournament](images/postTournament.png)

<br>

<h4>Search Members by Membership Start Date</h4>
![Search Members by Membership Start Date](images/searchMembersByMembershipStartDate.png)

<br>

<h4>Search Members by Membership Type</h4>
![Search Members by Membership Type](images/searchMembersByMembershipType.png)

<br>

<h4>Search Members by Name</h4>
![Search Members by Name](images/searchMembersByName.png)

<br>

<h4>Search Members by Phone Number</h4>
![Search Members by Phone Number](images/searchMembersByPhoneNumber.png)

<br>

<h4>Search Tournaments by Location</h4>
![Search Tournaments by Location](images/searchTournamentsByLocation.png)

<br>

<h4>Search Tournaments by Start Date</h4>
![Search Tournaments by Start Date](images/searchTournamentsByStartDate.png)

<br>

<h3>Deployment Steps and Docker Support</h3>

<h4>AWS RDS Database</h4>
![AWS RDS Database](images/AWSRDSDatabase.png)

<br>

<h4>Security Group for RDS</h4>
![Security Group for RDS](images/AWSRDSVPCSecurityGroup.png)

<br>

<h4>MySQL Workbench Connected to RDS</h4>
![MySQL Workbench Connected RDS](images/MySQLWorkbenchConnectedToRDSEndpoint.png)

<br>

<h4>Docker Image GitHub Action</h4>
![Docker Image GitHub Action](images/DockerImageGitHubAction.png)

<br>

<h4>GolfAPI Container Running</h4>
![GolfAPI Container Running](images/golfAPIContainerRunning.png)

To run the container use the command "docker compose up". Although since the database SG won't allow traffic not from my IP address, so that would need to be setup manually.

Speaking of the database; getting the RDS database created was a little trial and error. There were some configuration options I was not able to use due to the restrictions of the AWS Learners Lab. Once I figured that out though, all that was left was setting up the SG to allow inbound and outbound MySQL traffic from my IP.