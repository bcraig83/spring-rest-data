package b3ls.restdata.repositories;

import b3ls.restdata.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource()
public interface CustomerRepository extends MongoRepository<Customer, String> {

}
