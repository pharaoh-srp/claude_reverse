package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class kjh {
    public static final kjh E;
    public static final kjh F;
    public static final kjh G;
    public static final kjh H;
    public static final /* synthetic */ kjh[] I;

    static {
        kjh kjhVar = new kjh("StartInput", 0);
        E = kjhVar;
        kjh kjhVar2 = new kjh("StopInput", 1);
        F = kjhVar2;
        kjh kjhVar3 = new kjh("ShowKeyboard", 2);
        G = kjhVar3;
        kjh kjhVar4 = new kjh("HideKeyboard", 3);
        H = kjhVar4;
        I = new kjh[]{kjhVar, kjhVar2, kjhVar3, kjhVar4};
    }

    public static kjh valueOf(String str) {
        return (kjh) Enum.valueOf(kjh.class, str);
    }

    public static kjh[] values() {
        return (kjh[]) I.clone();
    }
}
