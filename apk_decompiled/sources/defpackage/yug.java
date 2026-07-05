package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class yug implements ymf, kh6 {
    public final ymf a;
    public final int b;
    public final int c;

    public yug(ymf ymfVar, int i, int i2) {
        ymfVar.getClass();
        this.a = ymfVar;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            mr9.q(grc.p(i, "startIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 < 0) {
            mr9.q(grc.p(i2, "endIndex should be non-negative, but is "));
            throw null;
        }
        if (i2 >= i) {
            return;
        }
        mr9.q(grc.o(i2, i, "endIndex should be not less than startIndex, but was ", " < "));
        throw null;
    }

    @Override // defpackage.kh6
    public final ymf a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? this : new yug(this.a, i3, i + i3);
    }

    @Override // defpackage.kh6
    public final ymf b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return i >= i2 - i3 ? tm6.a : new yug(this.a, i3 + i, i2);
    }

    @Override // defpackage.ymf
    public final Iterator iterator() {
        return new uvb(this);
    }
}
