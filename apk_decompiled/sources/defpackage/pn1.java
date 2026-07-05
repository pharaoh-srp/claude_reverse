package defpackage;

import android.media.AudioTrack;
import com.anthropic.claude.analytics.events.VoiceEvents$AudioEffectsCapability;
import com.anthropic.claude.analytics.events.VoiceEvents$MicDeadObjectRecovered;
import com.anthropic.claude.analytics.events.VoiceEvents$SettingsChanged;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceActivationMode;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceFocusResult;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceSettingKind;
import com.anthropic.claude.bell.api.a1;
import java.util.List;
import okio.ByteString;

/* JADX INFO: loaded from: classes2.dex */
public final class pn1 implements lp7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ tn1 F;

    public /* synthetic */ pn1(tn1 tn1Var, int i) {
        this.E = i;
        this.F = tn1Var;
    }

    @Override // defpackage.lp7
    public final Object g(Object obj, tp4 tp4Var) {
        g5j g5jVar;
        AudioTrack audioTrack;
        boolean zH = false;
        switch (this.E) {
            case 0:
                byte[] bArr = (byte[]) obj;
                x51 x51Var = this.F.t;
                x51Var.g += bArr.length;
                return x51Var.m.b(tp4Var, bArr);
            case 1:
                byte[] bArr2 = (byte[]) obj;
                if ((this.F.g.d() || this.F.q().a) && !this.F.y()) {
                    ej1 ej1Var = this.F.s;
                    bArr2.getClass();
                    yn1 yn1Var = ej1Var.f;
                    if (yn1Var != null) {
                        p5e p5eVar = ((a1) yn1Var).e;
                        if (p5eVar == null) {
                            x44.o0("ws");
                            throw null;
                        }
                        ByteString byteString = ByteString.H;
                        zH = p5eVar.h(2, ByteString.Companion.c(bArr2));
                    }
                    if (zH) {
                        this.F.P = true;
                    }
                }
                return iei.a;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                tn1 tn1Var = this.F;
                synchronized (tn1Var.H) {
                    no1 no1VarQ = tn1Var.q();
                    no1VarQ.getClass();
                    tn1Var.G.setValue(no1.a(no1VarQ, false, false, false, false, false, false, false, false, zBooleanValue, false, 767));
                }
                return iei.a;
            case 3:
                bi1 bi1Var = (bi1) obj;
                if (x44.r(bi1Var, zh1.a)) {
                    this.F.C(gm1.b, "client_attachment", null, true);
                } else {
                    if (!x44.r(bi1Var, ai1.a)) {
                        wg6.i();
                        return null;
                    }
                    tn1 tn1Var2 = this.F;
                    synchronized (tn1Var2.H) {
                        no1 no1VarQ2 = tn1Var2.q();
                        no1VarQ2.getClass();
                        tn1Var2.G.setValue(no1.a(no1VarQ2, false, false, false, false, false, false, false, false, false, false, 511));
                    }
                }
                return iei.a;
            case 4:
                wn1 wn1Var = (wn1) obj;
                tn1 tn1Var3 = this.F;
                g5j g5jVar2 = tn1Var3.B;
                if (g5jVar2 != null) {
                    VoiceEvents$VoiceActivationMode voiceEvents$VoiceActivationModeI = tn1Var3.i();
                    VoiceEvents$VoiceSettingKind voiceEvents$VoiceSettingKind = wn1Var.a;
                    String str = wn1Var.b;
                    String str2 = wn1Var.c;
                    w0j w0jVar = this.F.r.w;
                    voiceEvents$VoiceActivationModeI.getClass();
                    voiceEvents$VoiceSettingKind.getClass();
                    str.getClass();
                    str2.getClass();
                    w0jVar.getClass();
                    g5jVar2.a.e(new VoiceEvents$SettingsChanged(g5jVar2.b, g5jVar2.c, g5jVar2.D ? g5jVar2.d : "", voiceEvents$VoiceActivationModeI, voiceEvents$VoiceSettingKind, str, str2, w0jVar.a, w0jVar.b), VoiceEvents$SettingsChanged.Companion.serializer());
                }
                if (wn1Var.a == VoiceEvents$VoiceSettingKind.ACTIVATION_MODE && (g5jVar = this.F.B) != null) {
                    g5jVar.j++;
                }
                return iei.a;
            case 5:
                this.F.y.d(((Boolean) obj).booleanValue());
                return iei.a;
            case 6:
                this.F.y.a(((Boolean) obj).booleanValue());
                return iei.a;
            case 7:
                lm6 lm6Var = lm6.E;
                bs7 bs7Var = (bs7) obj;
                tn1 tn1Var4 = this.F;
                if (bs7Var instanceof yr7) {
                    g5j g5jVar3 = tn1Var4.B;
                    if (g5jVar3 != null) {
                        yr7 yr7Var = (yr7) bs7Var;
                        g5jVar3.e(VoiceEvents$VoiceFocusResult.LOSS, yr7Var.a, yr7Var.b);
                    }
                    List list = xah.a;
                    yr7 yr7Var2 = (yr7) bs7Var;
                    xah.e(2, "Bell Mode: audio focus lost, holding", null, sta.h0(new cpc("active_playback_usages", yr7Var2.a), new cpc("active_recording_sources", yr7Var2.b)));
                    return tn1Var4.h(tp4Var);
                }
                if (x44.r(bs7Var, zr7.a)) {
                    g5j g5jVar4 = tn1Var4.B;
                    if (g5jVar4 != null) {
                        g5jVar4.e(VoiceEvents$VoiceFocusResult.LOSS_TRANSIENT, lm6Var, lm6Var);
                    }
                    List list2 = xah.a;
                    xah.e(6, "Bell Mode: audio focus lost (transient), holding", null, null);
                    return tn1Var4.h(tp4Var);
                }
                if (x44.r(bs7Var, as7.a)) {
                    g5j g5jVar5 = tn1Var4.B;
                    if (g5jVar5 != null) {
                        g5jVar5.e(VoiceEvents$VoiceFocusResult.LOSS_TRANSIENT_CAN_DUCK, lm6Var, lm6Var);
                    }
                    List list3 = xah.a;
                    xah.e(6, "Bell Mode: audio focus lost (transient, can-duck)", null, null);
                } else {
                    if (!x44.r(bs7Var, xr7.a)) {
                        wg6.i();
                        return null;
                    }
                    g5j g5jVar6 = tn1Var4.B;
                    if (g5jVar6 != null) {
                        g5jVar6.e(VoiceEvents$VoiceFocusResult.GAIN, lm6Var, lm6Var);
                    }
                    if (tn1Var4.w()) {
                        List list4 = xah.a;
                        xah.e(6, "Bell Mode: audio focus regained while held, ignoring", null, null);
                    } else {
                        List list5 = xah.a;
                        xah.e(6, "Bell Mode: audio focus regained", null, null);
                        x51 x51Var2 = tn1Var4.t;
                        if (!x51Var2.f && (audioTrack = x51Var2.d) != null) {
                            audioTrack.setVolume(1.0f);
                        }
                        if (tn1Var4.M && !tn1Var4.A()) {
                            tn1Var4.L(false);
                        }
                    }
                }
                return iei.a;
            case 8:
                s51 s51Var = (s51) obj;
                g5j g5jVar7 = this.F.B;
                if (g5jVar7 != null) {
                    g5jVar7.d(s51Var, "auto");
                }
                return iei.a;
            case 9:
                q41 q41Var = (q41) obj;
                g5j g5jVar8 = this.F.B;
                if (g5jVar8 != null) {
                    q41Var.getClass();
                    g5jVar8.a.e(new VoiceEvents$AudioEffectsCapability(g5jVar8.b, g5jVar8.c, g5jVar8.d, q41Var.a, q41Var.b, q41Var.c, q41Var.d), VoiceEvents$AudioEffectsCapability.Companion.serializer());
                }
                return iei.a;
            case 10:
                int iIntValue = ((Number) obj).intValue();
                g5j g5jVar9 = this.F.B;
                if (g5jVar9 != null) {
                    g5jVar9.a.e(new VoiceEvents$MicDeadObjectRecovered(g5jVar9.b, g5jVar9.c, g5jVar9.d, iIntValue), VoiceEvents$MicDeadObjectRecovered.Companion.serializer());
                }
                return iei.a;
            default:
                return tn1.b(this.F, (fj1) obj, tp4Var);
        }
    }
}
