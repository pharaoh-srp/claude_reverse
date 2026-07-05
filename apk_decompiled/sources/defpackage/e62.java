package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e62 {
    public final cve a;
    public final nyj b = new nyj(new c62(0), 26, new d62());

    public e62(cve cveVar) {
        this.a = cveVar;
    }

    public final Object a(String str, xzg xzgVar) throws Throwable {
        Object objG = u00.G(xzgVar, this.a, false, true, new o8(str, 24));
        return objG == m45.E ? objG : iei.a;
    }

    public final Object b(ArrayList arrayList, dx dxVar) {
        StringBuilder sbO = ij0.o("SELECT uuid FROM cachedMessages WHERE uuid IN (");
        yfd.k(arrayList.size(), sbO);
        sbO.append(")");
        return u00.G(dxVar, this.a, true, false, new o5(sbO.toString(), 5, arrayList));
    }

    public final Object c(List list, xzg xzgVar) throws Throwable {
        Object objG = u00.G(xzgVar, this.a, false, true, new l0(this, 26, list));
        return objG == m45.E ? objG : iei.a;
    }
}
