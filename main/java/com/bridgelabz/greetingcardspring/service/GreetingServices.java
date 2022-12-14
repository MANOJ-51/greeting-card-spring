package com.bridgelabz.greetingcardspring.service;

import com.bridgelabz.greetingcardspring.controller.GreetingController;
import com.bridgelabz.greetingcardspring.model.GreetingModel;
import com.bridgelabz.greetingcardspring.repository.IGreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class GreetingServices implements IGreetingService {

    @Autowired
    IGreetingRepository iGreetingRepository;

    @Override
    public GreetingModel greetingMessage() {
        return iGreetingRepository.save(new GreetingModel("Hello Manoj"));
    }

    @Override
    public GreetingModel greetingMessage(String name) {
        return iGreetingRepository.save(new GreetingModel(String.format(GreetingController.TEMPLATE_1, name)));
    }

    @Override
    public GreetingModel greetingMessage(String firstName, String lastName) {
        return iGreetingRepository.save(new GreetingModel(String.format(GreetingController.TEMPLATE_2, firstName, lastName)));
    }

    @Override
    public GreetingModel getGreetingById(Long id) {
        Optional<GreetingModel> greetingModel = iGreetingRepository.findById(id);
        if (greetingModel.isPresent()) {
            return greetingModel.get();
        } else {
            return (new GreetingModel("Greeting Message is not there"));
        }
    }

    @Override
    public List<GreetingModel> getGreetingList() {
        return (List<GreetingModel>)iGreetingRepository.findAll();
    }

    @Override
    public GreetingModel editGreeting(GreetingModel greetingModel) {
        Optional<GreetingModel>greetingModelOptional=iGreetingRepository.findById(greetingModel.getId());
        if (greetingModelOptional.isPresent()){
            return iGreetingRepository.save(greetingModel);
        }else {
            return (new GreetingModel("Greeting is Not Found in the Repository"));
        }
    }

    @Override
    public GreetingModel deleteGreetingById(Long id) {
        Optional<GreetingModel>greetingModelOptional=iGreetingRepository.findById(id);
        if (greetingModelOptional.isPresent()){
            iGreetingRepository.deleteById(id);
            return greetingModelOptional.get();
        }else {
            return(new GreetingModel("NO Greeting Found "));
        }
    }
}
