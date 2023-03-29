import requests

def get_instagram_followers(username):
    url = f'https://www.instagram.com/{username}/?__a=1'
    response = requests.get(url)
    json_data = response.json()
    return json_data['graphql']['user']['edge_followed_by']['count']

def get_twitch_followers(username):
    url = f'https://api.twitch.tv/helix/users?login={username}'
    headers = {'Client-ID': 'your-client-id'}
    response = requests.get(url, headers=headers)
    json_data = response.json()
    return json_data['data'][0]['followers_count']

def get_twitter_followers(username):
    url = f'https://api.twitter.com/2/users/by/username/{username}?user.fields=public_metrics'
    headers = {'Authorization': 'Bearer your-bearer-token'}
    response = requests.get(url, headers=headers)
    json_data = response.json()
    return json_data['public_metrics']['followers_count']

def get_youtube_subscribers(channel):
    url = f'https://www.googleapis.com/youtube/v3/channels?part=statistics&forUsername={channel}&key=your-api-key'
    response = requests.get(url)
    json_data = response.json()
    return json_data['items'][0]['statistics']['subscriberCount']

//You will need to provide your own API keys and tokens for Twitch, Twitter, and YouTube. Also,the Twitch API requires a Client-ID header and the Twitter API requires a Bearer token in the Authorization header.

You can use these functions by passing the appropriate username/channel as an argument://

instagram_followers = get_instagram_followers('instagram')
twitch_followers = get_twitch_followers('twitch')
twitter_followers = get_twitter_followers('twitter')
youtube_subscribers = get_youtube_subscribers('YouTube')
