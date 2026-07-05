package androidx.health.platform.client.proto;

import defpackage.cu6;
import defpackage.d2e;
import defpackage.l28;
import defpackage.mr9;
import defpackage.o89;
import defpackage.sq6;
import defpackage.utc;
import defpackage.uud;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends n {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final m DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile utc PARSER = null;
    public static final int PERMISSION_FIELD_NUMBER = 3;
    private int bitField0_;
    private int code_;
    private String message_ = "";
    private o89 permission_ = uud.H;

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        n.n(m.class, mVar);
    }

    public static void p(m mVar, int i) {
        mVar.bitField0_ |= 1;
        mVar.code_ = i;
    }

    public static void q(m mVar, String str) {
        mVar.getClass();
        str.getClass();
        mVar.bitField0_ |= 2;
        mVar.message_ = str;
    }

    public static cu6 u() {
        return (cu6) DEFAULT_INSTANCE.d();
    }

    public static m v(byte[] bArr) {
        return (m) n.m(DEFAULT_INSTANCE, bArr);
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
                return new d2e(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b", new Object[]{"bitField0_", "code_", "message_", "permission_", r.class});
            case 3:
                return new m();
            case 4:
                return new cu6(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                utc utcVar = PARSER;
                if (utcVar != null) {
                    return utcVar;
                }
                synchronized (m.class) {
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

    public final int r() {
        return this.code_;
    }

    public final String s() {
        return this.message_;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }
}
