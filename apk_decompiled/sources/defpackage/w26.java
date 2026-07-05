package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class w26 {
    public static final String a = nga.e("DiagnosticsWrkr");

    public static final String a(jgj jgjVar, chj chjVar, m1h m1hVar, List list) throws IOException {
        StringBuilder sb = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tgj tgjVar = (tgj) it.next();
            xfj xfjVarD = amk.d(tgjVar);
            String str = tgjVar.a;
            l1h l1hVarA = m1hVar.a(xfjVarD);
            Integer numValueOf = l1hVarA != null ? Integer.valueOf(l1hVarA.c) : null;
            jgjVar.getClass();
            str.getClass();
            String strS0 = w44.S0((List) u00.E(jgjVar.a, true, false, new hti(str, 4)), ",", null, null, null, 62);
            chjVar.getClass();
            String strS02 = w44.S0((List) u00.E(chjVar.a, true, false, new hti(str, 15)), ",", null, null, null, 62);
            StringBuilder sbX = sq6.x("\n", str, "\t ");
            sbX.append(tgjVar.c);
            sbX.append("\t ");
            sbX.append(numValueOf);
            sbX.append("\t ");
            sbX.append(tgjVar.b.name());
            sbX.append("\t ");
            sbX.append(strS0);
            sbX.append("\t ");
            sbX.append(strS02);
            sbX.append('\t');
            sb.append(sbX.toString());
        }
        return sb.toString();
    }
}
