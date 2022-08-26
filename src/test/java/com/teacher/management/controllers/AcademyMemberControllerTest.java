package com.teacher.management.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.teacher.management.models.AcademyMember;
import com.teacher.management.util.MockData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AcademyMemberController.class)
public class AcademyMemberControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockData mockData;

    @Test
    public void shouldCreateAcademyMember() throws Exception {
        AcademyMember academyMember = mockData.createAcademyMember();

        mockMvc.perform(post("/api/academyMembers/addAcademyMember").contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(academyMember)))
                .andExpect(status().isCreated())
                .andDo(print());
    }

    @Test
    public void shouldReturnAcademyMember() throws Exception {
        int userId = 1;
        String tipMembru = "MembruTest1";
        AcademyMember academyMember = mockData.createAcademyMember();

        this.mockMvc.perform(get("/api/academyMembers/getAcademyMembersByUser/{tipMembru}/{userId}")).andExpect(status().isOk())
                .andExpect(jsonPath("$.userId").value(userId))
                .andExpect(jsonPath("$.numeAcademie").value(academyMember.getNumeAcademie()))
                .andExpect(jsonPath("$.punctaj").value(academyMember.getPunctaj()))
                .andExpect(jsonPath("$.tipMembru").value(tipMembru))
                .andExpect(jsonPath("$.numePrenume").value(academyMember.getNumePrenume()))
                .andDo(print());
    }
}
