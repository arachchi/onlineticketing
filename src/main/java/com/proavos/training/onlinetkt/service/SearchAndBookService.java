package com.proavos.training.onlinetkt.service;

import java.util.List;

import com.proavos.training.onlinetkt.common.ApplicationException;
import com.proavos.training.onlinetkt.dto.BookBusRequestDTO;
import com.proavos.training.onlinetkt.dto.BookBusResponseDTO;
import com.proavos.training.onlinetkt.dto.BusDTO;
import com.proavos.training.onlinetkt.dto.SearchBusRequestDTO;
import com.proavos.training.onlinetkt.dto.SearchBusResponseDTO;
import com.proavos.training.onlinetkt.model.City;

public interface SearchAndBookService {

	public String echo(String text);

	public List<City> getAllActiveCities();

	public SearchBusResponseDTO searchBusAvailability(SearchBusRequestDTO searchBusRequestDTO);

	public BookBusResponseDTO bookBus(BookBusRequestDTO bookBusRequestDTO) throws ApplicationException;

	public BusDTO getBusById(Long busID);

}
