package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$VoiceActivationMode;
import com.anthropic.claude.analytics.events.VoiceEvents$VoiceSettingKind;
import com.anthropic.claude.bell.PlaybackPace;
import com.anthropic.claude.bell.api.BellApiClientMessage;
import com.anthropic.claude.bell.api.VoiceSelection;

/* JADX INFO: loaded from: classes2.dex */
public final class xn1 {
    public final um1 a;
    public final fk0 b;
    public final ej1 c;
    public String d;
    public PlaybackPace e;
    public String f;
    public VoiceEvents$VoiceActivationMode g;
    public final zy1 h;
    public final ih2 i;

    public xn1(um1 um1Var, fk0 fk0Var, ej1 ej1Var) {
        this.a = um1Var;
        this.b = fk0Var;
        this.c = ej1Var;
        z4j z4jVar = VoiceSelection.Companion;
        String strB = um1Var.b();
        z4jVar.getClass();
        this.d = z4j.a(strB);
        k6d k6dVar = PlaybackPace.Companion;
        String strA = um1Var.a();
        k6dVar.getClass();
        this.e = k6d.a(strA);
        this.f = fk0Var.f();
        zy1 zy1VarP = wd6.P(-2, 6, null);
        this.h = zy1VarP;
        this.i = j8.b0(zy1VarP);
    }

    public final void a(PlaybackPace playbackPace) {
        playbackPace.getClass();
        z4j z4jVar = VoiceSelection.Companion;
        String strB = this.a.b();
        z4jVar.getClass();
        this.c.b(new BellApiClientMessage.VoiceSelect(new BellApiClientMessage.VoiceSelect.Data(z4j.a(strB), Float.valueOf(playbackPace.getSpeedFactor()), (String) null, 4, (mq5) null)));
        PlaybackPace playbackPace2 = this.e;
        if (playbackPace != playbackPace2) {
            this.h.r(new wn1(VoiceEvents$VoiceSettingKind.PLAYBACK_SPEED, ckk.i(playbackPace2), ckk.i(playbackPace)));
            this.e = playbackPace;
        }
    }
}
