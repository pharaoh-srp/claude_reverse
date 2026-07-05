package androidx.health.platform.client.proto;

import defpackage.d2e;
import defpackage.l28;
import defpackage.lg5;
import defpackage.mr9;
import defpackage.sq6;
import defpackage.utc;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends n {
    private static final h DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile utc PARSER;
    private int bitField0_;
    private String name_ = "";

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        n.n(h.class, hVar);
    }

    public static void p(h hVar, String str) {
        hVar.getClass();
        hVar.bitField0_ |= 1;
        hVar.name_ = str;
    }

    public static h q() {
        return DEFAULT_INSTANCE;
    }

    public static lg5 s() {
        return (lg5) DEFAULT_INSTANCE.d();
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
                return new d2e(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "name_"});
            case 3:
                return new h();
            case 4:
                return new lg5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                utc utcVar = PARSER;
                if (utcVar != null) {
                    return utcVar;
                }
                synchronized (h.class) {
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

    public final String r() {
        return this.name_;
    }
}
