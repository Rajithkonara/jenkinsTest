import redis.clients.jedis.Jedis;

public class Jdeis {

    public static void main(String[] args)  {

        Jedis jedis = new Jedis("127.0.0.1", 6379);

        if (!jedis.isConnected()) {
            System.out.println("Connected to Redis");
            System.out.println(jedis.ping());
        } else {
            System.out.prin("Connection Error");
        }
    }

}
