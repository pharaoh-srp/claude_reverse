package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class wsj implements Iterator {
    public final /* synthetic */ int E;
    public int F = 0;
    public final /* synthetic */ Object G;

    public /* synthetic */ wsj(int i, Object obj) {
        this.E = i;
        this.G = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.E;
        Object obj = this.G;
        switch (i) {
            case 0:
                if (this.F < ((qsj) obj).E.length()) {
                }
                break;
            case 1:
                if (this.F < ((qsj) obj).E.length()) {
                }
                break;
            default:
                if (this.F < ((jqj) obj).r()) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i = this.E;
        Object obj = this.G;
        switch (i) {
            case 0:
                int i2 = this.F;
                String str = ((qsj) obj).E;
                if (i2 >= str.length()) {
                    pmf.d();
                } else {
                    int i3 = this.F;
                    this.F = i3 + 1;
                }
                break;
            case 1:
                if (this.F >= ((qsj) obj).E.length()) {
                    pmf.d();
                } else {
                    int i4 = this.F;
                    this.F = i4 + 1;
                }
                break;
            default:
                int i5 = this.F;
                jqj jqjVar = (jqj) obj;
                int iR = jqjVar.r();
                int i6 = this.F;
                if (i5 >= iR) {
                    pmf.h(grc.p(i6, "Out of bounds index: "));
                } else {
                    this.F = i6 + 1;
                }
                break;
        }
        return null;
    }
}
