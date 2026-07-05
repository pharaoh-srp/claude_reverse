package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jkb {
    public static jkb h;
    public final fu9 a;
    public final tkh b;
    public final fz5 c;
    public final wt7 d;
    public final tkh e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public jkb(fu9 fu9Var, tkh tkhVar, fz5 fz5Var, wt7 wt7Var) {
        this.a = fu9Var;
        this.b = tkhVar;
        this.c = fz5Var;
        this.d = wt7Var;
        this.e = yfd.Y(tkhVar, fu9Var);
    }

    public final long a(int i, long j) {
        int i2;
        float f = this.g;
        float f2 = this.f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = kkb.a;
            long jB = sl4.b(0, 0, 0, 0, 15);
            tkh tkhVar = this.e;
            fz5 fz5Var = this.c;
            float fB = ez1.i(str, tkhVar, jB, fz5Var, this.d, 1, 96).b();
            float fB2 = ez1.i(kkb.b, this.e, sl4.b(0, 0, 0, 0, 15), fz5Var, this.d, 2, 96).b() - fB;
            this.g = fB;
            this.f = fB2;
            f2 = fB2;
            f = fB;
        }
        if (i != 1) {
            int iRound = Math.round((f2 * (i - 1)) + f);
            i2 = iRound >= 0 ? iRound : 0;
            int iG = rl4.g(j);
            if (i2 > iG) {
                i2 = iG;
            }
        } else {
            i2 = rl4.i(j);
        }
        return sl4.a(rl4.j(j), rl4.h(j), i2, rl4.g(j));
    }
}
