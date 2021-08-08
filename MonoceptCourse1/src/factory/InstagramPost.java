package factory;

public class InstagramPost  implements SocialMediaPost {
	@Override
	public void postMessage()
    {
        System.out.println("posting through instagram");
    }
}
