package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.WorkPlace;

public interface WorkPlaceService {
public DataResult<List<WorkPlace>> getAll();
}
