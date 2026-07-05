package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bhi implements oh7 {
    public final zgi a;
    public final int b;
    public final Integer c;
    public final int d;

    public bhi(zgi zgiVar, int i, Integer num) {
        zgiVar.getClass();
        this.a = zgiVar;
        this.b = i;
        this.c = num;
        int i2 = zgiVar.e;
        this.d = i2;
        if (i < 0) {
            mr9.q(grc.u("The minimum number of digits (", i, ") is negative"));
            throw null;
        }
        if (i2 >= i) {
            if (num == null || num.intValue() > i) {
                return;
            }
            poc.n("The space padding (", num, ") should be more than the minimum number of digits (", i, 41);
            throw null;
        }
        throw new IllegalArgumentException(("The maximum number of digits (" + i2 + ") is less than the minimum number of digits (" + i + ')').toString());
    }

    @Override // defpackage.oh7
    public final af4 a() {
        drd drdVar = this.a.a;
        af4 af4Var = new af4();
        int i = this.b;
        if (i < 0) {
            mr9.q(grc.u("The minimum number of digits (", i, ") is negative"));
            return null;
        }
        if (i <= 9) {
            return this.c != null ? new af4() : af4Var;
        }
        mr9.q(grc.u("The minimum number of digits (", i, ") exceeds the length of an Int"));
        return null;
    }

    @Override // defpackage.oh7
    public final auc b() {
        Integer numValueOf = Integer.valueOf(this.b);
        Integer numValueOf2 = Integer.valueOf(this.d);
        zgi zgiVar = this.a;
        return t9e.x(numValueOf, numValueOf2, this.c, zgiVar.a, zgiVar.b, false);
    }

    @Override // defpackage.oh7
    public final /* bridge */ /* synthetic */ h1 c() {
        return this.a;
    }
}
