package BR.example.simulator.DATA;

import java.util.List;

import BR.example.simulator.Domain.Match;
import retrofit2.Call;
import retrofit2.http.GET;

public interface MatchesAPI {
    @GET("matches.json")
    Call<List<Match>> getMatches();
    }
