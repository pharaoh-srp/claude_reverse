package defpackage;

import android.text.TextUtils;
import com.google.android.gms.internal.measurement.m;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class uh4 extends zna {
    public final /* synthetic */ int g = 1;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh4(pkk pkkVar) {
        super(20);
        this.h = pkkVar;
    }

    @Override // defpackage.zna
    public final Object a(Object obj) {
        m mVar;
        LinkedHashMap linkedHashMap;
        switch (this.g) {
            case 0:
                String str = (String) obj;
                str.getClass();
                return ((vh4) this.h).E.L0(str);
            default:
                String str2 = (String) obj;
                dgj.s(str2);
                pkk pkkVar = (pkk) this.h;
                pkkVar.O0();
                dgj.s(str2);
                if (TextUtils.isEmpty(str2) || (mVar = (m) pkkVar.L.get(str2)) == null || mVar.p() == 0) {
                    return null;
                }
                if (!pkkVar.L.containsKey(str2) || pkkVar.L.get(str2) == null) {
                    pkkVar.j1(str2);
                } else {
                    pkkVar.W0(str2, (m) pkkVar.L.get(str2));
                }
                uh4 uh4Var = pkkVar.N;
                synchronized (uh4Var.c) {
                    Set setEntrySet = uh4Var.b.a.entrySet();
                    setEntrySet.getClass();
                    linkedHashMap = new LinkedHashMap(setEntrySet.size());
                    Set<Map.Entry> setEntrySet2 = uh4Var.b.a.entrySet();
                    setEntrySet2.getClass();
                    for (Map.Entry entry : setEntrySet2) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                        break;
                    }
                }
                return (cuj) linkedHashMap.get(str2);
        }
    }

    @Override // defpackage.zna
    public void b(Object obj, Object obj2, Object obj3) throws Exception {
        switch (this.g) {
            case 0:
                tze tzeVar = (tze) obj2;
                ((String) obj).getClass();
                tzeVar.getClass();
                tzeVar.close();
                break;
            default:
                super.b(obj, obj2, obj3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uh4(vh4 vh4Var) {
        super(25);
        this.h = vh4Var;
    }
}
