package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class pgc {
    public static final pgc E;
    public static final pgc F;
    public static final pgc G;
    public static final pgc H;
    public static final pgc I;
    public static final /* synthetic */ pgc[] J;
    public static final /* synthetic */ gq6 K;

    static {
        pgc pgcVar = new pgc("Intro", 0);
        E = pgcVar;
        pgc pgcVar2 = new pgc("Setup", 1);
        F = pgcVar2;
        pgc pgcVar3 = new pgc("Looking", 2);
        G = pgcVar3;
        pgc pgcVar4 = new pgc("Failed", 3);
        H = pgcVar4;
        pgc pgcVar5 = new pgc("Success", 4);
        I = pgcVar5;
        pgc[] pgcVarArr = {pgcVar, pgcVar2, pgcVar3, pgcVar4, pgcVar5};
        J = pgcVarArr;
        K = new gq6(pgcVarArr);
    }

    public static pgc valueOf(String str) {
        return (pgc) Enum.valueOf(pgc.class, str);
    }

    public static pgc[] values() {
        return (pgc[]) J.clone();
    }
}
