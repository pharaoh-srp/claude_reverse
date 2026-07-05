package defpackage;

import androidx.datastore.core.CorruptionException;
import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.e;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class aw9 implements cof {
    public static final aw9 E = new aw9();
    public static final tv9 F;

    static {
        tv9 tv9VarN = tv9.n();
        tv9VarN.getClass();
        F = tv9VarN;
    }

    @Override // defpackage.cof
    public final Object e() {
        return F;
    }

    @Override // defpackage.cof
    public final void f(Object obj, udi udiVar) throws IOException {
        tv9 tv9Var = (tv9) obj;
        tv9Var.getClass();
        int iA = tv9Var.a(null);
        Logger logger = e.f;
        if (iA > 4096) {
            iA = 4096;
        }
        e eVar = new e(udiVar, iA);
        nud nudVar = nud.c;
        nudVar.getClass();
        c7f c7fVarA = nudVar.a(tv9Var.getClass());
        ive iveVar = eVar.a;
        if (iveVar == null) {
            iveVar = new ive(eVar);
        }
        c7fVarA.h(tv9Var, iveVar);
        if (eVar.d > 0) {
            eVar.k();
        }
    }

    @Override // defpackage.cof
    public final Object g(FileInputStream fileInputStream) throws CorruptionException {
        try {
            return tv9.q(fileInputStream);
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read proto.", e);
        }
    }
}
