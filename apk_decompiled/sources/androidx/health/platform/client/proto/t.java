package androidx.health.platform.client.proto;

import defpackage.d2e;
import defpackage.l28;
import defpackage.mr9;
import defpackage.sq6;
import defpackage.utc;
import defpackage.zje;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends n {
    public static final int AGGREGATION_TYPE_FIELD_NUMBER = 2;
    public static final int DATA_TYPE_NAME_FIELD_NUMBER = 1;
    private static final t DEFAULT_INSTANCE;
    public static final int FIELD_NAME_FIELD_NUMBER = 3;
    private static volatile utc PARSER;
    private int bitField0_;
    private String dataTypeName_ = "";
    private String aggregationType_ = "";
    private String fieldName_ = "";

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        n.n(t.class, tVar);
    }

    public static void p(t tVar, String str) {
        tVar.getClass();
        tVar.bitField0_ |= 2;
        tVar.aggregationType_ = str;
    }

    public static void q(t tVar, String str) {
        tVar.getClass();
        str.getClass();
        tVar.bitField0_ |= 4;
        tVar.fieldName_ = str;
    }

    public static void r(t tVar, String str) {
        tVar.getClass();
        tVar.bitField0_ |= 1;
        tVar.dataTypeName_ = str;
    }

    public static zje s() {
        return (zje) DEFAULT_INSTANCE.d();
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
                return new d2e(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "dataTypeName_", "aggregationType_", "fieldName_"});
            case 3:
                return new t();
            case 4:
                return new zje(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                utc utcVar = PARSER;
                if (utcVar != null) {
                    return utcVar;
                }
                synchronized (t.class) {
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
}
