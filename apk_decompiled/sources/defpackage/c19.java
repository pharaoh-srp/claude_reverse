package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c19 implements Iterable, mm9 {
    public final /* synthetic */ int E;
    public final Object F;

    public /* synthetic */ c19(int i, Object obj) {
        this.E = i;
        this.F = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.E;
        Object obj = this.F;
        switch (i) {
            case 0:
                return new f2((Iterator) ((zy7) obj).a());
            default:
                return new f2((eq6) obj);
        }
    }
}
