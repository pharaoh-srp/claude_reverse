package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class koj extends b88 {
    public final GoogleSignInOptions d0;

    public koj(Context context, Looper looper, rl rlVar, GoogleSignInOptions googleSignInOptions, kmj kmjVar, kmj kmjVar2) {
        s98 s98Var;
        super(context, looper, 91, rlVar, kmjVar, kmjVar2, 0);
        Set<Scope> set = (Set) rlVar.G;
        if (googleSignInOptions != null) {
            s98Var = new s98();
            s98Var.a = new HashSet();
            s98Var.h = new HashMap();
            s98Var.a = new HashSet(googleSignInOptions.F);
            s98Var.b = googleSignInOptions.I;
            s98Var.c = googleSignInOptions.J;
            s98Var.d = googleSignInOptions.H;
            s98Var.e = googleSignInOptions.K;
            s98Var.f = googleSignInOptions.G;
            s98Var.g = googleSignInOptions.L;
            s98Var.h = GoogleSignInOptions.x0(googleSignInOptions.M);
            s98Var.i = googleSignInOptions.N;
        } else {
            s98Var = new s98();
            s98Var.a = new HashSet();
            s98Var.h = new HashMap();
        }
        s98Var.i = eoj.a();
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = s98Var.a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = s98Var.a;
        if (hashSet2.contains(GoogleSignInOptions.R)) {
            Scope scope2 = GoogleSignInOptions.Q;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (s98Var.d && (s98Var.f == null || !hashSet2.isEmpty())) {
            hashSet2.add(GoogleSignInOptions.P);
        }
        this.d0 = new GoogleSignInOptions(3, new ArrayList(hashSet2), s98Var.f, s98Var.d, s98Var.b, s98Var.c, s98Var.e, s98Var.g, s98Var.h, s98Var.i);
    }

    @Override // defpackage.fe1, defpackage.ge0
    public final int i() {
        return 12451000;
    }

    @Override // defpackage.fe1
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof qoj ? (qoj) iInterfaceQueryLocalInterface : new qoj(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService", 1);
    }

    @Override // defpackage.fe1
    public final String u() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // defpackage.fe1
    public final String v() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }
}
