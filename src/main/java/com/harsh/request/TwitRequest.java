package com.harsh.request;

import java.time.LocalDateTime;

import com.harsh.model.Twit;

import lombok.Data;

@Data
public class TwitRequest {
	
    private String content;
    
    private Long twitId;

    private LocalDateTime createdAt;

    private String image; 
    
    private boolean isReply;
    
    private boolean isTwit;
    
    private Long replyFor;


}
