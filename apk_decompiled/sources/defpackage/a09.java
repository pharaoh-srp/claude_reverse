package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$VoiceSettingKind;
import com.anthropic.claude.bell.PlaybackPace;
import com.anthropic.claude.bell.api.BellApiClientMessage;
import com.anthropic.claude.bell.api.VoiceSelection;
import com.anthropic.claude.models.organization.configtypes.SttSupportedLanguage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class a09 extends iwe implements k5j {
    public final ylg b;
    public final ysg c;
    public final xm1 d;
    public final w4j e;
    public tn1 f;
    public fkg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a09(ylg ylgVar, um1 um1Var, fk0 fk0Var, ysg ysgVar, f9 f9Var, xm1 xm1Var, loi loiVar, h86 h86Var) {
        super(h86Var);
        ylgVar.getClass();
        this.b = ylgVar;
        this.c = ysgVar;
        this.d = xm1Var;
        w4j w4jVar = new w4j(um1Var, fk0Var, ysgVar, f9Var, loiVar);
        this.e = w4jVar;
        xm1Var.e(w4jVar.a());
        gb9.D(this.a, null, null, new al8(this, (tp4) null, 3), 3);
    }

    @Override // defpackage.k5j
    public final void B(SttSupportedLanguage sttSupportedLanguage) {
        sttSupportedLanguage.getClass();
        if (this.e.e(sttSupportedLanguage)) {
            fkg fkgVar = this.g;
            if (fkgVar != null) {
                fkgVar.d(null);
            }
            this.d.d(new ll1(10));
        }
    }

    @Override // defpackage.k5j
    public final boolean C() {
        return false;
    }

    @Override // defpackage.k5j
    public final void E() {
    }

    @Override // defpackage.k5j
    public final ArrayList F() {
        return this.e.d();
    }

    @Override // defpackage.k5j
    public final void L(String str) {
        this.e.g(str);
    }

    @Override // defpackage.k5j
    public final String a() {
        return this.e.c();
    }

    @Override // defpackage.k5j
    public final void j(dhg dhgVar, float f) {
        dhgVar.getClass();
        fkg fkgVar = this.g;
        tp4 tp4Var = null;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.g = gb9.D(this.a, null, null, new kj1(this, dhgVar, f, tp4Var, 1), 3);
    }

    @Override // defpackage.iwe, defpackage.y59
    public final void onDestroy() {
        fkg fkgVar = this.g;
        if (fkgVar != null) {
            fkgVar.d(null);
        }
        this.d.d(new ll1(10));
        tn1 tn1Var = this.f;
        if (tn1Var != null) {
            xn1 xn1Var = tn1Var.p;
            zy1 zy1Var = xn1Var.h;
            z4j z4jVar = VoiceSelection.Companion;
            um1 um1Var = xn1Var.a;
            String strB = um1Var.b();
            z4jVar.getClass();
            String strA = z4j.a(strB);
            k6d k6dVar = PlaybackPace.Companion;
            String strA2 = um1Var.a();
            k6dVar.getClass();
            float speedFactor = k6d.a(strA2).getSpeedFactor();
            String strF = xn1Var.b.f();
            xn1Var.c.b(new BellApiClientMessage.VoiceSelect(new BellApiClientMessage.VoiceSelect.Data(strA, Float.valueOf(speedFactor), strF, null)));
            if (!VoiceSelection.m576equalsimpl0(strA, xn1Var.d)) {
                zy1Var.r(new wn1(VoiceEvents$VoiceSettingKind.VOICE, xn1Var.d, strA));
                xn1Var.d = strA;
            }
            if (!x44.r(strF, xn1Var.f)) {
                VoiceEvents$VoiceSettingKind voiceEvents$VoiceSettingKind = VoiceEvents$VoiceSettingKind.LANGUAGE;
                String str = xn1Var.f;
                if (str == null) {
                    str = "";
                }
                zy1Var.r(new wn1(voiceEvents$VoiceSettingKind, str, strF != null ? strF : ""));
                xn1Var.f = strF;
            }
            if (!tn1Var.g.c()) {
                tn1Var.L(tn1Var.h0 ? false : tn1Var.g0);
            }
        }
        super.onDestroy();
    }

    @Override // defpackage.k5j
    public final void r(PlaybackPace playbackPace) {
        playbackPace.getClass();
        this.e.f(playbackPace);
        this.d.e(playbackPace);
        fn1 fn1Var = (fn1) this.b.getValue();
        if (fn1Var != null) {
            ((tn1) fn1Var).p.a(playbackPace);
        }
    }

    @Override // defpackage.k5j
    public final PlaybackPace v() {
        return this.e.a();
    }

    @Override // defpackage.k5j
    public final SttSupportedLanguage w() {
        return this.e.b();
    }

    @Override // defpackage.k5j
    public final List x() {
        ysg ysgVar = this.c;
        return ((Boolean) ysgVar.j.getValue()).booleanValue() ? (List) ysgVar.h.getValue() : lm6.E;
    }
}
