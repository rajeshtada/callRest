package com.example.callRest;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;

public class ObjectMapperUtils {
	
	private static  ModelMapper modelMapper = new ModelMapper();
	
public static void main(String[] args) {
	

	 List<SourceDTO> listSourceDto = new ArrayList<>();
	 listSourceDto.add(new SourceDTO (1L,"rama",LocalDateTime.now()));
	 listSourceDto.add(new SourceDTO (2L,"hari",LocalDateTime.now()));
	 listSourceDto.add(new SourceDTO (3L,"kanha",LocalDateTime.now().plusDays(1L)));
	 
	 
//	 List<PostDTO> listOfPostDTO = TestModelMapper.mapAll(listOfPreDto, PostDTO.class);

	 
	 Type targetClassType = new TypeToken<List<TargetDTO>>(){}.getType();
	 List<TargetDTO> listTargetDto = modelMapper.map(listSourceDto,targetClassType);
	 
	 for (TargetDTO postDTO : listTargetDto) {
		 System.out.println("id = "+postDTO.id+" :: name = " + postDTO.name + " :: age = " + postDTO.age);
	}
}	 
}

class TestModelMapper {

private static final ModelMapper modelMapper;
	    

//	      Model mapper property setting are specified in the following block.
//	      Default property matching strategy is set to Strict see {@link MatchingStrategies}
//	      Custom mappings are added using {@link ModelMapper#addMappings(PropertyMap)}
	    static {
	        modelMapper = new ModelMapper();
	        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
	    }

	    
//	      <p>Note: outClass object must have default constructor with no arguments</p>
//	      @param <D>      type of result object.
//	      @param <T>      type of source object to map from.
//	      @param entity   entity that needs to be mapped.
//	      @param outClass class of result object.
//	      @return new object of <code>outClass</code> type.
	    public static <D, T> D map(final T entity, Class<D> outClass) {
	        return modelMapper.map(entity, outClass);
	    }

	    
//	      <p>Note: outClass object must have default constructor with no arguments</p>
//	      @param entityList list of entities that needs to be mapped
//	      @param outCLass   class of result list element
//	      @param <D>        type of objects in result list
//	      @param <T>        type of entity in <code>entityList</code>
//	      @return list of mapped object with <code><D></code> type.
	    public static <D, T> List<D> mapAll(final Collection<T> entityList, Class<D> outCLass) {
	        return entityList.stream()
	                .map(entity -> map(entity, outCLass))
	                .collect(Collectors.toList());
	    }

	    /*
	     * Maps {@code source} to {@code destination}.
	     *
	     * @param source      object to map from
	     * @param destination object to map to
	     */
	    public static <S, D> D map(final S source, D destination) {
	        modelMapper.map(source, destination);
	        return destination;
	    }
	    
}

class SourceDTO { 
	Long id ;
	String name;
	LocalDateTime age;
	public SourceDTO(Long id, String name,LocalDateTime age ) {
		this.id = id; 	this.name = name;	this.age = age; }
	public Long getId() { return id; }
	public String getName() { return name; }
	public LocalDateTime getAge() { return age; }
	public void setId(Long id) { this.id = id;	}
	public void setName(String name) { this.name = name;	}
	public void setAge(LocalDateTime age) { this.age = age;	}
	
}
class TargetDTO { 
	String id ;
	String name;
	String age;
	public String getId() { return id; }
	public String getName() { return name; }
	public String getAge() { return age; }
	public void setId(String id) { this.id = id;	}
	public void setName(String name) { this.name = name;	}
	public void setAge(String age) { this.age = age;	}
}
