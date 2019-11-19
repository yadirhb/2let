## Description 

Complete programmatic configuration. No web.xml, dispatcher-servlet.xml, 
Security-context, applicationContext.
See com.packt.webstore.configuration package for details.

Spring Servlet Container automatically Bootstraps based on discovering of WebApplicationInitializer interface.
See DeploymentDescriptor.java example in above mentioned package.

## Setup requirements

### Db Schema

Create a new MySql schema named 2let_db.

### DB user info

Use mysql and create and user dbuser with password 'dbuser'. We are not using root users to test our app.