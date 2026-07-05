package com.anthropic.claude.conway;

import com.anthropic.claude.conway.ConwayAppScreen;
import com.anthropic.claude.conway.protocol.ConwayAppScreenSpec;
import com.anthropic.claude.conway.protocol.ConwayExtensionMeta;
import defpackage.amg;
import defpackage.b54;
import defpackage.bsg;
import defpackage.c61;
import defpackage.gb9;
import defpackage.h86;
import defpackage.hre;
import defpackage.hsf;
import defpackage.iei;
import defpackage.iuj;
import defpackage.jre;
import defpackage.kgh;
import defpackage.kk0;
import defpackage.l45;
import defpackage.m45;
import defpackage.n30;
import defpackage.pz7;
import defpackage.sf5;
import defpackage.sfa;
import defpackage.sq6;
import defpackage.sz6;
import defpackage.tp4;
import defpackage.uw4;
import defpackage.x44;
import defpackage.xzg;
import defpackage.yfa;
import defpackage.zfa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends xzg implements pz7 {
    public int E;
    public /* synthetic */ Object F;
    public final /* synthetic */ f G;
    public final /* synthetic */ hsf H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, hsf hsfVar, tp4 tp4Var) {
        super(2, tp4Var);
        this.G = fVar;
        this.H = hsfVar;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        e eVar = new e(this.G, this.H, tp4Var);
        eVar.F = obj;
        return eVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((l45) obj, (tp4) obj2)).invokeSuspend(iei.a);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object hreVar;
        char c;
        Object next;
        Object objC0;
        f fVar = this.G;
        amg amgVar = fVar.C;
        amg amgVar2 = fVar.A;
        l45 l45Var = (l45) this.F;
        int i = this.E;
        tp4 tp4Var = null;
        try {
            if (i == 0) {
                sf5.h0(obj);
                hsf hsfVar = this.H;
                c61 c61VarA = ((uw4) fVar.j).a(hsfVar.b, hsfVar.c);
                this.F = l45Var;
                this.E = 1;
                objC0 = gb9.c0(((h86) c61VarA.I).b(), new kk0(c61VarA, tp4Var, 20), this);
                m45 m45Var = m45.E;
                if (objC0 == m45Var) {
                    return m45Var;
                }
            } else {
                if (i != 1) {
                    sz6.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sf5.h0(obj);
                objC0 = obj;
            }
            hreVar = (List) objC0;
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        if (!(hreVar instanceof hre)) {
            List list = (List) hreVar;
            Set set = g.a;
            list.getClass();
            ArrayList<ConwayExtensionMeta> arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (!g.a.contains(((ConwayExtensionMeta) obj2).getName())) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (ConwayExtensionMeta conwayExtensionMeta : arrayList) {
                List<ConwayAppScreenSpec> appScreens = conwayExtensionMeta.getAppScreens();
                ArrayList arrayList3 = new ArrayList(x44.y(appScreens, 10));
                for (ConwayAppScreenSpec conwayAppScreenSpec : appScreens) {
                    String name = conwayExtensionMeta.getName();
                    String displayName = conwayExtensionMeta.getDisplayName();
                    if (displayName == null) {
                        displayName = conwayExtensionMeta.getName();
                    }
                    arrayList3.add(new ConwayAppScreen.Extension(name, displayName, conwayAppScreenSpec.getName(), conwayAppScreenSpec.getUrl()));
                }
                b54.t0(arrayList2, arrayList3);
            }
            amgVar2.getClass();
            amgVar2.n(null, arrayList2);
            ConwayAppScreen.Extension extension = (ConwayAppScreen.Extension) amgVar.getValue();
            if (extension != null) {
                char c2 = 0;
                String strL1 = bsg.l1(bsg.g1(bsg.g1(extension.getUrl(), '?'), '#'), '/');
                String url = extension.getUrl();
                String url2 = extension.getUrl();
                int length = url2.length();
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        c = c2;
                        i2 = -1;
                        break;
                    }
                    c = c2;
                    char cCharAt = url2.charAt(i2);
                    if (cCharAt == '?' || cCharAt == '#') {
                        break;
                    }
                    i2++;
                    c2 = c;
                }
                Integer num = new Integer(i2);
                if (num.intValue() < 0) {
                    num = null;
                }
                String strX0 = bsg.x0(num != null ? num.intValue() : extension.getUrl().length(), url);
                Iterator it = ((Iterable) amgVar2.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    ConwayAppScreen.Extension extension2 = (ConwayAppScreen.Extension) next;
                    if (x44.r(extension2.getExtensionName(), extension.getExtensionName())) {
                        String url3 = extension2.getUrl();
                        char[] cArr = new char[1];
                        cArr[c] = '/';
                        if (x44.r(bsg.l1(url3, cArr), strL1)) {
                            break;
                        }
                    }
                }
                ConwayAppScreen.Extension extension3 = (ConwayAppScreen.Extension) next;
                if (extension3 == null) {
                    amgVar.m(null);
                } else {
                    amgVar.m(ConwayAppScreen.Extension.copy$default(extension3, null, null, null, kgh.o(extension3.getUrl(), strX0), 7, null));
                }
            }
        }
        Throwable thA = jre.a(hreVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            zfa.a.getClass();
            if (yfa.b()) {
                String strE = iuj.E(l45Var);
                CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : copyOnWriteArrayList) {
                    ((n30) ((zfa) obj3)).getClass();
                    arrayList4.add(obj3);
                }
                if (!arrayList4.isEmpty()) {
                    String strS = sq6.s(zfa.a, thA, "Extension app_screens fetch failed: ");
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        ((n30) ((zfa) it2.next())).b(sfa.WARN, strE, strS);
                    }
                }
            }
        }
        return iei.a;
    }
}
