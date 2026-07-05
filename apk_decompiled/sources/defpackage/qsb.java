package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.mlkit.common.MlKitException;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class qsb implements Runnable {
    public final /* synthetic */ int E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;
    public final Object J;

    public qsb(File file, File file2, gmf gmfVar, h99 h99Var, iuj iujVar) {
        this.E = 0;
        h99Var.getClass();
        iujVar.getClass();
        this.F = file;
        this.G = file2;
        this.H = gmfVar;
        this.I = h99Var;
        this.J = iujVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v3, types: [hyk, rok] */
    /* JADX WARN: Type inference failed for: r12v4, types: [rok] */
    /* JADX WARN: Type inference failed for: r12v6, types: [rok] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0184 -> B:87:0x018b). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public final void run() {
        hyk hykVar;
        pfk pfkVar;
        switch (this.E) {
            case 0:
                g99 g99Var = g99.F;
                if (((File) this.F) == null) {
                    dch.H((h99) this.I, 4, g99Var, qs7.a0, null, false, 56);
                    return;
                }
                File file = (File) this.G;
                h99 h99Var = (h99) this.I;
                if (file == null) {
                    dch.H(h99Var, 4, g99Var, qs7.b0, null, false, 56);
                    return;
                } else {
                    fd9.t0(h99Var, (iuj) this.J, new v01(29, this));
                    return;
                }
            case 1:
                u1l u1lVar = (u1l) this.H;
                String str = (String) this.G;
                String str2 = (String) this.F;
                x4k x4kVar = (x4k) this.I;
                ?? J0 = (hyk) this.J;
                ArrayList arrayList = new ArrayList();
                try {
                    pfk pfkVar2 = J0.H;
                    if (pfkVar2 == null) {
                        J0.b0().J.a(str2, str, "Failed to get conditional properties; not connected to service");
                    } else {
                        arrayList = h1l.F1(pfkVar2.p(str2, str, u1lVar));
                        J0.c1();
                        h1l h1lVarJ0 = J0.J0();
                        h1lVarJ0.k1(x4kVar, arrayList);
                        J0 = h1lVarJ0;
                    }
                } catch (RemoteException e) {
                    J0.b0().J.d("Failed to get conditional properties; remote exception", str2, str, e);
                } finally {
                    J0.J0().k1(x4kVar, arrayList);
                }
                return;
            case 2:
                synchronized (((AtomicReference) this.F)) {
                    try {
                        try {
                            hykVar = (hyk) this.J;
                            pfkVar = hykVar.H;
                        } catch (RemoteException e2) {
                            ((hyk) this.J).b0().J.d("(legacy) Failed to get conditional properties; remote exception", null, (String) this.G, e2);
                            ((AtomicReference) this.F).set(Collections.EMPTY_LIST);
                        }
                        if (pfkVar == null) {
                            hykVar.b0().J.d("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.G, (String) this.H);
                            ((AtomicReference) this.F).set(Collections.EMPTY_LIST);
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            ((AtomicReference) this.F).set(pfkVar.p((String) this.G, (String) this.H, (u1l) this.I));
                        } else {
                            ((AtomicReference) this.F).set(pfkVar.t(null, (String) this.G, (String) this.H));
                        }
                        ((hyk) this.J).c1();
                        ((AtomicReference) this.F).notify();
                        return;
                    } finally {
                        ((AtomicReference) this.F).notify();
                    }
                }
            default:
                ffk ffkVar = (ffk) this.F;
                fnf fnfVar = (fnf) this.G;
                poj pojVar = (poj) this.H;
                g7k g7kVar = (g7k) this.I;
                j5h j5hVar = (j5h) this.J;
                AtomicBoolean atomicBoolean = ffkVar.c;
                r5l r5lVar = (r5l) fnfVar.F;
                r5l r5lVar2 = (r5l) fnfVar.F;
                try {
                    if (r5lVar.f()) {
                        pojVar.H();
                        return;
                    }
                    try {
                        if (!atomicBoolean.get()) {
                            ffkVar.a.c();
                            if (ffkVar.d == null) {
                                juj jujVarA = ((slh) ffkVar.g).a(ffkVar.f, ffkVar.e);
                                ffkVar.d = jujVarA;
                                jujVarA.b();
                            }
                            atomicBoolean.set(true);
                        }
                        if (r5lVar2.f()) {
                            pojVar.H();
                            return;
                        }
                        Object objCall = g7kVar.call();
                        if (r5lVar2.f()) {
                            pojVar.H();
                            return;
                        } else {
                            j5hVar.b(objCall);
                            return;
                        }
                    } catch (RuntimeException e3) {
                        throw new MlKitException("Internal error has occurred when executing ML Kit tasks", e3);
                    }
                } catch (Exception e4) {
                    if (r5lVar2.f()) {
                        pojVar.H();
                        return;
                    } else {
                        j5hVar.a(e4);
                        return;
                    }
                }
        }
    }

    public /* synthetic */ qsb(hyk hykVar, Serializable serializable, String str, Object obj, Object obj2, int i) {
        this.E = i;
        this.F = serializable;
        this.G = str;
        this.H = obj;
        this.I = obj2;
        this.J = hykVar;
    }

    public /* synthetic */ qsb(ffk ffkVar, fnf fnfVar, poj pojVar, g7k g7kVar, j5h j5hVar) {
        this.E = 3;
        this.F = ffkVar;
        this.G = fnfVar;
        this.H = pojVar;
        this.I = g7kVar;
        this.J = j5hVar;
    }
}
