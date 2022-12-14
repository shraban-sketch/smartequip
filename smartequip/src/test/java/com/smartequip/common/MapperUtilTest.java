package com.smartequip.common;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.smartequip.model.Smartequip;

/**
 * @author Shraban.Rana
 *
 */
@ExtendWith(MockitoExtension.class)
class MapperUtilTest {

	@InjectMocks
	private MapperUtil mapperUtil;

	/**
	 * This will checking mapping is happening correctly or not
	 */
	@Test
	void mapperTest() {
		List<Integer> generateRandomNumbers = new ArrayList<>();
		generateRandomNumbers.add(1);
		generateRandomNumbers.add(2);
		generateRandomNumbers.add(3);
		String token = "124343243438bjkhk34";
		Smartequip mapper = mapperUtil.mapper(generateRandomNumbers, token);
		assertEquals(token, mapper.getUniqueToken());
	}

}
