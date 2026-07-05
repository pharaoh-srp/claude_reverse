package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class jif {
    public final long a;
    public final long b;
    public final cu9 c;
    public final boolean d;
    public final ohf e;
    public final pa9 f;
    public final cvb g;
    public final ArrayList h;
    public int i;
    public int j;
    public int k;

    public jif(long j, long j2, cu9 cu9Var, boolean z, ohf ohfVar, pa9 pa9Var) {
        this.a = j;
        this.b = j2;
        this.c = cu9Var;
        this.d = z;
        this.e = ohfVar;
        this.f = pa9Var;
        int i = ika.a;
        this.g = new cvb(6);
        this.h = new ArrayList();
        this.i = -1;
        this.j = -1;
        this.k = -1;
    }

    public final int a(int i, c56 c56Var, c56 c56Var2) {
        if (i == -1) {
            int iOrdinal = dwk.k(c56Var, c56Var2).ordinal();
            if (iOrdinal == 0) {
                return this.k - 1;
            }
            if (iOrdinal == 1) {
                return this.k;
            }
            if (iOrdinal != 2) {
                wg6.i();
                return 0;
            }
        }
        return i;
    }
}
