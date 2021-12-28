package ibmtal.com.facebook.business.manager;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ibmtal.com.facebook.business.services.SharingService;
import ibmtal.com.facebook.core.result.Message;
import ibmtal.com.facebook.core.result.Result;
import ibmtal.com.facebook.database.SharingDao;
import ibmtal.com.facebook.entity.dto.SharingDto;
@Service
public class SharingManager implements SharingService {
	private SharingDao sharingDao;
	@Autowired
	public SharingManager(SharingDao sharingDao) {
		super();
		this.sharingDao = sharingDao;
	}
	@Override
	public Result addSharing(SharingDto sharingDto) {
		Result result=new Result();
		ArrayList<Message> mesaj=new ArrayList<Message>();
		result.setSuccess(true);

		
		result.setErrors(mesaj);
		return result;
	}
	
}
