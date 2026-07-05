package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c54 implements ymf {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ c54(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ymf
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((Iterable) obj).iterator();
            case 1:
                return new g96(new al7((bl7) obj));
            default:
                return new k6a(this);
        }
    }
}
