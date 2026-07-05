package androidx.health.platform.client.proto;

import defpackage.d2e;
import defpackage.ig5;
import defpackage.l28;
import defpackage.mr9;
import defpackage.sq6;
import defpackage.utc;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends n {
    public static final int APPLICATION_ID_FIELD_NUMBER = 1;
    private static final e DEFAULT_INSTANCE;
    private static volatile utc PARSER;
    private String applicationId_ = "";
    private int bitField0_;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        n.n(e.class, eVar);
    }

    public static void p(e eVar, String str) {
        eVar.getClass();
        eVar.bitField0_ |= 1;
        eVar.applicationId_ = str;
    }

    public static e r() {
        return DEFAULT_INSTANCE;
    }

    public static ig5 s() {
        return (ig5) DEFAULT_INSTANCE.d();
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
                return new d2e(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "applicationId_"});
            case 3:
                return new e();
            case 4:
                return new ig5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                utc utcVar = PARSER;
                if (utcVar != null) {
                    return utcVar;
                }
                synchronized (e.class) {
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

    public final String q() {
        return this.applicationId_;
    }
}
