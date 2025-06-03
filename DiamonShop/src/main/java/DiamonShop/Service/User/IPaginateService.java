package DiamonShop.Service.User;

import org.springframework.stereotype.Service;

import DiamonShop.Dto.PaginateDto;
@Service
public interface IPaginateService {
	public PaginateDto getInfoPaginate(int totalData, int limit, int currentPage);

}
