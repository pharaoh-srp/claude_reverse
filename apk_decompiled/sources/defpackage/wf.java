package defpackage;

import com.google.crypto.tink.shaded.protobuf.a;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes3.dex */
public final class wf {
    public final Class a;
    public final /* synthetic */ int b;

    public wf(int i, Class cls) {
        this.b = i;
        this.a = cls;
    }

    public final Object a(a aVar) throws GeneralSecurityException {
        switch (this.b) {
            case 0:
                sf sfVar = (sf) aVar;
                return new efd(new lrb(sfVar.z().h()), sfVar.A().y());
            case 1:
                fg fgVar = (fg) aVar;
                wf[] wfVarArr = {new wf(2, jg.class)};
                HashMap map = new HashMap();
                for (wf wfVar : wfVarArr) {
                    boolean zContainsKey = map.containsKey(wfVar.a);
                    Class cls = wfVar.a;
                    if (zContainsKey) {
                        sz6.p(vb7.o(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return null;
                    }
                    map.put(cls, wfVar);
                }
                if (wfVarArr.length > 0) {
                    Class cls2 = wfVarArr[0].a;
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                lg lgVarZ = fgVar.z();
                wf wfVar2 = (wf) mapUnmodifiableMap.get(jg.class);
                if (wfVar2 == null) {
                    sz6.i(jg.class.getCanonicalName(), " not supported.", "Requested primitive class ");
                    return null;
                }
                jg jgVar = (jg) wfVar2.a(lgVarZ);
                wf[] wfVarArr2 = {new wf(8, doa.class)};
                HashMap map2 = new HashMap();
                for (wf wfVar3 : wfVarArr2) {
                    boolean zContainsKey2 = map2.containsKey(wfVar3.a);
                    Class cls3 = wfVar3.a;
                    if (zContainsKey2) {
                        sz6.p(vb7.o(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        return null;
                    }
                    map2.put(cls3, wfVar3);
                }
                if (wfVarArr2.length > 0) {
                    Class cls4 = wfVarArr2[0].a;
                }
                Map mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
                fn8 fn8VarA = fgVar.A();
                wf wfVar4 = (wf) mapUnmodifiableMap2.get(doa.class);
                if (wfVar4 != null) {
                    return new fn6(jgVar, (doa) wfVar4.a(fn8VarA), fgVar.A().B().A());
                }
                sz6.i(doa.class.getCanonicalName(), " not supported.", "Requested primitive class ");
                return null;
            case 2:
                lg lgVar = (lg) aVar;
                return new jg(lgVar.A().h(), lgVar.B().y());
            case 3:
                sg sgVar = (sg) aVar;
                return new qg(sgVar.z().h(), sgVar.A().y());
            case 4:
                return new bh(((dh) aVar).y().h(), 0);
            case 5:
                return new jh(((lh) aVar).y().h());
            case 6:
                return new rh(((th) aVar).y().h());
            case 7:
                return new bh(((ng2) aVar).y().h(), 2);
            case 8:
                fn8 fn8Var = (fn8) aVar;
                zf8 zf8VarZ = fn8Var.B().z();
                SecretKeySpec secretKeySpec = new SecretKeySpec(fn8Var.A().h(), "HMAC");
                int iA = fn8Var.B().A();
                int iOrdinal = zf8VarZ.ordinal();
                if (iOrdinal == 1) {
                    return new efd(new o5l("HMACSHA1", secretKeySpec), iA);
                }
                if (iOrdinal == 2) {
                    return new efd(new o5l("HMACSHA384", secretKeySpec), iA);
                }
                if (iOrdinal == 3) {
                    return new efd(new o5l("HMACSHA256", secretKeySpec), iA);
                }
                if (iOrdinal == 4) {
                    return new efd(new o5l("HMACSHA512", secretKeySpec), iA);
                }
                if (iOrdinal == 5) {
                    return new efd(new o5l("HMACSHA224", secretKeySpec), iA);
                }
                rl7.j("unknown hash");
                return null;
            case 9:
                String strX = ((mq9) aVar).y().x();
                return oq9.a(strX).c(strX);
            case 10:
                rq9 rq9Var = (rq9) aVar;
                String strY = rq9Var.y().y();
                return new pq9(rq9Var.y().x(), oq9.a(strY).c(strY));
            default:
                return new bh(((uij) aVar).y().h(), 3);
        }
    }
}
