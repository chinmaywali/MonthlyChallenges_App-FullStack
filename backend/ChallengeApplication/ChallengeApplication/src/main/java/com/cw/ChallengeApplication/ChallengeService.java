
package com.cw.ChallengeApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ChallengeService{
    private Long nextId = 1L;

    @Autowired
    ChallengeRepository challengeRepository;

    public ChallengeService(){
    }

    public List<Challenge> getAllChallenges(){
        return challengeRepository.findAll(); //gets all challenges from db
    }

//    public Challenge getChallenge(String Month) {
//        Optional<Challenge> challenge = challengeRepository.findByMonthIgnoreCase(Month);
//        return challenge.orElse(null);
//    }

    public boolean addChallenge(Challenge challenge){
        if(challenge!=null){
            challenge.setId(nextId++);
            challengeRepository.save(challenge);
            return true;
        }
        return false;
    }

    public boolean updateChallenge(Challenge updatedChallenge , Long id){
          Optional<Challenge> challenge = challengeRepository.findById(id);
          if(challenge.isPresent()){
              Challenge challengeToUpdate = challenge.get();
              challengeToUpdate.setMonth(updatedChallenge.getMonth());
              challengeToUpdate.setDiscription(updatedChallenge.getDiscription());
              challengeRepository.save(challengeToUpdate);
              return true;
          }
          return false;
    }

    public boolean deleteChallenge(Long id){
        Optional<Challenge> challenge = challengeRepository.findById(id);
        if(challenge.isPresent()){
            challengeRepository.deleteById(id);
            return true;
        }
        return false;
    }
}