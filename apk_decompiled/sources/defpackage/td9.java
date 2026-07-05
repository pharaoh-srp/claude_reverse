package defpackage;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class td9 {
    public static final Map a = sta.h0(new cpc("PACKAGE", EnumSet.noneOf(xr9.class)), new cpc(CredentialProviderBaseController.TYPE_TAG, EnumSet.of(xr9.CLASS, xr9.FILE)), new cpc("ANNOTATION_TYPE", EnumSet.of(xr9.ANNOTATION_CLASS)), new cpc("TYPE_PARAMETER", EnumSet.of(xr9.TYPE_PARAMETER)), new cpc("FIELD", EnumSet.of(xr9.FIELD)), new cpc("LOCAL_VARIABLE", EnumSet.of(xr9.LOCAL_VARIABLE)), new cpc("PARAMETER", EnumSet.of(xr9.VALUE_PARAMETER)), new cpc("CONSTRUCTOR", EnumSet.of(xr9.CONSTRUCTOR)), new cpc("METHOD", EnumSet.of(xr9.FUNCTION, xr9.PROPERTY_GETTER, xr9.PROPERTY_SETTER)), new cpc("TYPE_USE", EnumSet.of(xr9.TYPE)));
    public static final Map b = sta.h0(new cpc("RUNTIME", wr9.E), new cpc("CLASS", wr9.F), new cpc("SOURCE", wr9.G));

    public static lp0 a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof pbe) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) a.get(sxb.e(((pbe) it.next()).b.name()).b());
            if (iterable == null) {
                iterable = um6.E;
            }
            b54.t0(arrayList2, iterable);
        }
        ArrayList arrayList3 = new ArrayList(x44.y(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new mq6(gh3.j(okg.u), sxb.e(((xr9) it2.next()).name())));
        }
        return new lp0(f06.S, arrayList3);
    }
}
