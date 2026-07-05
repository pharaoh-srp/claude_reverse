package androidx.health.platform.client.proto;

import defpackage.d2e;
import defpackage.eg5;
import defpackage.l28;
import defpackage.mr9;
import defpackage.sq6;
import defpackage.utc;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends n {
    private static final i DEFAULT_INSTANCE;
    public static final int IDENTIFIER_FIELD_NUMBER = 1;
    public static final int MANUFACTURER_FIELD_NUMBER = 2;
    public static final int MODEL_FIELD_NUMBER = 3;
    private static volatile utc PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 4;
    private int bitField0_;
    private String identifier_ = "";
    private String manufacturer_ = "";
    private String model_ = "";
    private String type_ = "";

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        n.n(i.class, iVar);
    }

    public static i p() {
        return DEFAULT_INSTANCE;
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
                return new d2e(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "identifier_", "manufacturer_", "model_", "type_"});
            case 3:
                return new i();
            case 4:
                return new eg5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                utc utcVar = PARSER;
                if (utcVar != null) {
                    return utcVar;
                }
                synchronized (i.class) {
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
        return this.manufacturer_;
    }

    public final String r() {
        return this.model_;
    }

    public final String s() {
        return this.type_;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean u() {
        return (this.bitField0_ & 4) != 0;
    }
}
