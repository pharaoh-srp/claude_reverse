package androidx.health.platform.client.proto;

import defpackage.d2e;
import defpackage.eg5;
import defpackage.l28;
import defpackage.mr9;
import defpackage.o89;
import defpackage.sq6;
import defpackage.utc;
import defpackage.uud;

/* JADX INFO: loaded from: classes2.dex */
public final class x extends n {
    public static final int DATA_POINT_FIELD_NUMBER = 1;
    private static final x DEFAULT_INSTANCE;
    public static final int PAGE_TOKEN_FIELD_NUMBER = 2;
    private static volatile utc PARSER;
    private int bitField0_;
    private o89 dataPoint_ = uud.H;
    private String pageToken_ = "";

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        n.n(x.class, xVar);
    }

    public static x r(byte[] bArr) {
        return (x) n.m(DEFAULT_INSTANCE, bArr);
    }

    @Override // androidx.health.platform.client.proto.n
    public final Object e(int i) {
        utc l28Var;
        switch (sq6.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new d2e(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000", new Object[]{"bitField0_", "dataPoint_", g.class, "pageToken_"});
            case 3:
                return new x();
            case 4:
                return new eg5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                utc utcVar = PARSER;
                if (utcVar != null) {
                    return utcVar;
                }
                synchronized (x.class) {
                    try {
                        l28Var = PARSER;
                        if (l28Var == null) {
                            l28Var = new l28();
                            PARSER = l28Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return l28Var;
            default:
                mr9.x();
                return null;
        }
    }

    public final o89 p() {
        return this.dataPoint_;
    }

    public final String q() {
        return this.pageToken_;
    }
}
