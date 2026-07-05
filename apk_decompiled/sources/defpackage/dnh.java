package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.anthropic.claude.analytics.events.ThirdPartyToolEvents$ThirdPartyToolParseFailed;
import com.anthropic.claude.analytics.events.ThirdPartyToolEvents$ThirdPartyToolToggled;
import com.anthropic.claude.api.chat.tool.Tool;
import com.anthropic.claude.tool.ToolIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class dnh {
    public final Context a;
    public final h86 b;
    public final mwh c;
    public final fk0 d;
    public final dyh e;
    public final qi3 f;
    public final mn5 g;
    public final wlg h;
    public final wlg i;
    public final wz5 j;
    public final wz5 k;
    public final kdg l = new kdg();
    public final wz5 m;
    public final wz5 n;
    public final wz5 o;

    public dnh(Context context, h86 h86Var, mwh mwhVar, fk0 fk0Var, dyh dyhVar, qi3 qi3Var, mn5 mn5Var, rc8 rc8Var, fn0 fn0Var) {
        this.a = context;
        this.b = h86Var;
        this.c = mwhVar;
        this.d = fk0Var;
        this.e = dyhVar;
        this.f = qi3Var;
        this.g = mn5Var;
        this.h = rc8Var.m("android_octopus_enabled");
        this.i = rc8Var.m("android_octopus_voice_enabled");
        final int i = 0;
        this.j = mpk.w(new zy7(this) { // from class: ymh
            public final /* synthetic */ dnh F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Object next;
                int i2 = i;
                dnh dnhVar = this.F;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(((Boolean) dnhVar.h.getValue()).booleanValue() || ((Boolean) dnhVar.d.J.getValue()).booleanValue());
                    case 1:
                        return Boolean.valueOf((((Boolean) dnhVar.j.getValue()).booleanValue() && ((Boolean) dnhVar.i.getValue()).booleanValue()) || ((Boolean) dnhVar.d.J.getValue()).booleanValue());
                    case 2:
                        if (!((Boolean) dnhVar.j.getValue()).booleanValue()) {
                            return lm6.E;
                        }
                        kdg kdgVar = dnhVar.l;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator = kdgVar.listIterator();
                        while (true) {
                            c8a c8aVar = (c8a) listIterator;
                            if (!c8aVar.hasNext()) {
                                return arrayList;
                            }
                            Object next2 = c8aVar.next();
                            String strR = ((xmh) next2).r();
                            strR.getClass();
                            dyh dyhVar2 = dnhVar.e;
                            String strM913constructorimpl = ToolIdentifier.m913constructorimpl(strR);
                            strM913constructorimpl.getClass();
                            String strConcat = "third_party__".concat(strM913constructorimpl);
                            mdg mdgVar = dyhVar2.b;
                            Object obj = mdgVar.get(strConcat);
                            if (obj == null) {
                                String string = dyhVar2.a.getString(strConcat, "NEVER");
                                Iterator<E> it = eyh.I.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        if (x44.r(((eyh) next).name(), string)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                eyh eyhVar = (eyh) next;
                                obj = eyhVar == null ? eyh.E : eyhVar;
                                mdgVar.put(strConcat, obj);
                            }
                            if (((eyh) obj).a()) {
                                arrayList.add(next2);
                            }
                        }
                        break;
                    case 3:
                        kdg kdgVar2 = dnhVar.l;
                        ArrayList arrayList2 = new ArrayList(x44.y(kdgVar2, 10));
                        ListIterator listIterator2 = kdgVar2.listIterator();
                        while (true) {
                            c8a c8aVar2 = (c8a) listIterator2;
                            if (!c8aVar2.hasNext()) {
                                return arrayList2;
                            }
                            arrayList2.add(enh.a((xmh) c8aVar2.next()));
                        }
                        break;
                    default:
                        return Integer.valueOf(((List) dnhVar.m.getValue()).size());
                }
            }
        });
        final int i2 = 1;
        this.k = mpk.w(new zy7(this) { // from class: ymh
            public final /* synthetic */ dnh F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Object next;
                int i22 = i2;
                dnh dnhVar = this.F;
                switch (i22) {
                    case 0:
                        return Boolean.valueOf(((Boolean) dnhVar.h.getValue()).booleanValue() || ((Boolean) dnhVar.d.J.getValue()).booleanValue());
                    case 1:
                        return Boolean.valueOf((((Boolean) dnhVar.j.getValue()).booleanValue() && ((Boolean) dnhVar.i.getValue()).booleanValue()) || ((Boolean) dnhVar.d.J.getValue()).booleanValue());
                    case 2:
                        if (!((Boolean) dnhVar.j.getValue()).booleanValue()) {
                            return lm6.E;
                        }
                        kdg kdgVar = dnhVar.l;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator = kdgVar.listIterator();
                        while (true) {
                            c8a c8aVar = (c8a) listIterator;
                            if (!c8aVar.hasNext()) {
                                return arrayList;
                            }
                            Object next2 = c8aVar.next();
                            String strR = ((xmh) next2).r();
                            strR.getClass();
                            dyh dyhVar2 = dnhVar.e;
                            String strM913constructorimpl = ToolIdentifier.m913constructorimpl(strR);
                            strM913constructorimpl.getClass();
                            String strConcat = "third_party__".concat(strM913constructorimpl);
                            mdg mdgVar = dyhVar2.b;
                            Object obj = mdgVar.get(strConcat);
                            if (obj == null) {
                                String string = dyhVar2.a.getString(strConcat, "NEVER");
                                Iterator<E> it = eyh.I.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        if (x44.r(((eyh) next).name(), string)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                eyh eyhVar = (eyh) next;
                                obj = eyhVar == null ? eyh.E : eyhVar;
                                mdgVar.put(strConcat, obj);
                            }
                            if (((eyh) obj).a()) {
                                arrayList.add(next2);
                            }
                        }
                        break;
                    case 3:
                        kdg kdgVar2 = dnhVar.l;
                        ArrayList arrayList2 = new ArrayList(x44.y(kdgVar2, 10));
                        ListIterator listIterator2 = kdgVar2.listIterator();
                        while (true) {
                            c8a c8aVar2 = (c8a) listIterator2;
                            if (!c8aVar2.hasNext()) {
                                return arrayList2;
                            }
                            arrayList2.add(enh.a((xmh) c8aVar2.next()));
                        }
                        break;
                    default:
                        return Integer.valueOf(((List) dnhVar.m.getValue()).size());
                }
            }
        });
        final int i3 = 3;
        gb9.D(fn0Var, null, null, new fj(this, null, 26), 3);
        final int i4 = 2;
        this.m = mpk.w(new zy7(this) { // from class: ymh
            public final /* synthetic */ dnh F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Object next;
                int i22 = i4;
                dnh dnhVar = this.F;
                switch (i22) {
                    case 0:
                        return Boolean.valueOf(((Boolean) dnhVar.h.getValue()).booleanValue() || ((Boolean) dnhVar.d.J.getValue()).booleanValue());
                    case 1:
                        return Boolean.valueOf((((Boolean) dnhVar.j.getValue()).booleanValue() && ((Boolean) dnhVar.i.getValue()).booleanValue()) || ((Boolean) dnhVar.d.J.getValue()).booleanValue());
                    case 2:
                        if (!((Boolean) dnhVar.j.getValue()).booleanValue()) {
                            return lm6.E;
                        }
                        kdg kdgVar = dnhVar.l;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator = kdgVar.listIterator();
                        while (true) {
                            c8a c8aVar = (c8a) listIterator;
                            if (!c8aVar.hasNext()) {
                                return arrayList;
                            }
                            Object next2 = c8aVar.next();
                            String strR = ((xmh) next2).r();
                            strR.getClass();
                            dyh dyhVar2 = dnhVar.e;
                            String strM913constructorimpl = ToolIdentifier.m913constructorimpl(strR);
                            strM913constructorimpl.getClass();
                            String strConcat = "third_party__".concat(strM913constructorimpl);
                            mdg mdgVar = dyhVar2.b;
                            Object obj = mdgVar.get(strConcat);
                            if (obj == null) {
                                String string = dyhVar2.a.getString(strConcat, "NEVER");
                                Iterator<E> it = eyh.I.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        if (x44.r(((eyh) next).name(), string)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                eyh eyhVar = (eyh) next;
                                obj = eyhVar == null ? eyh.E : eyhVar;
                                mdgVar.put(strConcat, obj);
                            }
                            if (((eyh) obj).a()) {
                                arrayList.add(next2);
                            }
                        }
                        break;
                    case 3:
                        kdg kdgVar2 = dnhVar.l;
                        ArrayList arrayList2 = new ArrayList(x44.y(kdgVar2, 10));
                        ListIterator listIterator2 = kdgVar2.listIterator();
                        while (true) {
                            c8a c8aVar2 = (c8a) listIterator2;
                            if (!c8aVar2.hasNext()) {
                                return arrayList2;
                            }
                            arrayList2.add(enh.a((xmh) c8aVar2.next()));
                        }
                        break;
                    default:
                        return Integer.valueOf(((List) dnhVar.m.getValue()).size());
                }
            }
        });
        this.n = mpk.w(new zy7(this) { // from class: ymh
            public final /* synthetic */ dnh F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Object next;
                int i22 = i3;
                dnh dnhVar = this.F;
                switch (i22) {
                    case 0:
                        return Boolean.valueOf(((Boolean) dnhVar.h.getValue()).booleanValue() || ((Boolean) dnhVar.d.J.getValue()).booleanValue());
                    case 1:
                        return Boolean.valueOf((((Boolean) dnhVar.j.getValue()).booleanValue() && ((Boolean) dnhVar.i.getValue()).booleanValue()) || ((Boolean) dnhVar.d.J.getValue()).booleanValue());
                    case 2:
                        if (!((Boolean) dnhVar.j.getValue()).booleanValue()) {
                            return lm6.E;
                        }
                        kdg kdgVar = dnhVar.l;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator = kdgVar.listIterator();
                        while (true) {
                            c8a c8aVar = (c8a) listIterator;
                            if (!c8aVar.hasNext()) {
                                return arrayList;
                            }
                            Object next2 = c8aVar.next();
                            String strR = ((xmh) next2).r();
                            strR.getClass();
                            dyh dyhVar2 = dnhVar.e;
                            String strM913constructorimpl = ToolIdentifier.m913constructorimpl(strR);
                            strM913constructorimpl.getClass();
                            String strConcat = "third_party__".concat(strM913constructorimpl);
                            mdg mdgVar = dyhVar2.b;
                            Object obj = mdgVar.get(strConcat);
                            if (obj == null) {
                                String string = dyhVar2.a.getString(strConcat, "NEVER");
                                Iterator<E> it = eyh.I.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        if (x44.r(((eyh) next).name(), string)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                eyh eyhVar = (eyh) next;
                                obj = eyhVar == null ? eyh.E : eyhVar;
                                mdgVar.put(strConcat, obj);
                            }
                            if (((eyh) obj).a()) {
                                arrayList.add(next2);
                            }
                        }
                        break;
                    case 3:
                        kdg kdgVar2 = dnhVar.l;
                        ArrayList arrayList2 = new ArrayList(x44.y(kdgVar2, 10));
                        ListIterator listIterator2 = kdgVar2.listIterator();
                        while (true) {
                            c8a c8aVar2 = (c8a) listIterator2;
                            if (!c8aVar2.hasNext()) {
                                return arrayList2;
                            }
                            arrayList2.add(enh.a((xmh) c8aVar2.next()));
                        }
                        break;
                    default:
                        return Integer.valueOf(((List) dnhVar.m.getValue()).size());
                }
            }
        });
        final int i5 = 4;
        this.o = mpk.w(new zy7(this) { // from class: ymh
            public final /* synthetic */ dnh F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                Object next;
                int i22 = i5;
                dnh dnhVar = this.F;
                switch (i22) {
                    case 0:
                        return Boolean.valueOf(((Boolean) dnhVar.h.getValue()).booleanValue() || ((Boolean) dnhVar.d.J.getValue()).booleanValue());
                    case 1:
                        return Boolean.valueOf((((Boolean) dnhVar.j.getValue()).booleanValue() && ((Boolean) dnhVar.i.getValue()).booleanValue()) || ((Boolean) dnhVar.d.J.getValue()).booleanValue());
                    case 2:
                        if (!((Boolean) dnhVar.j.getValue()).booleanValue()) {
                            return lm6.E;
                        }
                        kdg kdgVar = dnhVar.l;
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator = kdgVar.listIterator();
                        while (true) {
                            c8a c8aVar = (c8a) listIterator;
                            if (!c8aVar.hasNext()) {
                                return arrayList;
                            }
                            Object next2 = c8aVar.next();
                            String strR = ((xmh) next2).r();
                            strR.getClass();
                            dyh dyhVar2 = dnhVar.e;
                            String strM913constructorimpl = ToolIdentifier.m913constructorimpl(strR);
                            strM913constructorimpl.getClass();
                            String strConcat = "third_party__".concat(strM913constructorimpl);
                            mdg mdgVar = dyhVar2.b;
                            Object obj = mdgVar.get(strConcat);
                            if (obj == null) {
                                String string = dyhVar2.a.getString(strConcat, "NEVER");
                                Iterator<E> it = eyh.I.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next = it.next();
                                        if (x44.r(((eyh) next).name(), string)) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                eyh eyhVar = (eyh) next;
                                obj = eyhVar == null ? eyh.E : eyhVar;
                                mdgVar.put(strConcat, obj);
                            }
                            if (((eyh) obj).a()) {
                                arrayList.add(next2);
                            }
                        }
                        break;
                    case 3:
                        kdg kdgVar2 = dnhVar.l;
                        ArrayList arrayList2 = new ArrayList(x44.y(kdgVar2, 10));
                        ListIterator listIterator2 = kdgVar2.listIterator();
                        while (true) {
                            c8a c8aVar2 = (c8a) listIterator2;
                            if (!c8aVar2.hasNext()) {
                                return arrayList2;
                            }
                            arrayList2.add(enh.a((xmh) c8aVar2.next()));
                        }
                        break;
                    default:
                        return Integer.valueOf(((List) dnhVar.m.getValue()).size());
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.dnh r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, defpackage.vp4 r17) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnh.a(dnh, java.lang.String, java.lang.String, java.lang.String, vp4):java.lang.Object");
    }

    public static final xmh b(dnh dnhVar, String str, String str2, Tool.CustomTool customTool) {
        qi3 qi3Var = dnhVar.f;
        ide ideVar = xmh.o;
        boolean zF = xrk.f(customTool.getName());
        sfa sfaVar = sfa.WARN;
        if (!zF) {
            zfa.a.getClass();
            if (yfa.b()) {
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList = new ArrayList();
                for (Object obj : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj)).getClass();
                    arrayList.add(obj);
                }
                if (!arrayList.isEmpty()) {
                    zfa.a.getClass();
                    String strL = ij0.l("Rejecting tool '", customTool.getName(), "' from ", str, ": name must match ^[a-zA-Z0-9_-]+$");
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n30) ((zfa) it.next())).b(sfaVar, "ThirdPartyAppToolBridge", strL);
                    }
                }
            }
            qi3Var.e(new ThirdPartyToolEvents$ThirdPartyToolParseFailed(str, "invalid_name"), ThirdPartyToolEvents$ThirdPartyToolParseFailed.Companion.serializer());
            return null;
        }
        String strC = xrk.c(str, customTool.getName());
        if (strC.length() <= 64) {
            return new xmh(str, str2, customTool, dnhVar.b, dnhVar.f, dnhVar.g, dnhVar.c);
        }
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
                String strM = ij0.m(kgh.r("Rejecting tool '", customTool.getName(), "' from ", str, ": composite identifier '"), strC, "' exceeds 64 characters");
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((n30) ((zfa) it2.next())).b(sfaVar, "ThirdPartyAppToolBridge", strM);
                }
            }
        }
        qi3Var.e(new ThirdPartyToolEvents$ThirdPartyToolParseFailed(str, "name_too_long"), ThirdPartyToolEvents$ThirdPartyToolParseFailed.Companion.serializer());
        return null;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.vp4 r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnh.c(vp4):java.lang.Object");
    }

    public final void d(String str, eyh eyhVar) {
        Object next;
        str.getClass();
        eyhVar.getClass();
        String strM913constructorimpl = ToolIdentifier.m913constructorimpl(str);
        strM913constructorimpl.getClass();
        String strConcat = "third_party__".concat(strM913constructorimpl);
        dyh dyhVar = this.e;
        dyhVar.b.put(strConcat, eyhVar);
        SharedPreferences.Editor editorEdit = dyhVar.a.edit();
        editorEdit.putString(strConcat, eyhVar.name());
        editorEdit.apply();
        ListIterator listIterator = this.l.listIterator();
        while (true) {
            c8a c8aVar = (c8a) listIterator;
            if (!c8aVar.hasNext()) {
                next = null;
                break;
            } else {
                next = c8aVar.next();
                if (x44.r(((xmh) next).r(), str)) {
                    break;
                }
            }
        }
        xmh xmhVar = (xmh) next;
        if (xmhVar != null) {
            this.f.e(new ThirdPartyToolEvents$ThirdPartyToolToggled(xmhVar.x(), str, eyhVar.a()), ThirdPartyToolEvents$ThirdPartyToolToggled.Companion.serializer());
        }
    }
}
