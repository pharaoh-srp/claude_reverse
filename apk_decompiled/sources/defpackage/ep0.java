package defpackage;

import com.pvporbit.freetype.FreeTypeConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class ep0 {
    public static final int a;

    static {
        Object hreVar;
        try {
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            hreVar = property != null ? isg.r0(10, property) : null;
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        Integer num = (Integer) (hreVar instanceof hre ? null : hreVar);
        a = num != null ? num.intValue() : FreeTypeConstants.FT_LOAD_COMPUTE_METRICS;
    }
}
