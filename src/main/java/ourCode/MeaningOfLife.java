package ourCode;

import thirdparty.ZenService;

public class MeaningOfLife {
    private ZenService zenService;

    public MeaningOfLife(ZenService zenService) {
        this.zenService = zenService;
    }

    public int reveal() throws ServiceUnavailableException {
        int possibleAnswer = zenService.getUltimateAnswer();
        if (possibleAnswer == Integer.MAX_VALUE) throw new ServiceUnavailableException("ZenService returned unreliable answer");
        return possibleAnswer;
    }

    public static void main(String[] args) throws ServiceUnavailableException {
        System.out.printf("The meaning of life is ...\n%d", new MeaningOfLife(new ZenService()).reveal());
    }
}
