package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class x42 {
    public static final /* synthetic */ int a = 0;

    static {
        Object hreVar;
        try {
            hreVar = Class.forName("java.lang.ClassValue");
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        if (!(hreVar instanceof hre)) {
            hreVar = Boolean.TRUE;
        }
        Object obj = Boolean.FALSE;
        if (hreVar instanceof hre) {
            hreVar = obj;
        }
    }
}
