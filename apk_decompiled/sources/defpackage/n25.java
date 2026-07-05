package defpackage;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class n25 extends ts9 implements zy7 {
    public final /* synthetic */ int F;
    public final /* synthetic */ o25 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n25(o25 o25Var, int i) {
        super(0);
        this.F = i;
        this.G = o25Var;
    }

    @Override // defpackage.zy7
    public final Object a() {
        File file;
        int i = this.F;
        qh9 qh9VarA = null;
        o25 o25Var = this.G;
        switch (i) {
            case 0:
                u0h u0hVar = o25Var.J;
                File file2 = (File) u0hVar.getValue();
                h99 h99Var = o25Var.a;
                if (fd9.T(file2, h99Var)) {
                    file = (File) u0hVar.getValue();
                } else {
                    File file3 = new File(new File(o25Var.c(), "ndk_crash_reports_v2"), "last_view_event");
                    file = fd9.T(file3, h99Var) ? file3 : null;
                }
                if (file != null) {
                    List listF = new g4d(h99Var, 1).f(file);
                    if (!listF.isEmpty()) {
                        qh9VarA = new sh9(h99Var, 0).a(new String(((x1e) w44.U0(listF)).a, dj2.a));
                    }
                }
                if (qh9VarA != null) {
                    if (fd9.T((File) u0hVar.getValue(), h99Var)) {
                        fd9.Q((File) u0hVar.getValue(), h99Var);
                    } else {
                        File file4 = new File(new File(o25Var.c(), "ndk_crash_reports_v2"), "last_view_event");
                        if (fd9.T(file4, h99Var)) {
                            fd9.Q(file4, h99Var);
                        }
                    }
                }
                return qh9VarA;
            case 1:
                return new File(o25Var.c(), "last_view_event");
            case 2:
                h99 h99Var2 = o25Var.a;
                h99Var2.getClass();
                return new g4d(h99Var2, 1);
            case 3:
                ih4 ih4Var = new ih4(jh4.e);
                ih4Var.c(nrh.TLS_1_2, nrh.TLS_1_3);
                zf3[] zf3VarArr = o25.Q;
                ih4Var.b((zf3[]) Arrays.copyOf(zf3VarArr, zf3VarArr.length));
                jh4 jh4VarA = ih4Var.a();
                gdc gdcVar = new gdc();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                timeUnit.getClass();
                gdcVar.w = blj.b(45000L, timeUnit);
                timeUnit.getClass();
                gdcVar.z = blj.b(45000L, timeUnit);
                gdcVar.b(x44.X(bvd.HTTP_2, bvd.HTTP_1_1));
                gdcVar.a(x44.W(jh4VarA));
                rve rveVar = new rve(o25Var.l);
                if (rveVar != gdcVar.l) {
                    gdcVar.D = null;
                }
                gdcVar.l = rveVar;
                return new hdc(gdcVar);
            default:
                return (qh9) o25Var.I.getValue();
        }
    }
}
