package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class nvc {
    public final boolean a;
    public final boolean b;

    public nvc(int i) {
        boolean z = (i & 1) == 0;
        boolean z2 = (i & 2) == 0;
        this.a = z;
        this.b = z2;
    }
}
