package javabasic;
//인터페이스 예제
interface Human {
	String speakTo();

}
class Call {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Mom extends Call implements Human {
	public String speakTo() {
		return "Mom";
	}
}

class Dad extends Call implements Human {
	public String speakTo() {
		return "Dad";
	}
}

class SpeakTo {
    void feed(Human human) {  // 호랑이가 오면 사과를 던져 준다.
        System.out.println("say hello to " + human.speakTo());
    }
}

public class Ex00 {
    public static void main(String[] args) {
        SpeakTo speakto = new SpeakTo();
		Mom mom = new Mom();
		Dad dad = new Dad();
        speakto.feed(mom);  // feed apple 출력
        speakto.feed(dad);  // feed banana 출력
    }
}