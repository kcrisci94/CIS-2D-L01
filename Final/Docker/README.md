Docker is a linux based software
Docker is only available for Windows 10 operating systems or above. Anything below must download the Docker Toolkit instead, which contains all the tools run Docker in virtualbox. 
Docker is used to create the containers for a java application. These containers are given images to present to the user when the application initializes or any other instance that the coder specifies. 
Common commands: 
1.	docker version : gives Docker version info and client and server information
2.	docker-machine ls : gives list of all machines available to run
3.	docker container ls : gives list of all containers
Build an Image: 
1.	Make a new directory using ‘mkdir NAME’.
2.	Use ‘vi Dockerfile’ to create a new dockerfile inside the new directory. 
3.	In the editor, type FROM ubunto and then enter the code for the program you want to run
4.	Save the file using ‘:x’ and hit enter.
5.	Type ‘docker image build –t IMAGETAGNAME’ (the dash t gives the tag name)
6.	Run the container using ‘docker container run IMAGETAGNAME’


