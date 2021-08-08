package factory;

public class SocialMediaPostFactory {
	public SocialMediaPost createPost(String platform)
    {
        if (platform == null || platform.isEmpty())
            return null;
        if ("twitter".equals(platform)) {
            return new TwitterPost();
        }
        else if ("facebook".equals(platform)) {
            return new FacebookPost();
        }
        else if ("instagram".equals(platform)) {
            return new InstagramPost();
        }
        return null;
    }
}