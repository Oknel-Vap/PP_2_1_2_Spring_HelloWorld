import org.springframework.stereotype.Component;

@Component
public class Cat {

    private String catVoice;

    public Cat() {

    }

    public String getVoice() {
        return catVoice;
    }

    public void setCatVoice(String catVoice) {
        this.catVoice = catVoice;
    }
}
