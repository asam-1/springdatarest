# springdatarest
this microservice is based on spring data rest build-in functionalities
# Queries
for the standard CRUD operation there is no need to implements its own Rest controller, spring data rest offers already
this functionality. 
# Projections
to retrieve a subset of attributes/columns we can use projections. 
projections are defined as interfaces they must be in the samme package as the Model/entiy otherwise we can use a config class that implement the RepositoryRestConfigurer interface.
# Note
in order that a projection works fine, it should be in the same package as its Entity/Model
