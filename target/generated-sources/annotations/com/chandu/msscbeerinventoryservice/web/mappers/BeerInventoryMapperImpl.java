package com.chandu.msscbeerinventoryservice.web.mappers;

import com.chandu.msscbeerinventoryservice.domain.BeerInventory;
import com.chandu.msscbeerinventoryservice.domain.BeerInventory.BeerInventoryBuilder;
import com.chandu.msscbeerinventoryservice.web.domain.BeerInventoryDto;
import com.chandu.msscbeerinventoryservice.web.domain.BeerInventoryDto.BeerInventoryDtoBuilder;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-27T22:57:35-0600",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 12.0.2 (Oracle Corporation)"
)
@Component
public class BeerInventoryMapperImpl implements BeerInventoryMapper {

    @Autowired
    private DateMapper dateMapper;

    @Override
    public BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO) {
        if ( beerInventoryDTO == null ) {
            return null;
        }

        BeerInventoryBuilder beerInventory = BeerInventory.builder();

        beerInventory.id( beerInventoryDTO.getId() );
        beerInventory.createdDate( dateMapper.asTimestamp( beerInventoryDTO.getCreatedDate() ) );
        beerInventory.lastModifiedDate( dateMapper.asTimestamp( beerInventoryDTO.getLastModifiedDate() ) );
        beerInventory.beerId( beerInventoryDTO.getBeerId() );
        beerInventory.quantityOnHand( beerInventoryDTO.getQuantityOnHand() );

        return beerInventory.build();
    }

    @Override
    public BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory) {
        if ( beerInventory == null ) {
            return null;
        }

        BeerInventoryDtoBuilder beerInventoryDto = BeerInventoryDto.builder();

        beerInventoryDto.id( beerInventory.getId() );
        beerInventoryDto.createdDate( dateMapper.asOffsetDateTime( beerInventory.getCreatedDate() ) );
        beerInventoryDto.lastModifiedDate( dateMapper.asOffsetDateTime( beerInventory.getLastModifiedDate() ) );
        beerInventoryDto.beerId( beerInventory.getBeerId() );
        beerInventoryDto.quantityOnHand( beerInventory.getQuantityOnHand() );

        return beerInventoryDto.build();
    }
}