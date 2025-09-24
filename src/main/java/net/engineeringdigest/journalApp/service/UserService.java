package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import net.engineeringdigest.journalApp.entity.UserEntity;
import net.engineeringdigest.journalApp.repository.JournalEntryRepository;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveEntry(UserEntity userEntry){
        userRepository.save(userEntry);
    }

    public List<UserEntity> getAll(){
        return userRepository.findAll();
    }

    public Optional<UserEntity> findById(ObjectId id){
        return userRepository.findById(String.valueOf(id));
    }

    public void deleteById(ObjectId id){
        userRepository.deleteById(String.valueOf(id));
    }

    public UserEntity findByUserName(String userName){
        return userRepository.findByUserName(userName);
    }
}
