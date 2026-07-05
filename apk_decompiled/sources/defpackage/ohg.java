package defpackage;

import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ohg {
    public static final ohg E;
    public static final ohg F;
    public static final ohg G;
    public static final ohg H;
    public static final ohg I;
    public static final ohg J;
    public static final ohg K;
    public static final ohg L;
    public static final ohg M;
    public static final ohg N;
    public static final /* synthetic */ ohg[] O;

    static {
        ohg ohgVar = new ohg("MICROPHONE_EXCEPTION", 0);
        E = ohgVar;
        ohg ohgVar2 = new ohg("LANGUAGE_NOT_SUPPORTED", 1);
        F = ohgVar2;
        ohg ohgVar3 = new ohg("TIME_LIMIT_EXCEEDED", 2);
        G = ohgVar3;
        ohg ohgVar4 = new ohg("SERVER_ERROR", 3);
        H = ohgVar4;
        ohg ohgVar5 = new ohg("REGION_UNAVAILABLE", 4);
        I = ohgVar5;
        ohg ohgVar6 = new ohg("NO_SPEECH_DETECTED", 5);
        J = ohgVar6;
        ohg ohgVar7 = new ohg("NETWORK_ERROR", 6);
        K = ohgVar7;
        ohg ohgVar8 = new ohg("RECORDING_CANCELLED", 7);
        L = ohgVar8;
        ohg ohgVar9 = new ohg("ENDED_WITHOUT_ERROR_OR_USER_ACTION", 8);
        M = ohgVar9;
        ohg ohgVar10 = new ohg("UNKNOWN", 9);
        N = ohgVar10;
        O = new ohg[]{ohgVar, ohgVar2, ohgVar3, ohgVar4, ohgVar5, ohgVar6, ohgVar7, ohgVar8, ohgVar9, ohgVar10};
    }

    public static ohg valueOf(String str) {
        return (ohg) Enum.valueOf(ohg.class, str);
    }

    public static ohg[] values() {
        return (ohg[]) O.clone();
    }

    public final bne a() {
        switch (ordinal()) {
            case 0:
            case 1:
            case 3:
            case 5:
            case 8:
            case 9:
                return new yme("client_error", toString());
            case 2:
            case 7:
                return xme.a;
            case 4:
                return new yme("region_unavailable", toString());
            case 6:
                return new yme("network", toString());
            default:
                wg6.i();
                return null;
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        String lowerCase = name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }
}
