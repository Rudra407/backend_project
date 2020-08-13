package tech.codingclub.helix.controller;

import com.google.gson.GsonBuilder;
import org.apache.log4j.Logger;
import org.jooq.Condition;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import tech.codingclub.helix.database.GenericDB;
import tech.codingclub.helix.entity.LoginResponse;
import tech.codingclub.helix.entity.Member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.metal.MetalMenuBarUI;
import java.util.List;

/**
 * User: Rudra
 */
@Controller
@RequestMapping("/login")
public class LoginController extends BaseController {

    private static Logger logger = Logger.getLogger(MainController.class);

    @RequestMapping(method = RequestMethod.GET, value = "/admin")
    public String adminLogin(ModelMap modelMap, HttpServletResponse response, HttpServletRequest request) {
        return "adminLogin";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/user")
    public String userLogin(ModelMap modelMap, HttpServletResponse response, HttpServletRequest request) {
        return "userLogin";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/welcome")
    public String welcomelogin(ModelMap modelMap, HttpServletResponse response, HttpServletRequest request) {
        return "welcomelogin";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/welcome")
    public @ResponseBody
    LoginResponse handlelogin(@RequestBody Member member, ModelMap modelMap, HttpServletResponse response, HttpServletRequest request) {

        Condition condition = tech.codingclub.helix.tables.Member.MEMBER.EMAIL.eq(member.email).and(tech.codingclub.helix.tables.Member.MEMBER.PASSWORD.eq(member.password));

        List<Member> x = (List<Member>) GenericDB.getRows(tech.codingclub.helix.tables.Member.MEMBER, Member.class, condition, 1 );

        if(x!=null && x.size()>0){
                    Member memberTemp = x.get(0);
                    return new LoginResponse(memberTemp.id,true, "Logined successfully");
                }
                else {
            return new LoginResponse(-1, false, "Wrong combinations");
        }
    }
}