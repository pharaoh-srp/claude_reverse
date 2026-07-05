package defpackage;

import com.google.android.gms.internal.play_billing.zzia;

/* JADX INFO: loaded from: classes.dex */
public abstract class mdk implements Cloneable {
    public final zdk E;
    public zdk F;

    public mdk(zdk zdkVar) {
        this.E = zdkVar;
        if (zdkVar.h()) {
            sz6.p("Default instance must be immutable.");
            throw null;
        }
        this.F = zdkVar.n();
    }

    public final zdk a() {
        boolean zH = this.F.h();
        zdk zdkVar = this.F;
        if (zH) {
            zdkVar.getClass();
            zkk.c.a(zdkVar.getClass()).b(zdkVar);
            zdkVar.e();
            zdkVar = this.F;
        }
        zdkVar.getClass();
        if (zdk.i(zdkVar, true)) {
            return zdkVar;
        }
        throw new zzia();
    }

    public final void b() {
        if (this.F.h()) {
            return;
        }
        zdk zdkVarN = this.E.n();
        zkk.c.a(zdkVarN.getClass()).h(zdkVarN, this.F);
        this.F = zdkVarN;
    }

    public final Object clone() {
        mdk mdkVar = (mdk) this.E.j(5);
        boolean zH = this.F.h();
        zdk zdkVar = this.F;
        if (zH) {
            zdkVar.getClass();
            zkk.c.a(zdkVar.getClass()).b(zdkVar);
            zdkVar.e();
            zdkVar = this.F;
        }
        mdkVar.F = zdkVar;
        return mdkVar;
    }
}
