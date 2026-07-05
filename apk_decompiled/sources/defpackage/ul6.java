package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class ul6 {
    public int a = 1;
    public final sjb b;
    public sjb c;
    public sjb d;
    public int e;
    public int f;

    public ul6(sjb sjbVar) {
        this.b = sjbVar;
        this.c = sjbVar;
    }

    public final void a() {
        this.a = 1;
        this.c = this.b;
        this.f = 0;
    }

    public final boolean b() {
        njb njbVarB = this.c.b.b();
        int iA = njbVarB.a(6);
        return !(iA == 0 || ((ByteBuffer) njbVarB.d).get(iA + njbVarB.a) == 0) || this.e == 65039;
    }
}
