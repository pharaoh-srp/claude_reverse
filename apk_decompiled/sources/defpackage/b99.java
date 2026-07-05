package defpackage;

import android.content.Context;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b99 extends e88 {
    public static final nyj k = new nyj("IdentityCredentials.API", new z89(0), new lz1(13));
    public static final nyj l = new nyj("RestoreCredential.API", new z89(1), new lz1(13));
    public static final nyj m = new nyj("ModuleInstall.API", new z89(4), new lz1(13));
    public static int n = 1;

    public r5l d(njc... njcVarArr) {
        dgj.n("Please provide at least one OptionalModuleApi.", njcVarArr.length > 0);
        for (njc njcVar : njcVarArr) {
            dgj.w("Requested API must not be null.", njcVar);
        }
        df0 df0VarL0 = df0.l0(Arrays.asList(njcVarArr), false);
        if (df0VarL0.E.isEmpty()) {
            return ez1.E(new pqb(true, 0));
        }
        w19 w19VarB = w19.b();
        w19VarB.d = new jf7[]{jik.b};
        w19VarB.b = 27301;
        w19VarB.a = false;
        w19VarB.c = new fnf(this, df0VarL0, 16);
        return c(0, w19VarB.a());
    }

    public r5l e(GetCredentialRequest getCredentialRequest) {
        getCredentialRequest.getClass();
        w19 w19VarB = w19.b();
        w19VarB.d = new jf7[]{pik.b};
        w19VarB.c = new fnf(27, getCredentialRequest);
        w19VarB.b = 32701;
        r5l r5lVarC = c(0, w19VarB.a());
        r5lVarC.getClass();
        return r5lVarC;
    }

    public synchronized int f() {
        int i;
        try {
            i = n;
            if (i == 1) {
                Context context = this.a;
                f88 f88Var = f88.d;
                int iC = f88Var.c(context, 12451000);
                if (iC == 0) {
                    i = 4;
                    n = 4;
                } else if (f88Var.b(iC, context, null) != null || si6.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    i = 2;
                    n = 2;
                } else {
                    i = 3;
                    n = 3;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }
}
