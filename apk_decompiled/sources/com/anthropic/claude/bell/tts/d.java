package com.anthropic.claude.bell.tts;

import defpackage.b3f;
import defpackage.bg9;
import defpackage.ch9;
import defpackage.gj1;
import defpackage.iuj;
import defpackage.n30;
import defpackage.o6e;
import defpackage.p5e;
import defpackage.pqe;
import defpackage.sfa;
import defpackage.tp4;
import defpackage.wd6;
import defpackage.wif;
import defpackage.x44;
import defpackage.y6j;
import defpackage.yfa;
import defpackage.zfa;
import defpackage.zy1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends wif {
    public final bg9 d;
    public p5e e;
    public volatile Integer f;
    public volatile String g;
    public volatile long h;
    public final zy1 i = wd6.P(Integer.MAX_VALUE, 6, null);
    public final b3f j = new b3f(new o6e(this, (tp4) null, 27));

    public d(bg9 bg9Var, gj1 gj1Var) {
        this.d = bg9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(com.anthropic.claude.bell.tts.d r6, defpackage.vp4 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.c2h
            if (r0 == 0) goto L13
            r0 = r7
            c2h r0 = (defpackage.c2h) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            c2h r0 = new c2h
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.E
            m45 r1 = defpackage.m45.E
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L2b
            if (r2 != r3) goto L24
            goto L2b
        L24:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r6)
            r6 = 0
            return r6
        L2b:
            defpackage.sf5.h0(r7)
        L2e:
            boolean r7 = r6.c
            if (r7 != 0) goto L48
            y6j r7 = r6.v()
            java.lang.String r2 = "{ \"type\": \"keep_alive\" }"
            p5e r7 = (defpackage.p5e) r7
            r7.i(r2)
            r0.G = r3
            r4 = 4000(0xfa0, double:1.9763E-320)
            java.lang.Object r7 = defpackage.d4c.K(r4, r0)
            if (r7 != r1) goto L2e
            return r1
        L48:
            iei r6 = defpackage.iei.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anthropic.claude.bell.tts.d.q(com.anthropic.claude.bell.tts.d, vp4):java.lang.Object");
    }

    public static void s(d dVar) {
        ((p5e) dVar.v()).c(1000, null);
    }

    @Override // defpackage.wif, defpackage.rkk
    public final void j(y6j y6jVar, int i, String str) {
        y6jVar.getClass();
        str.getClass();
        this.f = Integer.valueOf(i);
        super.j(y6jVar, i, str);
        this.i.m(null);
    }

    @Override // defpackage.wif, defpackage.rkk
    public final void l(y6j y6jVar, Exception exc, pqe pqeVar) {
        y6jVar.getClass();
        super.l(y6jVar, exc, pqeVar);
        this.i.i(exc, false);
    }

    @Override // defpackage.rkk
    public final void m(y6j y6jVar, String str) {
        JsonElement jsonElement;
        sfa sfaVar = sfa.WARN;
        zfa.a.getClass();
        if (yfa.b()) {
            String strE = iuj.E(this);
            CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                ((n30) ((zfa) obj)).getClass();
                arrayList.add(obj);
            }
            if (!arrayList.isEmpty()) {
                zfa.a.getClass();
                String strConcat = "Text message from websocket: ".concat(str);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfaVar, strE, strConcat);
                }
            }
        }
        try {
            JsonObject jsonObjectI = ch9.i(this.d.e(str));
            JsonElement jsonElement2 = (JsonElement) jsonObjectI.get((Object) "type");
            String content = null;
            if (x44.r(jsonElement2 != null ? ch9.j(jsonElement2).getContent() : null, "error")) {
                JsonElement jsonElement3 = (JsonElement) jsonObjectI.get((Object) "error");
                if (jsonElement3 != null && (jsonElement = (JsonElement) ch9.i(jsonElement3).get((Object) "type")) != null) {
                    content = ch9.j(jsonElement).getContent();
                }
                this.g = content;
            }
        } catch (Throwable unused) {
        }
    }

    @Override // defpackage.rkk
    public final void n(y6j y6jVar, ByteString byteString) {
        this.h += (long) byteString.e();
        this.i.r(byteString.s());
    }

    public final void r() {
        this.i.m(null);
        ((p5e) v()).a();
    }

    public final Integer t() {
        return this.f;
    }

    public final String u() {
        return this.g;
    }

    public final y6j v() {
        p5e p5eVar = this.e;
        if (p5eVar != null) {
            return p5eVar;
        }
        x44.o0("ws");
        throw null;
    }

    public final void w(boolean z) {
        ((p5e) v()).i(z ? "{ \"type\": \"pause_playback\" }" : "{ \"type\": \"resume_playback\" }");
    }
}
