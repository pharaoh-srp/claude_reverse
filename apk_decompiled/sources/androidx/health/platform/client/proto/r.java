package androidx.health.platform.client.proto;

import defpackage.d2e;
import defpackage.l28;
import defpackage.mr9;
import defpackage.qxc;
import defpackage.sq6;
import defpackage.sxc;
import defpackage.utc;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends n {
    public static final int ACCESS_TYPE_FIELD_NUMBER = 2;
    public static final int DATA_TYPE_FIELD_NUMBER = 1;
    private static final r DEFAULT_INSTANCE;
    private static volatile utc PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 3;
    private int accessType_;
    private int bitField0_;
    private h dataType_;
    private String permission_ = "";

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        n.n(r.class, rVar);
    }

    public static void p(r rVar, String str) {
        rVar.getClass();
        str.getClass();
        rVar.bitField0_ |= 4;
        rVar.permission_ = str;
    }

    public static sxc r() {
        return (sxc) DEFAULT_INSTANCE.d();
    }

    public static r s(byte[] bArr) {
        return (r) n.m(DEFAULT_INSTANCE, bArr);
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
                return new d2e(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "dataType_", "accessType_", qxc.a, "permission_"});
            case 3:
                return new r();
            case 4:
                return new sxc(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                utc utcVar = PARSER;
                if (utcVar != null) {
                    return utcVar;
                }
                synchronized (r.class) {
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
        return this.permission_;
    }
}
