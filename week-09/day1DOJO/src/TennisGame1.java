public class TennisGame1 implements TennisGame {

  private int m_score1 = 0;
  private int m_score2 = 0;
  private String player1Name;
  private String player2Name;

  public static void main(String[] args) {
    String player1Name = "Lilla";
    String player2Name = "Bence";
    TennisGame1 game = new TennisGame1(player1Name, player2Name);
    game.wonPoint(player1Name);
    game.wonPoint(player2Name);

    game.wonPoint(player1Name);
    game.wonPoint(player2Name);

    game.wonPoint(player1Name);
    game.wonPoint(player2Name);

    game.wonPoint(player1Name);
    game.wonPoint(player2Name);

    game.wonPoint(player1Name);
    game.wonPoint(player2Name);

    game.wonPoint(player1Name);
    game.wonPoint(player2Name);
    System.out.println(game.getScore());
  }

  public TennisGame1(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
  }

  public void wonPoint(String playerName) {
    if (playerName == "player1")
      m_score1 += 1;
    else
      m_score2 += 1;
  }

  public String getScore() {
    String score = "";
    int tempScore=0;
    if (m_score1==m_score2)
    {
      switch (m_score1)
      {
        case 0:
          score = "Love-All";
          break;
        case 1:
          score = "Fifteen-All";
          break;
        case 2:
          score = "Thirty-All";
          break;
        case 3:
          score = "Forty-All";
          break;
        default:
          score = "Deuce";
          break;

      }
    }
    else if (m_score1>=4 || m_score2>=4)
    {
      int minusResult = m_score1-m_score2;
      if (minusResult==1) score ="Advantage player1";
      else if (minusResult ==-1) score ="Advantage player2";
      else if (minusResult>=2) score = "Win for player1";
      else score ="Win for player2";
    }
    else
    {
      for (int i=1; i<3; i++)
      {
        if (i==1) tempScore = m_score1;
        else { score+="-"; tempScore = m_score2;}
        switch(tempScore)
        {
          case 0:
            score+="Love";
            break;
          case 1:
            score+="Fifteen";
            break;
          case 2:
            score+="Thirty";
            break;
          case 3:
            score+="Forty";
            break;
        }
      }
    }
    return score;
  }
}