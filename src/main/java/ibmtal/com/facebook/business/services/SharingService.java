package ibmtal.com.facebook.business.services;

import ibmtal.com.facebook.core.result.Result;
import ibmtal.com.facebook.entity.dto.SharingDto;

public interface SharingService {
	Result addSharing(SharingDto sharingDto);
}
