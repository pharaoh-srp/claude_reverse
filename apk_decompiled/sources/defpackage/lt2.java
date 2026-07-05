package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lt2 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ File F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lt2(File file, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = file;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        File file = this.F;
        switch (i) {
            case 0:
                return new lt2(file, tp4Var, 0);
            case 1:
                return new lt2(file, tp4Var, 1);
            default:
                return new lt2(file, tp4Var, 2);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
            case 0:
                ((lt2) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
                break;
        }
        return ((lt2) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        boolean zDelete;
        int i = this.E;
        File file = this.F;
        switch (i) {
            case 0:
                sf5.h0(obj);
                try {
                    file.delete();
                    break;
                } catch (Exception e) {
                    List list = xah.a;
                    xah.f(e, "Failed to delete temporary image file.", null, null, 28);
                }
                return iei.a;
            case 1:
                sf5.h0(obj);
                String name = file.getName();
                name.getClass();
                return new cx4(nk7.o0(file), name, "image/jpeg");
            default:
                sf5.h0(obj);
                try {
                    zDelete = file.delete();
                    break;
                } catch (Exception e2) {
                    List list2 = xah.a;
                    xah.f(e2, "Failed to delete draft message", null, null, 28);
                    zDelete = false;
                }
                return Boolean.valueOf(zDelete);
        }
    }
}
