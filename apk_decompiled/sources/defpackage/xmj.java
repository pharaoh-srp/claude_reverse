package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class xmj extends hmj implements h88, i88 {
    public static final z89 q = anj.a;
    public final Context j;
    public final Handler k;
    public final z89 l;
    public final Set m;
    public final rl n;
    public i6g o;
    public eoc p;

    public xmj(Context context, xnj xnjVar, rl rlVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 0);
        this.j = context;
        this.k = xnjVar;
        this.n = rlVar;
        this.m = (Set) rlVar.F;
        this.l = q;
    }

    @Override // defpackage.hmj
    public final boolean D(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        switch (i) {
            case 3:
                rmj.b(parcel);
                break;
            case 4:
                rmj.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                rmj.b(parcel);
                break;
            case 7:
                rmj.b(parcel);
                break;
            case 8:
                qnj qnjVar = (qnj) rmj.a(parcel, qnj.CREATOR);
                rmj.b(parcel);
                this.k.post(new s2k(this, qnjVar, z, 9));
                break;
            case 9:
                rmj.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // defpackage.i88
    public final void b(hh4 hh4Var) {
        this.p.a(hh4Var);
    }

    @Override // defpackage.h88
    public final void c(int i) {
        this.p.b(i);
    }

    @Override // defpackage.h88
    public final void d() {
        this.o.F(this);
    }
}
