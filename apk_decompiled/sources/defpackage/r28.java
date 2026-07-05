package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class r28 extends u28 {
    public final sh7 E;

    public r28(p28 p28Var) {
        p28Var.F.f();
        p28Var.G = false;
        this.E = p28Var.F;
    }

    public final boolean i() {
        ebg ebgVar = this.E.a;
        int i = 0;
        while (true) {
            if (i >= ebgVar.F.size()) {
                Iterator it = ebgVar.d().iterator();
                while (it.hasNext()) {
                    if (!sh7.e((Map.Entry) it.next())) {
                    }
                }
                return true;
            }
            if (!sh7.e((Map.Entry) ebgVar.F.get(i))) {
                break;
            }
            i++;
        }
        return false;
    }

    public final int j() {
        ebg ebgVar = this.E.a;
        int iD = 0;
        for (int i = 0; i < ebgVar.F.size(); i++) {
            Map.Entry entry = (Map.Entry) ebgVar.F.get(i);
            iD += sh7.d((s28) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : ebgVar.d()) {
            iD += sh7.d((s28) entry2.getKey(), entry2.getValue());
        }
        return iD;
    }

    public final Object k(t28 t28Var) {
        o(t28Var);
        s28 s28Var = t28Var.d;
        Object obj = this.E.a.get(s28Var);
        if (obj == null) {
            return t28Var.b;
        }
        if (!s28Var.G) {
            return t28Var.a(obj);
        }
        if (s28Var.F.E != ffj.M) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(t28Var.a(it.next()));
        }
        return arrayList;
    }

    public final boolean l(t28 t28Var) {
        o(t28Var);
        s28 s28Var = t28Var.d;
        sh7 sh7Var = this.E;
        sh7Var.getClass();
        if (!s28Var.G) {
            return sh7Var.a.get(s28Var) != null;
        }
        sz6.p("hasField() can only be called on non-repeated fields.");
        return false;
    }

    public final void m() {
        this.E.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(defpackage.t34 r9, defpackage.v34 r10, defpackage.oc7 r11, int r12) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r28.n(t34, v34, oc7, int):boolean");
    }

    public final void o(t28 t28Var) {
        if (t28Var.a == a()) {
            return;
        }
        sz6.p("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    public r28() {
        this.E = new sh7();
    }
}
