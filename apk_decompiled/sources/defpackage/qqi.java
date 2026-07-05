package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qqi {
    public static final gp1 a = new gp1(ncc.a, 0, 0);

    public static final f5i a(pzi pziVar, zb0 zb0Var) {
        f5i f5iVarA = pziVar.a(zb0Var);
        int length = zb0Var.F.length();
        zb0 zb0Var2 = f5iVarA.a;
        occ occVar = f5iVarA.b;
        int length2 = zb0Var2.F.length();
        int iMin = Math.min(length, 100);
        for (int i = 0; i < iMin; i++) {
            b(occVar.D(i), length2, i);
        }
        b(occVar.D(length), length2, length);
        int iMin2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < iMin2; i2++) {
            c(occVar.l(i2), length, i2);
        }
        c(occVar.l(length2), length, length2);
        return new f5i(zb0Var2, new gp1(occVar, zb0Var.F.length(), zb0Var2.F.length()));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbV = vb7.v("OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", i3, i, " is not in range of transformed text [0, ");
        sbV.append(i2);
        sbV.append(']');
        e39.c(sbV.toString());
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbV = vb7.v("OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", i3, i, " is not in range of original text [0, ");
        sbV.append(i2);
        sbV.append(']');
        e39.c(sbV.toString());
    }
}
