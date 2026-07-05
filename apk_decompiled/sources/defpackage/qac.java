package defpackage;

import android.os.Build;
import java.time.Instant;
import java.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final class qac implements sa9 {
    public static final vr A0;
    public static final vr B0;
    public static final vr C0;
    public static final vr D0;
    public static final vr E0;
    public static final vr F0;
    public static final vr G0;
    public static final vr H0;
    public static final vr I0;
    public static final vr J0;
    public static final vr K0;
    public static final vr L0;
    public static final vr M0;
    public static final vr N0;
    public static final vr O0;
    public static final vr P0;
    public static final vr Q0;
    public static final vr R0;
    public static final fva X;
    public static final fva Y;
    public static final fva Z;
    public static final yn6 a0;
    public static final yn6 b0;
    public static final vr c0;
    public static final vr d0;
    public static final vr e0;
    public static final vr f0;
    public static final vr g0;
    public static final vr h0;
    public static final vr i0;
    public static final vr j0;
    public static final vr k0;
    public static final vr l0;
    public static final vr m0;
    public static final vr n0;
    public static final vr o0;
    public static final vr p0;
    public static final vr q0;
    public static final vr r0;
    public static final vr s0;
    public static final vr t0;
    public static final vr u0;
    public static final vr v0;
    public static final vr w0;
    public static final vr x0;
    public static final vr y0;
    public static final vr z0;
    public final fva A;
    public final fva B;
    public final fva C;
    public final fva D;
    public final fva E;
    public final fva F;
    public final fva G;
    public final fva H;
    public final fva I;
    public final fva J;
    public final fva K;
    public final fva L;
    public final fva M;
    public final fva N;
    public final fva O;
    public final fva P;
    public final fva Q;
    public final fva R;
    public final fva S;
    public final fva T;
    public final fva U;
    public final String V;
    public final int W;
    public final Instant a;
    public final ZoneOffset b;
    public final Instant c;
    public final ZoneOffset d;
    public final ijb e;
    public final fva f;
    public final fva g;
    public final fva h;
    public final yn6 i;
    public final yn6 j;
    public final fva k;
    public final fva l;
    public final fva m;
    public final fva n;
    public final fva o;
    public final fva p;
    public final fva q;
    public final fva r;
    public final fva s;
    public final fva t;
    public final fva u;
    public final fva v;
    public final fva w;
    public final fva x;
    public final fva y;
    public final fva z;

    static {
        xua xuaVar = fva.G;
        X = xua.a(0.0d);
        Y = xua.a(100.0d);
        Z = xua.a(100000.0d);
        tn6 tn6Var = xn6.E;
        a0 = new yn6(0.0d, tn6Var);
        b0 = new yn6(1.0E8d, tn6Var);
        xua xuaVar2 = fva.G;
        ty4 ty4Var = new ty4(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 27);
        nr nrVar = nr.TOTAL;
        c0 = pok.g("Nutrition", nrVar, "biotin", ty4Var);
        int i = 1;
        d0 = pok.g("Nutrition", nrVar, "caffeine", new ty4(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 28));
        e0 = pok.g("Nutrition", nrVar, "calcium", new ty4(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 29));
        sn6 sn6Var = yn6.G;
        f0 = pok.g("Nutrition", nrVar, "calories", new oac(1, sn6Var, sn6.class, "kilocalories", "kilocalories(D)Landroidx/health/connect/client/units/Energy;", 0, 6));
        g0 = pok.g("Nutrition", nrVar, "caloriesFromFat", new oac(1, sn6Var, sn6.class, "kilocalories", "kilocalories(D)Landroidx/health/connect/client/units/Energy;", 0, 5));
        int i2 = 0;
        h0 = pok.g("Nutrition", nrVar, "chloride", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 0));
        i0 = pok.g("Nutrition", nrVar, "cholesterol", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 1));
        j0 = pok.g("Nutrition", nrVar, "chromium", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 2));
        k0 = pok.g("Nutrition", nrVar, "copper", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 3));
        l0 = pok.g("Nutrition", nrVar, "dietaryFiber", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 4));
        m0 = pok.g("Nutrition", nrVar, "folate", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 7));
        n0 = pok.g("Nutrition", nrVar, "folicAcid", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 8));
        o0 = pok.g("Nutrition", nrVar, "iodine", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 9));
        p0 = pok.g("Nutrition", nrVar, "iron", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 10));
        q0 = pok.g("Nutrition", nrVar, "magnesium", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 11));
        r0 = pok.g("Nutrition", nrVar, "manganese", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 12));
        s0 = pok.g("Nutrition", nrVar, "molybdenum", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 13));
        t0 = pok.g("Nutrition", nrVar, "monounsaturatedFat", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 14));
        u0 = pok.g("Nutrition", nrVar, "niacin", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 15));
        v0 = pok.g("Nutrition", nrVar, "pantothenicAcid", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 16));
        w0 = pok.g("Nutrition", nrVar, "phosphorus", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 17));
        x0 = pok.g("Nutrition", nrVar, "polyunsaturatedFat", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 18));
        y0 = pok.g("Nutrition", nrVar, "potassium", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 19));
        z0 = pok.g("Nutrition", nrVar, "protein", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 20));
        A0 = pok.g("Nutrition", nrVar, "riboflavin", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 21));
        B0 = pok.g("Nutrition", nrVar, "saturatedFat", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 22));
        C0 = pok.g("Nutrition", nrVar, "selenium", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 23));
        D0 = pok.g("Nutrition", nrVar, "sodium", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 24));
        E0 = pok.g("Nutrition", nrVar, "sugar", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 25));
        F0 = pok.g("Nutrition", nrVar, "thiamin", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 26));
        G0 = pok.g("Nutrition", nrVar, "totalCarbohydrate", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 27));
        H0 = pok.g("Nutrition", nrVar, "totalFat", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 28));
        I0 = pok.g("Nutrition", nrVar, "transFat", new oac(1, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", 0, 29));
        J0 = pok.g("Nutrition", nrVar, "unsaturatedFat", new pac(i, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", i2, 0));
        K0 = pok.g("Nutrition", nrVar, "vitaminA", new pac(i, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", i2, 1));
        L0 = pok.g("Nutrition", nrVar, "vitaminB12", new pac(i, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", i2, 2));
        M0 = pok.g("Nutrition", nrVar, "vitaminB6", new pac(i, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", i2, 3));
        N0 = pok.g("Nutrition", nrVar, "vitaminC", new pac(i, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", i2, 4));
        O0 = pok.g("Nutrition", nrVar, "vitaminD", new pac(i, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", i2, 5));
        P0 = pok.g("Nutrition", nrVar, "vitaminE", new pac(i, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", i2, 6));
        Q0 = pok.g("Nutrition", nrVar, "vitaminK", new pac(i, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", i2, 7));
        R0 = pok.g("Nutrition", nrVar, "zinc", new pac(i, xuaVar2, xua.class, "grams", "grams(D)Landroidx/health/connect/client/units/Mass;", i2, 8));
    }

    public qac(Instant instant, ZoneOffset zoneOffset, Instant instant2, ZoneOffset zoneOffset2, ijb ijbVar, fva fvaVar, fva fvaVar2, fva fvaVar3, yn6 yn6Var, yn6 yn6Var2, fva fvaVar4, fva fvaVar5, fva fvaVar6, fva fvaVar7, fva fvaVar8, fva fvaVar9, fva fvaVar10, fva fvaVar11, fva fvaVar12, fva fvaVar13, fva fvaVar14, fva fvaVar15, fva fvaVar16, fva fvaVar17, fva fvaVar18, fva fvaVar19, fva fvaVar20, fva fvaVar21, fva fvaVar22, fva fvaVar23, fva fvaVar24, fva fvaVar25, fva fvaVar26, fva fvaVar27, fva fvaVar28, fva fvaVar29, fva fvaVar30, fva fvaVar31, fva fvaVar32, fva fvaVar33, fva fvaVar34, fva fvaVar35, fva fvaVar36, fva fvaVar37, fva fvaVar38, fva fvaVar39, fva fvaVar40, String str, int i) {
        this.a = instant;
        this.b = zoneOffset;
        this.c = instant2;
        this.d = zoneOffset2;
        this.e = ijbVar;
        this.f = fvaVar;
        this.g = fvaVar2;
        this.h = fvaVar3;
        this.i = yn6Var;
        this.j = yn6Var2;
        this.k = fvaVar4;
        this.l = fvaVar5;
        this.m = fvaVar6;
        this.n = fvaVar7;
        this.o = fvaVar8;
        this.p = fvaVar9;
        this.q = fvaVar10;
        this.r = fvaVar11;
        this.s = fvaVar12;
        this.t = fvaVar13;
        this.u = fvaVar14;
        this.v = fvaVar15;
        this.w = fvaVar16;
        this.x = fvaVar17;
        this.y = fvaVar18;
        this.z = fvaVar19;
        this.A = fvaVar20;
        this.B = fvaVar21;
        this.C = fvaVar22;
        this.D = fvaVar23;
        this.E = fvaVar24;
        this.F = fvaVar25;
        this.G = fvaVar26;
        this.H = fvaVar27;
        this.I = fvaVar28;
        this.J = fvaVar29;
        this.K = fvaVar30;
        this.L = fvaVar31;
        this.M = fvaVar32;
        this.N = fvaVar33;
        this.O = fvaVar34;
        this.P = fvaVar35;
        this.Q = fvaVar36;
        this.R = fvaVar37;
        this.S = fvaVar38;
        this.T = fvaVar39;
        this.U = fvaVar40;
        this.V = str;
        this.W = i;
        if (!this.a.isBefore(this.c)) {
            sz6.p("startTime must be before endTime.");
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            h0c.c(this);
            return;
        }
        fva fvaVar41 = this.f;
        fva fvaVar42 = Y;
        fva fvaVar43 = X;
        if (fvaVar41 != null) {
            quj.j(fvaVar41, fvaVar43, fvaVar42, "biotin");
        }
        fva fvaVar44 = this.g;
        if (fvaVar44 != null) {
            quj.j(fvaVar44, fvaVar43, fvaVar42, "caffeine");
        }
        fva fvaVar45 = this.h;
        if (fvaVar45 != null) {
            quj.j(fvaVar45, fvaVar43, fvaVar42, "calcium");
        }
        yn6 yn6Var3 = this.i;
        yn6 yn6Var4 = b0;
        yn6 yn6Var5 = a0;
        if (yn6Var3 != null) {
            quj.j(yn6Var3, yn6Var5, yn6Var4, "energy");
        }
        yn6 yn6Var6 = this.j;
        if (yn6Var6 != null) {
            quj.j(yn6Var6, yn6Var5, yn6Var4, "energyFromFat");
        }
        fva fvaVar46 = this.k;
        if (fvaVar46 != null) {
            quj.j(fvaVar46, fvaVar43, fvaVar42, "chloride");
        }
        fva fvaVar47 = this.l;
        if (fvaVar47 != null) {
            quj.j(fvaVar47, fvaVar43, fvaVar42, "cholesterol");
        }
        fva fvaVar48 = this.m;
        if (fvaVar48 != null) {
            quj.j(fvaVar48, fvaVar43, fvaVar42, "chromium");
        }
        fva fvaVar49 = this.n;
        if (fvaVar49 != null) {
            quj.j(fvaVar49, fvaVar43, fvaVar42, "copper");
        }
        fva fvaVar50 = this.o;
        fva fvaVar51 = Z;
        if (fvaVar50 != null) {
            quj.j(fvaVar50, fvaVar43, fvaVar51, "dietaryFiber");
        }
        fva fvaVar52 = this.p;
        if (fvaVar52 != null) {
            quj.j(fvaVar52, fvaVar43, fvaVar42, "chloride");
        }
        fva fvaVar53 = this.q;
        if (fvaVar53 != null) {
            quj.j(fvaVar53, fvaVar43, fvaVar42, "folicAcid");
        }
        fva fvaVar54 = this.r;
        if (fvaVar54 != null) {
            quj.j(fvaVar54, fvaVar43, fvaVar42, "iodine");
        }
        fva fvaVar55 = this.s;
        if (fvaVar55 != null) {
            quj.j(fvaVar55, fvaVar43, fvaVar42, "iron");
        }
        fva fvaVar56 = this.t;
        if (fvaVar56 != null) {
            quj.j(fvaVar56, fvaVar43, fvaVar42, "magnesium");
        }
        fva fvaVar57 = this.u;
        if (fvaVar57 != null) {
            quj.j(fvaVar57, fvaVar43, fvaVar42, "manganese");
        }
        fva fvaVar58 = this.v;
        if (fvaVar58 != null) {
            quj.j(fvaVar58, fvaVar43, fvaVar42, "molybdenum");
        }
        fva fvaVar59 = this.w;
        if (fvaVar59 != null) {
            quj.j(fvaVar59, fvaVar43, fvaVar51, "monounsaturatedFat");
        }
        if (fvaVar17 != null) {
            quj.j(fvaVar17, fvaVar43, fvaVar42, "niacin");
        }
        if (fvaVar18 != null) {
            quj.j(fvaVar18, fvaVar43, fvaVar42, "pantothenicAcid");
        }
        if (fvaVar19 != null) {
            quj.j(fvaVar19, fvaVar43, fvaVar42, "phosphorus");
        }
        if (fvaVar20 != null) {
            quj.j(fvaVar20, fvaVar43, fvaVar51, "polyunsaturatedFat");
        }
        if (fvaVar21 != null) {
            quj.j(fvaVar21, fvaVar43, fvaVar42, "potassium");
        }
        if (fvaVar22 != null) {
            quj.j(fvaVar22, fvaVar43, fvaVar51, "protein");
        }
        if (fvaVar23 != null) {
            quj.j(fvaVar23, fvaVar43, fvaVar42, "riboflavin");
        }
        if (fvaVar24 != null) {
            quj.j(fvaVar24, fvaVar43, fvaVar51, "saturatedFat");
        }
        if (fvaVar25 != null) {
            quj.j(fvaVar25, fvaVar43, fvaVar42, "selenium");
        }
        if (fvaVar26 != null) {
            quj.j(fvaVar26, fvaVar43, fvaVar42, "sodium");
        }
        if (fvaVar27 != null) {
            quj.j(fvaVar27, fvaVar43, fvaVar51, "sugar");
        }
        if (fvaVar28 != null) {
            quj.j(fvaVar28, fvaVar43, fvaVar42, "thiamin");
        }
        if (fvaVar29 != null) {
            quj.j(fvaVar29, fvaVar43, fvaVar51, "totalCarbohydrate");
        }
        if (fvaVar30 != null) {
            quj.j(fvaVar30, fvaVar43, fvaVar51, "totalFat");
        }
        if (fvaVar31 != null) {
            quj.j(fvaVar31, fvaVar43, fvaVar51, "transFat");
        }
        if (fvaVar32 != null) {
            quj.j(fvaVar32, fvaVar43, fvaVar51, "unsaturatedFat");
        }
        if (fvaVar33 != null) {
            quj.j(fvaVar33, fvaVar43, fvaVar42, "vitaminA");
        }
        if (fvaVar34 != null) {
            quj.j(fvaVar34, fvaVar43, fvaVar42, "vitaminB12");
        }
        if (fvaVar35 != null) {
            quj.j(fvaVar35, fvaVar43, fvaVar42, "vitaminB6");
        }
        if (fvaVar36 != null) {
            quj.j(fvaVar36, fvaVar43, fvaVar42, "vitaminC");
        }
        if (fvaVar37 != null) {
            quj.j(fvaVar37, fvaVar43, fvaVar42, "vitaminD");
        }
        if (fvaVar38 != null) {
            quj.j(fvaVar38, fvaVar43, fvaVar42, "vitaminE");
        }
        if (fvaVar39 != null) {
            quj.j(fvaVar39, fvaVar43, fvaVar42, "vitaminK");
        }
        if (fvaVar40 != null) {
            quj.j(fvaVar40, fvaVar43, fvaVar42, "zinc");
        }
    }

    @Override // defpackage.sa9
    public final Instant b() {
        return this.a;
    }

    @Override // defpackage.sa9
    public final Instant e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qac)) {
            return false;
        }
        qac qacVar = (qac) obj;
        return x44.r(this.f, qacVar.f) && x44.r(this.g, qacVar.g) && x44.r(this.h, qacVar.h) && x44.r(this.i, qacVar.i) && x44.r(this.j, qacVar.j) && x44.r(this.k, qacVar.k) && x44.r(this.l, qacVar.l) && x44.r(this.m, qacVar.m) && x44.r(this.n, qacVar.n) && x44.r(this.o, qacVar.o) && x44.r(this.p, qacVar.p) && x44.r(this.q, qacVar.q) && x44.r(this.r, qacVar.r) && x44.r(this.s, qacVar.s) && x44.r(this.t, qacVar.t) && x44.r(this.u, qacVar.u) && x44.r(this.v, qacVar.v) && x44.r(this.w, qacVar.w) && x44.r(this.x, qacVar.x) && x44.r(this.y, qacVar.y) && x44.r(this.z, qacVar.z) && x44.r(this.A, qacVar.A) && x44.r(this.B, qacVar.B) && x44.r(this.C, qacVar.C) && x44.r(this.D, qacVar.D) && x44.r(this.E, qacVar.E) && x44.r(this.F, qacVar.F) && x44.r(this.G, qacVar.G) && x44.r(this.H, qacVar.H) && x44.r(this.I, qacVar.I) && x44.r(this.J, qacVar.J) && x44.r(this.K, qacVar.K) && x44.r(this.L, qacVar.L) && x44.r(this.M, qacVar.M) && x44.r(this.N, qacVar.N) && x44.r(this.O, qacVar.O) && x44.r(this.P, qacVar.P) && x44.r(this.Q, qacVar.Q) && x44.r(this.R, qacVar.R) && x44.r(this.S, qacVar.S) && x44.r(this.T, qacVar.T) && x44.r(this.U, qacVar.U) && x44.r(this.V, qacVar.V) && this.W == qacVar.W && this.a.equals(qacVar.a) && x44.r(this.b, qacVar.b) && this.c.equals(qacVar.c) && x44.r(this.d, qacVar.d) && this.e.equals(qacVar.e);
    }

    @Override // defpackage.sa9
    public final ZoneOffset f() {
        return this.d;
    }

    @Override // defpackage.sa9
    public final ZoneOffset g() {
        return this.b;
    }

    public final int hashCode() {
        fva fvaVar = this.f;
        int iHashCode = (fvaVar != null ? fvaVar.hashCode() : 0) * 31;
        fva fvaVar2 = this.g;
        int iHashCode2 = (iHashCode + (fvaVar2 != null ? fvaVar2.hashCode() : 0)) * 31;
        fva fvaVar3 = this.h;
        int iHashCode3 = (iHashCode2 + (fvaVar3 != null ? fvaVar3.hashCode() : 0)) * 31;
        yn6 yn6Var = this.i;
        int iHashCode4 = (iHashCode3 + (yn6Var != null ? yn6Var.hashCode() : 0)) * 31;
        yn6 yn6Var2 = this.j;
        int iHashCode5 = (iHashCode4 + (yn6Var2 != null ? yn6Var2.hashCode() : 0)) * 31;
        fva fvaVar4 = this.k;
        int iHashCode6 = (iHashCode5 + (fvaVar4 != null ? fvaVar4.hashCode() : 0)) * 31;
        fva fvaVar5 = this.l;
        int iHashCode7 = (iHashCode6 + (fvaVar5 != null ? fvaVar5.hashCode() : 0)) * 31;
        fva fvaVar6 = this.m;
        int iHashCode8 = (iHashCode7 + (fvaVar6 != null ? fvaVar6.hashCode() : 0)) * 31;
        fva fvaVar7 = this.n;
        int iHashCode9 = (iHashCode8 + (fvaVar7 != null ? fvaVar7.hashCode() : 0)) * 31;
        fva fvaVar8 = this.o;
        int iHashCode10 = (iHashCode9 + (fvaVar8 != null ? fvaVar8.hashCode() : 0)) * 31;
        fva fvaVar9 = this.p;
        int iHashCode11 = (iHashCode10 + (fvaVar9 != null ? fvaVar9.hashCode() : 0)) * 31;
        fva fvaVar10 = this.q;
        int iHashCode12 = (iHashCode11 + (fvaVar10 != null ? fvaVar10.hashCode() : 0)) * 31;
        fva fvaVar11 = this.r;
        int iHashCode13 = (iHashCode12 + (fvaVar11 != null ? fvaVar11.hashCode() : 0)) * 31;
        fva fvaVar12 = this.s;
        int iHashCode14 = (iHashCode13 + (fvaVar12 != null ? fvaVar12.hashCode() : 0)) * 31;
        fva fvaVar13 = this.t;
        int iHashCode15 = (iHashCode14 + (fvaVar13 != null ? fvaVar13.hashCode() : 0)) * 31;
        fva fvaVar14 = this.u;
        int iHashCode16 = (iHashCode15 + (fvaVar14 != null ? fvaVar14.hashCode() : 0)) * 31;
        fva fvaVar15 = this.v;
        int iHashCode17 = (iHashCode16 + (fvaVar15 != null ? fvaVar15.hashCode() : 0)) * 31;
        fva fvaVar16 = this.w;
        int iHashCode18 = (iHashCode17 + (fvaVar16 != null ? fvaVar16.hashCode() : 0)) * 31;
        fva fvaVar17 = this.x;
        int iHashCode19 = (iHashCode18 + (fvaVar17 != null ? fvaVar17.hashCode() : 0)) * 31;
        fva fvaVar18 = this.y;
        int iHashCode20 = (iHashCode19 + (fvaVar18 != null ? fvaVar18.hashCode() : 0)) * 31;
        fva fvaVar19 = this.z;
        int iHashCode21 = (iHashCode20 + (fvaVar19 != null ? fvaVar19.hashCode() : 0)) * 31;
        fva fvaVar20 = this.A;
        int iHashCode22 = (iHashCode21 + (fvaVar20 != null ? fvaVar20.hashCode() : 0)) * 31;
        fva fvaVar21 = this.B;
        int iHashCode23 = (iHashCode22 + (fvaVar21 != null ? fvaVar21.hashCode() : 0)) * 31;
        fva fvaVar22 = this.C;
        int iHashCode24 = (iHashCode23 + (fvaVar22 != null ? fvaVar22.hashCode() : 0)) * 31;
        fva fvaVar23 = this.D;
        int iHashCode25 = (iHashCode24 + (fvaVar23 != null ? fvaVar23.hashCode() : 0)) * 31;
        fva fvaVar24 = this.E;
        int iHashCode26 = (iHashCode25 + (fvaVar24 != null ? fvaVar24.hashCode() : 0)) * 31;
        fva fvaVar25 = this.F;
        int iHashCode27 = (iHashCode26 + (fvaVar25 != null ? fvaVar25.hashCode() : 0)) * 31;
        fva fvaVar26 = this.G;
        int iHashCode28 = (iHashCode27 + (fvaVar26 != null ? fvaVar26.hashCode() : 0)) * 31;
        fva fvaVar27 = this.H;
        int iHashCode29 = (iHashCode28 + (fvaVar27 != null ? fvaVar27.hashCode() : 0)) * 31;
        fva fvaVar28 = this.I;
        int iHashCode30 = (iHashCode29 + (fvaVar28 != null ? fvaVar28.hashCode() : 0)) * 31;
        fva fvaVar29 = this.J;
        int iHashCode31 = (iHashCode30 + (fvaVar29 != null ? fvaVar29.hashCode() : 0)) * 31;
        fva fvaVar30 = this.K;
        int iHashCode32 = (iHashCode31 + (fvaVar30 != null ? fvaVar30.hashCode() : 0)) * 31;
        fva fvaVar31 = this.L;
        int iHashCode33 = (iHashCode32 + (fvaVar31 != null ? fvaVar31.hashCode() : 0)) * 31;
        fva fvaVar32 = this.M;
        int iHashCode34 = (iHashCode33 + (fvaVar32 != null ? fvaVar32.hashCode() : 0)) * 31;
        fva fvaVar33 = this.N;
        int iHashCode35 = (iHashCode34 + (fvaVar33 != null ? fvaVar33.hashCode() : 0)) * 31;
        fva fvaVar34 = this.O;
        int iHashCode36 = (iHashCode35 + (fvaVar34 != null ? fvaVar34.hashCode() : 0)) * 31;
        fva fvaVar35 = this.P;
        int iHashCode37 = (iHashCode36 + (fvaVar35 != null ? fvaVar35.hashCode() : 0)) * 31;
        fva fvaVar36 = this.Q;
        int iHashCode38 = (iHashCode37 + (fvaVar36 != null ? fvaVar36.hashCode() : 0)) * 31;
        fva fvaVar37 = this.R;
        int iHashCode39 = (iHashCode38 + (fvaVar37 != null ? fvaVar37.hashCode() : 0)) * 31;
        fva fvaVar38 = this.S;
        int iHashCode40 = (iHashCode39 + (fvaVar38 != null ? fvaVar38.hashCode() : 0)) * 31;
        fva fvaVar39 = this.T;
        int iHashCode41 = (iHashCode40 + (fvaVar39 != null ? fvaVar39.hashCode() : 0)) * 31;
        fva fvaVar40 = this.U;
        int iHashCode42 = (iHashCode41 + (fvaVar40 != null ? fvaVar40.hashCode() : 0)) * 31;
        String str = this.V;
        int i = ebh.i(this.a, (((iHashCode42 + (str != null ? str.hashCode() : 0)) * 31) + this.W) * 31, 31);
        ZoneOffset zoneOffset = this.b;
        int i2 = ebh.i(this.c, (i + (zoneOffset != null ? zoneOffset.hashCode() : 0)) * 31, 31);
        ZoneOffset zoneOffset2 = this.d;
        return this.e.hashCode() + ((i2 + (zoneOffset2 != null ? zoneOffset2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.y7e
    public final ijb m() {
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NutritionRecord(startTime=");
        sb.append(this.a);
        sb.append(", startZoneOffset=");
        sb.append(this.b);
        sb.append(", endTime=");
        sb.append(this.c);
        sb.append(", endZoneOffset=");
        sb.append(this.d);
        sb.append(", biotin=");
        sb.append(this.f);
        sb.append(", caffeine=");
        sb.append(this.g);
        sb.append(", calcium=");
        sb.append(this.h);
        sb.append(", energy=");
        sb.append(this.i);
        sb.append(", energyFromFat=");
        sb.append(this.j);
        sb.append(", chloride=");
        sb.append(this.k);
        sb.append(", cholesterol=");
        sb.append(this.l);
        sb.append(", chromium=");
        sb.append(this.m);
        sb.append(", copper=");
        sb.append(this.n);
        sb.append(", dietaryFiber=");
        sb.append(this.o);
        sb.append(", folate=");
        sb.append(this.p);
        sb.append(", folicAcid=");
        sb.append(this.q);
        sb.append(", iodine=");
        sb.append(this.r);
        sb.append(", iron=");
        sb.append(this.s);
        sb.append(", magnesium=");
        sb.append(this.t);
        sb.append(", manganese=");
        sb.append(this.u);
        sb.append(", molybdenum=");
        sb.append(this.v);
        sb.append(", monounsaturatedFat=");
        sb.append(this.w);
        sb.append(", niacin=");
        sb.append(this.x);
        sb.append(", pantothenicAcid=");
        sb.append(this.y);
        sb.append(", phosphorus=");
        sb.append(this.z);
        sb.append(", polyunsaturatedFat=");
        sb.append(this.A);
        sb.append(", potassium=");
        sb.append(this.B);
        sb.append(", protein=");
        sb.append(this.C);
        sb.append(", riboflavin=");
        sb.append(this.D);
        sb.append(", saturatedFat=");
        sb.append(this.E);
        sb.append(", selenium=");
        sb.append(this.F);
        sb.append(", sodium=");
        sb.append(this.G);
        sb.append(", sugar=");
        sb.append(this.H);
        sb.append(", thiamin=");
        sb.append(this.I);
        sb.append(", totalCarbohydrate=");
        sb.append(this.J);
        sb.append(", totalFat=");
        sb.append(this.K);
        sb.append(", transFat=");
        sb.append(this.L);
        sb.append(", unsaturatedFat=");
        sb.append(this.M);
        sb.append(", vitaminA=");
        sb.append(this.N);
        sb.append(", vitaminB12=");
        sb.append(this.O);
        sb.append(", vitaminB6=");
        sb.append(this.P);
        sb.append(", vitaminC=");
        sb.append(this.Q);
        sb.append(", vitaminD=");
        sb.append(this.R);
        sb.append(", vitaminE=");
        sb.append(this.S);
        sb.append(", vitaminK=");
        sb.append(this.T);
        sb.append(", zinc=");
        sb.append(this.U);
        sb.append(", name=");
        sb.append(this.V);
        sb.append(", mealType=");
        sb.append(this.W);
        sb.append(", metadata=");
        return ebh.q(sb, this.e, ')');
    }
}
