package groupgroup.Regulator;

import org.json.simple.JSONObject;

public interface Algorithm {

    /**
     * Computes for how long the client should wait until it retries.
     * @return
     */
    double getReturntime();

    /**
     * Return a JSON object to be sent to the clients.
     * The JSON will either tell the client to go forth, or return at a later time.
     * @return
     * @param numberOfFinishedJobs
     * @param numberOfRetries
     */
    JSONObject runAlgorithm(long numberOfFinishedJobs, int numberOfRetries);

    long getNumberOfReleasedTokens();

    void setNumberOfReleasedTokens(long numberOfReleasedTokens);
}
