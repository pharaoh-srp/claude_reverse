package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class w7e extends xzg implements rz7 {
    public List E;
    public List F;
    public List G;
    public fwb H;
    public fwb I;
    public fwb J;
    public Set K;
    public fwb L;
    public int M;
    public /* synthetic */ arb N;
    public final /* synthetic */ x7e O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7e(x7e x7eVar, tp4 tp4Var) {
        super(3, tp4Var);
        this.O = x7eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.x7e r22, java.util.List r23, java.util.List r24, java.util.List r25, defpackage.fwb r26, defpackage.fwb r27, defpackage.fwb r28, defpackage.fwb r29) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w7e.d(x7e, java.util.List, java.util.List, java.util.List, fwb, fwb, fwb, fwb):void");
    }

    public static final void n(List list, x7e x7eVar) {
        list.clear();
        synchronized (x7eVar.d) {
            try {
                ArrayList arrayList = x7eVar.l;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((ksb) arrayList.get(i));
                }
                x7eVar.l.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        w7e w7eVar = new w7e(this.O, (tp4) obj3);
        w7eVar.N = (arb) obj2;
        w7eVar.invokeSuspend(iei.a);
        return m45.E;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a4 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0142 -> B:44:0x014a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01f7 -> B:12:0x009f). Please report as a decompilation issue!!! */
    @Override // defpackage.vd1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w7e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
