package defpackage;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.c;
import androidx.datastore.preferences.protobuf.d;
import androidx.datastore.preferences.protobuf.f;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class dcd extends f {
    private static final dcd DEFAULT_INSTANCE;
    private static volatile ytc PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private hsa preferences_ = hsa.F;

    static {
        dcd dcdVar = new dcd();
        DEFAULT_INSTANCE = dcdVar;
        f.j(dcd.class, dcdVar);
    }

    public static hsa m(dcd dcdVar) {
        hsa hsaVar = dcdVar.preferences_;
        if (!hsaVar.E) {
            dcdVar.preferences_ = hsaVar.c();
        }
        return dcdVar.preferences_;
    }

    public static bcd o() {
        return (bcd) ((j28) DEFAULT_INSTANCE.b(5));
    }

    public static dcd p(FileInputStream fileInputStream) {
        dcd dcdVar = DEFAULT_INSTANCE;
        c cVar = new c(fileInputStream);
        pc7 pc7VarA = pc7.a();
        f fVarI = dcdVar.i();
        try {
            sud sudVar = sud.c;
            sudVar.getClass();
            g7f g7fVarA = sudVar.a(fVarI.getClass());
            d dVar = cVar.c;
            if (dVar == null) {
                dVar = new d(cVar);
            }
            g7fVarA.e(fVarI, dVar, pc7VarA);
            g7fVarA.b(fVarI);
            if (f.e(fVarI, true)) {
                return (dcd) fVarI;
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

    @Override // androidx.datastore.preferences.protobuf.f
    public final Object b(int i) {
        ytc o28Var;
        int iF = sq6.F(i);
        if (iF == 0) {
            return (byte) 1;
        }
        if (iF == 2) {
            return new g2e(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", ccd.a});
        }
        if (iF == 3) {
            return new dcd();
        }
        if (iF == 4) {
            return new bcd(DEFAULT_INSTANCE);
        }
        if (iF == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iF != 6) {
            throw null;
        }
        ytc ytcVar = PARSER;
        if (ytcVar != null) {
            return ytcVar;
        }
        synchronized (dcd.class) {
            try {
                o28Var = PARSER;
                if (o28Var == null) {
                    o28Var = new o28();
                    PARSER = o28Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return o28Var;
    }

    public final Map n() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
