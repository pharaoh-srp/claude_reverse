package defpackage;

import com.anthropic.claude.api.model.ModelSelectorSurface;
import com.anthropic.claude.code.remote.stores.a;
import com.anthropic.claude.sessions.types.PermissionMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class u3c {
    public final yih a;
    public final rc8 b;
    public final l45 c;
    public final oda d;
    public final c61 e;
    public final bx1 f;
    public final h80 g;
    public final lsc h;
    public final lsc i;
    public final kdg j;
    public final lsc k;
    public final lsc l;
    public final kdg m;
    public final LinkedHashMap n;
    public final boolean o;
    public final hi6 p;

    public u3c(yih yihVar, rc8 rc8Var, pkc pkcVar, spb spbVar, l45 l45Var, oda odaVar, c61 c61Var, bx1 bx1Var, h80 h80Var) {
        yihVar.getClass();
        rc8Var.getClass();
        pkcVar.getClass();
        spbVar.getClass();
        l45Var.getClass();
        this.a = yihVar;
        this.b = rc8Var;
        this.c = l45Var;
        this.d = odaVar;
        this.e = c61Var;
        this.f = bx1Var;
        this.g = h80Var;
        this.h = mpk.P(PermissionMode.Default);
        Boolean bool = Boolean.FALSE;
        this.i = mpk.P(bool);
        this.j = new kdg();
        this.k = mpk.P(bool);
        this.l = mpk.P(bool);
        this.m = new kdg();
        this.n = new LinkedHashMap();
        this.o = ((Boolean) rc8Var.m("ccr_video_attachments").getValue()).booleanValue();
        ModelSelectorSurface.Companion.getClass();
        this.p = new hi6(pkcVar, spbVar, ModelSelectorSurface.CODE);
    }

    public final boolean a() {
        c8a c8aVar;
        kdg kdgVar = this.m;
        if (kdgVar != null && kdgVar.isEmpty()) {
            return false;
        }
        ListIterator listIterator = kdgVar.listIterator();
        do {
            c8aVar = (c8a) listIterator;
            if (!c8aVar.hasNext()) {
                return false;
            }
        } while (((o32) c8aVar.next()).a() instanceof j32);
        return true;
    }

    public final boolean b() {
        kdg kdgVar = this.m;
        if (kdgVar != null && kdgVar.isEmpty()) {
            return false;
        }
        Iterator<E> it = kdgVar.iterator();
        while (it.hasNext()) {
            if (((o32) it.next()).a() instanceof j32) {
                return true;
            }
        }
        return false;
    }

    public final PermissionMode c() {
        return (PermissionMode) this.h.getValue();
    }

    public final void d(a aVar) {
        kdg kdgVar = this.j;
        ArrayList arrayList = new ArrayList(x44.y(kdgVar, 10));
        ListIterator listIterator = kdgVar.listIterator();
        while (true) {
            c8a c8aVar = (c8a) listIterator;
            if (!c8aVar.hasNext()) {
                break;
            } else {
                arrayList.add(((lhf) c8aVar.next()).a);
            }
        }
        aVar.i(arrayList);
        lhf lhfVar = (lhf) w44.N0(kdgVar);
        aVar.h(lhfVar != null ? lhfVar.a : null);
    }
}
