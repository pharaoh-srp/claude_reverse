package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class eb6 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ fb6 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eb6(fb6 fb6Var, String str, String str2, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = fb6Var;
        this.G = str;
        this.H = str2;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        switch (this.E) {
            case 0:
                return new eb6(this.F, this.G, this.H, tp4Var, 0);
            default:
                return new eb6(this.F, this.G, this.H, tp4Var, 1);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((eb6) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        String str = this.H;
        String str2 = this.G;
        fb6 fb6Var = this.F;
        boolean zRenameTo = false;
        switch (i) {
            case 0:
                sf5.h0(obj);
                File fileA = fb6.a(fb6Var, str2, str);
                File file = fileA.exists() ? fileA : null;
                if (file != null) {
                    return new Integer((int) ((fb6Var.d.a() - file.lastModified()) / 1000));
                }
                return new Integer(0);
            default:
                sf5.h0(obj);
                File fileA2 = fb6.a(fb6Var, null, str2);
                if (fileA2.exists()) {
                    try {
                        zRenameTo = fileA2.renameTo(fb6.a(fb6Var, str, str2));
                    } catch (Exception e) {
                        List list = xah.a;
                        xah.f(e, "Failed to migrate draft message", null, null, 28);
                    }
                    break;
                }
                return Boolean.valueOf(zRenameTo);
        }
    }
}
