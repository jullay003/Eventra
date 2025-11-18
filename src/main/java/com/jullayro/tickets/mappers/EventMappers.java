package com.jullayro.tickets.mappers;


import com.jullayro.tickets.domain.CreateEventRequest;
import com.jullayro.tickets.domain.CreateTicketTypeRequest;
import com.jullayro.tickets.domain.dtos.CreateEventRequestDto;
import com.jullayro.tickets.domain.dtos.CreateEventResponseDto;
import com.jullayro.tickets.domain.dtos.CreateTicketTypeRequestDto;
import com.jullayro.tickets.domain.entities.Event;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMappers {

    CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);
    CreateEventRequest fromDto(CreateEventRequestDto dto);

    CreateEventResponseDto toDto(Event event);

}
