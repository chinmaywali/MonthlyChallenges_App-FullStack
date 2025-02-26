//package com.cw.ChallengeApplication;
//
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//
//@RestController
//public class ChallengeController {
//
//    private ChallengeService challengeService;
//
//    public ChallengeController(ChallengeService challengeService){
//        this.challengeService = challengeService;
//    }
//
//    @GetMapping("/challenges")
//    public List<Challenge> getChallenges(){
//        return challengeService.getChallenges();
//    }
//
//    @GetMapping("/challenges/{month}")
//    public List<Challenge> getChallenge(@PathVariable String month){
//        Challenge ch = challengeService.getChallenge(month);
//        if(ch != null){
//            return (List<Challenge>) ch;
//        }
//        return null;
//    }
//
//    @PostMapping("/challenges")
//    public String addChallenges(@RequestBody Challenge challenge){
//        boolean isAdded = challengeService.addChallenges(challenge);
//        if(isAdded){
//            return "Challenge Added";
//        }
//        return "Not Added";
//    }
//
//    @PutMapping("/challenges/{id}")
//    public String updateChallenge (@PathVariable Long id ,@RequestBody Challenge updatedChallenge){
//        boolean isChallengeUpdated = challengeService.updateChallenge(updatedChallenge,id);
//        if(isChallengeUpdated)
//            return "Challenge updated succesfully";
//        else
//            return "Challenge not updated ";
//    }
//
//    @DeleteMapping("/challenges/{id}")
//    public String deleteChallenege(@PathVariable Long id){
//        boolean deleted = challengeService.deleteChallenge(id);
//        if(deleted){
//            return "deleted";
//        }
//        return "not found";
//    }
//
//}

package com.cw.ChallengeApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ChallengeController {

    private ChallengeService challengeService;

    public ChallengeController(ChallengeService challengeService){
        this.challengeService=challengeService;
    }

    @GetMapping("/challenges")
    public ResponseEntity<List<Challenge>> getChallenges(){
        return new ResponseEntity<>(challengeService.getAllChallenges(), HttpStatus.OK);
    }

//    @GetMapping("/challenges/{month}")
//    public ResponseEntity<Challenge> getChallenge(@PathVariable String Month){
//        Challenge ch = challengeService.getChallenge(Month);
//        if(ch != null){
//            return new ResponseEntity<>(ch,HttpStatus.OK);
//        }
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//    }

    @PostMapping("/challenges")
    public ResponseEntity<String> addChallenge(@RequestBody Challenge challenge){
        boolean isAdded = challengeService.addChallenge(challenge);
        if(isAdded){
            return new ResponseEntity<>("Challenge added succesfully", HttpStatus.OK);
        }
        return new ResponseEntity<>("Challenge not added ", HttpStatus.NOT_FOUND);
    }

    @PutMapping("/challenges/{id}")
    public ResponseEntity<String> updateChallenege(@RequestBody Challenge updatedChallenge , @PathVariable Long id){
        boolean isUpdated = challengeService.updateChallenge(updatedChallenge , id);
        if(isUpdated){
            return new ResponseEntity<>("Challenge updated succesfully", HttpStatus.OK);
        }
        return new ResponseEntity<>("Challenge not updated ", HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/challenges/{id}")
    public ResponseEntity<String> deleteChallenge(@PathVariable Long id){
        boolean deleted = challengeService.deleteChallenge(id);
        if(deleted){
            return new ResponseEntity<>("Challenge deleted succesfully", HttpStatus.OK);
        }
        return new ResponseEntity<>("Challenge not deleted ", HttpStatus.NOT_FOUND);
    }
}

