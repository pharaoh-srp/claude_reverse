package defpackage;

import com.agog.mathdisplay.render.MTTypesetterKt;

/* JADX INFO: loaded from: classes.dex */
public final class t54 {
    public static final float[] a;
    public static final float[] b;
    public static final a5i c;
    public static final a5i d;
    public static final rse e;
    public static final rse f;
    public static final rse g;
    public static final rse h;
    public static final rse i;
    public static final rse j;
    public static final rse k;
    public static final rse l;
    public static final rse m;
    public static final rse n;
    public static final rse o;
    public static final rse p;
    public static final rse q;
    public static final rse r;
    public static final qs9 s;
    public static final qs9 t;
    public static final rse u;
    public static final rse v;
    public static final rse w;
    public static final kdc x;
    public static final r54[] y;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        a5i a5iVar = new a5i(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        a5i a5iVar2 = new a5i(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d);
        a5i a5iVar3 = new a5i(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = a5iVar3;
        a5i a5iVar4 = new a5i(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = a5iVar4;
        v9j v9jVar = eve.e;
        rse rseVar = new rse("sRGB IEC61966-2.1", fArr, v9jVar, a5iVar, 0);
        e = rseVar;
        rse rseVar2 = new rse("sRGB IEC61966-2.1 (Linear)", fArr, v9jVar, 1.0d, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, 1);
        f = rseVar2;
        rse rseVar3 = new rse("scRGB-nl IEC 61966-2-2:2003", fArr, v9jVar, null, new sz6(14), new sz6(15), -0.799f, 2.399f, a5iVar, 2);
        g = rseVar3;
        rse rseVar4 = new rse("scRGB IEC 61966-2-2:2003", fArr, v9jVar, 1.0d, -0.5f, 7.499f, 3);
        h = rseVar4;
        rse rseVar5 = new rse("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, v9jVar, new a5i(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d), 4);
        i = rseVar5;
        rse rseVar6 = new rse("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, v9jVar, new a5i(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d), 5);
        j = rseVar6;
        rse rseVar7 = new rse("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new v9j(0.314f, 0.351f), 2.6d, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, 6);
        k = rseVar7;
        rse rseVar8 = new rse("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, v9jVar, a5iVar, 7);
        l = rseVar8;
        double d2 = 0.2222222222222222d;
        double d3 = 0.081d;
        double d4 = 2.2222222222222223d;
        double d5 = 0.9099181073703367d;
        double d6 = 0.09008189262966333d;
        rse rseVar9 = new rse("NTSC (1953)", fArr2, eve.b, new a5i(d4, d5, d6, d2, d3), 8);
        m = rseVar9;
        rse rseVar10 = new rse("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, v9jVar, new a5i(d4, d5, d6, d2, d3), 9);
        n = rseVar10;
        rse rseVar11 = new rse("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, v9jVar, 2.2d, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, 10);
        o = rseVar11;
        rse rseVar12 = new rse("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, eve.c, new a5i(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d), 11);
        p = rseVar12;
        float[] fArr4 = {0.7347f, 0.2653f, MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, 1.0E-4f, -0.077f};
        v9j v9jVar2 = eve.d;
        rse rseVar13 = new rse("SMPTE ST 2065-1:2012 ACES", fArr4, v9jVar2, 1.0d, -65504.0f, 65504.0f, 12);
        q = rseVar13;
        rse rseVar14 = new rse("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, v9jVar2, 1.0d, -65504.0f, 65504.0f, 13);
        r = rseVar14;
        qs9 qs9Var = new qs9(14, 1, 12884901889L, "Generic XYZ");
        s = qs9Var;
        qs9 qs9Var2 = new qs9(15, 0, 12884901890L, "Generic L*a*b*");
        t = qs9Var2;
        rse rseVar15 = new rse("None", fArr, v9jVar, a5iVar2, 16);
        u = rseVar15;
        rse rseVar16 = new rse("Hybrid Log Gamma encoding", fArr3, v9jVar, null, new sz6(16), new sz6(17), MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, a5iVar3, 17);
        v = rseVar16;
        rse rseVar17 = new rse("Perceptual Quantizer encoding", fArr3, v9jVar, null, new sz6(18), new sz6(19), MTTypesetterKt.kLineSkipLimitMultiplier, 1.0f, a5iVar4, 18);
        w = rseVar17;
        kdc kdcVar = new kdc("Oklab", 12884901890L, 19);
        x = kdcVar;
        y = new r54[]{rseVar, rseVar2, rseVar3, rseVar4, rseVar5, rseVar6, rseVar7, rseVar8, rseVar9, rseVar10, rseVar11, rseVar12, rseVar13, rseVar14, qs9Var, qs9Var2, rseVar15, rseVar16, rseVar17, kdcVar};
    }

    public static double a(a5i a5iVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = a5iVar.b;
        double d6 = a5iVar.c;
        double d7 = a5iVar.d;
        double d8 = a5iVar.e;
        double d9 = a5iVar.f;
        double d10 = d5 * d4;
        return (a5iVar.g + 1.0d) * d3 * (d10 <= 1.0d ? Math.pow(d10, d6) : Math.exp((d4 - d9) * d7) + d8);
    }

    public static double b(a5i a5iVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = 1.0d / a5iVar.b;
        double d5 = 1.0d / a5iVar.c;
        double d6 = 1.0d / a5iVar.d;
        double d7 = a5iVar.e;
        double d8 = a5iVar.f;
        double d9 = (d2 * d3) / (a5iVar.g + 1.0d);
        return d3 * (d9 <= 1.0d ? Math.pow(d9, d5) * d4 : (Math.log(d9 - d7) * d6) + d8);
    }

    public static double c(a5i a5iVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = a5iVar.b;
        double d6 = a5iVar.d;
        double dPow = (Math.pow(d4, d6) * a5iVar.c) + d5;
        return Math.pow((dPow >= 0.0d ? dPow : 0.0d) / ((Math.pow(d4, d6) * a5iVar.f) + a5iVar.e), a5iVar.g) * d3;
    }

    public static double d(a5i a5iVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = -a5iVar.b;
        double d6 = a5iVar.e;
        double d7 = 1.0d / a5iVar.g;
        return Math.pow(Math.max((Math.pow(d4, d7) * d6) + d5, 0.0d) / ((Math.pow(d4, d7) * (-a5iVar.f)) + a5iVar.c), 1.0d / a5iVar.d) * d3;
    }
}
