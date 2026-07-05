package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k79 {
    public final int a;
    public final long b;

    public /* synthetic */ k79(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public static k79 a(int i, int i2, String str) {
        if (i >= i2) {
            return null;
        }
        long j = 0;
        int i3 = i;
        while (i3 < i2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j = (j * 10) + ((long) (cCharAt - '0'));
            if (j > 2147483647L) {
                return null;
            }
            i3++;
        }
        if (i3 == i) {
            return null;
        }
        return new k79(j, i3);
    }

    public static k79 b(xd7 xd7Var, ssc sscVar) {
        xd7Var.p(sscVar.a, 0, 8);
        sscVar.M(0);
        return new k79(sscVar.m(), sscVar.q());
    }

    public k79(long j, int i) {
        this.b = j;
        this.a = i;
    }
}
