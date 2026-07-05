package com.anthropic.claude.bell.api;

import com.anthropic.claude.bell.api.BellApiData;
import defpackage.bg9;
import defpackage.bsg;
import defpackage.iik;
import defpackage.lz1;
import defpackage.mwa;
import defpackage.n30;
import defpackage.p5e;
import defpackage.pqe;
import defpackage.py1;
import defpackage.sfa;
import defpackage.uh6;
import defpackage.v40;
import defpackage.v84;
import defpackage.wd6;
import defpackage.wif;
import defpackage.x44;
import defpackage.xah;
import defpackage.y6j;
import defpackage.yfa;
import defpackage.yn1;
import defpackage.zfa;
import defpackage.zh6;
import defpackage.zni;
import defpackage.zy1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public final class a1 extends wif implements yn1 {
    public static final long i;
    public final bg9 d;
    public p5e e;
    public final zy1 f;
    public final v84 g;
    public volatile int h;

    static {
        lz1 lz1Var = uh6.F;
        i = v40.Q(4, zh6.SECONDS);
    }

    public a1(bg9 bg9Var) {
        this.d = bg9Var;
        zy1 zy1VarP = wd6.P(Integer.MAX_VALUE, 4, py1.F);
        this.f = zy1VarP;
        this.g = zni.c();
        zy1VarP.C(new defpackage.v0(15, this));
    }

    @Override // defpackage.wif, defpackage.rkk
    public final void j(y6j y6jVar, int i2, String str) {
        y6jVar.getClass();
        str.getClass();
        sfa sfaVar = sfa.DEBUG;
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
                String str2 = "onClosed: code=" + i2 + " reason=" + str;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfaVar, "BellApiWS", str2);
                }
            }
        }
        this.h = i2;
        super.j(y6jVar, i2, str);
        this.c = true;
        this.b = true;
        this.f.m(null);
    }

    @Override // defpackage.wif, defpackage.rkk
    public final void k(y6j y6jVar, int i2, String str) {
        sfa sfaVar = sfa.DEBUG;
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
                String str2 = "onClosing: code=" + i2 + " reason=" + str;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfaVar, "BellApiWS", str2);
                }
            }
        }
        this.h = i2;
        this.b = true;
        ((p5e) y6jVar).c(i2, str);
    }

    @Override // defpackage.wif, defpackage.rkk
    public final void l(y6j y6jVar, Exception exc, pqe pqeVar) {
        y6jVar.getClass();
        sfa sfaVar = sfa.DEBUG;
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
                String str = "onFailure: " + exc.getMessage() + " response=" + pqeVar;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfaVar, "BellApiWS", str);
                }
            }
        }
        super.l(y6jVar, exc, pqeVar);
        this.c = true;
        this.b = true;
        this.f.m(null);
    }

    @Override // defpackage.rkk
    public final void m(y6j y6jVar, String str) {
        try {
            iik.i(this.f, new BellApiData.MessageData((BellApiServerMessage) this.d.b(str, BellApiServerMessage.Companion.serializer())));
        } catch (Exception e) {
            List list = xah.a;
            xah.f(e, "Bell Mode server message parsing failed.", null, null, 28);
        }
    }

    @Override // defpackage.rkk
    public final void n(y6j y6jVar, ByteString byteString) {
        iik.i(this.f, new BellApiData.AudioData(byteString.s()));
    }

    public final void q() {
        sfa sfaVar = sfa.DEBUG;
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
                String str = "requestClose called (isClosing=" + this.b + ", isClosed=" + this.c + ")\n" + bsg.j1(500, mwa.N(new Throwable()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfaVar, "BellApiWS", str);
                }
            }
        }
        if (!this.b && !this.c) {
            p5e p5eVar = this.e;
            if (p5eVar == null) {
                x44.o0("ws");
                throw null;
            }
            p5eVar.i("{ \"type\": \"close_stream\" }");
        }
        this.b = true;
        this.f.m(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(defpackage.vp4 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.xh1
            if (r0 == 0) goto L13
            r0 = r8
            xh1 r0 = (defpackage.xh1) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            xh1 r0 = new xh1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.E
            m45 r1 = defpackage.m45.E
            int r2 = r0.G
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2b
            if (r2 != r4) goto L25
            goto L2b
        L25:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r7)
            return r3
        L2b:
            defpackage.sf5.h0(r8)
        L2e:
            boolean r8 = r7.c
            if (r8 != 0) goto L50
            boolean r8 = r7.b
            if (r8 != 0) goto L50
            p5e r8 = r7.e
            if (r8 == 0) goto L4a
            java.lang.String r2 = "{ \"type\": \"keep_alive\" }"
            r8.i(r2)
            long r5 = com.anthropic.claude.bell.api.a1.i
            r0.G = r4
            java.lang.Object r8 = defpackage.d4c.L(r5, r0)
            if (r8 != r1) goto L2e
            return r1
        L4a:
            java.lang.String r7 = "ws"
            defpackage.x44.o0(r7)
            throw r3
        L50:
            iei r7 = defpackage.iei.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.bell.api.a1.r(vp4):java.lang.Object");
    }
}
