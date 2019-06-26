package snsimp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Snsimp {
    public void imp(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
