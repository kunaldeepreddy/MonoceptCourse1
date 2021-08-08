package factory;

public class SMPostService {

	public static void main(String[] args)
    {
		SocialMediaPostFactory SMPFactory = new SocialMediaPostFactory();
		SocialMediaPost socialMedia = SMPFactory.createPost("facebook");
		socialMedia.postMessage();
		SocialMediaPost socialMedia1 = SMPFactory.createPost("instagram");
		socialMedia1.postMessage();
		SocialMediaPost socialMedia2 = SMPFactory.createPost("twitter");
		socialMedia2.postMessage();
    }
	
}
