package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zgi extends h1 {
    public final drd a;
    public final String b;
    public final Integer c;
    public final kcc d;
    public final int e;

    public zgi(drd drdVar, int i, kcc kccVar, int i2) {
        int i3;
        String str = drdVar.b;
        Integer num = (i2 & 16) != 0 ? null : 0;
        kccVar = (i2 & 32) != 0 ? null : kccVar;
        str.getClass();
        this.a = drdVar;
        this.b = str;
        this.c = num;
        this.d = kccVar;
        if (i < 10) {
            i3 = 1;
        } else if (i < 100) {
            i3 = 2;
        } else {
            if (i >= 1000) {
                sz6.p(grc.u("Max value ", i, " is too large"));
                throw null;
            }
            i3 = 3;
        }
        this.e = i3;
    }

    @Override // defpackage.h1
    public final drd a() {
        return this.a;
    }

    @Override // defpackage.h1
    public final Object b() {
        return this.c;
    }

    @Override // defpackage.h1
    public final String c() {
        return this.b;
    }

    @Override // defpackage.h1
    public final kcc d() {
        return this.d;
    }
}
