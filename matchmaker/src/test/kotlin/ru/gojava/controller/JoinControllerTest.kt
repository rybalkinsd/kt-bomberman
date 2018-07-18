package ru.gojava.controller

import org.hamcrest.Matchers
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status


/**
 * Created by Sergey Rybalkin on 26/11/17.
 */
@RunWith(SpringRunner::class)
@WebMvcTest
class JoinControllerTest {

    @Autowired
    lateinit var mock: MockMvc

    @Test
    fun `single join`() {
        mock.perform(post("/matchmaker/join")
                    .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                    .content("name=Alice"))
                .andDo { print(it) }
                .andExpect { status().isOk }
    }

    @Test
    fun `size after several joins`() {
        repeat(2) {
            `single join`()
        }

        mock.perform(get("/matchmaker/queue"))
                .andDo { print(it) }
                .andExpect(content().string(Matchers.isOneOf("2", "3")))
    }

}