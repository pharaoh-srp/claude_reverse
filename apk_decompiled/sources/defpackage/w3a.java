package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w3a {
    public static y3a a(a4a a4aVar) {
        a4aVar.getClass();
        int iOrdinal = a4aVar.ordinal();
        if (iOrdinal == 2) {
            return y3a.ON_DESTROY;
        }
        if (iOrdinal == 3) {
            return y3a.ON_STOP;
        }
        if (iOrdinal != 4) {
            return null;
        }
        return y3a.ON_PAUSE;
    }

    public static y3a b(a4a a4aVar) {
        a4aVar.getClass();
        int iOrdinal = a4aVar.ordinal();
        if (iOrdinal == 1) {
            return y3a.ON_CREATE;
        }
        if (iOrdinal == 2) {
            return y3a.ON_START;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return y3a.ON_RESUME;
    }
}
