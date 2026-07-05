package defpackage;

import com.anthropic.claude.bell.api.VoiceSelection;
import java.util.Locale;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class z4j {
    public static String a(String str) {
        if (str != null) {
            if (bsg.I0(str)) {
                str = null;
            }
            if (str != null) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return VoiceSelection.m574constructorimpl(lowerCase);
            }
        }
        return VoiceSelection.DEFAULT;
    }

    public static String b() {
        return VoiceSelection.AIRY;
    }

    public static String c() {
        return VoiceSelection.BUTTERY;
    }

    public static String d() {
        return VoiceSelection.DEFAULT;
    }

    public static String e() {
        return VoiceSelection.GLASSY;
    }

    public static String f() {
        return VoiceSelection.MELLOW;
    }

    public static String g() {
        return VoiceSelection.ROUNDED;
    }

    public final KSerializer serializer() {
        return y4j.a;
    }
}
