import static org.lwjgl.opengl.GL11.*;

public class Sprite {

    private int textureid;

    public Sprite()
    {
        textureid = glGenTextures();
    }
}
