package com.codef.io.sandbox;

import java.io.IOException;
import java.util.HashMap;

import org.json.simple.parser.ParseException;

import com.codef.io.util.CommonConstant;

/**
 * 은행 기업 외화 거래내역	
 */
public class KR_BK_1_B_005 {
	
	public static void main(String[] args) throws IOException, InterruptedException, ParseException {
		// 요청 URL 설정
		String urlPath = CommonConstant.SANDBOX_DOMAIN + CommonConstant.KR_BK_1_B_005;
		
		// 요청 파라미터 설정 시작
		HashMap<String, Object> bodyMap = new HashMap<String, Object>();
		bodyMap.put("connectedId", "6OOOZ58zAU.aX0pRRgzEBk");	// 엔드유저의 은행/카드사 계정 등록 후 발급받은 커넥티드아이디 예시
		
		bodyMap.put("organization", "0003"); 
		
		bodyMap.put("account", "0530815995600000");
		bodyMap.put("startDate", "20190401");
		bodyMap.put("endDate", "20190630");
		bodyMap.put("orderBy", "0");
		bodyMap.put("currency", "USD");
		// 요청 파라미터 설정 종료
		
		// API 요청
		String result = SandboxApiRequest.reqeust(urlPath, bodyMap);	//  샌드박스 요청 오브젝트 사용
	}
}