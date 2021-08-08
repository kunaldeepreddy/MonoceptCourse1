package factory;

public class TwitterPost implements SocialMediaPost {
	@Override
	public void postMessage()
    {
        System.out.println("posting through twitter");
    }
}
