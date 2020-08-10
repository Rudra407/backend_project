package tech.codingclub.helix.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import tech.codingclub.helix.entity.TimeApi;
import tech.codingclub.helix.entity.WikiResult;
import tech.codingclub.helix.entity.WikipediaDownloader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * User: rudra
 */
@Controller
@RequestMapping("/")
public class MainController extends BaseController {

    private static Logger logger = Logger.getLogger(MainController.class);

    @RequestMapping(method = RequestMethod.GET, value = "/helloworld")
    public String getQuiz(ModelMap modelMap, HttpServletResponse response, HttpServletRequest request) {
        return "hello";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/time")
    public @ResponseBody String getTime(ModelMap modelMap, HttpServletResponse response, HttpServletRequest request) {
        TimeApi timeApi = new TimeApi(new Date().toString(), new Date().getTime());
        return new Gson().toJson(timeApi);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/wiki/Gson")
    public @ResponseBody String getWikiResultGson(ModelMap modelMap, @RequestParam("country") String country,HttpServletResponse response, HttpServletRequest request) {
        WikipediaDownloader wikipediaDownloader = new WikipediaDownloader(country);
        WikiResult wikiResult = wikipediaDownloader.getResult();
        return new Gson().toJson(wikiResult);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/api/wiki/html")
    public String getWikiResultHtml(ModelMap modelMap, @RequestParam("country") String country,HttpServletResponse response, HttpServletRequest request) {
        WikipediaDownloader wikipediaDownloader = new WikipediaDownloader(country);
        WikiResult wikiresult = wikipediaDownloader.getResult();
        modelMap.addAttribute("IMAGE",wikiresult.getImage_url());
        modelMap.addAttribute("DESCRIPTION",wikiresult.getText_result());
        return "wikiApi";
    }
      @RequestMapping(method = RequestMethod.POST, value = "/handle")
    public
    @ResponseBody
    String handleEncrypt(@RequestBody String data, HttpServletRequest request, HttpServletResponse response) {
        return "ok";
    }
}