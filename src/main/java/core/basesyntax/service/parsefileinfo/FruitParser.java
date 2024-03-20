package core.basesyntax.service.parsefileinfo;

import core.basesyntax.service.functionalityexpansion.ActivityTypeEnum;

public class FruitParser {
    private static final int ACTIVITY_INDEX = 0;
    private static final int NAME_INDEX = 1;
    private static final int QUANTITY_INDEX = 2;
    private static final String DIVIDER_SYMBOL = ",";

    public FruitInfo parseActivity(String activityString) {
        String[] activityTypeArray = activityString.split(DIVIDER_SYMBOL);
        ActivityTypeEnum activityType = ActivityTypeEnum
                .getByCode(activityTypeArray[ACTIVITY_INDEX]);
        String name = activityTypeArray[NAME_INDEX];
        int quantity = Integer.parseInt(activityTypeArray[QUANTITY_INDEX]);
        return new FruitInfo(activityType, name, quantity);
    }
}
