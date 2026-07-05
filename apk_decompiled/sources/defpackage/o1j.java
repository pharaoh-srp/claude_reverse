package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class o1j {
    public static final o1j E;
    public static final o1j F;
    public static final /* synthetic */ o1j[] G;

    static {
        o1j o1jVar = new o1j("CHAT_BUTTON", 0);
        E = o1jVar;
        o1j o1jVar2 = new o1j("WIDGET", 1);
        o1j o1jVar3 = new o1j("APP_INTENT", 2);
        F = o1jVar3;
        G = new o1j[]{o1jVar, o1jVar2, o1jVar3, new o1j("RETRY", 3)};
    }

    public static o1j valueOf(String str) {
        return (o1j) Enum.valueOf(o1j.class, str);
    }

    public static o1j[] values() {
        return (o1j[]) G.clone();
    }
}
