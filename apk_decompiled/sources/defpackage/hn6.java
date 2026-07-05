package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.c;
import com.google.crypto.tink.shaded.protobuf.f;
import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class hn6 extends f {
    private static final hn6 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile vtc PARSER;
    private k22 encryptedKeyset_ = k22.F;
    private iq9 keysetInfo_;

    static {
        hn6 hn6Var = new hn6();
        DEFAULT_INSTANCE = hn6Var;
        f.t(hn6.class, hn6Var);
    }

    public static hn6 A(ByteArrayInputStream byteArrayInputStream, mc7 mc7Var) throws InvalidProtocolBufferException {
        f fVarS = f.s(DEFAULT_INSTANCE, new c(byteArrayInputStream), mc7Var);
        f.g(fVarS);
        return (hn6) fVarS;
    }

    public static void w(hn6 hn6Var, g22 g22Var) {
        hn6Var.getClass();
        hn6Var.encryptedKeyset_ = g22Var;
    }

    public static void x(hn6 hn6Var, iq9 iq9Var) {
        hn6Var.getClass();
        hn6Var.keysetInfo_ = iq9Var;
    }

    public static gn6 z() {
        return (gn6) DEFAULT_INSTANCE.h();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f
    public final Object i(int i) {
        vtc m28Var;
        switch (sq6.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new hn6();
            case 4:
                return new gn6(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (hn6.class) {
                    try {
                        m28Var = PARSER;
                        if (m28Var == null) {
                            m28Var = new m28();
                            PARSER = m28Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return m28Var;
            default:
                mr9.x();
                return null;
        }
    }

    public final k22 y() {
        return this.encryptedKeyset_;
    }
}
