package defpackage;

import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.UninitializedMessageException;
import androidx.glance.appwidget.protobuf.c;
import androidx.glance.appwidget.protobuf.d;
import androidx.glance.appwidget.protobuf.f;
import java.io.FileInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class tv9 extends f {
    private static final tv9 DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    private static volatile ttc PARSER;
    private n89 layout_ = tud.H;
    private int nextIndex_;

    static {
        tv9 tv9Var = new tv9();
        DEFAULT_INSTANCE = tv9Var;
        f.i(tv9.class, tv9Var);
    }

    public static void k(tv9 tv9Var, vv9 vv9Var) {
        tv9Var.getClass();
        n89 n89Var = tv9Var.layout_;
        if (!((o3) n89Var).E) {
            int size = n89Var.size();
            tv9Var.layout_ = ((tud) n89Var).e(size == 0 ? 10 : size * 2);
        }
        tv9Var.layout_.add(vv9Var);
    }

    public static void l(tv9 tv9Var) {
        tv9Var.getClass();
        tv9Var.layout_ = tud.H;
    }

    public static void m(tv9 tv9Var, int i) {
        tv9Var.nextIndex_ = i;
    }

    public static tv9 n() {
        return DEFAULT_INSTANCE;
    }

    public static tv9 q(FileInputStream fileInputStream) throws InvalidProtocolBufferException {
        tv9 tv9Var = DEFAULT_INSTANCE;
        c cVar = new c(fileInputStream);
        kc7 kc7VarA = kc7.a();
        f fVarH = tv9Var.h();
        try {
            nud nudVar = nud.c;
            nudVar.getClass();
            c7f c7fVarA = nudVar.a(fVarH.getClass());
            d dVar = (d) cVar.b;
            if (dVar == null) {
                dVar = new d(cVar);
            }
            c7fVarA.f(fVarH, dVar, kc7VarA);
            c7fVarA.b(fVarH);
            if (f.e(fVarH, true)) {
                return (tv9) fVarH;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
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

    @Override // androidx.glance.appwidget.protobuf.f
    public final Object b(int i) {
        ttc k28Var;
        switch (sq6.F(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new c2e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", vv9.class, "nextIndex_"});
            case 3:
                return new tv9();
            case 4:
                return new sv9(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                ttc ttcVar = PARSER;
                if (ttcVar != null) {
                    return ttcVar;
                }
                synchronized (tv9.class) {
                    try {
                        k28Var = PARSER;
                        if (k28Var == null) {
                            k28Var = new k28();
                            PARSER = k28Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return k28Var;
            default:
                mr9.x();
                return null;
        }
    }

    public final n89 o() {
        return this.layout_;
    }

    public final int p() {
        return this.nextIndex_;
    }
}
