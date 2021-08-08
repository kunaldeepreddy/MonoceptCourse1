package factory;

public class FacebookPost implements SocialMediaPost {
	@Override
	public void postMessage()
    {
        System.out.println("posting through facebook");
    }
}
