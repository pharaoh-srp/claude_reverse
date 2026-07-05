package defpackage;

import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes.dex */
public abstract class bjg {
    public static final boolean a;
    public static final jp0 b;
    public static final jp0 c;
    public static final jp0 d;

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (!z) {
            b = null;
            c = null;
            d = null;
        } else {
            new oq5(Date.class);
            new oq5(Timestamp.class);
            b = zig.c;
            c = zig.d;
            d = ajg.c;
        }
    }
}
