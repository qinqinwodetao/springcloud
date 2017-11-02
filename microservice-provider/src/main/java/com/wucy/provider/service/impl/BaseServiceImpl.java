package com.wucy.provider.service.impl;

import com.wucy.provider.dao.BaseRepository;
import com.wucy.provider.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

/**
 * @author wucy
 * @param <T>
 * @param <ID>
 */
public abstract class BaseServiceImpl<T,ID extends Serializable> implements BaseService<T,ID> {

    @Autowired
    BaseRepository<T,ID> baseRepository;


    @Override
    public T save(T model) {
        return baseRepository.save(model);
    }

    @Override
    public T merge(T model) {
        return null;
    }

    @Override
    public void delete(ID id) {
         baseRepository.delete(id);
    }

    @Override
    public void deleteObject(T model) {
        baseRepository.delete(model);
    }

    @Override
    public T get(ID id) {
        return baseRepository.findOne(id);
    }

    @Override
    public long countAll() {
        return baseRepository.count();
    }

    @Override
    public List<T> listAll() {
        return baseRepository.findAll();
    }

    @Override
    public Page<T> findByPage(Pageable pageable) {
        return baseRepository.findAll(pageable);
    }

    @Override
    public boolean exists(ID id) {
        return baseRepository.exists(id);
    }

    @Override
    public void flush() {
        baseRepository.flush();
    }

    @Override
    public void clear() {

    }


}
