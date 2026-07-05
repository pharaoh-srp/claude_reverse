package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.UninitializedMessageException;
import com.google.crypto.tink.shaded.protobuf.c;
import com.google.crypto.tink.shaded.protobuf.f;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dq9 extends f {
    private static final dq9 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile vtc PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private p89 key_ = vud.H;
    private int primaryKeyId_;

    static {
        dq9 dq9Var = new dq9();
        DEFAULT_INSTANCE = dq9Var;
        f.t(dq9.class, dq9Var);
    }

    public static aq9 C() {
        return (aq9) DEFAULT_INSTANCE.h();
    }

    public static dq9 D(ByteArrayInputStream byteArrayInputStream, mc7 mc7Var) throws InvalidProtocolBufferException {
        f fVarS = f.s(DEFAULT_INSTANCE, new c(byteArrayInputStream), mc7Var);
        f.g(fVarS);
        return (dq9) fVarS;
    }

    public static dq9 E(byte[] bArr, mc7 mc7Var) throws InvalidProtocolBufferException {
        dq9 dq9Var = DEFAULT_INSTANCE;
        int length = bArr.length;
        f fVarQ = dq9Var.q();
        try {
            pud pudVar = pud.c;
            pudVar.getClass();
            e7f e7fVarA = pudVar.a(fVarQ.getClass());
            oo0 oo0Var = new oo0();
            mc7Var.getClass();
            e7fVarA.j(fVarQ, bArr, 0, length, oo0Var);
            e7fVarA.b(fVarQ);
            f.g(fVarQ);
            return (dq9) fVarQ;
        } catch (InvalidProtocolBufferException e) {
            if (e.E) {
                throw new InvalidProtocolBufferException(e.getMessage(), e);
            }
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public static void w(dq9 dq9Var, int i) {
        dq9Var.primaryKeyId_ = i;
    }

    public static void x(dq9 dq9Var, cq9 cq9Var) {
        dq9Var.getClass();
        p89 p89Var = dq9Var.key_;
        if (!((q3) p89Var).E) {
            int size = p89Var.size();
            dq9Var.key_ = p89Var.j(size == 0 ? 10 : size * 2);
        }
        dq9Var.key_.add(cq9Var);
    }

    public final List A() {
        return this.key_;
    }

    public final int B() {
        return this.primaryKeyId_;
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
                return new e2e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", cq9.class});
            case 3:
                return new dq9();
            case 4:
                return new aq9(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vtc vtcVar = PARSER;
                if (vtcVar != null) {
                    return vtcVar;
                }
                synchronized (dq9.class) {
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

    public final cq9 y(int i) {
        return (cq9) this.key_.get(i);
    }

    public final int z() {
        return this.key_.size();
    }
}
