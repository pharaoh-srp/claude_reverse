package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class op0 implements Iterable, mm9 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;

    public /* synthetic */ op0(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                return mwa.F((Object[]) obj);
            default:
                return ((ymf) obj).iterator();
        }
    }
}
