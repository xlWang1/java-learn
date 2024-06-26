package Exercise.Exer1.exer3;

public enum OrderEnum {
    ADDSONG(1),
    TUICHU(4),
    SHANGYI(3), // 这里需要为SHANGYI赋值3
    TOTOP(2);

    private final int value;

    // 枚举构造函数
    OrderEnum(int value) {
        this.value = value;
    }

    // 获取枚举常量的值
    public int getValue() {
        return value;
    }
}
