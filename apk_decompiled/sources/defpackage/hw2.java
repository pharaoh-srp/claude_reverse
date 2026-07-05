package defpackage;

import com.anthropic.claude.analytics.events.ChatEvents$AddAttachment;
import com.anthropic.claude.analytics.events.ChatEvents$AttachmentSource;
import com.anthropic.claude.analytics.events.McpEvents$McpPromptsUsed;
import com.anthropic.claude.analytics.events.ScreenSource;
import com.anthropic.claude.api.chat.InputMode;
import com.anthropic.claude.api.chat.MessageAttachment;
import com.anthropic.claude.chat.input.draft.DraftMessage;
import com.anthropic.claude.chat.input.draft.QueuedSendRequest;
import com.anthropic.claude.types.strings.MessageId;
import com.anthropic.claude.types.strings.ProjectId;
import com.pvporbit.freetype.FreeTypeConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hw2 extends iwe {
    public final lsc A;
    public final wz5 B;
    public final lsc C;
    public final yih D;
    public final wz5 E;
    public final lsc F;
    public final lsc G;
    public final lsc H;
    public final wz5 I;
    public rv2 J;
    public final lsc K;
    public final lsc L;
    public final lsc M;
    public final wz5 N;
    public final wz5 O;
    public final wz5 P;
    public final wz5 Q;
    public final wz5 R;
    public final wz5 S;
    public final wz5 T;
    public final zy1 U;
    public final String b;
    public final String c;
    public final fk0 d;
    public final fb6 e;
    public final pt2 f;
    public final koi g;
    public final pkc h;
    public final zkg i;
    public final qi3 j;
    public final qs2 k;
    public final pl3 l;
    public final swa m;
    public final oke n;
    public final zy1 o;
    public final lsc p;
    public final lsc q;
    public final wz5 r;
    public final lsc s;
    public final lsc t;
    public final lsc u;
    public final lsc v;
    public final lsc w;
    public final lsc x;
    public final lsc y;
    public final lsc z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw2(boolean z, String str, String str2, fk0 fk0Var, fb6 fb6Var, pt2 pt2Var, koi koiVar, pkc pkcVar, zkg zkgVar, qi3 qi3Var, qs2 qs2Var, pl3 pl3Var, swa swaVar, oke okeVar, h86 h86Var) {
        super(h86Var);
        str.getClass();
        this.b = str;
        this.c = str2;
        this.d = fk0Var;
        this.e = fb6Var;
        this.f = pt2Var;
        this.g = koiVar;
        this.h = pkcVar;
        this.i = zkgVar;
        this.j = qi3Var;
        this.k = qs2Var;
        this.l = pl3Var;
        this.m = swaVar;
        this.n = okeVar;
        this.o = x44.a();
        this.p = mpk.P(co7.a);
        tp4 tp4Var = null;
        int i = 1;
        int i2 = 2;
        j8.T(new gq7(j8.B(okeVar.l, new ph1(18), j8.f), new ab0(this, tp4Var, i), i2), this.a);
        this.q = mpk.P(Boolean.valueOf(!z));
        this.r = mpk.w(new ov2(this, 11));
        this.s = mpk.P(str2 != null ? ProjectId.m1079boximpl(str2) : null);
        Boolean bool = Boolean.FALSE;
        this.t = mpk.P(bool);
        this.u = mpk.P(bool);
        this.v = mpk.P(bool);
        this.w = mpk.P(bool);
        this.x = mpk.P(bool);
        this.y = mpk.P(bool);
        this.z = mpk.P(bool);
        this.A = mpk.P(null);
        a5 a5Var = a5.N;
        this.B = mpk.x(new ov2(this, 12), a5Var);
        this.C = mpk.P(bool);
        this.D = new yih("", 2);
        this.E = mpk.w(new ov2(this, 13));
        this.F = mpk.P(null);
        this.G = mpk.P(null);
        this.H = mpk.P(null);
        int i3 = 0;
        this.I = mpk.w(new ov2(this, i3));
        this.K = mpk.P(bool);
        this.L = mpk.P(bool);
        this.M = mpk.P(null);
        j8.T(new gq7(new dw2(new v70(mpk.d0(new ov2(this, i)), 1), 0), new pv2(this, tp4Var, i3), i2), this.a);
        j8.T(new gq7(new gw2(mpk.d0(new ov2(this, i2)), 0), new pv2(this, tp4Var, i), i2), this.a);
        int i4 = 9;
        j8.T(new gq7(new v70(mpk.d0(new ov2(this, 3)), 1), new dx(this, tp4Var, i4), i2), this.a);
        this.N = mpk.w(new ov2(this, 4));
        this.O = mpk.x(new ov2(this, 5), a5Var);
        this.P = mpk.w(new ov2(this, 6));
        this.Q = mpk.x(new ov2(this, 7), a5Var);
        this.R = mpk.x(new ov2(this, 8), a5Var);
        this.S = mpk.w(new ov2(this, i4));
        this.T = mpk.x(new ov2(this, 10), a5Var);
        this.U = pt2Var.p;
    }

    public final void O(File file, ChatEvents$AttachmentSource chatEvents$AttachmentSource) {
        file.getClass();
        chatEvents$AttachmentSource.getClass();
        gb9.D(this.a, null, null, new pb2(this, file, chatEvents$AttachmentSource, null, 8), 3);
    }

    public final void P(Collection collection, ChatEvents$AttachmentSource chatEvents$AttachmentSource) {
        collection.getClass();
        chatEvents$AttachmentSource.getClass();
        gb9.D(this.a, null, null, new pb2(this, collection, chatEvents$AttachmentSource, null, 9), 3);
    }

    public final boolean Q(String str) {
        str.getClass();
        String str2 = X().b;
        ScreenSource screenSource = ScreenSource.CHAT_SCREEN;
        pt2 pt2Var = this.f;
        pt2Var.getClass();
        yw2 yw2Var = pt2Var.a;
        screenSource.getClass();
        int length = isg.g0(str).length;
        if (length < amk.c(pt2Var.g).getMax_inline_paste_bytes() || pt2Var.d() <= 0) {
            return false;
        }
        List listW = x44.W(new MessageAttachment((String) null, "", length, "text/plain", str, 1, (mq5) null));
        xw2 xw2Var = yw2.a;
        yw2Var.d(lm6.E, listW);
        pt2Var.d.e(new ChatEvents$AddAttachment(pt2Var.b.e, str2 == null ? "" : str2, "text/plain", ChatEvents$AttachmentSource.PASTE, screenSource, Boolean.valueOf(yw2Var.k(str2))), ChatEvents$AddAttachment.Companion.serializer());
        return true;
    }

    public final void R(String str) {
        String str2;
        str.getClass();
        if (bsg.I0(str)) {
            return;
        }
        yih yihVar = this.D;
        CharSequence charSequence = yihVar.d().G;
        if (!bsg.I0(charSequence)) {
            if (gb9.B(bsg.J0(charSequence))) {
                str = ((Object) charSequence) + str;
            } else {
                str = ((Object) charSequence) + " " + str;
            }
        }
        boolean zI0 = bsg.I0(charSequence);
        lsc lscVar = this.H;
        lscVar.setValue((zI0 || ((str2 = (String) lscVar.getValue()) != null && str2.contentEquals(charSequence))) ? str : null);
        cpk.u(yihVar, str);
    }

    public final void S(String str, String str2, Map map, zy7 zy7Var) {
        str.getClass();
        str2.getClass();
        map.getClass();
        String str3 = this.g.e;
        this.j.e(new McpEvents$McpPromptsUsed(str3, map.size(), 0, 0, 0, 0), McpEvents$McpPromptsUsed.Companion.serializer());
        gb9.D(this.a, null, null, new b9(str, str2, map, this, str3, zy7Var, null, 3), 3);
    }

    public final DraftMessage T() {
        CharSequence charSequenceA0 = a0();
        pt2 pt2Var = this.f;
        ArrayList arrayListF = pt2Var.f();
        ArrayList arrayListE = pt2Var.e();
        if (charSequenceA0.length() == 0 && arrayListF.isEmpty() && arrayListE.isEmpty()) {
            return null;
        }
        return new DraftMessage(X().a, b0(), charSequenceA0.toString(), arrayListF, arrayListE, (InputMode) this.I.getValue(), Y(), (String) this.F.getValue(), (QueuedSendRequest) null, FreeTypeConstants.FT_FSTYPE_NO_SUBSETTING, (mq5) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U(defpackage.vp4 r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.uv2
            if (r0 == 0) goto L13
            r0 = r10
            uv2 r0 = (defpackage.uv2) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            uv2 r0 = new uv2
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.E
            int r1 = r0.G
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.sf5.h0(r10)
            goto L54
        L25:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r9)
            r9 = 0
            return r9
        L2c:
            defpackage.sf5.h0(r10)
            qv2 r10 = r9.X()
            java.lang.String r5 = r10.a
            java.lang.String r6 = r9.b0()
            r0.G = r2
            fb6 r4 = r9.e
            h86 r9 = r4.c
            e45 r9 = r9.b()
            t74 r3 = new t74
            r7 = 0
            r8 = 18
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r9 = defpackage.gb9.c0(r9, r3, r0)
            m45 r10 = defpackage.m45.E
            if (r9 != r10) goto L54
            return r10
        L54:
            iei r9 = defpackage.iei.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hw2.U(vp4):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r13 == r11) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(defpackage.vp4 r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.xv2
            if (r0 == 0) goto L13
            r0 = r13
            xv2 r0 = (defpackage.xv2) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            xv2 r0 = new xv2
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.E
            int r1 = r0.G
            lsc r2 = r12.y
            iei r3 = defpackage.iei.a
            pt2 r5 = r12.f
            r10 = 2
            r4 = 1
            m45 r11 = defpackage.m45.E
            if (r1 == 0) goto L3e
            if (r1 == r4) goto L3a
            if (r1 != r10) goto L33
            defpackage.sf5.h0(r13)     // Catch: java.lang.Throwable -> L30
            goto L91
        L30:
            r0 = move-exception
            r12 = r0
            goto L9c
        L33:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.sz6.j(r12)
            r12 = 0
            return r12
        L3a:
            defpackage.sf5.h0(r13)
            goto L65
        L3e:
            defpackage.sf5.h0(r13)
            qv2 r13 = r12.X()
            java.lang.String r6 = r13.b
            sm r7 = new sm
            zy1 r13 = r12.o
            r7.<init>(r13)
            r0.G = r4
            r5.getClass()
            qq0 r4 = new qq0
            r9 = 5
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r13 = defpackage.fd9.N(r4, r0)
            if (r13 != r11) goto L61
            goto L62
        L61:
            r13 = r3
        L62:
            if (r13 != r11) goto L65
            goto L90
        L65:
            wz5 r13 = r5.m
            java.lang.Object r13 = r13.getValue()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto La2
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r2.setValue(r13)
            ut2 r13 = new ut2     // Catch: java.lang.Throwable -> L30
            r1 = 4
            r13.<init>(r12, r1)     // Catch: java.lang.Throwable -> L30
            b3f r12 = defpackage.mpk.d0(r13)     // Catch: java.lang.Throwable -> L30
            zl2 r13 = new zl2     // Catch: java.lang.Throwable -> L30
            r1 = 3
            r13.<init>(r1)     // Catch: java.lang.Throwable -> L30
            r0.G = r10     // Catch: java.lang.Throwable -> L30
            java.lang.Object r13 = defpackage.j8.H(r12, r13, r0)     // Catch: java.lang.Throwable -> L30
            if (r13 != r11) goto L91
        L90:
            return r11
        L91:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> L30
            r13.getClass()     // Catch: java.lang.Throwable -> L30
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            r2.setValue(r12)
            return r3
        L9c:
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            r2.setValue(r13)
            throw r12
        La2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hw2.V(vp4):java.lang.Object");
    }

    public final boolean W() {
        return ((Boolean) this.S.getValue()).booleanValue();
    }

    public final qv2 X() {
        return (qv2) this.r.getValue();
    }

    public final String Y() {
        MessageId messageId = (MessageId) this.A.getValue();
        if (messageId != null) {
            return messageId.m1057unboximpl();
        }
        return null;
    }

    public final sn8 Z() {
        return (sn8) this.M.getValue();
    }

    public final CharSequence a0() {
        return (CharSequence) this.E.getValue();
    }

    public final String b0() {
        ProjectId projectId = (ProjectId) this.s.getValue();
        if (projectId != null) {
            return projectId.m1085unboximpl();
        }
        return null;
    }

    public final boolean c0() {
        return ((Boolean) this.O.getValue()).booleanValue();
    }

    public final boolean d0() {
        return ((Boolean) this.B.getValue()).booleanValue();
    }

    public final boolean e0() {
        return ((Boolean) this.x.getValue()).booleanValue();
    }

    public final boolean f0() {
        return ((Boolean) this.K.getValue()).booleanValue();
    }

    public final void g0(String str, String str2, List list, List list2) {
        yih yihVar = this.D;
        cpk.e(yihVar);
        pt2 pt2Var = this.f;
        pt2Var.a.h();
        Boolean bool = Boolean.FALSE;
        this.K.setValue(bool);
        this.H.setValue(null);
        this.F.setValue(null);
        this.G.setValue(null);
        this.z.setValue(bool);
        this.A.setValue(str != null ? MessageId.m1051boximpl(str) : null);
        Boolean bool2 = Boolean.TRUE;
        lsc lscVar = this.w;
        lscVar.setValue(bool2);
        cpk.u(yihVar, str2);
        pt2Var.a(list2, list);
        lscVar.setValue(bool);
        this.t.setValue(bool2);
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h0(com.anthropic.claude.analytics.events.ChatEvents$DraftRestoreTrigger r17, defpackage.vhd r18, boolean r19, defpackage.vp4 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hw2.h0(com.anthropic.claude.analytics.events.ChatEvents$DraftRestoreTrigger, vhd, boolean, vp4):java.lang.Object");
    }

    public final void i0() {
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
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((n30) ((zfa) it.next())).b(sfa.ERROR, strE, "Device audio permission denied");
                }
            }
        }
        gb9.D(this.a, null, null, new zv2(this, null, 0), 3);
    }

    public final nwb j0(zy7 zy7Var, ld4 ld4Var, int i) {
        hw2 hw2Var;
        zy7Var.getClass();
        e18 e18Var = (e18) ld4Var;
        boolean zH = e18Var.h(this);
        Object objN = e18Var.N();
        if (zH || objN == jd4.a) {
            hw2Var = this;
            dm dmVar = new dm(0, hw2Var, hw2.class, "onAudioPermissionDenied", "onAudioPermissionDenied()V", 0, 3);
            e18Var.k0(dmVar);
            objN = dmVar;
        } else {
            hw2Var = this;
        }
        return dgj.M(zy7Var, (zy7) ((jm9) objN), hw2Var.l, e18Var, i & 14, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k0(com.anthropic.claude.chat.input.draft.DraftMessage r10, defpackage.vp4 r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hw2.k0(com.anthropic.claude.chat.input.draft.DraftMessage, vp4):java.lang.Object");
    }

    public final void l0(boolean z) {
        this.x.setValue(Boolean.valueOf(z));
    }

    public final void m0(boolean z) {
        this.L.setValue(Boolean.valueOf(z));
    }
}
