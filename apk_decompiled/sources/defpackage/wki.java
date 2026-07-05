package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class wki {
    public final boolean a;
    public final int b;
    public final Throwable c;

    public wki(boolean z, int i, Throwable th, int i2) {
        i = (i2 & 2) != 0 ? 0 : i;
        th = (i2 & 4) != 0 ? null : th;
        this.a = z;
        this.b = i;
        this.c = th;
    }
}
