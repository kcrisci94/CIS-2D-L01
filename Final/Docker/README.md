Docker is a linux based software

Requirements:
Compatible with all Linex systems
Yosemite 10.10+ or Windows 10 (x64)+
If your system does not meet the requirements for Docker, install Docker Toolbox, which will run Docker in virtualbox.

Docker is used to create the containers for a java application. These containers are given images to present to the user when the application initializes or any other instance that the coder specifies. 

Create Docker Machine: 
1. Run command 'docker-machine create -d DRIVERNAME MACHINENAME' (-d gives a driver name)
2. Set up runtime environment 'docker-machine env MACHINENAME' (this will give information on how to set up runtime environment)
3. Run the code that is given by the above command that starts with 'eval'
The client can now talk to the host machine

Create Docker Container: 
1. docker create -it CONTAINERNAME (if container name doesn't exist, it will pull container from Docker API)
2. To run the container, type 'docker container run -i NAME' (this runs the container in interactive mode)

Common commands: 
1.	docker version : gives Docker version info and client and server information
2.  docker --version : gives information about which version of docker is being run
3.  docker info : gives all information about Docker
4.	docker-machine ls : gives list of all machines available to run
5.	docker container ls : gives list of all containers

Run An Image From Docker API
1. docker run container PATH (jboss/wildfly is an example)

Build an Image: 
1.	Make a new directory using ‘mkdir NAME’.
2.	Use ‘vi Dockerfile’ to create a new dockerfile inside the new directory. 
3.	In the editor, type FROM ubunto and then enter the code for the program you want to run
4.	Save the file using ‘:x’ and hit enter.
5.	Type ‘docker image build –t IMAGETAGNAME’ (the dash t gives the tag name)
6.	Run the container using ‘docker container run IMAGETAGNAME’

View the Image (Declare Ports)
1. Run container in detatched mode, giving it a name and choosing a random port. 'docker container run -d --name web -P IMAGENAME'
2. Use 'docker container ls' to see the port information. 
3. If using Docker Toolbox, type the machine IP address into the url followed by a colon, then type the port number.
4. If using Docker, type 'localhost:' and then the port number. 
