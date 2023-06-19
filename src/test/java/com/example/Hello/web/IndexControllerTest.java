package com.example.Hello.web;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class IndexControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void 메인페이지_로딩() {

        // when
        String body = this.restTemplate.getForObject("/", String.class);

        // then
        // spring 2.7 이상에서 mustache 한글 깨짐. 2.6 이하 필요
        // resource : https://velog.io/@jihye/mustache%EC%97%90%EC%84%9C-%ED%95%9C%EA%B8%80%EC%9D%B4-%EA%B9%A8%EC%A7%84%EB%8B%A4-%EB%9A%AB%EB%9A%8F
        Assertions.assertThat(body).contains("web service using spring boot");
    }
}