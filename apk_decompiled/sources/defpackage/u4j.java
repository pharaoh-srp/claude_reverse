package defpackage;

import com.anthropic.claude.api.account.AccountSettings;
import com.anthropic.claude.bell.PlaybackPace;
import com.anthropic.claude.bell.api.VoiceSelection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u4j {
    public final q7 a;
    public final f9 b;
    public final um1 c;
    public final fk0 d;
    public final ysg e;
    public final fn0 f;

    public u4j(q7 q7Var, f9 f9Var, um1 um1Var, fk0 fk0Var, ysg ysgVar, fn0 fn0Var) {
        this.a = q7Var;
        this.b = f9Var;
        this.c = um1Var;
        this.d = fk0Var;
        this.e = ysgVar;
        this.f = fn0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [tp4] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.anthropic.claude.models.organization.configtypes.SttSupportedLanguage] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final void a() {
        Object next;
        q7 q7Var = this.a;
        AccountSettings settings = q7Var.a().getSettings();
        ?? B = 0;
        B = 0;
        String voice_preference = settings != null ? settings.getVoice_preference() : null;
        fn0 fn0Var = this.f;
        um1 um1Var = this.c;
        if (voice_preference == null || voice_preference.length() == 0) {
            String strB = um1Var.b();
            if (strB != null) {
                VoiceSelection.Companion.getClass();
                String strA = z4j.a(strB);
                if (!VoiceSelection.m576equalsimpl0(strA, z4j.d())) {
                    gb9.D(fn0Var, null, null, new k7h((Object) this, strA, (tp4) B, 8), 3);
                }
            }
        } else {
            um1Var.f(voice_preference);
        }
        AccountSettings settings2 = q7Var.a().getSettings();
        Double voice_speed = settings2 != null ? settings2.getVoice_speed() : null;
        if (voice_speed != null) {
            Iterator it = PlaybackPace.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((PlaybackPace) next).getSpeedFactor() == voice_speed.doubleValue()) {
                        break;
                    }
                }
            }
            PlaybackPace playbackPace = (PlaybackPace) next;
            if (playbackPace != null) {
                String strName = playbackPace.name();
                um1Var.d.setValue(strName);
                kgh.t(um1Var.a, "bell_pace", strName);
            }
        } else {
            String strA2 = um1Var.a();
            if (strA2 != null && strA2.length() != 0) {
                PlaybackPace.Companion.getClass();
                PlaybackPace playbackPaceA = k6d.a(strA2);
                if (playbackPaceA != k6d.b()) {
                    gb9.D(fn0Var, null, null, new k7h(this, playbackPaceA, (tp4) B, 9), 3);
                }
            }
        }
        fk0 fk0Var = this.d;
        if (((Boolean) fk0Var.m.getValue()).booleanValue()) {
            String strF = fk0Var.f();
            if (strF != null) {
                gb9.D(fn0Var, null, null, new lza(this, strF, B, 28), 3);
                return;
            }
            return;
        }
        ysg ysgVar = this.e;
        if (((List) ysgVar.h.getValue()).isEmpty()) {
            return;
        }
        AccountSettings settings3 = q7Var.a().getSettings();
        String voice_language_code = settings3 != null ? settings3.getVoice_language_code() : null;
        if (voice_language_code != null) {
            String str = voice_language_code.length() > 0 ? voice_language_code : null;
            if (str != null) {
                B = ysgVar.b(str);
            }
        }
        if (B != 0) {
            fk0Var.s(voice_language_code);
            fk0Var.u(true);
        }
    }
}
