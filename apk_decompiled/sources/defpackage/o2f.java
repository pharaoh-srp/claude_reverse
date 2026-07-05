package defpackage;

import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o2f {
    public static final o2f E;
    public static final o2f F;
    public static final o2f G;
    public static final o2f H;
    public static final HashMap I;
    public static final /* synthetic */ o2f[] J;

    /* JADX INFO: Fake field, exist only in values array */
    o2f EF1;

    static {
        o2f o2fVar = new o2f("svg", 0);
        o2f o2fVar2 = new o2f("a", 1);
        o2f o2fVar3 = new o2f("circle", 2);
        o2f o2fVar4 = new o2f("clipPath", 3);
        o2f o2fVar5 = new o2f("defs", 4);
        o2f o2fVar6 = new o2f("desc", 5);
        E = o2fVar6;
        o2f o2fVar7 = new o2f("ellipse", 6);
        o2f o2fVar8 = new o2f("g", 7);
        o2f o2fVar9 = new o2f("image", 8);
        o2f o2fVar10 = new o2f("line", 9);
        o2f o2fVar11 = new o2f("linearGradient", 10);
        o2f o2fVar12 = new o2f("marker", 11);
        o2f o2fVar13 = new o2f("mask", 12);
        o2f o2fVar14 = new o2f("path", 13);
        o2f o2fVar15 = new o2f("pattern", 14);
        o2f o2fVar16 = new o2f("polygon", 15);
        o2f o2fVar17 = new o2f("polyline", 16);
        o2f o2fVar18 = new o2f("radialGradient", 17);
        o2f o2fVar19 = new o2f("rect", 18);
        o2f o2fVar20 = new o2f("solidColor", 19);
        o2f o2fVar21 = new o2f("stop", 20);
        o2f o2fVar22 = new o2f("style", 21);
        o2f o2fVar23 = new o2f("SWITCH", 22);
        F = o2fVar23;
        o2f o2fVar24 = new o2f("symbol", 23);
        o2f o2fVar25 = new o2f("text", 24);
        o2f o2fVar26 = new o2f("textPath", 25);
        o2f o2fVar27 = new o2f("title", 26);
        G = o2fVar27;
        o2f o2fVar28 = new o2f("tref", 27);
        o2f o2fVar29 = new o2f("tspan", 28);
        o2f o2fVar30 = new o2f("use", 29);
        o2f o2fVar31 = new o2f("view", 30);
        o2f o2fVar32 = new o2f("UNSUPPORTED", 31);
        H = o2fVar32;
        J = new o2f[]{o2fVar, o2fVar2, o2fVar3, o2fVar4, o2fVar5, o2fVar6, o2fVar7, o2fVar8, o2fVar9, o2fVar10, o2fVar11, o2fVar12, o2fVar13, o2fVar14, o2fVar15, o2fVar16, o2fVar17, o2fVar18, o2fVar19, o2fVar20, o2fVar21, o2fVar22, o2fVar23, o2fVar24, o2fVar25, o2fVar26, o2fVar27, o2fVar28, o2fVar29, o2fVar30, o2fVar31, o2fVar32};
        I = new HashMap();
        for (o2f o2fVar33 : values()) {
            if (o2fVar33 == F) {
                I.put("switch", o2fVar33);
            } else if (o2fVar33 != H) {
                I.put(o2fVar33.name(), o2fVar33);
            }
        }
    }

    public static o2f valueOf(String str) {
        return (o2f) Enum.valueOf(o2f.class, str);
    }

    public static o2f[] values() {
        return (o2f[]) J.clone();
    }
}
