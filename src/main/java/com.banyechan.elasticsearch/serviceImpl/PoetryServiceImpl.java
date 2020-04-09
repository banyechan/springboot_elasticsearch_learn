package com.banyechan.elasticsearch.serviceImpl;

import com.banyechan.elasticsearch.entity.Poetry;
import com.banyechan.elasticsearch.repository.PoetryRepository;
import com.banyechan.elasticsearch.service.PoetryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class PoetryServiceImpl implements PoetryService {

    @Autowired
    private PoetryRepository poetryRepository;

    @Override
    public void savePoetry(Poetry record) {
        record = poetryRepository.save(record);
    }

    @Override
    public List<Poetry> listAllPoetry() {
        List<Poetry> poetryList = new ArrayList<>();
        Iterable<Poetry> searchResult = poetryRepository.findAll();
        Iterator<Poetry> iterator = searchResult.iterator();
        while(iterator.hasNext()){

            poetryList.add(iterator.next());
           // log.info("-----" + iterator.next().getContent());

        }
        return poetryList;
    }

    @Override
    public Poetry getById(String id) {
        Optional<Poetry> optional =poetryRepository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    @Override
    public void deleteById(String id) {
        poetryRepository.deleteById(id);
    }
}
