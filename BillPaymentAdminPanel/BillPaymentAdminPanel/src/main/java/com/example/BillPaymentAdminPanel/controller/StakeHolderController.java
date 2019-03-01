package com.example.BillPaymentAdminPanel.controller;

import com.example.BillPaymentAdminPanel.model.StakeHolder;
import com.example.BillPaymentAdminPanel.service.StakeHolderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/stake")
public class StakeHolderController {

    private static final Logger logger = LoggerFactory.getLogger(StakeHolder.class);
    @Autowired
    StakeHolderService stakeHolderService;

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping("/create")
    public ModelAndView getCreatePage(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("stakeholder/create");
        modelAndView.addObject("stake", new StakeHolder());
        return modelAndView;
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @PostMapping("/stakeholder")
    public ModelAndView createStakeholder(@Valid @ModelAttribute("stake") StakeHolder stakeHolder, BindingResult result){

        ModelAndView modelAndView = new ModelAndView();
        if(result.hasErrors()){
            logger.info("Validation errors while submitting form.");
            modelAndView.setViewName("stakeholder/create");
            modelAndView.addObject("stake", stakeHolder);
            return modelAndView;
        }
        stakeHolder.setStatus(1);
        stakeHolderService.createStakeHolder(stakeHolder);
        return new ModelAndView("redirect:/stake/lists");
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping("/show/{id}")
    public ModelAndView showStakeHolder(@PathVariable  int id){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/stakeholder/show");
        modelAndView.addObject("stakeholder", stakeHolderService.findStakeHolder(id).get());
        return modelAndView;
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping("/edit/{id}")
    public ModelAndView editStakeHolder(@PathVariable int id){

        Optional<StakeHolder> stakeHolder = stakeHolderService.findStakeHolder(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("stakeholder/update");
        modelAndView.addObject("stake", stakeHolder.get());
        return modelAndView;
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @PostMapping("/edit/{id}")
    public ModelAndView updateStakeHolder(@Valid @ModelAttribute("stake") StakeHolder stakeHolder, BindingResult result, @PathVariable int id){

        ModelAndView modelAndView = new ModelAndView();

        if(result.hasErrors()){
            logger.info("Validation errors while submitting form.");
            modelAndView.setViewName("stakeholder/update");
            modelAndView.addObject("stake", stakeHolder);
            return modelAndView;
        }
        stakeHolder.setId(id);
        stakeHolderService.createStakeHolder(stakeHolder);
        return new ModelAndView("redirect:/stake/lists");
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping("/lists")
    public ModelAndView getAll(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("stakeholder/stakeholderlist");
        List<StakeHolder> stakeHolderList = stakeHolderService.getAll().stream().filter(s -> s.getStatus() == 1).collect(Collectors.toList());
        modelAndView.addObject("stakeholders", stakeHolderList);
        return modelAndView;
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping("/delete/{id}")
    public ModelAndView deleteStakeHolder(@PathVariable int id){

        Optional<StakeHolder> stakeHolder = stakeHolderService.findStakeHolder(id);
        stakeHolder.get().setStatus(0);
        stakeHolderService.createStakeHolder(stakeHolder.get());
        return new ModelAndView("redirect:/stake/lists");
    }

    @PreAuthorize("hasAnyRole('ROLE_SUPER_ADMIN')")
    @GetMapping("/inactivelists")
    public ModelAndView inactiveStakeHolder(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("stakeholder/inactivelist");
        List<StakeHolder> stakeHolderList = stakeHolderService.getAll().stream().filter(s -> s.getStatus() == 0).collect(Collectors.toList());
        modelAndView.addObject("stakeholders", stakeHolderList);
        return modelAndView;
    }

    @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
    @GetMapping("/active/{id}")
    public ModelAndView active(@PathVariable int id){

        ModelAndView modelAndView = new ModelAndView();
        Optional<StakeHolder> stakeHolder = stakeHolderService.findStakeHolder(id);
        stakeHolder.get().setStatus(1);
        stakeHolderService.createStakeHolder(stakeHolder.get());
        return new ModelAndView("redirect:/stake/inactivelists");
    }


}
