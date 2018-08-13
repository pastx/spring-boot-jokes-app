package guru.springframework.springbootjokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImlp implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    // now I need to deliver Spring Bean of chuckNorrisQuote
    public JokeServiceImlp(final ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getJoke() {
        return this.chuckNorrisQuotes.getRandomQuote();
    }
}
