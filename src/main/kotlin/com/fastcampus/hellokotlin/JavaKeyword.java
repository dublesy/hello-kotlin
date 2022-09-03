package com.fastcampus.hellokotlin;

import java.io.InputStream;

public class JavaKeyword {

    private InputStream in;
    private Boolean is;

    public InputStream getIn() {
        return in;
    }

    public void setIn(InputStream in) {
        this.in = in;
    }

    public Boolean getIs() {
        return is;
    }

    public void setIs(Boolean is) {
        this.is = is;
    }
}

// 도미니카 나라 do 예약어를 사용 자바에서 이미 사용하고 있기 때문에 사용 할 수가 없었음.
// 코틀린은 백틱으로 처리 하여 사용할 수 있음.
enum CountryCodeJava {
    kr, jp, us;
}
