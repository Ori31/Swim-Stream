package com.mx.edu.tecdesoftware.PlataformaStreaming.persistence.crud;

import com.mx.edu.tecdesoftware.PlataformaStreaming.persistence.entity.MediaRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MediaRequestRepository extends CrudRepository<MediaRequest, Integer> {

    List<MediaRequest> findByStatus(String status);

    List<MediaRequest> findByIdUserRequester(Integer idUserRequester);
}
