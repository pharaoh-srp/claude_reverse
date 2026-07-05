package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h62 {
    public final cve a;
    public final nyj b = new nyj(new u52(1, this), 26, new v52(1, this));

    public h62(cve cveVar) {
        this.a = cveVar;
    }

    public final Object a(List list, vp4 vp4Var) {
        StringBuilder sbO = ij0.o("SELECT * FROM cachedProjects WHERE uuid IN (");
        yfd.k(list.size(), sbO);
        sbO.append(")");
        return u00.G(vp4Var, this.a, true, false, new t52(sbO.toString(), list, this));
    }
}
