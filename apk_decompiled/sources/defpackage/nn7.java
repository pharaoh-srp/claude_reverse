package defpackage;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.b;
import com.google.protobuf.c;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class nn7 extends v28 {
    private static final nn7 DEFAULT_INSTANCE;
    public static volatile n28 f;
    public final gsa e = gsa.F;

    static {
        nn7 nn7Var = new nn7();
        DEFAULT_INSTANCE = nn7Var;
        nn7Var.b &= Integer.MAX_VALUE;
        v28.d.put(nn7.class, nn7Var);
    }

    public static jn7 g() {
        return (jn7) ((h28) DEFAULT_INSTANCE.a(5));
    }

    public static nn7 h(FileInputStream fileInputStream) throws InvalidProtocolBufferException {
        v28 v28Var;
        nn7 nn7Var = DEFAULT_INSTANCE;
        nc7 nc7VarA = nc7.a();
        try {
            int i = fileInputStream.read();
            if (i == -1) {
                v28Var = null;
            } else {
                b bVar = new b(new a3(s34.e(i, fileInputStream), fileInputStream));
                v28 v28VarF = nn7Var.f();
                try {
                    rud rudVar = rud.c;
                    rudVar.getClass();
                    f7f f7fVarA = rudVar.a(v28VarF.getClass());
                    f7fVarA.g(v28VarF, c.a(bVar), nc7VarA);
                    f7fVarA.b(v28VarF);
                    bVar.f(0);
                    v28Var = v28VarF;
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
                } catch (RuntimeException e4) {
                    if (e4.getCause() instanceof InvalidProtocolBufferException) {
                        throw ((InvalidProtocolBufferException) e4.getCause());
                    }
                    throw e4;
                }
            }
            if (v28Var == null || v28.d(v28Var, true)) {
                return (nn7) v28Var;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        } catch (InvalidProtocolBufferException e5) {
            if (e5.E) {
                throw new InvalidProtocolBufferException(e5.getMessage(), e5);
            }
            throw e5;
        } catch (IOException e6) {
            throw new InvalidProtocolBufferException(e6.getMessage(), e6);
        }
    }

    @Override // defpackage.v28
    public final Object a(int i) {
        n28 n28Var;
        switch (sq6.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new f2e(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"flags_", mn7.a});
            case 3:
                return new nn7();
            case 4:
                return new jn7(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                n28 n28Var2 = f;
                if (n28Var2 != null) {
                    return n28Var2;
                }
                synchronized (nn7.class) {
                    try {
                        n28Var = f;
                        if (n28Var == null) {
                            n28Var = new n28();
                            f = n28Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return n28Var;
            default:
                mr9.x();
                return null;
        }
    }
}
