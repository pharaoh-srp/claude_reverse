package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class rgc extends ap0 {
    public final yc0 E;
    public final int F;

    public rgc(yc0 yc0Var, int i) {
        this.E = yc0Var;
        this.F = i;
    }

    @Override // defpackage.ap0
    public final int a() {
        return 1;
    }

    @Override // defpackage.ap0
    public final void e(int i, Object obj) {
        throw new IllegalStateException();
    }

    public final int g() {
        return this.F;
    }

    @Override // defpackage.ap0
    public final Object get(int i) {
        if (i == this.F) {
            return this.E;
        }
        return null;
    }

    public final Object h() {
        return this.E;
    }

    @Override // defpackage.ap0, java.lang.Iterable
    public final Iterator iterator() {
        return new dnf(2, this);
    }
}
