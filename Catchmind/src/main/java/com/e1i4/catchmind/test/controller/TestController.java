package com.e1i4.catchmind.test.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.e1i4.catchmind.member.model.service.MemberService;
import com.e1i4.catchmind.member.model.vo.Member;
import com.e1i4.catchmind.test.model.service.TestService;
import com.e1i4.catchmind.test.model.vo.Test;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("mbtiTest.te")
	public String mbtiTest() {
		
		return "test/mbtiTestView";
	}
	
	@RequestMapping("mbtiResult.te")
	public String mbtiResult(String mbtiResult, HttpSession session) {
		
		Test testResult = new Test();
		
		if(mbtiResult.equals("ESTP")) {
			
			testResult = new Test("./resources/images/mbtiResult/ESTP_ResultImg.png", 
						 		  "브레이크 고장 난 8톤 트럭", 
						 		  "ESTP",
						 		  
						 "<b>" + "#쿨내진동   #19금 풀 게이지   #연애 준비 200% 완료" + "</b>" +"<br>" + "<br>" + 
					     "인생이 즐겁고 놀라움으로 가득 차 있으며 지금 이 순간 모든 것을 즐기는 당신!" + "<br>" + "<br>" + 
						 "'언젠가'를 위한 계획을 세우는데 많은 시간을 투자하지는 않지만, 당신의 열정과 예측 불가능성은 당신을 짜릿한 데이트 상대로 만들어줄 것입니다. " + "<br>" +  "<br>" + 
						 "하지만 시간이 지남에 따라, 관계를 더 깊고 감정적으로 친밀한 수준으로 옮기는 것이 어려울 수 있습니다. " +  "쉽게 지루해하는 사업가적 성격을 가진 당신은 지속적인 자극을 추구합니다. " +  "<br>"  +  "<br>" 
						 + "때로는 의도적으로 자신을 자극에 노출시키기도 합니다." 
						 
						 + "<b>" + "<br>"+  "<br>" + "<hr>" +  "<br>"+ "<< 나와 잘맞는 BEST MBTI 유형 추천 >> " + "<br>"+ "<br>"
						 + " 1순위 : 밝고 쾌할하면서 깊이가 있는 INFJ ❤❤❤❤❤ "+ "<br>"+  "<br>"
						 + " 2순위 : 감정에 솔직하고 직설적인 ENFJ ❤❤❤❤♡"+ "<br>"+  "<br>"
						 + " 3순위 : 함께 모험을 즐기며 당신을 챙겨 줄 ENTJ ❤❤❤♡♡"+ "</b>"
						 , "");
			
		} else if(mbtiResult.equals("ESTJ")) {
			
			testResult = new Test("./resources/images/mbtiResult/ESTJ_ResultImg.png", 
						 		  "연애도 글로 배웠습니다... 갓선비", 
						 		  "ESTJ", 

						 		 "<b>" + "#밀당이라고는 모르는   #호불호 확실" + "</b>" + "<br>" + "<br>" + 
					     "정직함과 솔직함을 매우 중요시하는 당신! " + "<br>" + "<br>" + "처음부터 자신이 누구인지, 자신이 어떤 사람인지, 그리고 목표가 무엇인지에 대해 분명하기 때문에 당신의 연인이 당신의 말을 믿고 따를 수 있는 한, 당신과 연인은 매우 안정적인 관계일 수밖에 없습니다. "
					     + "<br>" +  "<br>" + "하지만 자신의 옳음을 확고히 믿고 고집이 센 당신은 연인의 연약한 감정을 빠르게 손상시킬 수 있습니다. 이를 염두에 두고, 강력한 성격의 균형을 맞추고 성장의 기회를 제공하기 위해 한두 가지 상반되는 특성을 가진 연인을 찾는 것이 좋습니다."
					     
					     + "<b>" + "<br>"+  "<br>" + "<hr>" +  "<br>"+ "<< 나와 잘맞는 BEST MBTI 유형 추천 >> " + "<br>"+ "<br>"
						 + " 1순위 : 진정한 사랑을 좇는 몽상가 INFP ❤❤❤❤❤ "+ "<br>"+  "<br>"
						 + " 2순위 : 따뜻하게 당신을 아껴 줄 ISFP ❤❤❤❤♡"+ "<br>"+  "<br>"
						 + " 3순위 : 함께 성장하려는 열정맨 ENTP ❤❤❤♡♡"+ "</b>"
						 , "");
			
		} else if(mbtiResult.equals("ESFP")) {
			
			testResult = new Test("./resources/images/mbtiResult/ESFP_ResultImg.png", 
						 		  "사랑에 빠지는 시간 3초면 OK, 금사빠", 
						 		  "ESFP", 

						 		 "<b>" + "#나너좋아   #너도좋아 #변덕은 나의 전문" + "</b>" + "<br>" + "<br>" + 		  
					     "재미를 사랑하고, 자유분방하며, 그 순간순간의 삶을 살아가는 당신! " + "<br>" + "<br>" + "당신은 데이트를 할 때 이러한 신선함과 에너지를 아끼지 않습니다. 당신의 사랑은 불꽃같지만 즐거움이 사라지면 불꽃 또한 사라집니다. " +
						 "만약 일주일 후 당신이 똑같이 느끼지 않는다면, 그것은 그뿐이고, 당신은 관계를 끊는 것을 심각하게 고려하지 않습니다. " + "<br>" +  "<br>" + 
					     "당신은 관계를 바꾸지 않고 기꺼이 노력할 수 있지만 귀찮은 일을 할 가치가 있다는 것을 깨닫기 위해서는 상당한 성숙함과 경험이 필요합니다." 
					     
					     + "<b>" + "<br>"+  "<br>" + "<hr>" +  "<br>"+ "<< 나와 잘맞는 BEST MBTI 유형 추천 >> " + "<br>"+ "<br>"
						 + " 1순위 : 사랑에 있어서도 침착하고 논리적인 INTJ ❤❤❤❤❤ "+ "<br>"+  "<br>"
						 + " 2순위 : 섬세한 감성의 소유자 ISFJ ❤❤❤❤♡"+ "<br>"+  "<br>"
						 + " 3순위 : 적극적으로 관계를 리드해 줄 ENTJ ❤❤❤♡♡"+ "</b>"
						 , "");
			
		} else if(mbtiResult.equals("ESFJ")) {
			
			testResult = new Test("./resources/images/mbtiResult/ESFJ_ResultImg.png", 
								  "자발적 을의 연애 집사스타일", 
								  "ESFJ", 
								  
								  "<b>" + "#눈치력만렙   #집사를 자처하는 유형 #주인님 찾습니다" + "</b>" + "<br>" + "<br>" + 		  
					     "따뜻한 신뢰와 가치를 느끼고 싶어 하는 당신! " + "<br>" + "<br>" + "이해를 쌓는 것부터 서로의 의견과 목표에 대한 상호 존중과 지지를 쌓는 것까지 애인과의 상호 충족을 위해 노력하는 당신은 연인이 사랑받고 인정받고 있다는 것을 " + 
					     "아는 것이 당신의 기분과 자존심에 큰 영향을 미칩니다. 당신은 갈등과 비판을 싫어하는데, 이것은 어떤 문제가 생겨도 해결하는 것을 어렵게 만들 수 있습니다." + "<br>" + "<br>" + "당신은 연인이 당신의 꿈이나 의견을 존중하지 않는다는 것을 " + 
					     "깨닫는 것보다 더 상처받거나 우울한 것이 없습니다."
					     
					     + "<b>" + "<br>"+  "<br>" + "<hr>" +  "<br>"+ "<< 나와 잘맞는 BEST MBTI 유형 추천 >> " + "<br>"+ "<br>"
						 + " 1순위 : 인간관계에 있어서도 차분하고 침착한 INTP ❤❤❤❤❤ "+ "<br>"+  "<br>"
						 + " 2순위 : 때로는 정열적이고, 때로는 차분한  ISTP ❤❤❤❤♡"+ "<br>"+  "<br>"
						 + " 3순위 : 함께 성장할 수 있는 관계의 ENTP ❤❤❤♡♡"+ "</b>"
						 , "");
			
		} else if(mbtiResult.equals("ENFP")) {
			
			testResult = new Test("./resources/images/mbtiResult/ENFP_ResultImg.png", 
								  "사랑을 찾아다니는 피터팬", 
								  "ENFP", 
						 
								  "<b>" + "#충동력 200%  #사랑을 찾습니다  #애정으로 지구폭발시킴" + "</b>" + "<br>" + "<br>" + 				  
					     "희망과 꿈, 아이디어와 경험으로 가득 찬 열정적이고 따뜻하며 개방적인 당신! " + "<br>" + "<br>" + "당신은 연인과의 관계에서 이 활기찬 에너지를 모두 가져다줍니다. 당신은 누군가에게 관심을 가질 때, 주저하지 않습니다. " +  
						 "쉽게 사랑에 빠지는 경향이 있고, 심하게 빠집니다. " + "<br>" + "<br>" + "자신의 삶을 다른 사람과 공유하고 싶은 깊은 갈망을 가지고 있는 당신은 독신일 때 약간 공허하거나 영감을 받지 못한다고 느낄 수 있습니다. " +
					     "관계에 대한 헌신은 칭찬할 만하지만, 관계 상태에 너무 많은 자아의식을 투자하지 않도록 경계할 필요가 있습니다."
					     
					     + "<b>" + "<br>"+  "<br>" + "<hr>" +  "<br>"+ "<< 나와 잘맞는 BEST MBTI 유형 추천 >> " + "<br>"+ "<br>"
						 + " 1순위 : 책임감 있고 듬직한 ISTJ ❤❤❤❤❤ "+ "<br>"+  "<br>"
						 + " 2순위 : 충성! 온화한 사랑꾼 ISFJ ❤❤❤❤♡"+ "<br>"+  "<br>"
						 + " 3순위 : 당신에게 열렬한 용기를 북돋아 줄 ESFJ ❤❤❤♡♡"+ "</b>"
						 , "");
			
		} else if(mbtiResult.equals("ENFJ")) {
			
			testResult = new Test("./resources/images/mbtiResult/ENFJ_ResultImg.png", 
						 		  "쿠크다스 멘탈 연애 치어리더", 
						 		  "ENFJ", 
						 		  
						 		 "<b>" + "#잘한다잘한다  #칭찬봇  #그러나 내 멘탈은 파사-삭" + "</b>" + "<br>" + "<br>" + 
						 "자신의 이상에 미치지 못하는 것에 만족하는 경우가 거의 없는 당신! " + "<br>" + "<br>" + "연애도 예외는 아닙니다. 누군가에게 빠져들면, 심하게 넘어지는 경향이 있습니다. 그리고 그것에 대해 수줍어하지 않습니다. " + 
						 "자신이 느끼는 감정을 가장 쉽게 표현하는 성격 유형들 중 하나이기 때문에 상대방이 같은 감정을 느낄 때까지 기다리기보다는, 본인이 먼저 행동하는 것을 발견할 수 있습니다. " + 
						 "당신의 인생에서 가장 큰 즐거움 중 하나는 자신이 아끼는 누군가가 그들의 목표에 도달하도록 돕는 것입니다. 연인의 목표를 자신의 것으로 받아들이면서 이것을 한 단계 더 발전시킵니다. " + "<br>" +"<br>" +
						 "하지만 지나치게 투자하게 된다면, 자신에게 소홀히 하게 될 수도 있습니다."
						 
						 + "<b>" + "<br>"+  "<br>" + "<hr>" +  "<br>"+ "<< 나와 잘맞는 BEST MBTI 유형 추천 >> " + "<br>"+ "<br>"
						 + " 1순위 : 새로운 경험과 활동을 선사해 줄 ISTP ❤❤❤❤❤ "+ "<br>"+  "<br>"
						 + " 2순위 : 따뜻하고 열정적인 ISFP ❤❤❤❤♡"+ "<br>"+  "<br>"
						 + " 3순위 : 연애에서도 열정과 아이디어가 넘치는 ENTP ❤❤❤♡♡" + "</b>"
						 , "");
			
		} else if(mbtiResult.equals("ENTP")) {
			
			testResult = new Test("./resources/images/mbtiResult/ENTP_ResultImg.png", 
								  "노빠꾸 직진 연애불도저", 
								  "ENTP", 
						
								  "<b>" + "#아무도나를막을수없으셈  #길을 비켜라   #단호박" + "</b>" + "<br>" + "<br>" + 		  
				         "일을 계속 진행시키기 위한 끝없는 혁신과 아이디어의 흐름을 생각해 내는 당신! " + "<br>" + "<br>" + "당신의 성격 유형의 핵심은 성장이고, 심지어 연인을 찾기도 전에, 함께 새로운 것을 경험할 수 있는 모든 방법을 상상합니다. " + "<br>" + "<br>"+
						 "당신과 데이트하는 것은 거의 지루한 경험이 아니며, 자신의 새로운 아이디어와 경험으로 연인을 기쁘게 하고 놀라게 함으로써 자신의 열정과 창의력을 활용합니다. 당신의 열정은 매력적일 수 있지만, " + 
				         "가장 인내심이 많은 연인도 지치게 할 수 있습니다. 잠시 숨을 쉴 수 있는 시간은 많은 사람들에게 필요하지만, 당신에게는 그것이 높이 평가할 만한 것은 아닙니다. " + "<br>" + "<br>"+
						 "하지만 당신의 변함없는 열정을 실제로 마주하게 된다면 강인함과 깊이가 있는 멋진 관계로 이어질 수 있습니다."
						 
						 + "<b>" + "<br>"+  "<br>" + "<hr>" +  "<br>"+ "<< 나와 잘맞는 BEST MBTI 유형 추천 >> " + "<br>"+ "<br>"
						 + " 1순위 : 섬세한 감성의 소유자 ISFJ ❤❤❤❤❤ "+ "<br>"+  "<br>"
						 + " 2순위 : 책임감 있고 듬직한 ISTJ ❤❤❤❤♡"+ "<br>"+  "<br>"
						 + " 3순위 : 연애에서도 열정과 아이디어가 넘치는 ENTP ❤❤❤♡♡"+ "</b>"
						 , "");
			
		} else if(mbtiResult.equals("ENTJ")) {
			
			testResult = new Test("./resources/images/mbtiResult/ENTJ_ResultImg.png", 
						 		  "인내심 바닥난 연애CEO", 
						 		  "ENTJ", 
						 
						
						 		 "<b>" + "#프로야망러   #인내심 0점   #성취감 변태" + "</b>"  + "<br>" + "<br>" + 	
						 "일련의 목표와 그것들을 성취하기 위한 계획을 가지고 있는 당신! " + "<br>" + "<br>" + "삶의 다른 분야와 마찬가지로, 데이트와 관계에 접근할 때도 계획을 가지고, 인상적인 에너지와 열정을 가지고 진행합니다. " + "<br>" + "<br>" +
						 "당신과 같은 성격의 사람들은 이기려고 하고, 일이 얼마나 순조롭게 진행되는지에 대한 개인적인 책임을 지고, 서로에게 보람 있는 경험을 보장하기 위해 적극적으로 일하면서, 시작부터 기꺼이 관계에서 주도적인 역할을 맡을 것입니다. " + 
						 "연애를 진지한 사업이라고 생각하고, 오랜 기간의 연애를 하고 있습니다. 개인적인 책임감은 당신이 관계에 많은 에너지를 쏟는다는 것을 의미하며, " +
						 "특히 데이트 단계에서 항상 흥미로운 것을 유지하기 위해 새로운 것을 제안하며 자신의 창의성을 보여줍니다."
						
						 + "<b>" + "<br>"+  "<br>" + "<hr>" +  "<br>"+ "<< 나와 잘맞는 BEST MBTI 유형 추천 >> " + "<br>"+ "<br>"
						 + " 1순위 : 따뜻하게 당신을 아껴 줄 ISFP ❤❤❤❤❤ "+ "<br>"+  "<br>"
						 + " 2순위 : 진정한 사랑을 좇는 몽상가 INFP ❤❤❤❤♡"+ "<br>"+  "<br>"
						 + " 3순위 : 불꽃같은 연애를 경험할 수 있는 ESFP ❤❤❤♡♡"+ "</b>"
						 , "");
				
		} else if(mbtiResult.equals("ISTJ")) {
			
			testResult = new Test("./resources/images/mbtiResult/ISTJ_ResultImg.png", 
								  "리액션 고장난 연애봇", 
								  "ISTJ", 
								  
								  "<b>" + "#플랜성애자   #내적사랑꾼   #연애도 사랑도 원칙주의자"+ "</b>" + "<br>" + "<br>" + 			  
					     "철저하게 신뢰할 수 있는 당신! " + "<br>" + "<br>" + "이 특성은 연인 관계에서도 분명히 나타납니다. 가족 가치의 대명사를 나타내며, 전통적인 가정과 명확하고 정직한 가족 구성원을 추구합니다. 내성적인 성격이 종종 데이트를 어렵게 만들지만, " + 
						 "안정적이고 상호 만족스러운 관계를 보장하기 위해 엄청난 생각과 에너지를 기꺼이 쏟는 헌신적인 애인입니다. " + "<br>" + "<br>"
					     + "소개팅은 당신이 연인을 찾기 위해 선호하는 방법이 아닙니다. 당신은 관심 있는 동료와의 저녁 식사나, " + 
					     "더 책임감 있고 보수적인 데이트 방법을 훨씬 선호합니다. 껍데기는 강하고 조용한 결단력과 신뢰감을 감추고 있는데, 다른 성격 유형들 중에서도 드문 경우입니다."
					     
					     + "<b>" + "<br>"+  "<br>" + "<hr>" +  "<br>"+ "<< 나와 잘맞는 BEST MBTI 유형 추천 >> " + "<br>"+ "<br>"
						 + " 1순위 :  희망과 꿈으로 뭉친 에너자이저 ENFP ❤❤❤❤❤ "+ "<br>"+  "<br>"
						 + " 2순위 :  함께 성장하려는 열정맨 ENTP ❤❤❤❤♡"+ "<br>"+  "<br>"
						 + " 3순위 :  자상하고 충성스러운 피앙세ISFP ❤❤❤♡♡"+ "</b>"
						 , "");
						
		} else if(mbtiResult.equals("ISTP")) {
			
			testResult = new Test("./resources/images/mbtiResult/ISTP_ResultImg.png", 
								  "개쌍마이웨이 연애주의자", 
								  "ISTP", 
								  
								  "<b>" + "#우당탕탕   #혼자놀기 만렙   #내 사람 홀릭" + "</b>" + "<br>" + "<br>" +		  
					     "새로운 활동과 경험을 추구하며 현재를 살고 있는 당신! " + "<br>" + "<br>" + "당신과의 데이트는 냉담함과 초연함, 열정, 자발성, 그리고 순간의 즐거움을 번갈아 가며 하는 복잡하고 흥미로운 탱고입니다. " + 
						 "당신과의 관계에서는 어떤 것도 강요할 수 없지만, 자기 자신이 되기 위해 필요한 공간이 주어진다면, 당신은 평생 동안 안정된 연인과의 편안함을 기꺼이 누릴 것입니다. 연애 초기에, " + 
					     "당신은 특히 변덕스러울 수 있습니다. 육체적으로나 정신적으로나 많은 개인적인 공간이 필요하며, 당신을 통제하거나 강제로 당신의 활동을 계획하려는 시도는 이탈을 가속화시킬 뿐입니다. " + "<br>" + "<br>" +
						 "실제로 감정이 매우 깊고 강합니다. 단지 감정을 어떻게 다루고 표현해야 할지 확신이 서지 않기 때문에 감정을 숨기고 보호하는 것입니다."
						 
						 + "<b>" + "<br>"+  "<br>" + "<hr>" +  "<br>"+ "<< 나와 잘맞는 BEST MBTI 유형 추천 >> " + "<br>"+ "<br>"
						 + " 1순위 : 감정에 솔직하고 직설적인 ENFJ ❤❤❤❤❤ "+ "<br>"+  "<br>"
						 + " 2순위 : 반대가 끌리는 법! 따뜻한 감성의 ESFJ ❤❤❤❤♡"+ "<br>"+  "<br>"
						 + " 3순위 : 잔잔하지만 이상적인 연애는 INFJ ❤❤❤♡♡"+ "</b>"
						 , "");
			
		} else if(mbtiResult.equals("ISFJ")) {
			
			testResult = new Test("./resources/images/mbtiResult/ISFJ_ResultImg.png", 
								  "뒤끝 오지는 사랑집착꾼", 
								  "ISFJ", 
								  
								  "<b>" +"#나 사랑해? 얼만큼?  #사랑확인ing  #러브데스노트" + "</b>" + "<br>" + "<br>" +			  
					     "온화하고 겸손한 외관 아래 사랑하는 사람들에 대한 열정적인 헌신과 충성심을 가지고 있는 당신! " + "<br>" + "<br>" + "때때로 자기 자신의 강렬함, 특히 연인을 보호하고 돌보려는 자신의 격렬한 열망에 놀랄 수 있습니다. " + 
						 "감정이 매우 깊은 당신은 당신의 연인이 자신에게 얼마나 중요한지를 표현하기 위한 단어를 찾는데 어려움을 겪을 수 있습니다. 하지만 당신은 매일 백만 가지의 작은 방법으로 연인에게 자신의 애정을 보여줍니다. " + "<br>" + "<br>" +
					     "사랑하는 사람들의 삶을 더 낫고 더 즐겁게 만들고자 하는 당신은 저녁 식사 준비부터 주말여행 준비까지 가장 지루한 일조차도 진심 어린 사랑과 보살핌의 몸짓으로 바꿀 수 있습니다. " + 
						 "건강한 장기간의 관계에 필요한 노력의 양을 현실적으로 인식하고, 자신이 소중히 여기는 사람과의 지속적인 유대감을 형성하는데 필요한 일을 기꺼이 하는 것 이상으로 합니다."
						
						 + "<b>" + "<br>"+  "<br>" + "<hr>" +  "<br>"+ "<< 나와 잘맞는 BEST MBTI 유형 추천 >> " + "<br>"+ "<br>"
						 + " 1순위 : 새로운 아이디어로 나를 기쁘게 해 줄 ENTP ❤❤❤❤❤ "+ "<br>"+  "<br>"
						 + " 2순위 : 당신과의 사랑에 모든 걸 바칠 ENFP ❤❤❤❤♡"+ "<br>"+  "<br>"
						 + " 3순위 : 똑부러지면서 유머러스한 INTP ❤❤❤♡♡"+ "</b>"
						 , "");
			
		} else if(mbtiResult.equals("ISFP")) {
			
			testResult = new Test("./resources/images/mbtiResult/ISFP_ResultImg.png", 
								  "귀차니즘 만렙 프로긍정러", 
								  "ISFP", 
								  
								  "<b>" + "#집순이집돌이   #세미관종   #그려~ 다 좋어~" + "</b>" + "<br>" + "<br>" +		  
					     "따뜻하고 열정적인 당신! " + "<br>" + "<br>" + "당신은 꽤 신비롭고 알아가기가 어렵습니다. 매우 감정적인 사람으로 표현하기보다 듣는 것을 선호합니다. 자기 자신의 감정으로 상황의 분위기를 지시하는 것에 거의 관심을 두지 않고 대신 자신의 연인에게 집중합니다. " + 
						 "자상하고 충성스러운 당신은 재미난 작은 방법으로 연인을 놀라게 할 수 있는 방법을 찾는 것을 좋아합니다. 연인과 시간을 보내는 것을 진심으로 즐기고, 연인이 자신의 보살핌을 받고 있고 특별하다는 것을 알기를 원합니다. " +   "<br>"+  "<br>"+
					     "그리고 연인이 이것을 분명히 아는 것이 중요합니다. 당신은 감사를 절대 바라지 않겠지만, 감사를 듣지 않으면 마음이 아플 수 있습니다. 이러한 표현은 반드시 언어적일 필요는 없습니다. 당신은 말이 아닌 행동을 믿습니다."
					     
					     + "<b>" + "<br>"+  "<br>" + "<hr>" +  "<br>"+ "<< 나와 잘맞는 BEST MBTI 유형 추천 >> " + "<br>"+ "<br>"
						 + " 1순위 : 사랑은 반대가 끌리는 법! ENTJ ❤❤❤❤❤ "+ "<br>"+  "<br>"
						 + " 2순위 : 당신의 믿음은 무한한 사랑으로 돌아올거에요 ESTJ ❤❤❤❤♡"+ "<br>"+  "<br>"
						 + " 3순위 : 매사에 신중한 INTJ ❤❤❤♡♡"+ "</b>"
						 , "");
			
		} else if(mbtiResult.equals("INFJ")) {
			
			testResult = new Test("./resources/images/mbtiResult/INFJ_ResultImg.png", 
								  "겉바속촉 연애꿈나무", 
								  "INFJ", 
								  
								  "<b>" + "#짝사랑 전문   #덕질 전문   #표정관리고수"+ "</b>"  + "<br>" + "<br>" +			  
					     "사람과의 관계에서 깊이와 의미를 찾는 당신! " + "<br>" + "<br>" + "연인과의 관계에서도 다르지 않습니다. 활기차고 생생한 상상력을 가진 것으로 알려진 성격 유형이지만, 진정한 사랑이 아닌 것에 기반을 둔 결혼에 안주하는 자신을 상상할 수는 없습니다. " + "<br>" + "<br>"+
						 "당신은 최고의 인연을 찾는 데 시간이 걸릴 수 있습니다. 어떤 사람들은 당신이 너무 까다롭다고 생각할 수 있고, 당신의 성격이 비현실적인 기대를 하기 쉽다는 것은 사실입니다. 완벽주의적이고 이상주의적인 성격으로, " +  
					     "당신은 궁극적으로 존재하지 않는 완벽한 인연이나 관계를 유지하려고 할 수 있습니다. 당신은 사랑을 표현하는 것을 두려워하지 않으며 온 마음을 다해 사랑을 느낍니다."
					     
					     + "<b>" + "<br>"+  "<br>" + "<hr>" +  "<br>"+ "<< 나와 잘맞는 BEST MBTI 유형 추천 >> " + "<br>"+ "<br>"
						 + " 1순위 : 밝고 쾌할하면서 깊이 있는 연인 ESTP ❤❤❤❤❤ "+ "<br>"+  "<br>"
						 + " 2순위 : 자유로운 영혼의 소유자 ESFP ❤❤❤❤♡"+ "<br>"+  "<br>"
						 + " 3순위 : 때로는 정열적이고, 때로는 차분한   ISTP ❤❤❤♡♡"+ "</b>"
						 , "");
			
		} else if(mbtiResult.equals("INFP")) {
			
			testResult = new Test("./resources/images/mbtiResult/INFP_ResultImg.png", 
								  "망상에 사는 프로 연애 철벽러", 
								  "INFP", 
								  
								  "<b>" +"#사랑의바보   #연애기준 오조오억개   #365일 프로망상러" + "</b>" + "<br>" + "<br>" +		  
					     "로맨스에 관한 한 몽상가이자 이상주의자인 당신! " + "<br>" + "<br>" + "당신은 진정한 사랑의 힘과 아름다움을 믿습니다. 높은 기대를 가지고 로맨스의 세계에 접근한다고 해도 과언이 아닙니다. " + 
						 "다른 사람과 그들의 내면을 공유하는 것이 어떤 느낌일지 상상하면서, 완벽한 관계에 대한 공상에 몇 년을 보냈을지도 모릅니다. 당신은 단순히 연인을 찾는 것이 아니라, 소울메이트와 연결되기를 원합니다. " + "<br>" + "<br>" +
					     "사려 깊고 개방적인 성격으로, 일반적으로 모든 종류의 사람들과 어울리는 것을 고려합니다. 당신은 외모, 사회적 지위와 같은 잠재적인 연인의 피상적인 특성을 무시하고 더 깊고 의미 있는 궁합의 신호에 집중할 수 있는 능력에 자부심을 느낍니다."
					     
					     + "<b>" + "<br>"+  "<br>" + "<hr>" +  "<br>"+ "<< 나와 잘맞는 BEST MBTI 유형 추천 >> " + "<br>"+ "<br>"
						 + " 1순위 : 당신의 믿음은 무한한 사랑으로 돌아올거에요 ESTJ ❤❤❤❤❤ "+ "<br>"+  "<br>"
						 + " 2순위 : 섬세하면서 즐거운 연애를 하고 싶다면 ENTJ ❤❤❤❤♡"+ "<br>"+  "<br>"
						 + " 3순위 : 오후 햇살처럼 포근하고 잔잔한 감성의 연애는 INTJ ❤❤❤♡♡"+ "</b>"
						 , "");
			
		} else if(mbtiResult.equals("INTJ")) {
			
			testResult = new Test("./resources/images/mbtiResult/INTJ_ResultImg.png", 
						 		  "고집만렙 연애분석가", 
						 		  "INTJ", 
						 		  
						 		 "<b>" + "#안들린다..안들린다..  #츤데레    #분석성애자" + "</b>" + "<br>" + "<br>" +			  
					     "사랑을 표현하는 것보다 사랑에 대해 생각하는 데 더 많은 시간을 보내는 당신! " + "<br>" + "<br>" + "전략적으로 명확한 목표와 목표를 달성하기 위한 계획을 가지고 대부분의 과제를 수행하는 방식으로 로맨스에 접근합니다. " + 
						 "순수하게 합리적인 세상에서, 이 접근법은 완전무결할 것입니다. 애석하게도, 사랑은 이성적인 것이 거의 없고, 당신은 인간의 본성과 애정의 예측 불가능성을 간과하거나 잘못 해석할 위험이 있습니다. " + "<br>" + "<br>" +
						 "이러한 성격 유형을 가진 사람들에게 적합한 애인을 찾는 것은 어려울 수 있습니다. 하지만 어떤 관계에 잠재력이 있다고 믿는다면, 당신은 그것이 편안한 공간에서 벗어나게 할지라도, 그것에 모든 것을 바칠 수 있습니다."
						 
						 + "<b>" + "<br>"+  "<br>" + "<hr>" +  "<br>"+ "<< 나와 잘맞는 BEST MBTI 유형 추천 >> " + "<br>"+ "<br>"
						 + " 1순위 : 자유로운 영혼의 소유자, 나만의 연예인 ESFP ❤❤❤❤❤ "+ "<br>"+  "<br>"
						 + " 2순위 : 예측불가, 짜릿한 데이트는 ESTP ❤❤❤❤♡"+ "<br>"+  "<br>"
						 + " 3순위 : 따뜻하게 당신을 챙겨 줄 ISFP ❤❤❤♡♡"+ "</b>"
						 , "");
			
		} else if(mbtiResult.equals("INTP")) {
			
			testResult = new Test("./resources/images/mbtiResult/ESTP_ResultImg.png", 
						 		  "연애성공률 1% 나르시스트", 
						 		  "INTP", 
						 		  
						 		 "<b>" + "#나 자신 사랑해     #무의식 팩폭러    #나님짱" + "</b>" + "<br>" + "<br>" +		
						 "두뇌가 명석하고 내성적인 것처럼 보이는 당신! " + "<br>" + "<br>" + "하지만 장난스럽고 창의적인 면 또한 가지고 있습니다. 독창성을 사용하여 상황을 신선하게 유지하고 연인이 특별하다고 느끼게 하는 영리하고 예상치 못한 방법들을 생각해 낼 수 있습니다. " + "<br>"+ "<br>" +
						 "당신이 생각하는 이상적인 로맨틱한 연인은 단지 시간을 함께 보낼 수 있는 사람이 아닌 자신의 생각에 도전할 수 있는 동등한 사람입니다. " + 
						 "당신은 자신의 삶이 배움과 성장을 추구하며 보내기를 원하는데 사랑하는 사람이 이 사명을 공유할 뿐만 아니라 적극적으로 격려하기를 바랍니다."
						 
						 + "<b>" + "<br>"+  "<br>" + "<hr>" +  "<br>"+ "<< 나와 잘맞는 BEST MBTI 유형 추천 >> " + "<br>"+ "<br>"
						 + " 1순위 : 당신에게 열렬한 용기를 북돋아 줄  ESFJ ❤❤❤❤❤ "+ "<br>"+  "<br>"
						 + " 2순위 : 감정에 솔직하고 직설적인  ENFJ ❤❤❤❤♡"+ "<br>"+  "<br>"
						 + " 3순위 : 섬세한 감성의 소유자  ISFJ ❤❤❤♡♡"+ "</b>"
						 , "");
		}
		
		session.setAttribute("testResult", testResult);
		
		return "test/mbtiResultView";
	}
	
	// MBTI 테스트 결과 업데이트 서비스
	@RequestMapping("updateMbti.te")
	public String updateMbti(Test t, Model model, HttpSession session) {

		if(t.getMbtiUser().equals("")) { // 로그인한 회원이 아닌 경우
			
			// alert "로그인한 회원만 이용 가능한 서비스입니다."
			// 로그인 페이지로 이동
			session.setAttribute("alertMsg", "로그인한 회원만 이용 가능한 서비스입니다.");

			return "member/login";
			
		} else { // 로그인한 회원일 경우
			
			int result = testService.updateMbti(t);

			if(result > 0) { // MBTI 테스트 결과 업데이트 성공
			
				// alert "MBTI가 성공적으로 업데이트 되었습니다."
				Member updateMem = memberService.loginMember((Member)session.getAttribute("loginUser"));
				session.setAttribute("loginUser", updateMem);

				// 메인페이지로 이동
				session.setAttribute("alertMsg", "MBTI가 성공적으로 업데이트 되었습니다.");

				return "main";
				
			} else { // MBTI 테스트 결과 업데이트 실패 => 에러페이지로 포워딩

				model.addAttribute("errorMsg", "MBTI 테스트 결과 업데이트 실패");

				return "common/errorPage";
			}
		}
	}
}