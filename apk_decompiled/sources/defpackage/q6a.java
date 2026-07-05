package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class q6a implements Iterator {
    public final String E;
    public a7a F = null;
    public int G = 0;
    public int H = 0;
    public final /* synthetic */ fj0 I;

    public q6a(fj0 fj0Var, String str) {
        this.I = fj0Var;
        this.E = str;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        s6f s6fVar;
        if (this.F == null) {
            String str = this.E;
            int length = str.length();
            while (true) {
                int i = this.G;
                if (i >= length) {
                    break;
                }
                char cCharAt = str.charAt(i);
                fj0 fj0Var = this.I;
                if (cCharAt == ':') {
                    s6fVar = (jli) fj0Var.E;
                } else if (cCharAt == '@') {
                    s6fVar = (lja) fj0Var.G;
                } else if (cCharAt != 'w') {
                    fj0Var.getClass();
                    s6fVar = null;
                } else {
                    s6fVar = (cm4) fj0Var.F;
                }
                int i2 = this.G;
                if (s6fVar != null) {
                    a7a a7aVarH = s6fVar.h(i2, this.H, str);
                    if (a7aVarH != null) {
                        this.F = a7aVarH;
                        int i3 = a7aVarH.c;
                        this.G = i3;
                        this.H = i3;
                        break;
                    }
                    this.G++;
                } else {
                    this.G = i2 + 1;
                }
            }
        }
        return this.F != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            pmf.d();
            return null;
        }
        a7a a7aVar = this.F;
        this.F = null;
        return a7aVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("remove");
    }
}
