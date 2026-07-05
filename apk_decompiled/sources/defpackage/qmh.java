package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qmh {
    public Integer a;
    public int b;
    public long c;
    public long d;
    public Long e;

    public final void a(Integer num, long j) {
        Integer num2 = this.a;
        int iIntValue = num.intValue();
        if (num2 != null && iIntValue == num2.intValue()) {
            return;
        }
        if (num2 == null) {
            this.b = 0;
            this.c = j;
            this.d = 1200L;
            this.a = num;
            this.e = Long.valueOf(j);
            return;
        }
        if (num.intValue() < num2.intValue()) {
            this.a = num;
            this.d = 0L;
            this.e = Long.valueOf(j);
            return;
        }
        Long l = this.e;
        long jLongValue = l != null ? j - l.longValue() : 3000L;
        Integer numB = b(j);
        this.b = numB != null ? numB.intValue() : num.intValue();
        this.c = j;
        this.d = wd6.f0(jLongValue, 300L, 3000L);
        this.a = num;
        this.e = Long.valueOf(j);
    }

    public final Integer b(long j) {
        Integer num = this.a;
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        long j2 = this.d;
        if (j2 <= 0) {
            return num;
        }
        double dC0 = wd6.c0((j - this.c) / j2, 0.0d, 1.0d);
        int i = this.b;
        return Integer.valueOf((int) ((((double) (iIntValue - i)) * dC0) + ((double) i)));
    }
}
