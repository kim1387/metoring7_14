package kr.ac.kpu.metoring7_14.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//JSON 보통 snake_case를 많이 사용한다. camelCase도 쓴다. 사실 표준이 있는건 아님
//@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String id;
    private String pw;

    //@JsonProperty("phone_number")
    private String PhoneNumber;
    private String email;

//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getPw() {
//        return pw;
//    }
//
//    public void setPw(String pw) {
//        this.pw = pw;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "id='" + id + '\'' +
//                ", pw='" + pw + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }


}