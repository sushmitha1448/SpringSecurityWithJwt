package com.microservices.spring.SecurityExample.Model;

import org.springframework.context.annotation.Bean;


public class Candidate {
    private long candidateId;
    private String candidateName;
    private String candidateLocation;
    private int candidateScore;

    public Candidate(long candidateId, String candidateName, String candidateLocation, int candidateScore) {
        this.candidateId = candidateId;
        this.candidateName = candidateName;
        this.candidateLocation = candidateLocation;
        this.candidateScore = candidateScore;
    }

    public long getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(long candidateId) {
        this.candidateId = candidateId;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public String getCandidateLocation() {
        return candidateLocation;
    }

    public void setCandidateLocation(String candidateLocation) {
        this.candidateLocation = candidateLocation;
    }

    public int getCandidateScore() {
        return candidateScore;
    }

    public void setCandidateScore(int candidateScore) {
        this.candidateScore = candidateScore;
    }
}
