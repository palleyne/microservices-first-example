package br.com.cbds.microservices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cbds.microservices.model.Team;
import br.com.cbds.microservices.repository.TeamRepository;

@Service
public class TeamService {

	@Autowired
	private TeamRepository teamRepository;

	public Iterable<Team> getAllTeam() {
		return teamRepository.findAll();
	}

	public Team getTeam(Integer teamId) {
		return teamRepository.findOne(teamId);
	}

	public void saveTeam(Team team) {
		teamRepository.save(team);
	}

	public void deleteTeam(Team team) {
		teamRepository.delete(team.getTeamId());
	}

}
