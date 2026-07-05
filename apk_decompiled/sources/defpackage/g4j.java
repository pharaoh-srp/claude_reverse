package defpackage;

import com.anthropic.claude.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g4j {
    public static final g4j G;
    public static final g4j H;
    public static final /* synthetic */ g4j[] I;
    public static final /* synthetic */ gq6 J;
    public final String E;
    public final int F;

    static {
        g4j g4jVar = new g4j(0, R.string.voice_feedback_reason_audio_quality, "AUDIO_QUALITY", "audio_quality");
        G = g4jVar;
        g4j g4jVar2 = new g4j(1, R.string.voice_feedback_reason_echo_crosstalk, "ECHO_CROSSTALK", "echo_crosstalk");
        g4j g4jVar3 = new g4j(2, R.string.voice_feedback_reason_interrupted_me, "INTERRUPTED_ME", "interrupted_me");
        g4j g4jVar4 = new g4j(3, R.string.voice_feedback_reason_cut_off_response, "CUT_OFF_RESPONSE", "cut_off_response");
        g4j g4jVar5 = new g4j(4, R.string.voice_feedback_reason_unresponsive_slow, "UNRESPONSIVE_SLOW", "unresponsive_slow");
        g4j g4jVar6 = new g4j(5, R.string.voice_feedback_reason_response_quality, "RESPONSE_QUALITY", "response_quality");
        g4j g4jVar7 = new g4j(6, R.string.voice_feedback_reason_wrong_language, "WRONG_LANGUAGE", "wrong_language");
        g4j g4jVar8 = new g4j(7, R.string.voice_feedback_reason_couldnt_connect, "COULDNT_CONNECT", "couldnt_connect");
        g4j g4jVar9 = new g4j(8, R.string.voice_feedback_reason_misheard_me, "MISHEARD_ME", "misheard_me");
        g4j g4jVar10 = new g4j(9, R.string.voice_feedback_reason_couldnt_hear, "COULDNT_HEAR", "couldnt_hear");
        g4j g4jVar11 = new g4j(10, R.string.voice_feedback_reason_other, "OTHER", "other");
        H = g4jVar11;
        g4j[] g4jVarArr = {g4jVar, g4jVar2, g4jVar3, g4jVar4, g4jVar5, g4jVar6, g4jVar7, g4jVar8, g4jVar9, g4jVar10, g4jVar11};
        I = g4jVarArr;
        J = new gq6(g4jVarArr);
    }

    public g4j(int i, int i2, String str, String str2) {
        this.E = str2;
        this.F = i2;
    }

    public static g4j valueOf(String str) {
        return (g4j) Enum.valueOf(g4j.class, str);
    }

    public static g4j[] values() {
        return (g4j[]) I.clone();
    }
}
