package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceLanguagePrompt;
import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.api.model.ThinkingOption;
import com.anthropic.claude.bell.BellModeService;
import com.anthropic.claude.bell.PlaybackPace;
import com.anthropic.claude.bell.VoiceSessionSummary;
import com.anthropic.claude.models.organization.configtypes.SttSupportedLanguage;
import com.anthropic.claude.types.strings.ModelId;
import com.anthropic.claude.types.strings.ThinkingEffort;
import com.anthropic.claude.types.strings.ThinkingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class mj1 extends iwe implements k5j {
    public final wz5 A;
    public final wz5 B;
    public final wz5 C;
    public final wz5 D;
    public final wz5 E;
    public final wz5 F;
    public final wz5 G;
    public lj1 H;
    public BellModeService I;
    public ij1 J;
    public final amg K;
    public boolean L;
    public VoiceSessionSummary M;
    public final zy1 N;
    public fkg O;
    public final lsc P;
    public boolean Q;
    public final lsc R;
    public final String b;
    public final String c;
    public final boolean d;
    public final o1j e;
    public final koi f;
    public final pkc g;
    public final xm1 h;
    public final um1 i;
    public final Context j;
    public final qi3 k;
    public final f9 l;
    public final gj1 m;
    public final ysg n;
    public final fk0 o;
    public final q7 p;
    public final w4j q;
    public final wz5 r;
    public final wz5 s;
    public final wz5 t;
    public final wz5 u;
    public final lsc v;
    public final lsc w;
    public final lsc x;
    public final wz5 y;
    public final wz5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public mj1(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12, defpackage.o1j r13, defpackage.koi r14, defpackage.pkc r15, defpackage.xm1 r16, defpackage.um1 r17, android.content.Context r18, defpackage.qi3 r19, defpackage.h86 r20, defpackage.f9 r21, defpackage.gj1 r22, defpackage.ysg r23, defpackage.fk0 r24, defpackage.q7 r25) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj1.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, o1j, koi, pkc, xm1, um1, android.content.Context, qi3, h86, f9, gj1, ysg, fk0, q7):void");
    }

    @Override // defpackage.k5j
    public final void B(SttSupportedLanguage sttSupportedLanguage) {
        sttSupportedLanguage.getClass();
        if (this.q.e(sttSupportedLanguage)) {
            Y();
        }
    }

    @Override // defpackage.k5j
    public final boolean C() {
        return ((Boolean) this.R.getValue()).booleanValue();
    }

    @Override // defpackage.k5j
    public final void E() {
        this.R.setValue(Boolean.FALSE);
    }

    @Override // defpackage.k5j
    public final ArrayList F() {
        return this.q.d();
    }

    @Override // defpackage.k5j
    public final void L(String str) {
        this.q.g(str);
    }

    public final void O() {
        lsc lscVar = this.P;
        p4j p4jVar = (p4j) lscVar.getValue();
        boolean z = p4jVar instanceof n4j;
        tp4 tp4Var = null;
        fk0 fk0Var = this.o;
        if (z) {
            fk0Var.p.setValue(Boolean.TRUE);
            SharedPreferences.Editor editorEdit = fk0Var.a.edit();
            editorEdit.putBoolean("voice_added_support_notice_shown", true);
            editorEdit.apply();
            fk0Var.u(true);
            String strF = fk0Var.f();
            if (strF == null) {
                strF = this.q.b().getCode();
            }
            fk0Var.s(strF);
            AccountSettings settings = this.p.a().getSettings();
            String voice_language_code = settings != null ? settings.getVoice_language_code() : null;
            if (voice_language_code == null || voice_language_code.length() == 0) {
                fk0Var.v(true);
                gb9.D(this.a, null, null, new cm(this, strF, tp4Var, 9), 3);
            }
        } else if (p4jVar instanceof o4j) {
            fk0Var.o.setValue(Boolean.TRUE);
            vb7.B(fk0Var.a, "voice_unsupported_language_notice_shown", true);
        } else if (p4jVar != null) {
            wg6.i();
            return;
        }
        lscVar.setValue(null);
    }

    public final void P() {
        if (this.H == null) {
            return;
        }
        amg amgVar = this.K;
        fn1 fn1Var = (fn1) amgVar.getValue();
        boolean z = false;
        if (fn1Var != null && ((tn1) fn1Var).l()) {
            z = true;
        }
        this.L = z;
        BellModeService bellModeService = this.I;
        if (bellModeService != null) {
            bellModeService.c();
        }
        fn1 fn1Var2 = (fn1) amgVar.getValue();
        this.M = fn1Var2 != null ? ((tn1) fn1Var2).c0 : null;
        lj1 lj1Var = this.H;
        if (lj1Var != null) {
            this.j.unbindService(lj1Var);
            amgVar.m(null);
            this.I = null;
            this.H = null;
        }
        Y();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String Q() {
        /*
            r7 = this;
            java.lang.String r0 = r7.R()
            r1 = 0
            if (r0 == 0) goto L94
            com.anthropic.claude.types.strings.ThinkingEffort r0 = com.anthropic.claude.types.strings.ThinkingEffort.m1135boximpl(r0)
            java.lang.String r2 = r0.m1141unboximpl()
            pkc r3 = r7.g
            okc r3 = r3.a()
            upb r4 = com.anthropic.claude.api.model.ModelSelectorSurface.Companion
            r4.getClass()
            java.lang.String r4 = com.anthropic.claude.api.model.ModelSelectorSurface.access$getCHAT$cp()
            com.anthropic.claude.api.model.ModelSelectorConfig r3 = r3.f(r4)
            if (r3 == 0) goto L8c
            java.util.List r3 = r3.getModels()
            if (r3 == 0) goto L8c
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L30:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L50
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.anthropic.claude.api.model.ModelSelectorEntry r5 = (com.anthropic.claude.api.model.ModelSelectorEntry) r5
            java.lang.String r5 = r5.m364getIdi4oh0I()
            java.lang.String r6 = r7.S()
            if (r6 != 0) goto L49
            r5 = 0
            goto L4d
        L49:
            boolean r5 = com.anthropic.claude.types.strings.ModelId.m1061equalsimpl0(r5, r6)
        L4d:
            if (r5 == 0) goto L30
            goto L51
        L50:
            r4 = r1
        L51:
            com.anthropic.claude.api.model.ModelSelectorEntry r4 = (com.anthropic.claude.api.model.ModelSelectorEntry) r4
            if (r4 == 0) goto L8c
            java.util.List r7 = r4.getEffortOptions()
            if (r7 == 0) goto L8c
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r3 = r7 instanceof java.util.Collection
            if (r3 == 0) goto L6b
            r3 = r7
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L6b
            goto L8c
        L6b:
            java.util.Iterator r7 = r7.iterator()
        L6f:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L8c
            java.lang.Object r3 = r7.next()
            com.anthropic.claude.api.model.ThinkingOption r3 = (com.anthropic.claude.api.model.ThinkingOption) r3
            java.lang.Object r3 = r3.getId()
            com.anthropic.claude.types.strings.ThinkingEffort r3 = (com.anthropic.claude.types.strings.ThinkingEffort) r3
            java.lang.String r3 = r3.m1141unboximpl()
            boolean r3 = com.anthropic.claude.types.strings.ThinkingEffort.m1138equalsimpl0(r3, r2)
            if (r3 == 0) goto L6f
            goto L8d
        L8c:
            r0 = r1
        L8d:
            if (r0 == 0) goto L94
            java.lang.String r7 = r0.m1141unboximpl()
            return r7
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj1.Q():java.lang.String");
    }

    public final String R() {
        ThinkingEffort thinkingEffort = (ThinkingEffort) this.w.getValue();
        if (thinkingEffort != null) {
            return thinkingEffort.m1141unboximpl();
        }
        return null;
    }

    public final String S() {
        ModelId modelId = (ModelId) this.v.getValue();
        if (modelId != null) {
            return modelId.m1064unboximpl();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String T() {
        /*
            r7 = this;
            lsc r0 = r7.x
            java.lang.Object r0 = r0.getValue()
            com.anthropic.claude.types.strings.ThinkingMode r0 = (com.anthropic.claude.types.strings.ThinkingMode) r0
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.String r0 = r0.m1149unboximpl()
            goto L11
        L10:
            r0 = r1
        L11:
            if (r0 == 0) goto La0
            com.anthropic.claude.types.strings.ThinkingMode r0 = com.anthropic.claude.types.strings.ThinkingMode.m1142boximpl(r0)
            java.lang.String r2 = r0.m1149unboximpl()
            pkc r3 = r7.g
            okc r3 = r3.a()
            upb r4 = com.anthropic.claude.api.model.ModelSelectorSurface.Companion
            r4.getClass()
            java.lang.String r4 = com.anthropic.claude.api.model.ModelSelectorSurface.access$getCHAT$cp()
            com.anthropic.claude.api.model.ModelSelectorConfig r3 = r3.f(r4)
            if (r3 == 0) goto L98
            java.util.List r3 = r3.getModels()
            if (r3 == 0) goto L98
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L3c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5c
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.anthropic.claude.api.model.ModelSelectorEntry r5 = (com.anthropic.claude.api.model.ModelSelectorEntry) r5
            java.lang.String r5 = r5.m364getIdi4oh0I()
            java.lang.String r6 = r7.S()
            if (r6 != 0) goto L55
            r5 = 0
            goto L59
        L55:
            boolean r5 = com.anthropic.claude.types.strings.ModelId.m1061equalsimpl0(r5, r6)
        L59:
            if (r5 == 0) goto L3c
            goto L5d
        L5c:
            r4 = r1
        L5d:
            com.anthropic.claude.api.model.ModelSelectorEntry r4 = (com.anthropic.claude.api.model.ModelSelectorEntry) r4
            if (r4 == 0) goto L98
            java.util.List r7 = r4.getModeOptions()
            if (r7 == 0) goto L98
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r3 = r7 instanceof java.util.Collection
            if (r3 == 0) goto L77
            r3 = r7
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L77
            goto L98
        L77:
            java.util.Iterator r7 = r7.iterator()
        L7b:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L98
            java.lang.Object r3 = r7.next()
            com.anthropic.claude.api.model.ThinkingOption r3 = (com.anthropic.claude.api.model.ThinkingOption) r3
            java.lang.Object r3 = r3.getId()
            com.anthropic.claude.types.strings.ThinkingMode r3 = (com.anthropic.claude.types.strings.ThinkingMode) r3
            java.lang.String r3 = r3.m1149unboximpl()
            boolean r3 = com.anthropic.claude.types.strings.ThinkingMode.m1145equalsimpl0(r3, r2)
            if (r3 == 0) goto L7b
            goto L99
        L98:
            r0 = r1
        L99:
            if (r0 == 0) goto La0
            java.lang.String r7 = r0.m1149unboximpl()
            return r7
        La0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj1.T():java.lang.String");
    }

    public final boolean U() {
        return !((Collection) this.n.h.getValue()).isEmpty();
    }

    public final void V(String str) {
        str.getClass();
        String strS = S();
        if (strS == null ? false : ModelId.m1061equalsimpl0(str, strS)) {
            return;
        }
        this.v.setValue(ModelId.m1058boximpl(str));
        fn1 fn1Var = (fn1) this.K.getValue();
        if (fn1Var != null) {
            ((tn1) fn1Var).K(str, Q(), T());
        }
    }

    public final void W(boolean z) {
        String strM1149unboximpl;
        Object next;
        if (z == ((Boolean) this.G.getValue()).booleanValue()) {
            return;
        }
        if (z) {
            wz5 wz5Var = this.D;
            Iterator it = ((List) wz5Var.getValue()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((ThinkingOption) next).getRecommended()) {
                        break;
                    }
                }
            }
            ThinkingOption thinkingOption = (ThinkingOption) next;
            if (thinkingOption != null) {
                strM1149unboximpl = ((ThinkingMode) thinkingOption.getId()).m1149unboximpl();
            } else {
                ThinkingOption thinkingOption2 = (ThinkingOption) w44.N0((List) wz5Var.getValue());
                if (thinkingOption2 == null) {
                    return;
                } else {
                    strM1149unboximpl = ((ThinkingMode) thinkingOption2.getId()).m1149unboximpl();
                }
            }
        } else {
            if (!((Boolean) this.E.getValue()).booleanValue()) {
                return;
            }
            ThinkingMode.Companion.getClass();
            strM1149unboximpl = ThinkingMode.OFF;
        }
        lsc lscVar = this.x;
        ThinkingMode thinkingMode = (ThinkingMode) lscVar.getValue();
        String strM1149unboximpl2 = thinkingMode != null ? thinkingMode.m1149unboximpl() : null;
        boolean zM1145equalsimpl0 = false;
        if (strM1149unboximpl == null) {
            if (strM1149unboximpl2 == null) {
                zM1145equalsimpl0 = true;
            }
        } else if (strM1149unboximpl2 != null) {
            zM1145equalsimpl0 = ThinkingMode.m1145equalsimpl0(strM1149unboximpl, strM1149unboximpl2);
        }
        if (zM1145equalsimpl0) {
            return;
        }
        lscVar.setValue(strM1149unboximpl != null ? ThinkingMode.m1142boximpl(strM1149unboximpl) : null);
        fn1 fn1Var = (fn1) this.K.getValue();
        if (fn1Var != null) {
            tn1 tn1Var = (tn1) fn1Var;
            tn1Var.d.invoke(strM1149unboximpl != null ? ThinkingMode.m1142boximpl(strM1149unboximpl) : null);
            tn1Var.H();
        }
    }

    public final void X() {
        if (fd9.d0(this.a)) {
            if (x44.x(this.j, "android.permission.RECORD_AUDIO") != 0) {
                this.N.r(nk1.a);
                return;
            }
            ij1 ij1Var = new ij1(this, 0);
            this.J = ij1Var;
            bz7 bz7Var = BellModeService.T;
            BellModeService.T = ij1Var;
            Intent intent = new Intent(this.j, (Class<?>) BellModeService.class);
            this.j.startForegroundService(intent);
            if (this.H == null) {
                this.H = new lj1(0, this);
            }
            Context context = this.j;
            lj1 lj1Var = this.H;
            lj1Var.getClass();
            context.bindService(intent, lj1Var, 1);
        }
    }

    public final void Y() {
        fkg fkgVar = this.O;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.h.d(new ll1(10));
    }

    public final void Z(p4j p4jVar, String str) {
        String str2;
        String strH1;
        String str3 = this.f.e;
        boolean z = p4jVar instanceof o4j;
        if (z) {
            str2 = "unsupported";
        } else {
            if (!(p4jVar instanceof n4j)) {
                wg6.i();
                return;
            }
            str2 = "added_support";
        }
        if (z) {
            strH1 = bsg.h1(((o4j) p4jVar).a, "-");
        } else {
            if (!(p4jVar instanceof n4j)) {
                wg6.i();
                return;
            }
            strH1 = ((n4j) p4jVar).b;
        }
        this.k.e(new VoiceEvents$VoiceLanguagePrompt(str3, str2, str, strH1), VoiceEvents$VoiceLanguagePrompt.Companion.serializer());
    }

    @Override // defpackage.k5j
    public final String a() {
        return this.q.c();
    }

    @Override // defpackage.k5j
    public final void j(dhg dhgVar, float f) {
        dhgVar.getClass();
        fkg fkgVar = this.O;
        tp4 tp4Var = null;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.O = gb9.D(this.a, null, null, new kj1(this, dhgVar, f, tp4Var, 0), 3);
    }

    @Override // defpackage.iwe, defpackage.y59
    public final void onDestroy() {
        if (this.e != o1j.F) {
            this.j.stopService(new Intent(this.j, (Class<?>) BellModeService.class));
        }
        bz7 bz7Var = BellModeService.T;
        if (BellModeService.T == this.J) {
            BellModeService.T = null;
        }
        this.J = null;
        super.onDestroy();
    }

    @Override // defpackage.k5j
    public final void r(PlaybackPace playbackPace) {
        playbackPace.getClass();
        this.q.f(playbackPace);
        this.h.e(playbackPace);
        fn1 fn1Var = (fn1) this.K.getValue();
        if (fn1Var != null) {
            ((tn1) fn1Var).p.a(playbackPace);
        }
    }

    @Override // defpackage.k5j
    public final PlaybackPace v() {
        return this.q.a();
    }

    @Override // defpackage.k5j
    public final SttSupportedLanguage w() {
        return this.q.b();
    }

    @Override // defpackage.k5j
    public final List x() {
        ysg ysgVar = this.n;
        return ((Boolean) ysgVar.j.getValue()).booleanValue() ? (List) ysgVar.h.getValue() : lm6.E;
    }
}
