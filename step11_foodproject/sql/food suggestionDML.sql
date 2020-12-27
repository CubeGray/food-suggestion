
insert into category values ('c_1','한식');
insert into category values ('c_2','양식');
insert into category values ('c_3','일식');
insert into category values ('c_4','중식');
commit;

insert into specific values ('s_1','국물류','c_1');
insert into specific values ('s_2','분식류','c_1');
insert into specific values ('s_3','패스트푸드','c_2');
insert into specific values ('s_4','파스타','c_2');
insert into specific values ('s_5','초밥','c_3');
insert into specific values ('s_6','돈가스','c_3');
insert into specific values ('s_7','중식','c_4');
commit;

insert into restaurant values ('r_1','신선설농탕 서초점','s_1','https://map.kakao.com/?urlX=504323&urlY=1107260&urlLevel=3&itemId=11119974&q=%EC%8B%A0%EC%84%A0%EC%84%A4%EB%86%8D%ED%83%95%20%EC%84%9C%EC%B4%88%EC%A0%90&srcid=11119974&map_type=TYPE_MAP','https://place.map.kakao.com/11119974');
insert into restaurant values ('r_2','북창동 순두부 서초점','s_1','https://map.kakao.com/?urlX=504323&urlY=1107260&urlLevel=3&itemId=11119974&q=%EC%8B%A0%EC%84%A0%EC%84%A4%EB%86%8D%ED%83%95%20%EC%84%9C%EC%B4%88%EC%A0%90&srcid=11119974&map_type=TYPE_MAP','https://place.map.kakao.com/20197153');
insert into restaurant values ('r_3','국대떡볶이','s_2','https://map.kakao.com/?urlX=504085&urlY=1107186&urlLevel=3&itemId=13025838&q=%EA%B5%AD%EB%8C%80%EB%96%A1%EB%B3%B6%EC%9D%B4%20%EC%84%9C%EC%B4%88%EB%82%A8%EB%B6%80%EC%A0%90&srcid=13025838&map_type=TYPE_MAP','https://place.map.kakao.com/13025838');
insert into restaurant values ('r_4','바르다김선생 남부터미널점','s_2','https://map.kakao.com/?urlX=503265&urlY=1107627&urlLevel=3&itemId=26404615&q=%EB%B0%94%EB%A5%B4%EB%8B%A4%EA%B9%80%EC%84%A0%EC%83%9D%20%EB%82%A8%EB%B6%80%ED%84%B0%EB%AF%B8%EB%84%90%EC%A0%90&srcid=26404615&map_type=TYPE_MAP','https://place.map.kakao.com/26404615');
insert into restaurant values ('r_5','왕떡볶이','s_2','https://map.kakao.com/?urlX=504785&urlY=1107268&urlLevel=3&itemId=16329157&q=%EC%99%95%EB%96%A1%EB%B3%B6%EC%9D%B4&srcid=16329157&map_type=TYPE_MAP','https://place.map.kakao.com/16329157');
insert into restaurant values ('r_6','롯데리아 남부터미널점','s_3','https://map.kakao.com/?urlX=503522&urlY=1107140&urlLevel=3&itemId=7860341&q=%EB%A1%AF%EB%8D%B0%EB%A6%AC%EC%95%84%20%EB%82%A8%EB%B6%80%ED%84%B0%EB%AF%B8%EB%84%90%EC%A0%90&srcid=7860341&map_type=TYPE_MAP','https://place.map.kakao.com/7860341');
insert into restaurant values ('r_7','KFC 서초동점','s_3','https://map.kakao.com/?urlX=503345&urlY=1107093&urlLevel=3&itemId=8016870&q=KFC%20%EC%84%9C%EC%B4%88%EB%8F%99%EC%A0%90&srcid=8016870&map_type=TYPE_MAP','https://place.map.kakao.com/8016870');
insert into restaurant values ('r_8','하일아트레스토랑','s_4','https://map.kakao.com/?urlX=503504&urlY=1106214&urlLevel=3&itemId=13597701&q=%ED%95%98%EC%9D%BC%EC%95%84%ED%8A%B8%EB%A0%88%EC%8A%A4%ED%86%A0%EB%9E%91&srcid=13597701&map_type=TYPE_MAP','https://place.map.kakao.com/13597701');
insert into restaurant values ('r_9','더스파케티하우스 서초점','s_4','https://map.kakao.com/?urlX=506794&urlY=1107327&urlLevel=3&itemId=1718253066&q=%EB%8D%94%EC%8A%A4%ED%8C%8C%EA%B2%8C%ED%8B%B0%ED%95%98%EC%9A%B0%EC%8A%A4%20%EC%84%9C%EC%B4%88%EC%A0%90&srcid=1718253066&map_type=TYPE_MAP','https://place.map.kakao.com/1718253066');
insert into restaurant values ('r_10','스시환','s_5','https://map.kakao.com/?urlX=503601&urlY=1107226&urlLevel=3&itemId=27062366&q=%EC%8A%A4%EC%8B%9C%ED%99%98&srcid=27062366&map_type=TYPE_MAP','https://place.map.kakao.com/27062366');
insert into restaurant values ('r_11','스시36.5','s_5','https://map.kakao.com/?urlX=503958&urlY=1107259&urlLevel=3&itemId=467722199&q=%EC%8A%A4%EC%8B%9C36.5&srcid=467722199&map_type=TYPE_MAP','https://place.map.kakao.com/467722199');
insert into restaurant values ('r_12','그림나베','s_6','https://map.kakao.com/?urlX=503561&urlY=1107312&urlLevel=3&itemId=2051492635&q=%EA%B7%B8%EB%A6%BC%EB%82%98%EB%B2%A0%20%EB%82%A8%EB%B6%80%ED%84%B0%EB%AF%B8%EB%84%90%EC%A0%90&srcid=2051492635&map_type=TYPE_MAP','https://place.map.kakao.com/2051492635');
insert into restaurant values ('r_13','믿을신','s_6','https://map.kakao.com/?urlX=503063&urlY=1108770&urlLevel=3&itemId=1743257699&q=%EB%AF%BF%EC%9D%84%EC%8B%A0&srcid=1743257699&map_type=TYPE_MAP','https://place.map.kakao.com/1743257699');
insert into restaurant values ('r_14','송쉐프 르쁘띠','s_7','https://map.kakao.com/?urlX=503110&urlY=1108239&urlLevel=3&itemId=781438888&q=%EC%86%A1%EC%89%90%ED%94%84%20%EB%A5%B4%EC%81%98%EB%9D%A0&srcid=781438888&map_type=TYPE_MAP','https://place.map.kakao.com/781438888');
insert into restaurant values ('r_15','천지궁 서초점','s_7','https://map.kakao.com/?urlX=502892&urlY=1107163&urlLevel=3&itemId=13307801&q=%EC%B2%9C%EC%A7%80%EA%B6%81%20%EC%84%9C%EC%B4%88%EC%A0%90&srcid=13307801&map_type=TYPE_MAP','https://place.map.kakao.com/13307801');
commit;












