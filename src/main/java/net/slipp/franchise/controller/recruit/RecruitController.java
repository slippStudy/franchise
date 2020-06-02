package net.slipp.franchise.controller.recruit;

import net.slipp.franchise.apis.RecruitsApi;
import net.slipp.franchise.models.RecruitCreateModel;
import net.slipp.franchise.models.RecruitModel;
import net.slipp.franchise.models.RecruitUpdateModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.time.LocalDateTime;

@RestController
public class RecruitController implements RecruitsApi {


    @Override
    public ResponseEntity<RecruitModel> createRecruit(@Valid RecruitCreateModel body) {

        RecruitModel model = new RecruitModel();
        if (body.getDeadlineDate().isBefore(LocalDateTime.now())) {
            return new ResponseEntity<>(model, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(model, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<RecruitModel> getRecruitById(String recruitId, @Valid RecruitUpdateModel body) {
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @Override
    public ResponseEntity<RecruitModel> recruitStatusChange(String recruitId) {
        RecruitModel model = new RecruitModel();
        return new ResponseEntity<>(model, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<RecruitModel> updateRecruitContents(String recruitId, @Valid RecruitUpdateModel body) {
        RecruitModel model = new RecruitModel();
        return new ResponseEntity<>(model, HttpStatus.OK);
    }
}
