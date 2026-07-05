package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class fh6 implements ymf, kh6 {
    public final /* synthetic */ int a;
    public final ymf b;
    public final int c;

    public fh6(ymf ymfVar, int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = ymfVar;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                mr9.q(vb7.p("count must be non-negative, but was ", i, '.'));
                throw null;
            default:
                ymfVar.getClass();
                this.b = ymfVar;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                mr9.q(vb7.p("count must be non-negative, but was ", i, '.'));
                throw null;
        }
    }

    @Override // defpackage.kh6
    public final ymf a(int i) {
        int i2 = this.a;
        ymf ymfVar = this.b;
        int i3 = this.c;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new fh6(this, i, 1) : new yug(ymfVar, i3, i4);
            default:
                return i >= i3 ? this : new fh6(ymfVar, i, 1);
        }
    }

    @Override // defpackage.kh6
    public final ymf b(int i) {
        int i2 = this.a;
        ymf ymfVar = this.b;
        int i3 = this.c;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new fh6(this, i, 0) : new fh6(ymfVar, i4, 0);
            default:
                return i >= i3 ? tm6.a : new yug(ymfVar, i, i3);
        }
    }

    @Override // defpackage.ymf
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new eh6(this);
            default:
                return new eh6(this, (byte) 0);
        }
    }
}
