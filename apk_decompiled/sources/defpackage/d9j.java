package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d9j {
    public static final d9j E;
    public static final d9j F;
    public static final /* synthetic */ d9j[] G;

    static {
        d9j d9jVar = new d9j("Start", 0);
        E = d9jVar;
        d9j d9jVar2 = new d9j("End", 1);
        F = d9jVar2;
        G = new d9j[]{d9jVar, d9jVar2};
    }

    public static d9j valueOf(String str) {
        return (d9j) Enum.valueOf(d9j.class, str);
    }

    public static d9j[] values() {
        return (d9j[]) G.clone();
    }
}
