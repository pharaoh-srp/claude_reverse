package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w52 {
    public final cve a;
    public final nyj b = new nyj(new u52(0, this), 26, new v52(0, this));

    public w52(cve cveVar) {
        this.a = cveVar;
    }

    public final Object a(List list, xzg xzgVar) throws Throwable {
        StringBuilder sbO = ij0.o("DELETE FROM cachedConversations WHERE uuid IN (");
        yfd.k(list.size(), sbO);
        sbO.append(")");
        Object objG = u00.G(xzgVar, this.a, false, true, new t52(sbO.toString(), list));
        return objG == m45.E ? objG : iei.a;
    }

    public final Object b(s52 s52Var, xzg xzgVar) throws Throwable {
        Object objG = u00.G(xzgVar, this.a, false, true, new l0(this, 25, s52Var));
        return objG == m45.E ? objG : iei.a;
    }
}
