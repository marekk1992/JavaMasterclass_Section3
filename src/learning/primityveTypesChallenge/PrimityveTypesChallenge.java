package learning.primityveTypesChallenge;

public class PrimityveTypesChallenge {

    public static void main(String[] args) {

        byte ByteValue = 100;
        short ShortValue = 14000;
        int IntValue = 123_456;

        long longTotal = 50_000L + 10L * (ByteValue + ShortValue + IntValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1_000 + 10 *
                (ByteValue + ShortValue + IntValue));
    }
}
