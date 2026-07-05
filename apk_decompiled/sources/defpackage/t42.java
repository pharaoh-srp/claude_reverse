package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class t42 implements n42 {
    public final boolean a;
    public final String b;

    public t42(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    @Override // defpackage.n42
    public final boolean a(h1f h1fVar) {
        int i;
        boolean z = this.a;
        String strO = this.b;
        if (z && strO == null) {
            strO = h1fVar.o();
        }
        f1f f1fVar = h1fVar.b;
        if (f1fVar != null) {
            Iterator it = f1fVar.a().iterator();
            i = 0;
            while (it.hasNext()) {
                h1f h1fVar2 = (h1f) ((j1f) it.next());
                if (strO == null || h1fVar2.o().equals(strO)) {
                    i++;
                }
            }
        } else {
            i = 1;
        }
        return i == 1;
    }

    public final String toString() {
        return this.a ? ij0.j("only-of-type <", this.b, ">") : "only-child";
    }
}
