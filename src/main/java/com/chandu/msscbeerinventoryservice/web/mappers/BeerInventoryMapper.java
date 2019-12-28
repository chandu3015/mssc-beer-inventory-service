package com.chandu.msscbeerinventoryservice.web.mappers;


import com.chandu.msscbeerinventoryservice.domain.BeerInventory;
import com.chandu.msscbeerinventoryservice.web.domain.BeerInventoryDto;
import org.mapstruct.Mapper;


@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {
    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
