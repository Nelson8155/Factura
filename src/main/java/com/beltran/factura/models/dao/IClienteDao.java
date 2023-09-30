package com.beltran.factura.models.dao;

import com.beltran.factura.models.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IClienteDao extends CrudRepository<Cliente, Long>, PagingAndSortingRepository<Cliente, Long> {
}
