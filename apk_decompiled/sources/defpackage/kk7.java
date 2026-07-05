package defpackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class kk7 extends xzg implements bz7 {
    public FileOutputStream E;
    public FileOutputStream F;
    public int G;
    public final /* synthetic */ lk7 H;
    public final /* synthetic */ Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk7(lk7 lk7Var, Object obj, tp4 tp4Var) {
        super(1, tp4Var);
        this.H = lk7Var;
        this.I = obj;
    }

    @Override // defpackage.vd1
    public final tp4 create(tp4 tp4Var) {
        return new kk7(this.H, this.I, tp4Var);
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        return ((kk7) create((tp4) obj)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Exception {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        int i = this.G;
        iei ieiVar = iei.a;
        lk7 lk7Var = this.H;
        if (i == 0) {
            sf5.h0(obj);
            try {
                fileOutputStream = new FileOutputStream(lk7Var.a);
                Object obj2 = this.I;
                try {
                    cof cofVar = lk7Var.b;
                    udi udiVar = new udi(fileOutputStream);
                    this.E = fileOutputStream;
                    this.F = fileOutputStream;
                    this.G = 1;
                    cofVar.f(obj2, udiVar);
                    m45 m45Var = m45.E;
                    if (ieiVar == m45Var) {
                        return m45Var;
                    }
                    fileOutputStream2 = fileOutputStream;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream2 = fileOutputStream;
                    throw th;
                }
            } catch (Exception e) {
                if (e instanceof FileNotFoundException) {
                    throw ybi.u(lk7Var.a.getParent(), (FileNotFoundException) e);
                }
                throw e;
            }
        } else {
            if (i != 1) {
                sz6.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fileOutputStream = this.F;
            fileOutputStream2 = this.E;
            try {
                sf5.h0(obj);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    wd6.Z(fileOutputStream2, th);
                    throw th3;
                }
            }
        }
        fileOutputStream.getFD().sync();
        wd6.Z(fileOutputStream2, null);
        return ieiVar;
    }
}
