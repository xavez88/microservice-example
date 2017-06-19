# microservice-example

This is a project I've been wanting to launch for a while. I've started to work with Microservices oriented architectures early this year and I thought it would be useful for newbies to have simple proof of concept where all the microservices best practises could be seen in action.

# API Design and definition:

In order to define and design the microservice REST API, we have used Atom editor + API Workbench (http://apiworkbench.com) plugin. These tools have produced a RAML file that can be found under src/main/resources/api/definition

To view the REST API definition in a user friendly way we have used API Console (https://github.com/mulesoft/api-console). It requires few dependencies to be installed but nothing too difficult to set up. This tool is not included as part of the source code, must be installed separately if wanted to be used.
