package defpackage;

import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class rff {
    public static String a() {
        String str = ((SimpleDateFormat) sff.a.get()).format(new Date());
        str.getClass();
        return isg.n0(str, "UTC", "Z", false);
    }
}
