package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class hng {
    public static final cm4 E;
    public static final hng F;
    public static final hng G;
    public static final /* synthetic */ hng[] H;

    static {
        hng hngVar = new hng("EnterPhoneStep", 0);
        F = hngVar;
        hng hngVar2 = new hng("OnboardingStep", 1);
        G = hngVar2;
        H = new hng[]{hngVar, hngVar2};
        E = new cm4();
    }

    public static hng valueOf(String str) {
        return (hng) Enum.valueOf(hng.class, str);
    }

    public static hng[] values() {
        return (hng[]) H.clone();
    }
}
