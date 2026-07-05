package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class blh {
    public static final xih i = new xih(2);
    public final int a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final afh h;

    public blh(int i2, String str, String str2, long j, long j2, long j3, boolean z, int i3) {
        j3 = (i3 & 32) != 0 ? System.currentTimeMillis() : j3;
        z = (i3 & 64) != 0 ? true : z;
        this.a = i2;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = z;
        if (str.length() == 0 && str2.length() == 0) {
            sz6.p("Either pre or post text must not be empty");
            throw null;
        }
        this.h = (str.length() != 0 || str2.length() <= 0) ? (str.length() <= 0 || str2.length() != 0) ? afh.G : afh.F : afh.E;
    }

    public final teh a() {
        afh afhVar = this.h;
        afh afhVar2 = afh.F;
        teh tehVar = teh.H;
        if (afhVar != afhVar2) {
            return tehVar;
        }
        long j = this.e;
        if (!kkh.d(j)) {
            return tehVar;
        }
        long j2 = this.d;
        return kkh.d(j2) ? ((int) (j2 >> 32)) > ((int) (j >> 32)) ? teh.E : teh.F : (((int) (j2 >> 32)) == ((int) (j >> 32)) && ((int) (j2 >> 32)) == this.a) ? teh.G : tehVar;
    }
}
