package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nj9 {
    public static final ww7 a;
    public static final ww7 b;
    public static final ww7 c;
    public static final ww7 d;
    public static final ww7 e;
    public static final ww7 f;
    public static final List g;
    public static final ww7 h;
    public static final ww7 i;
    public static final List j;
    public static final ww7 k;
    public static final ww7 l;
    public static final ww7 m;
    public static final ww7 n;
    public static final Set o;
    public static final Set p;

    static {
        ww7 ww7Var = new ww7("org.jspecify.nullness.Nullable");
        a = ww7Var;
        b = new ww7("org.jspecify.nullness.NullnessUnspecified");
        ww7 ww7Var2 = new ww7("org.jspecify.nullness.NullMarked");
        c = ww7Var2;
        ww7 ww7Var3 = new ww7("org.jspecify.annotations.Nullable");
        d = ww7Var3;
        e = new ww7("org.jspecify.annotations.NullnessUnspecified");
        ww7 ww7Var4 = new ww7("org.jspecify.annotations.NullMarked");
        f = ww7Var4;
        List listX = x44.X(mj9.i, new ww7("androidx.annotation.Nullable"), new ww7("android.support.annotation.Nullable"), new ww7("android.annotation.Nullable"), new ww7("com.android.annotations.Nullable"), new ww7("org.eclipse.jdt.annotation.Nullable"), new ww7("org.checkerframework.checker.nullness.qual.Nullable"), new ww7("javax.annotation.Nullable"), new ww7("javax.annotation.CheckForNull"), new ww7("edu.umd.cs.findbugs.annotations.CheckForNull"), new ww7("edu.umd.cs.findbugs.annotations.Nullable"), new ww7("edu.umd.cs.findbugs.annotations.PossiblyNull"), new ww7("io.reactivex.annotations.Nullable"), new ww7("io.reactivex.rxjava3.annotations.Nullable"));
        g = listX;
        ww7 ww7Var5 = new ww7("javax.annotation.Nonnull");
        h = ww7Var5;
        i = new ww7("javax.annotation.CheckForNull");
        List listX2 = x44.X(mj9.h, new ww7("edu.umd.cs.findbugs.annotations.NonNull"), new ww7("androidx.annotation.NonNull"), new ww7("android.support.annotation.NonNull"), new ww7("android.annotation.NonNull"), new ww7("com.android.annotations.NonNull"), new ww7("org.eclipse.jdt.annotation.NonNull"), new ww7("org.checkerframework.checker.nullness.qual.NonNull"), new ww7("lombok.NonNull"), new ww7("io.reactivex.annotations.NonNull"), new ww7("io.reactivex.rxjava3.annotations.NonNull"));
        j = listX2;
        ww7 ww7Var6 = new ww7("org.checkerframework.checker.nullness.compatqual.NullableDecl");
        k = ww7Var6;
        ww7 ww7Var7 = new ww7("org.checkerframework.checker.nullness.compatqual.NonNullDecl");
        l = ww7Var7;
        ww7 ww7Var8 = new ww7("androidx.annotation.RecentlyNullable");
        m = ww7Var8;
        ww7 ww7Var9 = new ww7("androidx.annotation.RecentlyNonNull");
        n = ww7Var9;
        dxf.q0(dxf.q0(dxf.q0(dxf.q0(dxf.q0(dxf.q0(dxf.q0(dxf.q0(dxf.p0(dxf.q0(dxf.p0(new LinkedHashSet(), listX), ww7Var5), listX2), ww7Var6), ww7Var7), ww7Var8), ww7Var9), ww7Var), ww7Var2), ww7Var3), ww7Var4);
        o = mp0.Z0(new ww7[]{mj9.k, mj9.l});
        p = mp0.Z0(new ww7[]{mj9.j, mj9.m});
        sta.h0(new cpc(mj9.c, okg.t), new cpc(mj9.d, okg.w), new cpc(mj9.e, okg.m), new cpc(mj9.f, okg.x));
    }

    public static final ww7 a() {
        return n;
    }

    public static final ww7 b() {
        return m;
    }

    public static final ww7 c() {
        return l;
    }

    public static final ww7 d() {
        return k;
    }

    public static final ww7 e() {
        return h;
    }

    public static final ww7 f() {
        return d;
    }

    public static final ww7 g() {
        return e;
    }

    public static final ww7 h() {
        return a;
    }

    public static final ww7 i() {
        return b;
    }

    public static final List j() {
        return j;
    }

    public static final List k() {
        return g;
    }
}
