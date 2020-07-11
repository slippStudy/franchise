/**
 * Created by joenggyu0@gmail.com on 4/28/20
 * Github : http://github.com/lenkim
 */

package net.slipp.moim.domain.model.recruit;

import net.slipp.ddd.domain.DomainEvent;

import java.time.LocalDateTime;

public class RecruitCreatedEvent implements DomainEvent {

    private final RecruitId recruitId;

    public RecruitCreatedEvent(RecruitId recruitId) {
        this.recruitId = recruitId;
    }

    @Override
    public LocalDateTime occurredOn() {
        return LocalDateTime.now();
    }

    public RecruitId getRecruitId() {
        return this.recruitId;
    }
}
