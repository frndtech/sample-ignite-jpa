package pl.piomin.services.ignite.repository;

import org.apache.ignite.springdata.repository.IgniteRepository;
import org.apache.ignite.springdata.repository.config.RepositoryConfig;

import pl.piomin.services.ignite.model.Contact;

@RepositoryConfig(cacheName = "ContactCache")
public interface ContactRepository extends IgniteRepository<Contact, Long> {

}
