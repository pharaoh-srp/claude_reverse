package defpackage;

import com.anthropic.claude.analytics.events.VoiceEvents$VoiceSettingKind;

/* JADX INFO: loaded from: classes2.dex */
public final class wn1 {
    public final VoiceEvents$VoiceSettingKind a;
    public final String b;
    public final String c;

    public wn1(VoiceEvents$VoiceSettingKind voiceEvents$VoiceSettingKind, String str, String str2) {
        voiceEvents$VoiceSettingKind.getClass();
        str.getClass();
        str2.getClass();
        this.a = voiceEvents$VoiceSettingKind;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wn1)) {
            return false;
        }
        wn1 wn1Var = (wn1) obj;
        return this.a == wn1Var.a && x44.r(this.b, wn1Var.b) && x44.r(this.c, wn1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kgh.l(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BellSettingsChange(kind=");
        sb.append(this.a);
        sb.append(", old=");
        sb.append(this.b);
        sb.append(", new=");
        return ij0.m(sb, this.c, ")");
    }
}
