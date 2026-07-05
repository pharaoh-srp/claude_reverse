package defpackage;

import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public abstract class f40 {
    public static final c40 a() {
        return new c40(new Path());
    }

    public static final Path.Direction b(nuc nucVar) {
        int iOrdinal = nucVar.ordinal();
        if (iOrdinal == 0) {
            return Path.Direction.CCW;
        }
        if (iOrdinal == 1) {
            return Path.Direction.CW;
        }
        mr9.b();
        return null;
    }

    public static final void c(String str) {
        throw new IllegalStateException(str);
    }
}
