package com.mx.edu.tecdesoftware.PlataformaStreaming.persistence.crud;

import com.mx.edu.tecdesoftware.PlataformaStreaming.persistence.entity.MediaRequest;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MediaRequestRepository extends CrudRepository<MediaRequest, Integer> {

    List<MediaRequest> findByStatus(String status);

    List<MediaRequest> findByIdUserRequester(Integer idUserRequester);
}
