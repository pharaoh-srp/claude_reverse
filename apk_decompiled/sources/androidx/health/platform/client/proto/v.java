package androidx.health.platform.client.proto;

import defpackage.bke;
import defpackage.d2e;
import defpackage.l28;
import defpackage.mr9;
import defpackage.sq6;
import defpackage.utc;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends n {
    public static final int CALLING_PACKAGE_FIELD_NUMBER = 1;
    private static final v DEFAULT_INSTANCE;
    public static final int IS_IN_FOREGROUND_FIELD_NUMBER = 4;
    private static volatile utc PARSER = null;
    public static final int PERMISSION_TOKEN_FIELD_NUMBER = 3;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isInForeground_;
    private int sdkVersion_;
    private String callingPackage_ = "";
    private String permissionToken_ = "";

    static {
        v vVar = new v();
        DEFAULT_INSTANCE = vVar;
        n.n(v.class, vVar);
    }

    public static void p(v vVar, String str) {
        vVar.getClass();
        str.getClass();
        vVar.bitField0_ |= 1;
        vVar.callingPackage_ = str;
    }

    public static void q(v vVar, int i) {
        vVar.bitField0_ |= 2;
        vVar.sdkVersion_ = i;
    }

    public static void r(v vVar, String str) {
        vVar.getClass();
        str.getClass();
        vVar.bitField0_ |= 4;
        vVar.permissionToken_ = str;
    }

    public static void s(v vVar, boolean z) {
        vVar.bitField0_ |= 8;
        vVar.isInForeground_ = z;
    }

    public static bke x() {
        return (bke) DEFAULT_INSTANCE.d();
    }

    public static v y(byte[] bArr) {
        return (v) n.m(DEFAULT_INSTANCE, bArr);
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
                return new d2e(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "callingPackage_", "sdkVersion_", "permissionToken_", "isInForeground_"});
            case 3:
                return new v();
            case 4:
                return new bke(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                utc utcVar = PARSER;
                if (utcVar != null) {
                    return utcVar;
                }
                synchronized (v.class) {
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

    public final String t() {
        return this.callingPackage_;
    }

    public final boolean u() {
        return this.isInForeground_;
    }

    public final String v() {
        return this.permissionToken_;
    }

    public final int w() {
        return this.sdkVersion_;
    }
}
