package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class t29 implements kw9, Serializable {
    public final Object E;

    public t29(Object obj) {
        this.E = obj;
    }

    @Override // defpackage.kw9
    public final boolean b() {
        return true;
    }

    @Override // defpackage.kw9
    public final Object getValue() {
        return this.E;
    }

    public final String toString() {
        return String.valueOf(this.E);
    }
}
