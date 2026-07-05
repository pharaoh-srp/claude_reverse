package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class j2e extends sn7 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2e(j7g j7gVar, j7g j7gVar2) {
        super(j7gVar, j7gVar2);
        j7gVar.getClass();
        j7gVar2.getClass();
        as9.a.b(j7gVar, j7gVar2);
    }

    public static final ArrayList q0(g06 g06Var, yr9 yr9Var) throws IOException {
        List<vai> listH = yr9Var.H();
        ArrayList arrayList = new ArrayList(x44.y(listH, 10));
        for (vai vaiVar : listH) {
            vaiVar.getClass();
            StringBuilder sb = new StringBuilder();
            w44.R0(x44.W(vaiVar), sb, ", ", null, null, new e06(g06Var, 0), 60);
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    public static final String r0(String str, String str2) {
        if (!bsg.v0(str, '<')) {
            return str;
        }
        return bsg.g1(str, '<') + '<' + str2 + '>' + bsg.d1('>', str, str);
    }

    @Override // defpackage.sn7, defpackage.yr9
    public final fab G() {
        xh3 xh3VarA = O().a();
        qqb qqbVar = xh3VarA instanceof qqb ? (qqb) xh3VarA : null;
        if (qqbVar == null) {
            sz6.k("Incorrect classifier: ", O().a());
            return null;
        }
        fab fabVarO = qqbVar.o(new i2e());
        fabVarO.getClass();
        return fabVarO;
    }

    @Override // defpackage.yr9
    public final yr9 j0(es9 es9Var) {
        es9Var.getClass();
        j7g j7gVar = this.F;
        j7gVar.getClass();
        j7g j7gVar2 = this.G;
        j7gVar2.getClass();
        return new j2e(j7gVar, j7gVar2);
    }

    @Override // defpackage.fhi
    public final fhi l0(boolean z) {
        return new j2e(this.F.l0(z), this.G.l0(z));
    }

    @Override // defpackage.fhi
    /* JADX INFO: renamed from: m0 */
    public final fhi j0(es9 es9Var) {
        es9Var.getClass();
        j7g j7gVar = this.F;
        j7gVar.getClass();
        j7g j7gVar2 = this.G;
        j7gVar2.getClass();
        return new j2e(j7gVar, j7gVar2);
    }

    @Override // defpackage.fhi
    public final fhi n0(r9i r9iVar) {
        r9iVar.getClass();
        return new j2e(this.F.n0(r9iVar), this.G.n0(r9iVar));
    }

    @Override // defpackage.sn7
    public final j7g o0() {
        return this.F;
    }

    @Override // defpackage.sn7
    public final String p0(g06 g06Var, g06 g06Var2) throws IOException {
        j7g j7gVar = this.F;
        String strZ = g06Var.Z(j7gVar);
        j7g j7gVar2 = this.G;
        String strZ2 = g06Var.Z(j7gVar2);
        if (g06Var2.a.o()) {
            return "raw (" + strZ + ".." + strZ2 + ')';
        }
        if (j7gVar2.H().isEmpty()) {
            return g06Var.G(strZ, strZ2, jwk.x(this));
        }
        ArrayList arrayListQ0 = q0(g06Var, j7gVar);
        ArrayList arrayListQ02 = q0(g06Var, j7gVar2);
        String strS0 = w44.S0(arrayListQ0, ", ", null, null, p9d.K, 30);
        ArrayList<cpc> arrayListV1 = w44.v1(arrayListQ0, arrayListQ02);
        if (arrayListV1.isEmpty()) {
            strZ2 = r0(strZ2, strS0);
        } else {
            for (cpc cpcVar : arrayListV1) {
                String str = (String) cpcVar.E;
                String str2 = (String) cpcVar.F;
                if (!x44.r(str, bsg.R0(str2, "out ")) && !str2.equals("*")) {
                    break;
                }
            }
            strZ2 = r0(strZ2, strS0);
        }
        String strR0 = r0(strZ, strS0);
        return strR0.equals(strZ2) ? strR0 : g06Var.G(strR0, strZ2, jwk.x(this));
    }
}
