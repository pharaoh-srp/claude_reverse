package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class he9 {
    public static final ww7 a;
    public static final ww7[] b;
    public static final q28 c;
    public static final ie9 d;

    static {
        ww7 ww7Var = new ww7("org.jspecify.nullness");
        ww7 ww7Var2 = new ww7("org.jspecify.annotations");
        a = ww7Var2;
        ww7 ww7Var3 = new ww7("io.reactivex.rxjava3.annotations");
        ww7 ww7Var4 = new ww7("org.checkerframework.checker.nullness.compatqual");
        String strB = ww7Var3.b();
        b = new ww7[]{new ww7(strB.concat(".Nullable")), new ww7(strB.concat(".NonNull"))};
        ww7 ww7Var5 = new ww7("org.jetbrains.annotations");
        ie9 ie9Var = ie9.d;
        cpc cpcVar = new cpc(ww7Var5, ie9Var);
        cpc cpcVar2 = new cpc(new ww7("androidx.annotation"), ie9Var);
        cpc cpcVar3 = new cpc(new ww7("android.support.annotation"), ie9Var);
        cpc cpcVar4 = new cpc(new ww7("android.annotation"), ie9Var);
        cpc cpcVar5 = new cpc(new ww7("com.android.annotations"), ie9Var);
        cpc cpcVar6 = new cpc(new ww7("org.eclipse.jdt.annotation"), ie9Var);
        cpc cpcVar7 = new cpc(new ww7("org.checkerframework.checker.nullness.qual"), ie9Var);
        cpc cpcVar8 = new cpc(ww7Var4, ie9Var);
        cpc cpcVar9 = new cpc(new ww7("javax.annotation"), ie9Var);
        cpc cpcVar10 = new cpc(new ww7("edu.umd.cs.findbugs.annotations"), ie9Var);
        cpc cpcVar11 = new cpc(new ww7("io.reactivex.annotations"), ie9Var);
        ww7 ww7Var6 = new ww7("androidx.annotation.RecentlyNullable");
        iie iieVar = iie.WARN;
        cpc cpcVar12 = new cpc(ww7Var6, new ie9(iieVar, 4));
        cpc cpcVar13 = new cpc(new ww7("androidx.annotation.RecentlyNonNull"), new ie9(iieVar, 4));
        cpc cpcVar14 = new cpc(new ww7("lombok"), ie9Var);
        gs9 gs9Var = new gs9(1, 9, 0);
        iie iieVar2 = iie.STRICT;
        c = new q28(sta.h0(cpcVar, cpcVar2, cpcVar3, cpcVar4, cpcVar5, cpcVar6, cpcVar7, cpcVar8, cpcVar9, cpcVar10, cpcVar11, cpcVar12, cpcVar13, cpcVar14, new cpc(ww7Var, new ie9(iieVar, gs9Var, iieVar2)), new cpc(ww7Var2, new ie9(iieVar, new gs9(1, 9, 0), iieVar2)), new cpc(ww7Var3, new ie9(iieVar, new gs9(1, 8, 0), iieVar2))));
        d = new ie9(iieVar, 4);
    }
}
