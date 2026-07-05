package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class pp0 implements ymf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pp0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ymf
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new f2((Object[]) obj);
            case 1:
                return yb5.v((pz7) obj);
            case 2:
                return (Iterator) obj;
            case 3:
                return new dnf(0, obj);
            default:
                return new j6a((CharSequence) obj);
        }
    }
}
