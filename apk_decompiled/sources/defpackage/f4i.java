package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class f4i implements tai, qef {
    public int E;
    public Object F;
    public Object G;
    public Object H;
    public Object I;

    public f4i(el5 el5Var, do5 do5Var, cf9 cf9Var, int i) {
        el5Var.getClass();
        cf9Var.getClass();
        this.F = el5Var;
        this.G = do5Var;
        this.E = i;
        ArrayList typeParameters = cf9Var.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i2));
            i2++;
        }
        this.H = linkedHashMap;
        this.I = ((ke9) ((el5) this.F).E).a.c(new h4(21, this));
    }

    @Override // defpackage.qef
    public void a(frh frhVar, yd7 yd7Var, t6f t6fVar) {
    }

    public r81 b() {
        return new r81((String) this.F, (String) this.G, (String) this.H, (f91) this.I, this.E);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2  */
    @Override // defpackage.qef
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(defpackage.ssc r31) {
        /*
            Method dump skipped, instruction units count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f4i.c(ssc):void");
    }

    public boolean d(f4i f4iVar, int i) {
        return f4iVar != null && Objects.equals(((hge[]) this.F)[i], ((hge[]) f4iVar.F)[i]) && Objects.equals(((f87[]) this.G)[i], ((f87[]) f4iVar.G)[i]);
    }

    public boolean e(int i) {
        return ((hge[]) this.F)[i] != null;
    }

    public void f(f91 f91Var) {
        this.I = f91Var;
    }

    public void g(String str) {
        this.G = str;
    }

    public void h(String str) {
        this.H = str;
    }

    public void i(int i) {
        this.E = i;
    }

    @Override // defpackage.tai
    public qai j(ybe ybeVar) {
        ybeVar.getClass();
        py9 py9Var = (py9) ((efa) this.I).invoke(ybeVar);
        return py9Var != null ? py9Var : ((tai) ((el5) this.F).F).j(ybeVar);
    }

    public void k(String str) {
        this.F = str;
    }

    public f4i(hge[] hgeVarArr, f87[] f87VarArr, r4i r4iVar, Object obj) {
        fd9.E(hgeVarArr.length == f87VarArr.length);
        this.F = hgeVarArr;
        this.G = (f87[]) f87VarArr.clone();
        this.H = r4iVar;
        this.I = obj;
        this.E = hgeVarArr.length;
    }
}
