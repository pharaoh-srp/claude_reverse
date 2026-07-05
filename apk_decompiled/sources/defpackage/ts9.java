package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class ts9 implements a08, Serializable {
    public final int E;

    public ts9(int i) {
        this.E = i;
    }

    @Override // defpackage.a08
    public final int getArity() {
        return this.E;
    }

    public final String toString() {
        String strJ = jce.a.j(this);
        strJ.getClass();
        return strJ;
    }
}
