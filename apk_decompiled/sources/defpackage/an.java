package defpackage;

import com.anthropic.claude.types.strings.SessionId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class an extends iwe {
    public final sl b;
    public final qzb c;
    public final j8i d;
    public final lsc e;
    public final lsc f;
    public final lsc g;

    public an(sl slVar, qzb qzbVar, j8i j8iVar, h86 h86Var) {
        super(h86Var);
        this.b = slVar;
        this.c = qzbVar;
        this.d = j8iVar;
        this.e = mpk.P("");
        Boolean bool = Boolean.FALSE;
        this.f = mpk.P(bool);
        this.g = mpk.P(bool);
        gb9.D(this.a, null, null, new ym(this, null, 0), 3);
    }

    public final boolean O() {
        return ((Boolean) ((vm) this.b).y.getValue()).booleanValue();
    }

    public final boolean P() {
        wk wkVar = ((vm) this.b).t;
        return (!((Boolean) ((i8c) wkVar.e).d.getValue()).booleanValue() || ((Boolean) ((lsc) wkVar.i).getValue()).booleanValue() || puk.h(((koi) wkVar.f).d().getNotification_preferences(), g9c.K)) ? false : true;
    }

    public final void Q(fk fkVar) {
        Object gkVar;
        fkVar.getClass();
        boolean z = fkVar.c;
        vm vmVar = (vm) this.b;
        vmVar.getClass();
        kk kkVar = vmVar.V;
        kkVar.getClass();
        Set set = kk.l;
        String str = fkVar.e;
        if (str == null) {
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj)).getClass();
                    arrayList.add(obj);
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                zfa.a.getClass();
                String str2 = "openAttachment: no fileUuid for '" + fkVar.b() + "' (isResolved=" + fkVar.f + ") — chip should have been inert";
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.WARN, "AgentChat", str2);
                }
                return;
            }
            return;
        }
        String strA = ikb.a(fkVar.b());
        zfa.a.getClass();
        if (yfa.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : copyOnWriteArrayList2) {
                ((n30) ((zfa) obj2)).getClass();
                arrayList2.add(obj2);
            }
            if (!arrayList2.isEmpty()) {
                zfa.a.getClass();
                String strB = fkVar.b();
                String str3 = z ? "image-viewer" : strA.equals("pdf") ? "pdf-viewer" : (ikb.a.contains(strA) || set.contains(strA)) ? "code-viewer" : "download";
                StringBuilder sbR = kgh.r("openAttachment: '", strB, "' ext='", strA, "' isImage=");
                sbR.append(z);
                sbR.append(" uuid=");
                sbR.append(str);
                sbR.append(" → ");
                sbR.append(str3);
                String string = sbR.toString();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((n30) ((zfa) it2.next())).b(sfa.DEBUG, "AgentChat", string);
                }
            }
        }
        if (z) {
            gkVar = new hk(fkVar, kkVar.b(str));
        } else if (strA.equals("pdf")) {
            gkVar = new ik(fkVar, kkVar.c(str));
        } else {
            if (!ikb.a.contains(strA) && !set.contains(strA)) {
                kkVar.a(fkVar);
                return;
            }
            String strO = kgh.o(kkVar.c.a(), kkVar.c(str));
            fkg fkgVar = kkVar.k;
            tp4 tp4Var = null;
            if (fkgVar != null) {
                fkgVar.d(null);
            }
            kkVar.k = gb9.D(kkVar.a, null, null, new o0(kkVar, fkVar, strO, tp4Var, 2), 3);
            gkVar = new gk(fkVar, strA, null);
        }
        kkVar.j.setValue(gkVar);
    }

    public final void R() {
        rl rlVar = ((vm) this.b).u;
        fkg fkgVar = (fkg) rlVar.J;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        SessionId sessionId = (SessionId) ((im) rlVar.I).a();
        String strM1120unboximpl = sessionId != null ? sessionId.m1120unboximpl() : null;
        if (strM1120unboximpl == null) {
            return;
        }
        rlVar.J = gb9.D((mp4) rlVar.F, null, null, new ql(rlVar, strM1120unboximpl, null), 3);
    }

    @Override // defpackage.iwe, defpackage.y59
    public final void onDestroy() {
        ((vm) this.b).t();
        super.onDestroy();
    }
}
