package app.controller;

import app.auth.User;
import app.auth.UserRepository;
import app.model.*;
import app.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

    private EyeLashServiceRepository eyeLashServiceRepository;
    private MasterRepository masterRepository;
    private CustomerRepository customerRepository;
    private JournalRepository journalRepository;
    private ActionRepository actionRepository;
    private BlackListRepository blackListRepository;
    private QualificationRepository qualificationRepository;
    private PhotoRepository photoRepository;
    private ReviewRepository reviewRepository;
    private UserRepository userRepository;


    @Autowired
    public AdminController(EyeLashServiceRepository eyeLashServiceRepository,
                           MasterRepository masterRepository, CustomerRepository customerRepository,
                           JournalRepository journalRepository, ActionRepository actionRepository,
                           BlackListRepository blackListRepository, QualificationRepository qualificationRepository,
                           PhotoRepository photoRepository, ReviewRepository reviewRepository, UserRepository userRepository){
        this.eyeLashServiceRepository = eyeLashServiceRepository;
        this.masterRepository = masterRepository;
        this.customerRepository = customerRepository;
        this.journalRepository = journalRepository;
        this.actionRepository = actionRepository;
        this.blackListRepository = blackListRepository;
        this.qualificationRepository = qualificationRepository;
        this.photoRepository = photoRepository;
        this.reviewRepository = reviewRepository;
        this.userRepository = userRepository;
        this.initUserEntity();


    }

    private void initUserEntity(){
        User user = new User();
        user.setUsername("client");
        user.setPassword(new BCryptPasswordEncoder(11).encode("password"));
        this.userRepository.save(user);
    }


    @GetMapping("/")
    public String index(Model model){
        System.out.println("INDEX");
        Iterable<EyeLashService> list = eyeLashServiceRepository.findAll();
        StringBuilder builder = new StringBuilder();
        for(EyeLashService service : list){
            builder.append("id = " + service.getId() + " name = " + service.getEyeLashServiceName() + "\n");
        }
        model.addAttribute("message", builder);
        return "my";

    }



    @GetMapping("/lists/customer")
    public ModelAndView showCustomer() {
        ModelAndView modelAndView = new ModelAndView("lists/customer");
        return modelAndView;
    }

    @PostMapping("/lists/addmaster")
    public String saveMaster(Master master){
        masterRepository.save(master);
        return "redirect:/lists/addmaster";

    }


    @GetMapping("/lists/addmaster")
    public ModelAndView showMaster(){
        ModelAndView modelAndView = new ModelAndView("lists/masterList");
        modelAndView.addObject("masters",masterRepository.findAll());
        modelAndView.addObject("master",new Master());
        return modelAndView;
    }

    @PostMapping("/lists/addcustomer")
    public String saveAction(Customer customer){
        customerRepository.save(customer);
        return "redirect:/lists/addcustomer";
    }

    @GetMapping("/lists/addcustomer")
    public ModelAndView showClient(){
        ModelAndView modelAndView = new ModelAndView("lists/customerList");
        modelAndView.addObject("customers", customerRepository.findAll());
        modelAndView.addObject("customer",new Customer());
        return modelAndView;
    }
//
    @PostMapping("/lists/addaction")
    public String saveAction(Action action){
        actionRepository.save(action);
        return "redirect:/lists/addaction";
    }

    @GetMapping("/lists/addaction")
    public ModelAndView showAction(){
        ModelAndView modelAndView = new ModelAndView("lists/actionList");
        modelAndView.addObject("actions",actionRepository.findAll());
        modelAndView.addObject("action",new Action());
        return modelAndView;
    }

    @PostMapping("/lists/addblacklist")
    public String saveBlackList(BlackList blackList){
        blackListRepository.save(blackList);
        return "redirect:/lists/addblacklist";
    }

    @GetMapping("/lists/addblacklist")
    public ModelAndView showBlackList(){
        ModelAndView modelAndView = new ModelAndView("lists/blackListList");
        modelAndView.addObject("blackLists",blackListRepository.findAll());
        modelAndView.addObject("blackList",new BlackList());
        return modelAndView;
    }

    @PostMapping("/lists/addprice")
    public String savePrice(EyeLashService eyeLashService){
        eyeLashServiceRepository.save(eyeLashService);
        return "redirect:/lists/addprice";
    }

    @GetMapping("/lists/addprice")
    public ModelAndView showPrice(){
        ModelAndView modelAndView = new ModelAndView("lists/priceList");
        modelAndView.addObject("prices", eyeLashServiceRepository.findAll());
        modelAndView.addObject("price",new EyeLashService());
        return modelAndView;
    }

    @PostMapping("/lists/addjournal")
    public String saveJournal(Journal journal){
        journalRepository.save(journal);
        return "redirect:/lists/addjournal";
    }

    @GetMapping("/lists/addjournal")
    public ModelAndView showJournal(){
        ModelAndView modelAndView = new ModelAndView("lists/journalList");
        modelAndView.addObject("journals",journalRepository.findAll());
        modelAndView.addObject("clients", customerRepository.findAll());
        modelAndView.addObject("journal",new Journal());
        return modelAndView;
    }

    @PostMapping("/lists/addqualification")
    public String saveQualification(Qualification qualification){
        qualificationRepository.save(qualification);
        return "redirect:/lists/addqualification";
    }

    @GetMapping("/lists/addqualification")
    public ModelAndView showQualification(){
        ModelAndView modelAndView = new ModelAndView("lists/qualificationList");
        modelAndView.addObject("qualifications",qualificationRepository.findAll());
        modelAndView.addObject("qualification",new Qualification());
        return modelAndView;
    }

    @PostMapping("/lists/addphoto")
    public String savePhoto(Photo photo){
        photoRepository.save(photo);
        return "redirect:/lists/addphoto";
    }

    @GetMapping("/lists/addphoto")
    public ModelAndView showPhoto(){
        ModelAndView modelAndView = new ModelAndView("lists/photoList");
        modelAndView.addObject("photos",photoRepository.findAll());
        modelAndView.addObject("photo",new Photo());
        return modelAndView;
    }

    @PostMapping("/lists/addreview")
    public String saveReview(Review review){
        reviewRepository.save(review);
        return "redirect:/lists/addreview";
    }

    @GetMapping("/lists/addreview")
    public ModelAndView showReview(){
        ModelAndView modelAndView = new ModelAndView("lists/reviewList");
        modelAndView.addObject("reviews",reviewRepository.findAll());
        modelAndView.addObject("review",new Review());
        return modelAndView;
    }

}


