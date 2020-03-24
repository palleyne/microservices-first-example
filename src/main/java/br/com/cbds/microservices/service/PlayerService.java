package br.com.cbds.microservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cbds.microservices.model.Player;
import br.com.cbds.microservices.model.Team;
import br.com.cbds.microservices.repository.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	public Player getPlayer(Integer playerId) {
		return playerRepository.findOne(playerId);
	}

	public List<Player> getPlayersByTeam(Integer teamId) {
		return playerRepository.findByTeam(new Team(teamId));
	}

	public void savePlayer(Player player) {
		playerRepository.save(player);
	}

	public void deletePlayer(Player player) {
		playerRepository.delete(player.getPlayerId());
	}

}
